package MovieTicketBookingSystem;

public class Viewer {
    //• Knows: (from INPUT via Scanner)
    //  - numberOfSeats
    //  - screenType (GOLD / SILVER)
    //  - wantsSnacks (YES / NO)
    //  - snackQuantity
    private int numberOfSeats;
    private String screenType;
    private String wantSnacks;
    private int snackQuality;
    //Unknown: bookingId, ticketPrice, snackPrice, totalBill
private int bookId;
private int  ticketPrice;
private int snackPrice;
private int totalBill;
private GoldScreen goldScreen;
private SilverScreen silverScreen;
public Viewer(){}
    public Viewer(int snackQuality){
        this.snackQuality=snackQuality;
    }
    public Viewer(int numberOfSeats,String screenType,String wantSnacks,int snackQuality){
        this.numberOfSeats=numberOfSeats;
        this.screenType=screenType;
        this.wantSnacks=wantSnacks;
        this.snackQuality=snackQuality;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public String getWantSnacks() {
        return wantSnacks;
    }

    public void setWantSnacks(String wantSnacks) {
        this.wantSnacks = wantSnacks;
    }

    public int getSnackQuality() {
        return snackQuality;
    }


    public void setSnackQuality(int snackQuality) {
        this.snackQuality = snackQuality;
    }

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

    public GoldScreen getGoldScreen() {
        return goldScreen;
    }

    public void setGoldScreen(GoldScreen goldScreen) {
        this.goldScreen = goldScreen;
    }

    public SilverScreen getSilverScreen() {
        return silverScreen;
    }

    public void setSilverScreen(SilverScreen silverScreen) {
        this.silverScreen = silverScreen;
    }


}
