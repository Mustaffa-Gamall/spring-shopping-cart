package com.shoppingCart.ecommerce.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String name;
   private String description;
   private int stock;
   private double price;
   @ManyToOne
   private Category category;

   public Product(String name, String description, int stock, Category category) {
      this.name = name;
      this.description = description;
      this.stock = stock;
      this.category = category;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public int getStock() {
      return stock;
   }

   public void setStock(int stock) {
      this.stock = stock;
   }

   public Category getCategory() {
      return category;
   }

   public void setCategory(Category category) {
      this.category = category;
   }

}
