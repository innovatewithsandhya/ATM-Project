package basicProjects;

import java.util.ArrayList;

public class PersonalFinanceTracker {
private ArrayList<Transaction>transactions;
public PersonalFinanceTracker(){
    transactions=new ArrayList<Transaction>();
}
    public void addTransaction(Transaction t){
        transactions.add(t);
}
public void showTransaction(){
    for(Transaction tr:transactions){
        tr.showTransaction();
    }

}
    public void calculateBalance(){
        double balance = 0;
        for(Transaction tr : transactions){
            if(tr.type.equals("Income")){
                balance += tr.amount;
            }
            else {
                balance -= tr.amount;
            }
        }
        System.out.println("Balance: " + balance);
    }
}
