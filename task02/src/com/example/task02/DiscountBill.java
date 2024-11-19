package com.example.task02;

public class DiscountBill extends Bill{
    private final double discount;

    public DiscountBill(double discount){
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public double getTotalPrice(){
        return super.getPrice() - getPrice();
    }

    public long getPrice() {
        return (long) (super.getPrice() - super.getPrice() * (discount/100));
    }
}