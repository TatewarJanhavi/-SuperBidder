package SupperBidder.repository;

import SupperBidder.dto.Auction;

import java.util.HashMap;
import java.util.Map;

public class AuctionRepository {
    private static Map<String ,Auction>  auctionMap ;

    public AuctionRepository() {
        this.auctionMap = new HashMap<>();
    }

    public static Map<String, Auction> getAuctionMap() {
        return auctionMap;
    }
}
