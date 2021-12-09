package com.dgl.mandart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MandartController {

    @GetMapping("test")
    public String mandartTable(Model model){

        int idx = 0;
        String[][] matrixStr = new String[9][];

        for (String[] strings : matrixStr) {
            strings = new String[9];
            for (String string : strings) {
                string = new String(idx++ +"");
                System.out.println("ham : " + string);
            }
        }

        model.addAttribute("matrix", matrixStr);
        return "manTable";
    }
}
