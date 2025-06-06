import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Message {
    private final String content;
    private final String sender;
    private final String recipient;

    public Message(String content, String sender, String recipient) {
        this.content = content;
        this.sender = sender;
        this.recipient = recipient;
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void printSummary() {
        printCommonDetails();
    }

    public void printDetails() {
        printCommonDetails();
        System.out.println("Content Length: " + content.length());
        System.out.println("Sender Uppercase: " + sender.toUpperCase());
        System.out.println("Recipient Lowercase: " + recipient.toLowerCase());
    }

    private void printCommonDetails() {
        System.out.println("Content: " + content);
        System.out.println("Sender: " + sender);
        System.out.println("Recipient: " + recipient);
    }
}




