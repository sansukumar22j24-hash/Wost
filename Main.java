package MovieTicket;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== VIEWER 1 =====");
        Scanner sc = new Scanner(System.in);
        Viewer viewer = new Viewer();

        BigInteger num1;

        System.out.println("Enter the number of seats");
        num1 = new BigInteger(sc.nextLine());
        viewer.setNumberOfSeats(num1.byteValue());

        System.out.println("Enter screen type (GOLD/SILVER):");
        String screenType = (sc.nextLine());
        viewer.setScreenType(screenType);

        System.out.println("Want snacks? (YES/NO) ");
        String wantsSnacks = (sc.nextLine());
        viewer.setWantSnacks(wantsSnacks);

        BigInteger snackQuantity;
        if (wantsSnacks.equals("YES")) {
            System.out.println("Enter Snack Quality:");
            snackQuantity = new BigInteger(sc.nextLine());
        } else {
            snackQuantity = new BigInteger("0");
        }


        viewer.setSnackQuality(snackQuantity.intValue());

        if (viewer.getScreenType().equals("GOLD"))
        {
            System.out.println("===== GOLD SCREEN =====");
            int [][] goldScreen=new int [6][5];

            for (int i = 0; i < goldScreen.length; i++) {
                if(1!=0){
                    System.out.print((char)(65+i-1));
                    System.out.print(" ");
                }
                for (int j = 0; j < goldScreen[i].length; j++) {
                    if(i==0&&j==0){
                        System.out.print(" ");
                    }
                    System.out.print(goldScreen[i][j]);
                    System.out.print(" ");
                    }
                System.out.println();
            }
            for (int i=0;i< viewer.getNumberOfSeats();i++){

                boolean isValidSeat=false;
                boolean isAlreadyBookedSeats=false;

                while (!isValidSeat || !isAlreadyBookedSeats){

              try {
                  System.out.println("enter the rows");
                  String row = sc.nextLine();
                  char[] ch = row.toCharArray();
                  int finalRows = ch[0] - 65;
                  BigInteger seat = new BigInteger(String.valueOf(ch[1]));
                  int finalSeats = seat.intValue() - 1;

                  if (goldScreen[finalRows + 1][finalSeats] == 1) {
                      isAlreadyBookedSeats = true;
                      System.out.println("Already Booked ");
                      isValidSeat = true;
                  }
              }
                catch(Exception e){
                    System.out.println("Error check Again");

                }
                }


            }

            ScreenInterface golderScreen;
            golderScreen = new GoldScreen(1, 300, 200, viewer);
            ScreenInterface[] arr = viewer.getScreen();
            arr[0] = golderScreen;
            golderScreen.setViewer(viewer);
            arr[0].calculateSnackPrice();
            arr[0].calculateTicketPrice();
            arr[0].generateBill();
            arr[0].applyDiscount();

            //            System.out.println(viewer.getGoldScreen().getBookingId());
//            System.out.println(viewer.getGoldScreen().getTicketPrice());
//            System.out.println(viewer.getGoldScreen().getSnackPrice());
//            System.out.println(viewer.getGoldScreen().getTotalBill());
        }


        else
        {
        ScreenInterface silverScreen = new SilverScreen(1, 100, 200, viewer);
        ScreenInterface[] arr = viewer.getScreen();
        arr[1] = silverScreen;
        silverScreen.setViewer(viewer);
        arr[1].calculateSnackPrice();
        arr[1].calculateTicketPrice();
        arr[1].generateBill();
        arr[1].applyDiscount();
        //            System.out.println(viewer.getSilverScreen().getBookingId());
//            System.out.println(viewer.getSilverScreen().getTicketPrice());
//            System.out.println(viewer.getSilverScreen().getSnackPrice());
//            System.out.println(viewer.getSilverScreen().getTotalBill());

      }

        System.out.println("===== BOOKING SUMMARY =====");


        System.out.println("Enter the number of seats");
            BigInteger num2 = new BigInteger(sc.nextLine());
            System.out.println("Enter screen type (GOLD/SILVER):");
            String screenType2 = (sc.nextLine());
            System.out.println("Want snacks? (YES/NO) ");
            String wantsSnacks2 = (sc.nextLine());
            BigInteger snackQuantity2;
            if (wantsSnacks.equals("YES")) {
                System.out.println("Enter Snack Quality:");
                snackQuantity2 = new BigInteger(sc.nextLine());
            } else {
                snackQuantity2 = new BigInteger("0");
            }

            Viewer viewer2 = new Viewer(num2.intValue(), screenType2, wantsSnacks2, snackQuantity2.intValue());
//        viewer.getSnackQuality();
            if (viewer2.getScreenType().equals("GOLD")) {
                ScreenInterface goldScreen = new GoldScreen(2, 300, 200, viewer);
                ScreenInterface[] arr = viewer.getScreen();
                arr[0] = goldScreen;
                goldScreen.setViewer(viewer);
                arr[0].calculateSnackPrice();
                arr[0].calculateTicketPrice();
                arr[0].generateBill();
                arr[0].applyDiscount();
                // viewer2.setGoldScreen(goldScreen);
//            System.out.println("===== BOOKING SUMMARY =====");
//            System.out.println(viewer2.getGoldScreen().getBookingId());
//            System.out.println(viewer2.getGoldScreen().getTicketPrice());
//            System.out.println(viewer2.getGoldScreen().getSnackPrice());
//            System.out.println(viewer2.getGoldScreen().getTotalBill());
            } else {
                ScreenInterface silverScreen = new SilverScreen(2, 100, 200, viewer2);
                ScreenInterface[] arr = viewer.getScreen();
                arr[1] = silverScreen;
                silverScreen.setViewer(viewer);
                arr[1].calculateSnackPrice();
                arr[1].calculateTicketPrice();
                arr[1].generateBill();
                arr[1].applyDiscount();
//            viewer2.setSilverScreen(silverScreen);
//            System.out.println("===== BOOKING SUMMARY =====");
//            System.out.println(viewer2.getSilverScreen().getBookingId());
//            System.out.println(viewer2.getSilverScreen().getTicketPrice());
//            System.out.println(viewer2.getSilverScreen().getSnackPrice());
//            System.out.println(viewer2.getSilverScreen().getTotalBill());

            }
            System.out.println("comparison viewer1 and viewer2");
            ScreenInterface[] d1 = viewer.getScreen();
            ScreenInterface[] d2 = viewer2.getScreen();

            if (d1[0].getTotalBill() > d1[1].getTotalBill()) {
                System.out.println("Viewer 1 paid more!");
            } else if (d1[0].getTotalBill() > d1[1].getTotalBill()) {
                System.out.println("Viewer 2 paid more!");
            } else {
                System.out.println("Both paid same amount!");
            }
        }

    }
