class Test{
    int b,a;
    Test(int i){
        a=i;
    }
    Test incbyTen(){
        Test temp = new Test(a+10);
        return temp;
    }

}
public class RetObj {
    public static void main(String[] args) {
        Test ob1 = new Test(2);
        Test ob2;
        // Test ob2 = new Test(4);
        // System.out.println("ob2.a:"+ob2.a);
        ob2 = ob1.incbyTen();
        System.out.println("ob1.a:"+ob1.a);
        System.out.println("ob2.a:"+ob2.a);
        System.out.println("ob2.b:"+ob2.b);
        ob2=ob2.incbyTen();
        System.out.println("ob2.a:"+ob2.a);

    }
}
