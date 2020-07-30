package eu.training.designpatterns.singleton;

//The Singleton pattern ensures the existence of only one object instance in the whole JVM.

public class SingletonClass {

    private static SingletonClass singletonClass;

    private SingletonClass(){};

    public static SingletonClass getInstance(){
        if (singletonClass == null){
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }

    public void message(){
        System.out.println("singleton instance");
    }

}
