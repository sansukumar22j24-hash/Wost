package MovieTicket;

public class Viewer implements ViewerInterface {
    //known
    private int numberOfSeats;
    private String screenType;
    private String wantSnacks;
    private int snackQuality;


    // unknown

//    private int bookingId;
//    private  int ticketPrice;
//    private int snackPrice;
//    private int totalBill;
//    private GoldScreenInterface goldScreen;
//    private SilverIScreenInterface silverScreen;
private  ScreenInterface[]  screen= new ScreenInterface[2];

    public  Viewer(){

    }
    public  Viewer( int numberOfSeats,String screenType,String wantSnacks,int snackQuality){

        this.numberOfSeats = numberOfSeats;
        this.screenType = screenType;
        this.wantSnacks = wantSnacks;
        this.snackQuality = snackQuality;
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
//
//    public GoldScreenInterface getGoldScreen() {
//        return goldScreen;
//    }
//
//    public void setGoldScreen(GoldScreenInterface goldScreen) {
//        this.goldScreen = goldScreen;
//    }
//
//    public SilverIScreenInterface getSilverScreen() {
//        return silverScreen;
//    }
//
//    public void setSilverScreen(SilverIScreenInterface silverScreen) {
//        this.silverScreen = silverScreen;
//    }

    public ScreenInterface[] getScreen() {
        return screen;
    }

    public void setScreen(ScreenInterface[] screen) {
        this.screen = screen;
    }
}
