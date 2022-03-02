package com.example.BackendNews;

import com.example.BackendNews.model.Inquiry;
import com.example.BackendNews.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("inquiry", new Inquiry());

        return "index";
    }

    @GetMapping("/about.html")
    public String about() {
        return "about";
    }

    @GetMapping("/blog.html")
    public String blog() {
        return "blog";
    }

    @GetMapping("/contact.html")
    public String contact() {
        return "contact";
    }

    @GetMapping("/fullpost.html")
    public String fullpost() {
        return "fullpost";
    }

    @GetMapping("/portfolio.html")
    public String portfolio() {
        return "portfolio";
    }
//
//    @GetMapping("/results.html")
//    public String results(Model model) {
//
//        model.addAttribute("posts", homeService.getPosts());
//
//        return "results";
//    }

    @PostMapping("/results.html")
    public String searchResults(Model model, @ModelAttribute Inquiry inquiry) {

        String searchString = inquiry.getSearchString();

        model.addAttribute("results", homeService.searchPosts(searchString));

        return "results";
    }
}
