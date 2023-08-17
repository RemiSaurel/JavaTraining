package interfaces;

public interface Viewer extends User {

    public void watch();

    public void sendMessage(String message);
    public void sendDonation(double amount);
}
