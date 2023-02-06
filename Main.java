package org.example;

public class Main {
    public static void main(String[] args) {
        TemplateMethod templateMethod = new AnotherUseCaseTemplateMethodImpl();
        Data data = new Data();
        data.data = 5;
        templateMethod.doAll(data);
    }
}