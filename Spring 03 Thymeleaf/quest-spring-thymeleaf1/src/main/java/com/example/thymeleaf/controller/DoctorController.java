package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class DoctorController {

    @GetMapping("/doctor")
    public String doctor(Model model, @RequestParam(value = "docName", required = false, defaultValue = "John Doe") String docName, @RequestParam(value="docNbr", required=false, defaultValue="0") String docNbr){
       model.addAttribute("docName", docName);
       model.addAttribute("docNbr", docNbr);
        return "doctor";
    }
}
