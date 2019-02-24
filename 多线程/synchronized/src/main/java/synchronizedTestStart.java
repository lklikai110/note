public class synchronizedTestStart {

    /**
     *
     * 同一类中多个同步方法用同一锁时，方法间不保证原子性
     *
     */
    public static void main(String[] args) {
        People p = new People();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" 地址： "+p);
                p.say();
                p.run();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" 地址： "+p);
                p.run();
            }
        });
        t1.start();
        t2.start();
    }

}
