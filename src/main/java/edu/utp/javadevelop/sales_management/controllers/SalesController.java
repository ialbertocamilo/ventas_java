package edu.utp.javadevelop.sales_management.controllers;

import edu.utp.javadevelop.sales_management.models.Sales;
import edu.utp.javadevelop.sales_management.services.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/sales")
public class SalesController {

    @Autowired
    SalesService salesService;

    @PostMapping("/save")
    public Sales save(@RequestBody Sales sales){
       return salesService.save(sales);
    }


    @GetMapping("/list")
    public List<Sales> list(){
        return salesService.list();
    }


}
