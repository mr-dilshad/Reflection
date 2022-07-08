package test;

public class Test {

    private String name;

    public Test(String name){
        this.name=name;
    }

    public void meathod1(){
        System.out.println("This is meathod 1 and name is set to : "+name);
    }

    private void meathod2(){
        System.out.println("This is a private meathod : meathod 2");
    }

    public void meathod3(int n){
        System.out.println("This is meathod 3 and the \'local\' variable is set to :"+n);
    }
}
