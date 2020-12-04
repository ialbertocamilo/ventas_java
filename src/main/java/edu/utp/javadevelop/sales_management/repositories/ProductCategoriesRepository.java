package edu.utp.javadevelop.sales_management.repositories;

import edu.utp.javadevelop.sales_management.models.ProductCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface ProductCategoriesRepository extends JpaRepository<ProductCategories, Serializable> {

}
