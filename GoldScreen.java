package MovieTicket;

public class GoldScreen extends Screen implements GoldScreenInterface{


    public GoldScreen(){}
    public GoldScreen(int bookingId,int snackPrice,int convienince,Viewer viewer){
        this.setViewer(viewer);
        this.setBookingId(  bookingId);
        this.setSnackPrice(snackPrice);
        this.setConvienince( convienince);
    }


}
