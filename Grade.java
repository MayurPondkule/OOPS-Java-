import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        System.out.println("enter number of students:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1; i<=n;i++){
            System.out.println("enter marks of 5 subjects");
            int sub1=sc.nextInt();
            int sub2=sc.nextInt();
            int sub3=sc.nextInt();
            int sub4=sc.nextInt();
            int sub5=sc.nextInt();
            float avg=(sub1+sub2+sub3+sub4+sub5)/5;

            if(avg>=80){
                System.out.println("grade is A");
            }

            else if(avg<80 & avg>60){
                System.out.println("grade is B");
            }

            else if(avg<60 & avg>=40){
                System.out.println("grade is C");


            }
            else {
                System.out.println("grade is D");
            }

        }
    }
}
