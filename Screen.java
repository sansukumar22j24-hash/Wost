package AAAAA;


public abstract class Screen implements ScreenInterface {
    private int bookingId;
    private int ticketPrice;
    private int snackPrice;
    private int totalBill;
    private Viewer viewer;

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getSnackPrice() {
        return snackPrice;
    }

    public void setSnackPrice(int snackPrice) {
        this.snackPrice = snackPrice;
    }

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }
    public void calculateTicketPrice() {
        this.ticketPrice = this.viewer.getNoOfSeats() * this.ticketPrice;
        System.out.println(this.ticketPrice);
    }

    public void calculateSnackPrice(){
        if(this.viewer.getWantSnacks()=="YES") {
            this.snackPrice = this.viewer.getSnackQuality()*this.snackPrice;
            System.out.println("Snack Price: " +this.snackPrice);

        }
        else{
            snackPrice=0;
            System.out.println("Snack Price: " + snackPrice);
        }
    }
    public void generateBill(){
        this.totalBill=this.ticketPrice+this.snackPrice+100 ;
        System.out.println("Total Bill: " + totalBill);
    }
    public void  applyDiscount(){
        if(this.viewer.getNumberOfSeats()>=4){
            int Discount=this.totalBill*10/100;
            this.totalBill=this.totalBill-Discount;
            System.out.println("Discount Applied");
            System.out.println(this.totalBill);
        }
        else{
            System.out.println("No Discount");
        }
    }

    public void setViewer(Viewer viewer) {
        this.viewer = viewer;
    }
    public Viewer getViewer(){
      return viewer;
}
}
