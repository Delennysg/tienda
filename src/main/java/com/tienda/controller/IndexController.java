
package com.tienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    
    @RequestMapping("/") //url al que responde
    public String index() {
        return "index"; //Nombre de la vista en templateas a mostar 
    }
    
//    @RequestMapping("/informacion") //url al que responde
//    public String info() {
//        return "info"; //Nombre de la vista en templateas a mostar 
//    }
}
