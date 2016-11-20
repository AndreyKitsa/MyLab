class Loader extends Thread{
        public void run(){
                try{
                Thread.sleep(10000);
                } catch (InterruptedException e){
                System.out.println("Some error occured");
                }
                System.out.println("Thread 1");
        }
}
class Loader2 extends Thread{
        public void run(){
                try{
                Thread.sleep(10000);
                } catch (InterruptedException e){
                System.out.println("Some error occured");
                }
                System.out.println("Thread 2");
        }
}
public class threadLoader{
        public static void main(String[] args){
                Loader obj = new Loader();
                obj.start();
                Loader2 obj2 = new Loader2();
                obj2.start();
        }
}
