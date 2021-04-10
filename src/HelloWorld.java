import java.lang.Thread;
import java.util.ArrayList;


public class HelloWorld {
    static ArrayList<String> someNumbers = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        /*HelloWorld n = new HelloWorld();
        ByeWorld r = new ByeWorld();
        boolean b = r.hashCode()==n.hashCode();
        System.out.println(b);
        System.out.println(testFunction3Arity());*/
        go();

        Thread gtg = new Hairloo();
        Thread gg = new Crypto();
        gtg.start();
        gtg.join();
        gg.start();


    }
    public static void go(){
        someNumbers.add("Identify the target");
        someNumbers.add("Rummage in your files");
        someNumbers.add("Identity weak spots");
        someNumbers.add("Slow your Net");
        someNumbers.add("Blocking your keyboard and mouse");
        someNumbers.add("Watching to you in your camera");
        someNumbers.add("Pressing F");
        someNumbers.add("Destroy your device");



    }


}
class Crypto extends Thread {
    public void run(){
        String outputNumber;
        for(int i = 0; i < HelloWorld.someNumbers.size() ; i++){
            outputNumber = HelloWorld.someNumbers.get(i);
            System.out.print(outputNumber + testFunction3Arity());
            for(int r = 0; r <= 10; r++){
                System.out.print(".");
                try {
                    Thread.sleep(100);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println();
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }

        }
        System.out.println("You been hacked by Crypto");
    }
    public static int testFunction3Arity() {
        int c = 3;
        int d = 4;
        return (c + d);

    }
}
class Hairloo extends Thread {
    public void run(){
        String outputNumber;
        for(int i = 0; i < HelloWorld.someNumbers.size() ; i++){
            outputNumber = HelloWorld.someNumbers.get(i);
            System.out.print(outputNumber);
            for(int r = 0; r <= 10; r++){
                System.out.print(".");
                try {
                    Thread.sleep(50);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println();
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("You been hacked by Hairloo");
    }
}


