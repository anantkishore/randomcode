package com.kishore.anant.enact;

import java.util.TreeSet;

public class StockPriceFluctuation {


    private TreeSet<Pair> stockPriceSet = new TreeSet<>();
    private int latestTimestamp = -1;
    private int currentPrice = -1;

    public static void main(String[] args) {

        StockPriceFluctuation stockPriceFluctuation = new StockPriceFluctuation();
        stockPriceFluctuation.update(1, 10);
        stockPriceFluctuation.update(2, 5);
        System.out.println(stockPriceFluctuation.current());
        System.out.println(stockPriceFluctuation.maximum());
        stockPriceFluctuation.update(1, 3);
        System.out.println(stockPriceFluctuation.maximum());
        stockPriceFluctuation.update(4, 2);
        System.out.println(stockPriceFluctuation.minimum());
    }

    public void update(int timestamp, int price) {

        if (timestamp > latestTimestamp) {
            latestTimestamp = timestamp;
            currentPrice = price;
        }

        if (stockPriceSet.contains(new Pair(timestamp, price))) {
            stockPriceSet.remove(new Pair(timestamp, price));
            stockPriceSet.add(new Pair(timestamp, price));
        } else {
            stockPriceSet.add(new Pair(timestamp, price));
        }

    }

    public int current() {
        return currentPrice;
    }

    public int maximum() {
        return stockPriceSet.last().getPrice();
    }

    public int minimum() {
        return stockPriceSet.first().price;
    }
}


class Pair implements Comparable<Pair> {
    int timestamp;
    int price;

    public Pair(int timestamp, int price) {
        this.timestamp = timestamp;
        this.price = price;
    }

    public int getTimestamp() {
        return this.timestamp;
    }

    public int getPrice() {
        return this.price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pair) {
            return this.timestamp == ((Pair) obj).timestamp;
        }
        return false;
    }

    @Override
    public int compareTo(Pair pair) {
        if (pair != null) {
            return Integer.compare(this.timestamp, pair.timestamp);
        }
        return 1;
    }
}


/**
 * Your StockPrice object will be instantiated and called as such:
 * StockPrice obj = new StockPrice();
 * obj.update(timestamp,price);
 * int param_2 = obj.current();
 * int param_3 = obj.maximum();
 * int param_4 = obj.minimum();
 */
