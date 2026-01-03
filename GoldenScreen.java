package AAAAA;

public class GoldenScreen extends  Screen{
    public GoldenScreen(int bookingId,int ticketPrice,int snackPrice,ViewerInterface viewer) {
        this.setBookingId(bookingId);
        this.setTicketPrice(ticketPrice);
        this.setSnackPrice(snackPrice);
        this.setViewer(viewer);
    }
}
