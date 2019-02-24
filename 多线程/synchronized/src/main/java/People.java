public class People{
    public int i ;
    public int n ;
    public synchronized void say(){
        for(int i=0;i<10;i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.i++;
            System.out.println(this.i+"  say  "+Thread.currentThread().getName());
        }
    }
    public synchronized void run(){
        for(int i=0;i<10;i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.n++;
            System.out.println(this.n+"  run  "+Thread.currentThread().getName());
        }
    }
}