
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000.00;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public boolean eatAffordably(PaymentCard paymentCard) {
        if(paymentCard.balance() >= 2.50){
            paymentCard.takeMoney(2.50);
            this.affordableMeals++;
            
            return true;
        }
        return false;
    }
    
    public double eatAffordably(double payment){
                if(payment >= 2.50){
            this.affordableMeals++;
            this.money += 2.50;
            return payment - 2.50;
        }
        return payment;
    }

    public boolean eatHeartily(PaymentCard paymentCard) {
                if(paymentCard.balance() >= 4.30){
            paymentCard.takeMoney(4.30);
            this.heartyMeals++;
            
            return true;
        }
        return false;
    }
    
        public double eatHeartily(double payment) {
        if(payment >= 4.30){
            this.heartyMeals++;
            this.money += 4.30;
            return payment - 4.30;
        }
        return payment;
    }
        
        public void addMoneyToCard(PaymentCard card, double sum) {
            if(sum > 0){
                 card.addMoney(sum);
                this.money += sum;   
            }

    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
