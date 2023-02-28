import java.time.Period;
import java.util.Scanner;

class Bank{
    double Interest=0;
    int Pamount=0;
    int period=0;
    double roi;

    void getRateofInterest(){
        System.out.println(roi);
    }

    void getdetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter principal amount:");
        Pamount=sc.nextInt();
        System.out.println("enter time period(years):");
        period =sc.nextInt();
    }

    void calculateInterest(){
        Interest=(Pamount*roi*period)/100;
    }

}

class SBI extends Bank{
    SBI(){
        roi=8.4;

    }

    void getRateofInterest(){
        System.out.println("interest rate of SBI is "+roi);

    }
    void calculateInterest(){
        getdetails();
        Interest=(Pamount*roi*period)/100;
        System.out.println("your interest over "+period+" years is: "+Interest);


    }
}


class ICICI extends Bank{
    ICICI(){
        roi=9.7;
    }

    void getRateofInterest(){
        System.out.println("interest rate of ICICI is "+roi);

    }
    void calculateInterest(){
        getdetails();
        Interest=(Pamount*roi*period)/100;
        System.out.println("your interest over "+period+" years is:"+Interest);


    }
}


class HDFC extends Bank{
    HDFC(){
        roi=7.3;
    }

    void getRateofInterest(){
        System.out.println("interest rate of HDFC is "+roi);

    }
    void calculateInterest(){
        getdetails();
        Interest=(Pamount*roi*period)/100;
        System.out.println("your interest over "+period+" years is :"+Interest);


    }
}


public class Main1 {
    public static void main(String[] args) {
        int choice;
        do{
        Scanner s=new Scanner(System.in);
        System.out.println("hello user! greeting of the day! \n");
        Bank inv = new Bank();
        System.out.println("enter the choice of the bank 1)SBI 2)ICICI 3)HDFC :");
        choice=s.nextInt();

        switch (choice){
            case 1: inv=new SBI();
            break;



            case 2: inv=new ICICI();
            break;

            case 3: inv =new HDFC();
            break;

            default:System.out.println("invalid output!!");
        }
        inv.getRateofInterest();
        inv.calculateInterest();

        }while (choice!=0);
    }
}
