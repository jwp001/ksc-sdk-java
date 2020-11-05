package com.ksc.epc.model;

import java.util.List;
        
public class PriceInfo {

    /**
     * 价格信息
     */
    private List<Price> priceSet;

    public void addPriceSet(Price... priceSet) {
        if (this.priceSet == null) {
            this.priceSet = new com.ksc.internal.SdkInternalList<Price>();
        }
        for (Price value : priceSet) {
            this.priceSet.add(value);
        }
    }

    public void setPriceSet(List<Price> priceSet) {
        this.priceSet = new com.ksc.internal.SdkInternalList<Price>(priceSet);
    }

    public  List<Price> getPriceSet() {
        return priceSet;
    }

    public String toString() {
        return "PriceInfo(PriceSet=" + this.getPriceSet() + ")";
    }

}
