public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        long result = textCount();
        //运算结果在10000-20000之间
        System.out.println("运算结果是====" + result);
    }

    public static long textCount() {
        Calculate calculate = new Calculate();
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                calculate.addCount();
            }
        });

        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                calculate.addCount();
            }
        });

        threadOne.start();
        threadTwo.start();
        try {
            threadOne.join();
            threadTwo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return calculate.getCount();

    }

}
