import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MessagingService {
    private final Map<String, List<Message>> inbox;

    public MessagingService() {
        this.inbox = new HashMap<>();
    }

    public void sendMessage(String content, String sender, String recipient) {
        Message message = new Message(content, sender, recipient);
        inbox.computeIfAbsent(recipient, k -> new ArrayList<>()).add(message);
    }

    public List<Message> getMessagesForRecipient(String recipient) {
        return inbox.getOrDefault(recipient, new ArrayList<>());
    }

    public void printAllMessages() {
        for (Map.Entry<String, List<Message>> entry : inbox.entrySet()) {
            String recipient = entry.getKey();
            List<Message> messages = entry.getValue();

            for (Message message : messages) {
                System.out.println(
                        "Recipient: " + recipient + "\n" +
                                "Sender: " + message.getSender() + "\n" +
                                "Content: " + message.getContent());

                System.out.println("-----------");
            }
        }
    }
}