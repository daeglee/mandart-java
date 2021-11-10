package com.dgl.mandart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MandartController {

    @GetMapping("test")
    public String mandartTable(Model model){
        int[][] matrix = {
                {0,1,2,3,4,5,6},
                {7,8,9,10,11,12,13}
        };

        model.addAttribute("matrix", matrix);
        return "manTable";
    }
}
