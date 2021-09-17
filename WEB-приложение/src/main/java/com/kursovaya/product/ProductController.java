package com.kursovaya.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
public class ProductController {

    @Autowired
    public ProductService productService;

    @GetMapping("/helloworld")
    public String Hello() {
        return "hello";
    }

    @GetMapping("/product")
    public String product(Model model) {
        model.addAttribute("products", productService.findAll());
        return "product";
    }
    
	@GetMapping("/")
    public String index(Model model) {
        model.addAttribute("products", productService.findAll());
        return "index";
    }

    @GetMapping("/auto")
    public String auto() {
        return "auto";
    }
	
    @GetMapping("/addProduct")
    public String createProductPage(){
        return "createProduct";

    }

    @PostMapping("/addProduct")
    public String addProduct(@ModelAttribute("product") Product product){
        productService.save(product);
        return "redirect:/product";
    }

    @GetMapping("/productDelete/{id}")
    public String deleteProduct(@PathVariable("id") int id){
        productService.delete(id);
        return "redirect:/product";
    }

    @GetMapping("/productEdit/{id}")
    public String editProduct(@PathVariable("id") int id, Model model){
        model.addAttribute("product", productService.getById(id));
        return "productEdit";
    }

    @PostMapping("/updateProduct")
    public String updateProduct(@ModelAttribute("product") Product product){
    productService.update(product);
    return "redirect:/product";
    }
}