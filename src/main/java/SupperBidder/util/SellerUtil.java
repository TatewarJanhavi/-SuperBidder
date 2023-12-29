package SupperBidder.util;

import SupperBidder.dto.Seller;
import SupperBidder.repository.SellerRepository;

import java.util.List;
import java.util.Map;

public class SellerUtil {


    public boolean isSellerPresent(String sellerName)
    {
           Map<String, Seller> sellerMap =  SellerRepository.getAllSellers();
            if(sellerMap.containsKey(sellerName))
                return true ;
            return false ;
    }

    public Map<String , Seller> getAllSeller(){
        return SellerRepository.getAllSellers();
    }

    public void addSeller(String sellerName){
        if(isSellerPresent(sellerName))
            throw new RuntimeException(String.format("Seller with seller name %s already esxits" , sellerName));
        Map<String, Seller> sellerMap =  SellerRepository.getAllSellers();
        Seller seller = new Seller(sellerName);
        sellerMap.put(sellerName , seller);



    }
}
