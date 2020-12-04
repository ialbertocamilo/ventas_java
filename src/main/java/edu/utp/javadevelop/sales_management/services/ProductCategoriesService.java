package edu.utp.javadevelop.sales_management.services;

import edu.utp.javadevelop.sales_management.models.ProductCategories;
import edu.utp.javadevelop.sales_management.repositories.ProductCategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductCategoriesService {

    @Autowired
    ProductCategoriesRepository productCategoriesRepository;

    public Optional<ProductCategories> getById(Integer id){

        return productCategoriesRepository.findById(id);
    }


    public List<ProductCategories> list(){

        return productCategoriesRepository.findAll();
    }

    public ProductCategories save(ProductCategories p){
        return productCategoriesRepository.save(p);
    }

}
