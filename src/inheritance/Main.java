package inheritance;

public class Main {

    public static void main(String[] args) {

        IndividualCustomer enes=new IndividualCustomer();
        enes.customerNumber="12345";

        CorporateCustomer hepsiBurada=new CorporateCustomer();
        hepsiBurada.customerNumber="Hepsi Burada";

        SendikaCustomer abc=new SendikaCustomer();
        abc.customerNumber="99999";
        CustomerManager customManager=new CustomerManager();
//		customManager.add(hepsiBurada);
//		customManager.add(enes);
//		customManager.add(abc);

        Customer[] customers= {enes,hepsiBurada,abc};

        customManager.addMultiple(customers);
    }

}
