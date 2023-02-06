package org.example;

public class AnotherUseCaseTemplateMethodImpl extends TemplateMethod {
    @Override
    protected void validate(Data data) {
        System.out.println("boo i am validating uuu");
    }

    @Override
    protected void doFirstImportantDeed(Data data) {
        System.out.println("i make profit");
    }

    @Override
    protected void doSecondImportantDeed(Data data) {
        System.out.println("i make proft too");
    }
}
