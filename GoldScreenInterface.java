package MovieTicket;

public interface GoldScreenInterface extends ScreenInterface{
    public int getBookingId();
    public void applyDiscount();
    public void  generateBill();
    public void  calculateSnackPrice();
    public  void calculateTicketPrice();
}
