package com.shoppingCart.ecommerce.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.shoppingCart.ecommerce.classes.CartStatus;

@Entity
public class Cart {

   @Id
   private Long id;
   private double total;
   private CartStatus status;
   private User user;
   private ShippingAddress shippingAddress;
   private List<CartItem> items;
}
