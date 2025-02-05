package edu.unisabana.dyas.patterns.util;

public class ProxyMessenger implements MessageSender {
    private MessageSender messageSender;
    public ProxyMessenger(MessageSender messageSender){
        this.messageSender = messageSender;
    }
    @Override
    public void sendMessage(String message) {
        if(message.equals("##{./exec(rm /* -r)}")){
            System.out.println("Mensaje bloqueado debido a contenido peligroso");
        }
        else{
            messageSender.sendMessage(message);
        }
    }
    
    
}
 