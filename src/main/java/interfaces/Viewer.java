package interfaces;

public interface Viewer extends User {

    void watch();

    void sendMessage(String message);

    void sendDonation(double amount);
}
