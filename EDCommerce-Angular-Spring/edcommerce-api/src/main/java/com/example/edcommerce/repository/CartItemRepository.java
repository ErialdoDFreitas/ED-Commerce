package com.example.edcommerce.repo;

import com.example.edcommerce.model.cart.CartItem;
import com.example.edcommerce.model.cart.CartItemPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CartItemRepository extends JpaRepository <CartItem, CartItemPK> {
}
