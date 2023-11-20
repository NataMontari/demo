package com.example.demo;
import java.util.LinkedList;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Order {
    Payment payment;
    Delivery delivery;
    LinkedList items;

    private void setPaymentStrategy(Payment payment){
        this.payment = payment;
    }

    private void setDeliveryStrategy(Delivery delivery){
    }

    public double calculateTotalPrice(){
        return 3;
    }

    public void ProcessOrder(){

    }
    public void addItem(Item item){
    }

    public void removeItem(Item item){
        
    }
}
