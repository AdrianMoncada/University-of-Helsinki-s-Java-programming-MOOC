
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }
//Aqui
        if(cents < 0) {
            System.out.println("using this");
            int diference = 100 - (cents * -1);
            cents = diference;
            euros--;
        }
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition){
        Money newMoney = new Money(this.euros + addition.euros,this.cents + addition.cents);
        
        return newMoney;
    }
    
    public boolean lessThan(Money compared){

        if(this.euros < compared.euros){
            return true;
        }
        
        if(this.euros == compared.euros &&
                this.cents < compared.cents){
            return true;
        }
        return false;
    }
    
    public Money minus(Money decreaser){
        if(this.lessThan(decreaser)){
            Money newMoney = new Money(0,0);
            return newMoney;
        }
        int euroDiff = this.euros - decreaser.euros;
        int centsDiff = this.cents - decreaser.cents;
        System.out.println("centsDiff es: " + centsDiff);
        //7.-50
        Money diffMoney = new Money(euroDiff,centsDiff);
        return diffMoney;
    }

}
