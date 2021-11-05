public class IntQueueRunner {
    public static void main(String[] args) {
        IntQueue test = new IntQueue(2);
        test.offer(5);
        test.offer(7);
        test.offer(9);
        System.out.println(test);
        System.out.println(test.isEmpty());
        System.out.println(test.poll());
        System.out.println(test.peek());
        System.out.println(test.poll());
        System.out.println(test.poll());
        System.out.println(test.isEmpty());
        System.out.println(test);
        System.out.println(test.peek());
    }
}