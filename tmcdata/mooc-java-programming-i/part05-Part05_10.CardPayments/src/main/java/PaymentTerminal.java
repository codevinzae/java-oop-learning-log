
public class PaymentTerminal {


    private double money;  
    private int affordableMeals; 
    private int heartyMeals;  


    public PaymentTerminal() {
        this.money =  1000.0;
    }

    public double eatAffordably(double payment) {
        if(payment >= 2.50){
            this.money = this.money + 2.50;
            this.affordableMeals = this.affordableMeals + 1;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        if(payment >= 4.30){
            this.money = this.money = 4.30;
            this.heartyMeals = this.heartyMeals + 1;
            return payment - 4.30;
        }
        return payment;
    }

    public void addMoneyToCard(PaymentCard card, double sum){
        if (sum > 0) {
            card.addMoney(sum);
            this.money = this.money + sum;
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
