package com.examp.dem04_sb_fruits.dem04_sb_fruits.service;

import com.examp.dem04_sb_fruits.dem04_sb_fruits.fruit.Cart;
import com.examp.dem04_sb_fruits.dem04_sb_fruits.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    CartRepository cartRepository;

    @Autowired
    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public List<Cart> getAll(){

        return cartRepository.getAll();
    }

    public Cart getById(int id){
        return cartRepository.getById(id);
    }

    public void addCart(Cart cart){
        cartRepository.addCart(cart);
    }

}
