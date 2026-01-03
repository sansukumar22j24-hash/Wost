package AAAAA;

public class Viewer implements ViewerInterface {
private int numberOfSeats;
private String screenType;
private String wantSnacks;
private int snackQuality;
private Screen [] screen= new Screen[2];


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


    public Viewer(){

    }

    public Screen[] getScreen() {
        return screen;
    }

    public void setScreen(Screen[] screen) {
        this.screen = screen;
    }

//    public int getNoOfSeats() {
//    }
}
