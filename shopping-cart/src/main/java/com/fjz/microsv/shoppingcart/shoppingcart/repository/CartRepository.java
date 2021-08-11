package com.fjz.microsv.shoppingcart.shoppingcart.repository;

import com.fjz.microsv.shoppingcart.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart,Integer> {
}
