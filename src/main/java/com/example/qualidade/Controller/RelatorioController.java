package com.example.qualidade.Controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RelatorioController {
    @GetMapping("/hello")
    public boolean helloWorld() {
        return true; 
}
    @GetMapping("/numeros")
    public ArrayList<String> numeros() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("01");
        list.add("02");

        return list;
    }

}
