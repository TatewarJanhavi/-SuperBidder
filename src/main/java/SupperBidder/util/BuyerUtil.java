package SupperBidder.util;

import SupperBidder.dto.Buyer;
import SupperBidder.repository.BuyerRepository;

import java.util.HashMap;
import java.util.Map;

public class BuyerUtil {


    public void addBuyer(String buyerName) throws  Exception{
        Map<String , Buyer> buyerMap = BuyerRepository.getBuyerMap();
        if(isBuyerPresent(buyerName)){
            throw new Exception (String.format("Buyer with buyer name  %s already esixts " , buyerName));
        }
        Buyer buyer = new Buyer(buyerName);
        buyerMap.put(buyerName , buyer);

    }

    public boolean isBuyerPresent(String buyerName){
        Map<String , Buyer> buyerMap = BuyerRepository.getBuyerMap();
        if(buyerMap.containsKey(buyerName)){
            return true ;
        }
        return false ;
    }

}
