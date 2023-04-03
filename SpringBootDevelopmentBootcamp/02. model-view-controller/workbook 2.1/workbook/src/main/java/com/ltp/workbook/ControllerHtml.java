package com.ltp.workbook;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerHtml {
    
    @GetMapping("/")
    public String getShows() {
        return "shows";
    }
}
