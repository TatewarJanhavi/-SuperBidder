package SupperBidder.util;

import SupperBidder.dto.Auction;
import SupperBidder.dto.Buyer;
import SupperBidder.dto.Seller;
import SupperBidder.repository.AuctionRepository;

import java.util.ArrayList;
import java.util.Map;

public class AuctionUtil {


    private SellerUtil sellerUtil;

    public AuctionUtil() {
        this.sellerUtil = new SellerUtil();
    }

    public boolean isAuctionExists(String auctionName){

        Map<String, Auction> auctionUtilMap = AuctionRepository.getAuctionMap();


        if(auctionUtilMap.containsKey(auctionName))
            return true ;

        return false ;

    }

    public void createAuction(String auctionName , int minPrice , int maxPrice , String sellerName){
        Map<String , Seller> sellers = sellerUtil.getAllSeller();
        Auction auction = new Auction(auctionName ,  sellers.get(sellerName) , maxPrice, maxPrice);
        Map<String , Auction> auctionUtilMap = AuctionRepository.getAuctionMap();

        auctionUtilMap.put(auctionName , auction);
    }


    public Auction getAuctionForAuctionName(String auctionName){

        Map<String , Auction> auctionUtilMap = AuctionRepository.getAuctionMap();
        return auctionUtilMap.get(auctionName);

    }


}
