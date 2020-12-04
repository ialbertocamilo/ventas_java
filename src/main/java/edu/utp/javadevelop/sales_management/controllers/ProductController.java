package edu.utp.javadevelop.sales_management.controllers;


import edu.utp.javadevelop.sales_management.models.Products;
import edu.utp.javadevelop.sales_management.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.websocket.MessageHandler;
import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping(path = "/api/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/getAll")
    public List<Products> getAll() {
        return productService.list();
    }

    @RequestMapping("/get/{id}")
    public Optional<Products> findById(@PathVariable Integer id) {

        return productService.getById(id);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public void  save(@RequestBody Products product) {
         productService.save(product);
    }

    @PostMapping("/delete")
    @ResponseBody
    public ResponseEntity  delete(@RequestParam Integer id){
        productService.delete(id);
        return new ResponseEntity("ok", HttpStatus.ACCEPTED);
    }

}w
