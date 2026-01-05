package MovieTicket;

public abstract class Screen implements ScreenInterface  {
    private int bookingId;
    private  int ticketPrice;
    private int snackPrice;
    private int totalBill;
    private  int convienince;
    private ViewerInterface viewer;

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

    public int getConvienince() {
        return convienince;
    }

    public void setConvienince(int convienince) {
        this.convienince = convienince;
    }

    public ViewerInterface getViewer() {
        return viewer;
    }

    public void setViewer(ViewerInterface viewer) {
        this.viewer = viewer;
    }

    public  void calculateTicketPrice(){
        int ticketprice =this.getViewer().getNumberOfSeats()*500;
        this.setTicketPrice(ticketprice);
        System.out.println("ticket Price: "+this.getTicketPrice());
    }
    public void  calculateSnackPrice(){
        if(this.getViewer().getWantSnacks().equals("YES")){
            System.out.println( "Snack Price: " + getSnackPrice());
            int snackPrice = getViewer().getSnackQuality()*this.getConvienince();
            this.setSnackPrice(snackPrice);
            System.out.println("Snack Price: "+this.getSnackPrice());


        }

    }
    public void  generateBill(){
        int totalBill=getTicketPrice()+getSnackPrice()+getConvienince();
        setTotalBill(totalBill);
        System.out.println( "Total Bill: " +getTotalBill());
    }
    public void applyDiscount(){
        if(getViewer().getNumberOfSeats()>=4){
            int discountAmount= this.getTotalBill()*10/100;
            System.out.println("Discount Applied: " + discountAmount);
        }
        else{
            int discountAmount=0;
            System.out.println("Discount Applied: " + discountAmount);
        }
    }

}
