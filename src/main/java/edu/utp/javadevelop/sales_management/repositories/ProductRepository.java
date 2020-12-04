package edu.utp.javadevelop.sales_management.repositories;

import edu.utp.javadevelop.sales_management.models.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface ProductRepository extends JpaRepository<Products, Serializable> {

}
