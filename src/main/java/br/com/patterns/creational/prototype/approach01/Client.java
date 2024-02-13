package br.com.patterns.creational.prototype.approach01;

import java.time.LocalDateTime;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        var documentTemplateRegistry = new DocumentTemplateRegistry();
        var clonedLetterTemplate = documentTemplateRegistry.getByName("letter");
        var clonedInvoiceTemplate = documentTemplateRegistry.getByName("invoice");

        clonedInvoiceTemplate.setTitle("Custom invoice template");
        clonedInvoiceTemplate.setBody("Custom invoice body");
        clonedInvoiceTemplate.setCreationDate(LocalDateTime.now());
        clonedInvoiceTemplate.getOwner().setName("Kelly");

        System.out.println(clonedLetterTemplate);
        System.out.println(clonedInvoiceTemplate);
    }

}
