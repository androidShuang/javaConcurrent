public class Calculate {

    private long count = 0;

    public void addCount(){
        int i = 0;
        while(i++<10000){
//            System.out.println("当前线程==="+Thread.currentThread().getId());
            count+=1;
        }
        System.out.println("循环了=="+i+"次");
    }

    public long getCount(){
        return count;
    }

}
