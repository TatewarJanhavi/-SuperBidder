package SupperBidder.service;

import SupperBidder.util.SellerUtil;

public class SellerService {
    SellerUtil sellerUtil ;

    public SellerService() {
        this.sellerUtil = new SellerUtil();
    }

    public void addSeller(String sellerName){
        sellerUtil.addSeller(sellerName);
        System.out.println("Added seller succesfully");
    }
}
