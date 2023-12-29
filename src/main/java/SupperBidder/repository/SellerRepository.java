package SupperBidder.repository;

import SupperBidder.dto.Seller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SellerRepository {
    static Map<String , Seller> sellers ;

    public static Map<String , Seller> getAllSellers() {
        return sellers;
    }

    public SellerRepository() {
        this.sellers = new HashMap<>();
    }


}
