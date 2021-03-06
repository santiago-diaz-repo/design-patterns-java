package singleton;

public class Singleton {

    private static Singleton instance = null;

    private Singleton(){ }

    public static Singleton getInstance(){
        if(instance == null){
            System.out.println("Creating instance");
            instance = new Singleton();
        }
        return instance;
    }
}