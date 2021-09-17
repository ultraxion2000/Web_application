package com.kursovaya.chairs;

import com.kursovaya.table.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
public class ChairsController {

    @Autowired
    public ChairsService chairsService;

    @GetMapping("/chairs")
    public String chairs(Model model) {
        model.addAttribute("chair", chairsService.findAll());
        return "chairs";
    }

    @GetMapping("/addChairs")
    public String createChairsPage(){
        return "createChairs";

    }

    @PostMapping("/addChairs")
    public String addChairs(@ModelAttribute("chairs") Chairs chairs){
        chairsService.save(chairs);
        return "redirect:/chairs";
    }

    @GetMapping("/chairsDelete/{id}")
    public String deleteChairs(@PathVariable("id") int id){
        chairsService.delete(id);
        return "redirect:/chairs";
    }
}