package com.kursovaya.table;

import com.kursovaya.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
public class TableController {

    @Autowired
    public TableService tableService;

    @GetMapping("/table")
    public String table(Model model) {
        model.addAttribute("tables", tableService.findAll());
        return "table";
    }

    @GetMapping("/addTable")
    public String createTablePage(){
        return "createTable";

    }

    @PostMapping("/addTable")
    public String addTable(@ModelAttribute("table") Table table){
        tableService.save(table);
        return "redirect:/table";
    }

    @GetMapping("/tableDelete/{id}")
    public String deleteTable(@PathVariable("id") int id){
        tableService.delete(id);
        return "redirect:/table";
    }
}