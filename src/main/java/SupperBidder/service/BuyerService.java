package SupperBidder.service;

import SupperBidder.dto.Buyer;
import SupperBidder.util.BuyerUtil;


public class BuyerService {

    BuyerUtil buyerUtil ;

    public BuyerService(){
        buyerUtil = new BuyerUtil();
    }

    public void createBuyer(String buyerName) throws Exception {
        buyerUtil.addBuyer(buyerName);
        System.out.println("SuccessFully created a Buyer with buyer name "+ buyerName);
    }
}
