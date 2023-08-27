package com.paliwal999harsh.competitivecodehub.service;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.paliwal999harsh.competitivecodehub.model.PlatformModel;
import com.paliwal999harsh.competitivecodehub.model.ProblemModel;

import lombok.Data;
import reactor.core.publisher.Mono;

/**
 * CsesFiService
 */
@Service
@Data
public class CsesFiService {
    private static WebClient webClient;
    @Autowired
    PlatformService platformService;

    public List<ProblemModel> getAllProblems(){
        return null;
    }
    public List<ProblemModel> fetchProblems(){
        PlatformModel platform = platformService.getPlatform("CSESFI");
        List<ProblemModel> problemsList = new ArrayList<>();
        webClient = WebClient.create();
        Mono<String> responseMono = webClient.get()
            .uri("https://cses.fi/problemset")
            .retrieve()
            .bodyToMono(String.class);
        String response = responseMono.block();
        Document document = Jsoup.parse(response);
        Elements h2Headings = document.select("h2"); // Select all h2 headings
        for (Element h2 : h2Headings) {
            String category = h2.text();
            // Find the ul element following the h2
            Element ul = h2.nextElementSibling();
            if (ul != null && ul.tagName().equals("ul")) {
                Elements liItems = ul.select("li.task"); // Select all li items with class "task"
                for (Element li : liItems) {
                    Element link = li.selectFirst("a[href]"); // Select the first <a> element with href
                    String problemName = link.text();
                    String href = link.attr("href");
                    ProblemModel problem = new ProblemModel(href,problemName,category,platform,platform.getPlatformBaseURL()+href);
                    problemsList.add(problem);
                }
            }
        }
        return problemsList;
    }
}