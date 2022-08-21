package com.shoppingCart.ecommerce.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;   
   private String name;
   @OneToMany
   private List<Product> products;

   public Category() {
   }

   public Category(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public List<Product> getProducts() {
      return this.products;
   }
   
}
