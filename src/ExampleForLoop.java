public class ExampleForLoop {
    int a;
    int b;
    int c;
    public ExampleForLoop(){
    }
    public static void main(String[]args){
        ExampleForLoop e=new ExampleForLoop();
        e.a=10;
        for(int a=0;a<=10;a++){
            System.out.println(a);
        }
        e.b=20;
        for(int b=0;b<20;b++) {
            System.out.println(b);
        }
        e.c=30;
        for(int c=40;c>30;c--){
            System.out.println(c);
        }

    }

}
