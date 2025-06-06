import java.util.List;

public class Main {
    public static void main(String[] args) {
        MessagingService messagingService = new MessagingService();

        messagingService.sendMessage("Hello, tenant!", "Property Manager", "Tenant A");
        messagingService.sendMessage("Important notice: Rent due next week.", "Property Owner", "Tenant A");
        messagingService.sendMessage("Maintenance request received.", "Tenant A", "Property Manager");

    
        System.out.println("Messages for Tenant A:");
        List<Message> tenantAMessages = messagingService.getMessagesForRecipient("Tenant A");
        for (Message message : tenantAMessages) {
            System.out.println("From: " + message.getSender() + ", Content: " + message.getContent());
        }

   
        System.out.println("Example Message Details:");
        Message exampleMessage = new Message("Test", "Sender", "Recipient");
        exampleMessage.printDetails();

   
        System.out.println("All Messages:");
        messagingService.printAllMessages();
    }
}