package inheritance2;

public class Main {

    public static void main(String[] args) {

//		LogManager logManager=new LogManager();
//		logManager.log(2);

        Logger logger=new DatabaseLogger();


        CustomerManager customerManager=new CustomerManager();
        customerManager.add(new DatabaseLogger()); //Logger datatype ında yeni bir databaselogger oluştuurldu

    }

}
