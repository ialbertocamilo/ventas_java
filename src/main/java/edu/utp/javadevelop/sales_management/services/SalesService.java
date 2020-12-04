package edu.utp.javadevelop.sales_management.services;

import edu.utp.javadevelop.sales_management.models.Sales;
import edu.utp.javadevelop.sales_management.repositories.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesService {

    @Autowired
    SalesRepository salesRepository;

    public List<Sales> list(){
       return salesRepository.findAll();
    }
    public Sales save(Sales s){
        return salesRepository.save(s);
    }
}
