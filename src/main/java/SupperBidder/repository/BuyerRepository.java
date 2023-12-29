package SupperBidder.repository;

import SupperBidder.dto.Buyer;

import java.util.HashMap;
import java.util.Map;

public class BuyerRepository {
    private static Map<String , Buyer> buyerMap;

    public BuyerRepository() {
        this.buyerMap = new HashMap<>();
    }

    public static  Map<String, Buyer> getBuyerMap() {
        return buyerMap;
    }

    public void setBuyerMap(Map<String, Buyer> buyerMap) {
        this.buyerMap = buyerMap;
    }
}
