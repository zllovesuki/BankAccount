//interface Comparable{
//    int compareTo(BankAccount bankAccount);
//    public class comparable{
//        private float balance;
//
//        float comparableTo(BankAccount bankAccount){
//            return this.balance-bankAccount.getBalance();
//        }
//    }
//}
import java.util.*;



public class BankAccount extends Measurable {
    private static final float DEFAULT_BALANCE = 0;
    private float balance;
    private float rate;
    public int id;
    public static int nextId =1000;


    @Override
    public float getMeasure() {
        return this.balance;
    }

    public BankAccount(float balance, float rate ){
        this.balance = balance;
        this.rate = rate;
        this.id=nextId;
        nextId++;
    }

    public BankAccount(float rate){
        this(DEFAULT_BALANCE, rate);
    }

    public void processYear(){

        this.balance += this.balance * this.rate;
    }
    public void processYears(int n){
        for(int i = 0; i<n; i++){
            processYear();
        }
    }


    public float getBalance() {
        return balance;
    }

    public static void main(String [] args) {
        BankAccount account = new BankAccount(1000, .1f);
        BankAccount account2 = new BankAccount(1300, .1f);
        BankAccount account3 = new BankAccount(1350, .1f);
        int n =2;
        account.processYears(n);
        System.out.println("balance after "+ n + " years is: " + account.balance);
        ArrayList<BankAccount> baList = new ArrayList<>();
        baList.add(account);
        baList.add(account2);
        baList.add(account3);
        Collections.sort(baList);
        System.out.println(baList);
    }

    @Override
    public String toString() {
        return id+" has " +balance;
    }
}
