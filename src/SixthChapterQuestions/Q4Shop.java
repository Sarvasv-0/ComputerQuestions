package SixthChapterQuestions;

public class Q4Shop {
    private int price;
    private int balance;
    private int total;
    public Q4Shop(int cost) {
        price = cost;
        balance=0;
        total=0;
    }
    public int getPrice() {
        return price;
    }
    public int getBalance() {
        return balance;
    }
    public void insertMoney(int amount) {
        if(amount>0) {
            balance+=amount;
        }
        else {
            System.out.println("Use a positive amount: "+amount);
        }
    }
    public void printShop() {
        int amountLeftToPay;
        amountLeftToPay=price-balance;
        if(balance >=price) {
            total+=price;
            balance-=price;
            if(amountLeftToPay==0) {
                System.out.println("Correct amount paid..");
            }
            else {
                System.out.println("Amount left to be paid: "+amountLeftToPay);
            }
        }
        else {
            System.out.println("You Must enter at least: "+amountLeftToPay+" Rupees");
        }
    }
    public int refundBalance() {
        int amountToRefund;
        amountToRefund=balance;
        balance =0;
        return amountToRefund;
    }
    public int emptyMachine() {
        int temp=total;
        total=0;
        return temp;
    }
}