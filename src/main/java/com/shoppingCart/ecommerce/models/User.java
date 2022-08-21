package com.shoppingCart.ecommerce.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.shoppingCart.ecommerce.classes.UserType;


@Entity
public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String name;
   private String email;
   private String password;
   private List<ShippingAddress> addresses;
   private UserType type;

   
}
