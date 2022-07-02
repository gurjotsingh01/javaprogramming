class A extends Thread {

    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 1; i <= 5; i++) {

            System.out.println(name);

        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {

        }

    }
}

class B extends Thread {

    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 1; i <= 5; i++) {

            System.out.println(name);

        }
        try {
            Thread.sleep(10000);// sleep for 10 sec after the execution of the loop and then terminated
        } catch (InterruptedException e) {

        }

    }
}

class test {

    public static void main(String args[]) throws Exception {
        A t = new A();// thread 0 created
        B t2 = new B();// thread 1 created
        t.start();
        t2.start();

        t.join(2000);

        t2.join(5000);

    }

}