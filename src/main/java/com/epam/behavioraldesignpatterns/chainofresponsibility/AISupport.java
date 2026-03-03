package com.epam.behavioraldesignpatterns.chainofresponsibility;

public class AISupport extends SupportHandler {
    @Override
    public void handleRequest(String issueSeverity) {
        if (issueSeverity.equals("BASIC")) {
            System.out.println("AI: Sorun SSS dökümanı ile çözüldü.");
        } else if (nextHandler != null) {
            System.out.println("AI: Bu beni aşar, Junior'a aktarıyorum...");
            nextHandler.handleRequest(issueSeverity);
        }
    }
}

class JuniorSupport extends SupportHandler {
    @Override
    public void handleRequest(String issueSeverity) {
        if (issueSeverity.equals("MEDIUM")) {
            System.out.println("Junior: Sorunu manuel müdahale ile çözdüm.");
        } else if (nextHandler != null) {
            System.out.println("Junior: Kritik bir durum, Senior'a paslıyorum...");
            nextHandler.handleRequest(issueSeverity);
        }
    }
}

class SeniorSupport extends SupportHandler {
    @Override
    public void handleRequest(String issueSeverity) {
        if (issueSeverity.equals("CRITICAL")) {
            System.out.println("Senior: Sistemdeki bug düzeltildi, sorun çözüldü.");
        } else {
            System.out.println("Destek Ekibi: Maalesef bu sorun tanımlanamadı.");
        }
    }
}
