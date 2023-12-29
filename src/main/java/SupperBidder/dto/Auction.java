package SupperBidder.dto;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Auction {
    private  String auctionName ;
    private  Seller seller ;
    private int maxBiddingPrice ;
    private int minBiddingPrice ;
    private List<Buyer> buyer ;

    public Auction(String auctionName, Seller seller, int maxBiddingPrice, int minBiddingPrice) {
        this.auctionName = auctionName;
        this.seller = seller;
        this.maxBiddingPrice = maxBiddingPrice;
        this.minBiddingPrice = minBiddingPrice;
        this.buyer = new ArrayList<>();
    }

    public String getAuctionName() {
        return auctionName;
    }

    public void setAuctionName(String auctionName) {
        this.auctionName = auctionName;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public int getMaxBiddingPrice() {
        return maxBiddingPrice;
    }

    public void setMaxBiddingPrice(int maxBiddingPrice) {
        this.maxBiddingPrice = maxBiddingPrice;
    }

    public int getMinBiddingPrice() {
        return minBiddingPrice;
    }

    public void setMinBiddingPrice(int minBiddingPrice) {
        this.minBiddingPrice = minBiddingPrice;
    }

    public List<Buyer> getBuyer() {
        return buyer;
    }

    public void setBuyer(List<Buyer> buyer) {
        this.buyer = buyer;
    }
}
