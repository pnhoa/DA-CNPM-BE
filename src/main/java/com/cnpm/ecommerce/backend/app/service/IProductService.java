package com.cnpm.ecommerce.backend.app.service;

import com.cnpm.ecommerce.backend.app.dto.MessageResponse;
import com.cnpm.ecommerce.backend.app.dto.ProductDTO;
import com.cnpm.ecommerce.backend.app.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {

    List<Product> findAll();

    Page<Product> findAllPageAndSort(Pageable pagingSort);

    Product findById(Long theId);

    MessageResponse createProduct(ProductDTO theProductDto);

    MessageResponse updateProduct(Long theId, ProductDTO theProductDto);

    void deleteProduct(Long theId);

    Page<Product> findByNameContaining(String productName, Pageable pagingSort);
    

    Long count();

    Page<Product> findByCategoryIdPageAndSort(Long categoryId, Pageable pagingSort);

    Page<Product> findByNameContainingAndCategoryIdPageSort(String productName, Long categoryId, Pageable pagingSort);

    Long countProductsByCategoryId(Long theCategoryId);
}
