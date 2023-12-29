package SupperBidder.service;

import SupperBidder.repository.AuctionRepository;
import SupperBidder.repository.BuyerRepository;
import SupperBidder.repository.SellerRepository;

public class InMemoryService {
    public static SellerRepository sellerRepository;
    public static BuyerRepository buyerRepository;
    public   static AuctionRepository auctionRepository;

    public void intializeDatabase(){
        sellerRepository = new SellerRepository();
        buyerRepository = new BuyerRepository();
        auctionRepository = new AuctionRepository();

    }
}
