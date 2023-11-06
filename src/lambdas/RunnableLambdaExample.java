package lambdas;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        /**
         * Prior Java-8
         * Legacy way of programming
         */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };
        new Thread(runnable).start();

        /*
         * Java-8 Lambda Expression
         * ()->{}
         */

        Runnable runnableLambda = ()->{
            System.out.println("Inside Runnable 2");
        };
        new Thread(runnableLambda).start();

        //single liner
        Runnable runnableLambda1 = ()-> System.out.println("Inside Runnable 2.1");
        new Thread(runnableLambda1).start();

        //curly braces needed in case of multiple lines
        Runnable runnableLambdaMultiple = ()->{
            System.out.println("Inside Runnable multiple lines- ");
            System.out.println("Inside Runnable multiple lines--");
        };
        new Thread(runnableLambdaMultiple).start();

        // a little more concise way to write lambda expression here
        new Thread(()-> System.out.println("Inside lambda 3")).start();

        /*
         * The same above expression using legacy way of programming
         */
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 4");
            }
        }).start();

    }
}
