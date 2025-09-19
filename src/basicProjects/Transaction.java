package basicProjects;

public class Transaction {
            double amount;
            String date;
            String category;
            String type;
            public Transaction(double amount, String date, String category, String type){
                this.amount=amount;
                this.date=date;
                this.category=category;
                this.type=type;
            }
            void showTransaction(){
                System.out.println("Amount: "+ amount);
                System.out.println("Category: "+category);
                System.out.println("Date: "+date);
                System.out.println("Type of Transaction: "+type);
            }

        }


