package com.kursovaya.invoice;

import com.kursovaya.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
public class InvoiceController {

    @Autowired
    public InvoiceService invoiceService;

    @GetMapping("/invoice")
    public String invoice(Model model) {
        model.addAttribute("invoices", invoiceService.findAll());
        return "invoice";
    }

    @GetMapping("/addInvoice")
    public String createProductPage(){
        return "createInvoice";

    }

    @PostMapping("/addInvoice")
    public String addInvoice(@ModelAttribute("invoice") Invoice invoice){
        invoiceService.save(invoice);
        return "redirect:/invoice";
    }

    @GetMapping("/invoiceDelete/{productId}/{deliveryId}")
    public String deleteInvoice(@PathVariable("productId") int productId, @PathVariable("deliveryId") int deliveryId){
        invoiceService.delete(productId, deliveryId);
        return "redirect:/invoice";
    }

    @GetMapping("/invoiceEdit/{productId}/{deliveryId}")
    public String editInvoice(@PathVariable("productId") int productId, @PathVariable("deliveryId") int deliveryId, Model model){
        model.addAttribute("invoice", invoiceService.getById(productId, deliveryId));
        return "invoiceEdit";
    }

    @PostMapping("/updateInvoice")
    public String updateInvoice(@ModelAttribute("invoice") Invoice invoice){
        invoiceService.update(invoice);
        return "redirect:/invoice";
    }

}