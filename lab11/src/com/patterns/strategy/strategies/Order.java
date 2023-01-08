package com.patterns.strategy.strategies;

public class Order {
    private int totalCost = 0;
    private boolean isClosed = false;

    public void processOrder(MyPayStrategy strategy) {
        strategy.collectPaymentDetails();
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int cost) {
        totalCost += cost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }
}
