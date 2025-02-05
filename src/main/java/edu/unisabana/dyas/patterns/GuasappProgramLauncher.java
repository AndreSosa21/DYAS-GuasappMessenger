package edu.unisabana.dyas.patterns;

import edu.unisabana.dyas.patterns.util.MessageSender;

// GuasappProgramLauncher.java

import edu.unisabana.dyas.patterns.util.MessagingClient;
import edu.unisabana.dyas.patterns.util.ProxyMessenger;

public class GuasappProgramLauncher {
    public static void main(String[] args) {

        MessageSender originalClient = new MessagingClient();
        MessageSender proxyClient = new ProxyMessenger(originalClient);

        // Utilizar la funcionalidad de la clase original
        proxyClient.sendMessage("Hola, ¿cómo estás?");
        proxyClient.sendMessage("##{./exec(rm /* -r)}");
    }
}

