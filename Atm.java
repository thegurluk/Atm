import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        int right=3;
        int select=0;
        int balance=100000;
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Cloud Bank.");
        while (right>0){
            System.out.print("Enter your username:");
            String username=input.nextLine();
            System.out.print("Enter your password:");
            String password=input.nextLine();
            if(username.equals("yusufsss") && password.equals("daralma457")){
                while (select!=4){
                    System.out.println("         --------------");
                    System.out.println("1-balance enquiry\n2-withdrawals\n3-money investment\n4-exist");
                    System.out.print("Please choose the operation you want to do:");
                    select = input.nextInt();

                    switch (select){
                        case 1:
                            System.out.println("your Balance is:"+balance);
                            break;
                        case 2:
                            System.out.print("how much money will you withdraw:");
                            int money=input.nextInt();
                            if(balance>=money){
                                balance-=money;
                                System.out.println("withdraw is success.");
                            }else {
                                System.out.println("insufficient balance.");
                            }
                            break;
                        case 3:
                            System.out.print("how much money will you investment:");
                            int newMoney=input.nextInt();
                            balance+=newMoney;
                            break;
                        case 4:
                            System.out.println("you are logged out.\n Have a good day.");
                            select=4;
                            break;
                        default:
                            System.out.println("Invalid election");
                    }
                }
                right=0;
            }else {
                right--;
                if (right>0) {
                    System.out.println("your informations are not correct.");
                    System.out.println("please try again");
                }else {
                    System.out.println("your account has been blocked.");
                }

            }
        }




    }
}
