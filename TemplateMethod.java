package org.example;

public abstract class TemplateMethod {
    public void doAll(Data data) {
        validate(data);
        doFirstImportantDeed(data);
        doSecondImportantDeed(data);
    }

    protected abstract void validate(Data data);

    protected abstract void doFirstImportantDeed(Data data);

    protected void doSecondImportantDeed(Data data) {
        System.out.println("base second important deed implementation");
    }
}
