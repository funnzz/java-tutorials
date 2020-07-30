package eu.training.designpatterns.builder;

//The Builder pattern is used to help build final objects,
//for classes with a huge amount of fields or parameters

public class AccountInfo {

    private Integer iban;
    private String firstName;
    private String secondName;

    public double getIban() {
        return iban;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public static class AccountInfoBuilder {

        private Integer iban;
        private String firstName;
        private String secondName;

        public AccountInfoBuilder setIban(Integer iban) {
            this.iban = iban;
            return this;
        }

        public AccountInfoBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public AccountInfoBuilder setSecondName(String secondName) {
            this.secondName = secondName;
            return this;
        }

        public AccountInfo build() {
            AccountInfo accountInfo = new AccountInfo();
            accountInfo.iban = this.iban;
            accountInfo.firstName = this.firstName;
            accountInfo.secondName = this.secondName;
            return accountInfo;
        }

    }

    private AccountInfo() {
    }



    @Override
    public String toString() {
        return "AccountInfo{" +
                "iban=" + iban +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
