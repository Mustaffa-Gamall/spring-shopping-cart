package com.shoppingCart.ecommerce.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ShippingAddress {
   
   @Id
   private Long id;
   private User user;
   private String name;
   private String building;
   private String street;
   private int floor;
   private int apprtment;

   public ShippingAddress() {}

   public ShippingAddress(User user, String name, String building, String street, int floor, int apprtment) {
      this.user = user;
      this.name = name;
      this.building = building;
      this.street = street;
      this.floor = floor;
      this.apprtment = apprtment;
   }

   public User getUser() {
      return user;
   }

   public void setUser(User user) {
      this.user = user;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getBuilding() {
      return building;
   }

   public void setBuilding(String building) {
      this.building = building;
   }

   public String getStreet() {
      return street;
   }

   public void setStreet(String street) {
      this.street = street;
   }

   public int getFloor() {
      return floor;
   }

   public void setFloor(int floor) {
      this.floor = floor;
   }

   public int getApprtment() {
      return apprtment;
   }

   public void setApprtment(int apprtment) {
      this.apprtment = apprtment;
   }   

}
