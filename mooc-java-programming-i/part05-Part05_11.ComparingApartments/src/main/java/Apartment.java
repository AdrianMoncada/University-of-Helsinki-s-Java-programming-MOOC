
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if(this.squares > compared.squares){
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        int priceA = this.princePerSquare * this.squares;
        int priceB = compared.princePerSquare * compared.squares;
        if(priceA > priceB) {
           int priceDiference = priceA - priceB;
           return priceDiference; 
        }
        int priceDiference = priceB - priceA;
        return priceDiference;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int priceA = this.princePerSquare * this.squares;
        int priceB = compared.princePerSquare * compared.squares;
        if(priceA > priceB){
            return true;
        }
        return false;
    }
}
