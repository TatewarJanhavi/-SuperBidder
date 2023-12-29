package SupperBidder;

import SupperBidder.dto.Auction;
import SupperBidder.service.AuctionService;
import SupperBidder.service.BuyerService;
import SupperBidder.service.InMemoryService;
import SupperBidder.service.SellerService;

public class SupperBidderApplication {
    public static void main(String[] args) throws Exception {
        InMemoryService inMemoryService = new InMemoryService();
        inMemoryService.intializeDatabase();
        BuyerService buyerService = new BuyerService();
        AuctionService auctionService = new AuctionService();
        SellerService sellerService = new SellerService();
        buyerService.createBuyer("buyer1");
        buyerService.createBuyer("buyer2");
        buyerService.createBuyer("buyer3");
        sellerService.addSeller("seller1");
        auctionService.createAuction("A1" , 10 , 50 , "seller1");

    }
}
