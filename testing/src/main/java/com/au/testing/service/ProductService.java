package com.au.testing.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.au.testing.entity.Product;
import com.au.testing.repository.ProductRepository;

@Service
public class ProductService {
 
    private final ProductRepository productRepository;
 
    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
 
    /**
     * Save a product.
     *
     * @param product the entity to save
     * @return the persisted entity
     */
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
 
    /**
     * Get all the products.
     *
     * @return the list of entities
     */
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
 
    /**
     * Get one product by ID.
     *
     * @param id the ID of the entity
     * @return the entity
     */
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }
    
    public Optional<Product> getProductByPanNumber(String PanNumber){
    	return productRepository.findByPanNumber(PanNumber);
    }
 
    /**
     * Update a product.
     *
     * @param id the ID of the entity
     * @param updatedProduct the updated entity
     * @return the updated entity
     */
    public Product updateProduct(Long id, Product updatedProduct) {
        Optional<Product> existingProduct = productRepository.findById(id);
        if (existingProduct.isPresent()) {
            Product product = existingProduct.get();
            product.setName(updatedProduct.getName());
            product.setAge(updatedProduct.getAge());
            product.setGender(updatedProduct.getGender());
            product.setPanNumber(updatedProduct.getPanNumber());
            product.setPhoneNumber(updatedProduct.getPhoneNumber());
            product.setEmailAddress(updatedProduct.getEmailAddress());
            product.setEmployeeAddress(updatedProduct.getEmployeeAddress());
            product.setEmployeeCity(updatedProduct.getEmployeeCity());
            product.setEmployeeZipCode(updatedProduct.getEmployeeZipCode());
            product.setEmployeeState(updatedProduct.getEmployeeState());
            product.setEmployeeDOB(updatedProduct.getEmployeeDOB());
            return productRepository.save(product);
        } else {
            throw new RuntimeException("Product not found");
        }
    }
 
    /**
     * Delete the product by ID.
     *
     * @param id the ID of the entity
     */
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}