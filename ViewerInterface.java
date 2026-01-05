package MovieTicket;

public interface ViewerInterface {

    public int getNumberOfSeats();
    public void setNumberOfSeats(int numberOfSeats);
    public String getScreenType() ;
    public void setScreenType(String screenType);
    public String getWantSnacks();
    public void setWantSnacks(String wantSnacks);
    public int getSnackQuality();
    public void setSnackQuality(int snackQuality);
    public ScreenInterface[] getScreen();
    public void setScreen(ScreenInterface[] screen);
//    public GoldScreenInterface getGoldScreen();
//    public void setGoldScreen(GoldScreenInterface goldScreen);
//    public SilverIScreenInterface getSilverScreen();
//    public void setSilverScreen(SilverIScreenInterface silverScreen);
}
