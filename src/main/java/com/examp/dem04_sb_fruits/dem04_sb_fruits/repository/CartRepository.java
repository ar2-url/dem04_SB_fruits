package com.examp.dem04_sb_fruits.dem04_sb_fruits.repository;

import com.examp.dem04_sb_fruits.dem04_sb_fruits.fruit.Cart;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CartRepository {

    private List<Cart> cartList = new ArrayList<>();

    public CartRepository() {
        cartList.add(new Cart("koszykNaOwoce1", 1));
        cartList.add(new Cart("koszykNaOwoce2", 2));
        cartList.add(new Cart("koszykNaOwoce3", 3));
    }

    public List<Cart> getAll() {
        return cartList;
    }

    public Cart getById(int id){
        return cartList.stream()
                .filter(cart -> cart.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void addCart(Cart cart){
        cartList.add(cart);
    }

}