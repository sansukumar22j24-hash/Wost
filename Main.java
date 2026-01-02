package MovieTicketBookingSystem;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Viewer viewer=new Viewer(1);
        Viewer viewer2=new Viewer();

        Scanner sc= new Scanner(System.in);
        BigInteger input1=new BigInteger(sc.nextLine());
        System.out.println("Enter the numberOfSeats : ");
        viewer.setNumberOfSeats(input1.intValue());
        System.out.println("Enter the ScreenType : ");
        String screenType=sc.nextLine();
        viewer.setScreenType(screenType);
        System.out.println("Enter Snacks YES||NO ");
        String wantsSnacks=sc.nextLine();
        viewer.setWantSnacks(wantsSnacks);

    //    int snackQuality;
//        if(wantsSnacks.equals("YES"))
//            System.out.println("Enter the SnacksQuality ");
//         snackQuality = sc.nextInt();
//         System.out.println(snackQuality);

        if(viewer.getScreenType()=="GOLD"){
            GoldScreen goldScreen=new GoldScreen(1,200,100,300);
            viewer.setGoldScreen(goldScreen);
            goldScreen.calculateTicketPrice();
            goldScreen.calculateSnackPrice();
            goldScreen.generateBill();
            goldScreen.applyDiscount();
            System.out.println("===== BOOKING SUMMARY =====");
            System.out.println(viewer.getGoldScreen().getBookId());
            System.out.println(viewer.getGoldScreen().getTicketPrice());
            System.out.println(viewer.getGoldScreen().getSnackPrice());
            System.out.println(viewer.getGoldScreen().getTotalBill());
        }
        else {
            SilverScreen silverScreen=new SilverScreen(1,100,80,180);
            viewer.setSilverScreen(silverScreen);
            silverScreen.calculateTicketPrice();
            silverScreen.calculateSnackPrice();
            silverScreen.generateBill();
            silverScreen.applyDiscount();
            System.out.println("===== BOOKING SUMMARY =====");
            System.out.println(viewer.getSilverScreen().getBookId());
            System.out.println(viewer.getSilverScreen().getTicketPrice());
            System.out.println(viewer.getSilverScreen().getSnackPrice());
            System.out.println(viewer.getSilverScreen().getTotalBill());

        }

        }
        System.out.println("Enter the numberOfSeats : ");
        int numberOfSeats= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the ScreenType : ");
        String screenType=sc.nextLine();
        System.out.println("Enter Snacks YES||NO ");
        String wantsSnacks=sc.nextLine();
        if(wantsSnacks.equals("YES")) {
            System.out.println("Enter the SnacksQuality ");
            int snackQuality = sc.nextInt();
            System.out.println(snackQuality);
        }
        viewer2.setNumberOfSeats(numberOfSeats);
        viewer2.setScreenType(screenType);
        viewer2.setWantSnacks(wantsSnacks);


        if(viewer2.getScreenType()=="GOLD"){
            GoldScreen goldScreen=new GoldScreen(2,300,150,450);
            viewer2.setGoldScreen(goldScreen);
            goldScreen.calculateTicketPrice();
            goldScreen.calculateSnackPrice();
            goldScreen.generateBill();
            goldScreen.applyDiscount();
            System.out.println("===== BOOKING SUMMARY =====");
            System.out.println(viewer2.getGoldScreen().getBookId());
            System.out.println(viewer2.getGoldScreen().getTicketPrice());
            System.out.println(viewer2.getGoldScreen().getSnackPrice());
            System.out.println(viewer2.getGoldScreen().getTotalBill());
        }
        else{
            SilverScreen silverScreen=new SilverScreen(2,140,200,340);
            viewer2.setSilverScreen(silverScreen);
            silverScreen.calculateTicketPrice();
            silverScreen.calculateSnackPrice();
            silverScreen.generateBill();
            silverScreen.applyDiscount();
            System.out.println("===== BOOKING SUMMARY =====");
            System.out.println(viewer2.getSilverScreen().getBookId());
            System.out.println(viewer2.getSilverScreen().getTicketPrice());
            System.out.println(viewer2.getSilverScreen().getSnackPrice());
            System.out.println(viewer2.getSilverScreen().getTotalBill());

        }


    }
}
//BigInteger numberOfSeats=new BigInteger (sc.nextInt());
//        viewer.setNumberOfSeats(numberOfSeats.intValue());