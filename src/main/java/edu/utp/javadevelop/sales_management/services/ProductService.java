package edu.utp.javadevelop.sales_management.services;

import edu.utp.javadevelop.sales_management.models.Products;
import edu.utp.javadevelop.sales_management.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {


    @Autowired
    ProductRepository productRepository;

    public Optional<Products> getById(Integer id){

       return productRepository.findById(id);
    }


    public List<Products> list(){

        return productRepository.findAll();
    }

    public Products save(Products product){
        return productRepository.save(product);
    }

    public void delete(int id){
        productRepository.deleteById(id);
    }
}
