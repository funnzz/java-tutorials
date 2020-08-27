package eu.training.concurrency;
//Running several threads of computation at the same time in the same process
//Share memory and resources
//Part of the same program

public class MultithreadingBasic extends Thread{

    private String country;

    public MultithreadingBasic(String country){
        super(country + " thread");
        this.country = country;
    }

    @Override
    public void run() {

        long id = Thread.currentThread().getId();
        System.out.println(id + ": country name is: "+ country);
    }

    public static void main(String[] args) {

        String [] countries = {"France", "India", "China", "USA"};

        for(String country: countries){
            new MultithreadingBasic(country).start();
        }
    }
}
