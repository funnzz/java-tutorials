package eu.training.designpatterns;


import eu.training.designpatterns.builder.AccountInfo;
import eu.training.designpatterns.singleton.SingletonClass;

public class MainTest {

    public static void main(String[] args) {

        AccountInfo accountInfo = new AccountInfo.AccountInfoBuilder().setIban(55555).setSecondName("Rocky").build();
        System.out.println(accountInfo);

        SingletonClass singletonInstance = SingletonClass.getInstance();
        singletonInstance.message();
    }
}
