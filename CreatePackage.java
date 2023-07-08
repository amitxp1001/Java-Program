package abhi;
class Demo{
    public void sum(num1,num2)
    {
        int result;
        result = num1+num2;
        System.out.println("The sum of two number is:",+result);
    }
}

import abhi.Demo;
class TesterextendDemo{
    public static void main(String arg[])
    {
        Tester obj = new Tester();
        obj.sum(10,20);
    }
}
