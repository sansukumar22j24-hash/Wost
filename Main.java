package AAAAA;

import MovieTicketBookingSystem.GoldScreen;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ViewerInterface viewer1= new Viewer();
        ViewerInterface viewer2= new Viewer();

        Scanner sc= new Scanner(System.in);

        BigInteger bigInteger= new BigInteger(sc.nextLine());
        System.out.println("No of seats");
        viewer1.setNumberOfSeats(bigInteger.intValue());

        System.out.println("Screen Type");
        String screenType= sc.nextLine();
        viewer1.setScreenType(screenType);

        System.out.println("Snacks");
        String snacks=sc.nextLine();
        viewer1.setSnackQuality(snacks);

        System.out.println("Snack Quality");
        BigInteger snackQualiy= new BigInteger(sc.nextLine());
        viewer2.setSnackQuality(snackQualiy);

        BigInteger bigInteger2= new BigInteger(sc.nextLine());
        System.out.println("No of seats");
        viewer1.setNumberOfSeats(bigInteger2.intValue());

        System.out.println("Screen Type");
        String screenType2= sc.nextLine();
        viewer1.setScreenType(screenType2);

        System.out.println("Snacks");
        String snacks2=sc.nextLine();
        viewer1.setSnackQuality(snacks2);

        System.out.println("Snack Quality");
        BigInteger snackQualiy= new BigInteger(sc.nextLine());
        viewer2.setSnackQuality(snackQualiy);

        if(viewer1.getScreenType().equals("Gold")){
            ScreenInterface goldScreen= new GoldScreen(10,400,200,viewer1);
            ScreenInterface[] screen=viewer1.getScreen();
            screen[0]=goldScreen;
            goldScreen.calculateTicketPrice();
            goldScreen.calculateSnackPrize();
            goldScreen.generateBill();
            goldScreen.applyDiscount();
            System.out.println("Final Bill");
            System.out.println(viewer1.getScreen()[0].getTotalBill);
            System.out.println("Booking Id :");
            System.out.println(viewer1.getScreen()[0].getBookingId);

        }






    }

}
