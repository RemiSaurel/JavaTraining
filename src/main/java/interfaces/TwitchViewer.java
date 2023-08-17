package interfaces;

public class TwitchViewer implements Viewer {

    private String username;
    private String channel;

    public TwitchViewer(String username, String channel) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty");
        }
        if (channel == null || channel.isEmpty()) {
            throw new IllegalArgumentException("Channel cannot be null or empty");
        }
        this.username = username;
        this.channel = channel;
    }

    @Override
    public void watch() {
        System.out.println(username + " is watching " + channel);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(username + " sent a message: " + message);
    }

    @Override
    public void sendDonation(double amount) {
        System.out.println(username + " donated $" + amount);
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty");
        }
        this.username = username;
    }

    @Override
    public String getChannel() {
        return channel;
    }

    @Override
    public void setChannel(String channel) {
        if (channel == null || channel.isEmpty()) {
            throw new IllegalArgumentException("Channel cannot be null or empty");
        }
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "TwitchViewer{" +
                "username='" + username + '\'' +
                ", channel='" + channel + '\'' +
                '}';
    }
}
