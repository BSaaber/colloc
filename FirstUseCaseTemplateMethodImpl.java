package org.example;

public class FirstUseCaseTemplateMethodImpl extends TemplateMethod {
    @Override
    protected void validate(Data data) {
        if (data.data == 0) {
            throw new RuntimeException("bad data: must be != 0");
        }
    }

    @Override
    protected void doFirstImportantDeed(Data data) {
        System.out.println("first important deed, btw data is: ");
        System.out.println(data.data);
    }

    // See, no doSecondImportantDeed impl? Because we use base impl
}
