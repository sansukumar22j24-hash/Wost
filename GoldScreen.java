package MovieTicketBookingSystem;

public class GoldScreen {
  // Knows: bookingId, ticketPrice, snackPrice, totalBill
  private int bookId;
    private int  ticketPrice;
    private int snackPrice;
    private int totalBill;
// Unknown: numberOfSeats, wantsSnacks, snackQuantity
    private int numberOfSeats;
    private String wantsSnacks;
    private int snackQuantity;
private Viewer viewer;

    public GoldScreen(int bookId,int  ticketPrice,int snackPrice,int totalBill){
      this.setBookId(bookId);
      this.setTicketPrice(ticketPrice);
      this.setSnackPrice(snackPrice);
      this.setTotalBill(totalBill);
    }
    public GoldScreen(){}
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
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

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getWantsSnacks() {
        return wantsSnacks;
    }

    public void setWantsSnacks(String wantsSnacks) {
        this.wantsSnacks = wantsSnacks;
    }

    public int getSnackQuantity() {
        return snackQuantity;
    }

    public void setSnackQuantity(int snackQuantity) {
        this.snackQuantity = snackQuantity;
    }

    public void calculateTicketPrice(){
       this.ticketPrice=viewer.getNumberOfSeats()*this.ticketPrice;

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
        if(numberOfSeats>=4){
            int Discount=this.totalBill*10/100;
            this.totalBill=this.totalBill-Discount;
            System.out.println("Discount Applied");
            System.out.println(this.totalBill);
        }
        else{
            System.out.println("No Discount");
        }
    }


    public Viewer getViewer() {
        return viewer;
    }

    public void setViewer(Viewer viewer) {
        this.viewer = viewer;
    }
}
