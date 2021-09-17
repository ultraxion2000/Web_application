package com.kursovaya.delivery;

import com.kursovaya.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
public class DeliveryController {

    @Autowired
    public DeliveryService deliveryService;

    @GetMapping("/delivery")
    public String delivery(Model model) {
        model.addAttribute("deliveries", deliveryService.findAll());
        return "delivery";
    }


    @GetMapping("/addDelivery")
    public String createDeliveryPage(){
        return "createDelivery";

    }

    @PostMapping("/addDelivery")
    public String addDelivery(@ModelAttribute("delivery") Delivery delivery){
        deliveryService.save(delivery);
        return "redirect:/delivery";
    }

    @GetMapping("/deliveryDelete/{id}")
    public String deleteDelivery(@PathVariable("id") int id){
        deliveryService.delete(id);
        return "redirect:/delivery";
    }


    @GetMapping("/deliveryEdit/{id}")
    public String editDelivery(@PathVariable("id") int id, Model model){
        model.addAttribute("delivery", deliveryService.getById(id));
        return "deliveryEdit";
    }

    @PostMapping("/updateDelivery")
    public String updateDelivery(@ModelAttribute("delivery") Delivery delivery){
        deliveryService.update(delivery);
        return "redirect:/delivery";
    }
}