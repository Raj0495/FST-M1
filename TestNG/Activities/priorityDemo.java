package examples;

import org.testng.annotations.Test;

public class priorityDemo {

    @Test
    public void Four(){
        System.out.println("This is the Test Case number Four");
    }
    @Test(priority = 1)
    public void One() {
        System.out.println("This is the Test Case number One");
    }

    @Test(priority = 2)
    public void Two() {
        System.out.println("This is the Test Case number Two");
    }

    @Test(priority = 3)
    public void Three() {
        System.out.println("This is the Test Case number Three");
    }

    @Test(priority = -1)
    public void Five(){
        System.out.println("This is the Test Case number Five");
    }
    @Test(priority = -1)
    public void Six(){
        System.out.println("This is the Test Case number Six");
    }

    @Test(priority=0)
    public void seven(){
        System.out.println("This is the Test Case number seven");
    }
}
