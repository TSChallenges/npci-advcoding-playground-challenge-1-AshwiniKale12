class StockPortfolio {
    
    private String symbol;
    private int quantity;
    private double buyingPrice;
    private double currentPrice;
    private double highestPrice;



    public StockPortfolio(String symbol, int quantity, double buyingPrice) {
        this.symbol = symbol;
        this.quantity = quantity;
        this.buyingPrice = buyingPrice;
        this.currentPrice = buyingPrice;
        this.highestPrice = buyingPrice;
    }

    public void updatePrice(double newPrice) {
        if(newPrice > 0){
            currentPrice = newPrice;
        }
        if(newPrice > highestPrice){
            highestPrice = newPrice;
        }
    }
   
    public double calculateProfit() {
       return (currentPrice - buyingPrice) * quantity;
       
    }

    public double getCurrentValue() {
     return currentPrice * quantity;
    }
}
