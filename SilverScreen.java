package MovieTicket;

public class SilverScreen  extends Screen implements SilverIScreenInterface {

    public  SilverScreen(){

    }
    public  SilverScreen(int bookingId,int convienince, int snackPrice,Viewer viewer){
        this.setViewer(viewer);
        this.setBookingId(  bookingId);
        this.setSnackPrice(snackPrice);
        this.setConvienince( convienince);

    }
//
//    public void calculateTicketPrice(){
//        int ticketPrice=getViewer().getNumberOfSeats()*200;
//        this.setTicketPrice(ticketPrice);
//        System.out.println(this.getTicketPrice());
//    }
//    public void calculateSnackPrice(){
//        if(getViewer().getWantSnacks().equals("YES")){
//            int snackPrice=getViewer().getSnackQuality()*80;
//            this.setSnackPrice(snackPrice);
//            System.out.println("Snack Price: "+this.getSnackPrice());
//        }
//        else{
//            int snackPrice=0;
//            System.out.println("Snack Price: "+this.getSnackPrice());
//        }
//    }
//    public void generateBill(){
//        int totalBill= this.getTicketPrice()+this.getSnackPrice()+this.getConvienince();
//        this.setTotalBill(totalBill);
//        System.out.println("Total Bill: " +this.getTotalBill());
//    }
//    public void applyDiscount(){
//        if(getViewer().getNumberOfSeats()>=4){
//            int discountAmount= getTotalBill()*10/100;
//            System.out.println( "Discount Applied: " + discountAmount );
//        }
//    }


}
