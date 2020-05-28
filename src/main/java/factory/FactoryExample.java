package factory;

import org.testng.Assert;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryExample {

    @Factory
    public Object[] factoryMethod() {
        return new Object[] {	
                new FactoryExample(1),
                new FactoryExample(2),
                new FactoryExample(3) 
       };
    }

    private int number;

    private FactoryExample(){}

    private FactoryExample(int number) {
        this.number = number;
    }

    @Test
    public void test1(){
        Assert.assertNotEquals(3, number);
    }

    @Test
    public void test2(){ 
    }
}