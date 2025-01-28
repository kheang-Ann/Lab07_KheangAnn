public class Product {
    
    private String name;
    private double price;
    private double discount;
    public String getName(){
        return name;
    }

    public void setName(String name){
        if(!name.isBlank()){
            this.name = name;
        }
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        if (price > 0){
            this.price = price;
        }
    }

    public double getDiscount(){
        return discount;
    }

    public void setDiscount(double discount){
        if (discount >= 0 && discount <= 100){
            this.discount = discount;
        }
    }
}
