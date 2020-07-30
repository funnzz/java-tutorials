package eu.training.designpatterns;


import eu.training.designpatterns.builder.AccountInfo;

public class MainTest {

    public static void main(String[] args) {

        AccountInfo accountInfo = new AccountInfo.AccountInfoBuilder().setIban(55555).setSecondName("Rocky").build();

        System.out.println(accountInfo);
    }
}
