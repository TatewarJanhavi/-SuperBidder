package SupperBidder.dto;

import java.util.ArrayList;
import java.util.List;

public class Buyer {
    private String name ;
    List<Auction> auctionList;


    public Buyer(String name) {
        this.name = name;
        auctionList = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
