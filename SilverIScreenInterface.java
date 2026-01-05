package MovieTicket;

public interface SilverIScreenInterface extends ScreenInterface {
    public void calculateTicketPrice();
    public void calculateSnackPrice();
    public void generateBill();
    public void applyDiscount();

}
