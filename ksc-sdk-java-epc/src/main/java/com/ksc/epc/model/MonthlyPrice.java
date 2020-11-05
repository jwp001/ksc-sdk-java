package com.ksc.epc.model;


public class MonthlyPrice {

    /**
     * 价格
     */
    private String monthlylistPrice;

    public void setMonthlylistPrice(String monthlylistPrice) {
        this.monthlylistPrice = monthlylistPrice;
    }

    public String getMonthlylistPrice() {
        return monthlylistPrice;
    }

    public String toString() {
        return "MonthlyPrice(MonthlylistPrice=" + this.getMonthlylistPrice() + ")";
    }

}
