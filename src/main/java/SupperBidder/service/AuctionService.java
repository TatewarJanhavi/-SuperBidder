package SupperBidder.service;

import SupperBidder.dto.Auction;
import SupperBidder.dto.Buyer;
import SupperBidder.repository.AuctionRepository;
import SupperBidder.util.AuctionUtil;
import SupperBidder.util.BuyerUtil;
import SupperBidder.util.SellerUtil;

import java.util.List;

public class AuctionService {

    private AuctionUtil auctionUtil;
    private SellerUtil sellerUtil ;
    private BuyerUtil buyerUtil;

    public AuctionService() {
    auctionUtil = new AuctionUtil();
    sellerUtil = new SellerUtil();
    buyerUtil = new BuyerUtil();
    }

    public void createAuction(String auctionName , int minPrice , int maxPrice , String sellerName) throws Exception {
        if(auctionUtil.isAuctionExists(auctionName)){
            throw new Exception(String.format("Auction with auction name %s already exists", auctionName));
        }
        if(!sellerUtil.isSellerPresent(sellerName)){
            throw new Exception(String.format("Seller with seller name %s doesn't exists", sellerName));
        }
        auctionUtil.createAuction(auctionName, minPrice , maxPrice , sellerName);
    }

    public void createBid(String buyerName , String auctionName , int value) throws Exception {
        if(!buyerUtil.isBuyerPresent(buyerName)){
            throw new Exception(String.format( "Buyer  with buyer name %s doesn't exists", buyerName));
        }
        if(!auctionUtil.isAuctionExists(auctionName)){
            throw new Exception(String.format( "Auction  with auction name %s  doesn't exists", auctionName));
        }
         Auction auction = auctionUtil.getAuctionForAuctionName(auctionName);
        List<Buyer> buyers = auction.getBuyer();
         for(Buyer buyer : buyers){
             if(buyer.getName().equals(buyerName)){
                 throw new Exception(String.format( "Buyer  with buyer name %s doesn't exists", buyerName));
             }
         }
        buyerUtil.isBuyerPresent(buyerName);


        }

}
