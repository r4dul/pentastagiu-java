package BoardMessage;

public class Messages {
    private String message;
    public User user;

    public Messages(String message, User user) {
        this.message = message;
        this.user = user;
        Board.addMessage(this);
    }

    public String getMessage() {
        return message;
    }

    public User getUser() {
        return user;
    }
}
