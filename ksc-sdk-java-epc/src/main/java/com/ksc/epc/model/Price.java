package com.ksc.epc.model;

import java.math.BigDecimal;

public class Price {

    /**
     * 币种
     */
    private String currency;
    /**
     * 折扣价
     */
    private BigDecimal discountPrice;
    /**
     * 原价
     */
    private BigDecimal originalPrice;
    /**
     * 成交价
     */
    private BigDecimal tradePrice;

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setTradePrice(BigDecimal tradePrice) {
        this.tradePrice = tradePrice;
    }

    public BigDecimal getTradePrice() {
        return tradePrice;
    }

    public String toString() {
        return "Price(Currency=" + this.getCurrency() + ",DiscountPrice=" + this.getDiscountPrice() + ",OriginalPrice=" + this.getOriginalPrice() + ",TradePrice=" + this.getTradePrice() + ")";
    }

}
