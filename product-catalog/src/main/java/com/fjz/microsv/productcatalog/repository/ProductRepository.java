package com.fjz.microsv.productcatalog.repository;


import com.fjz.microsv.productcatalog.model.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepository extends ElasticsearchRepository<Product,Integer> {

}
