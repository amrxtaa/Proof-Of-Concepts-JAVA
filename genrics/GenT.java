// cretaing my own genric class
import java.util.ArrayList;
 class Gen<T> {
    T ob;
    Gen(T ob)
    {
        this.ob=ob;
    }
        public void show()
        {
            System.out.println("it belongs to"+ob.getClass().getName());
        }
        public T getOb()
        {
            return ob;
        }
    }
    public class GenT
    {
        public static void main(String[] args) {
            Gen<String> g1=new Gen<String>("amrita");
            g1.show();
            System.out.println(g1.getOb());

            Gen<Integer> g2=new Gen<Integer>(10);
            g2.show();
            System.out.println(g2.getOb());

            Gen<Double> g3=new Gen<Double>(12.5d);
            g3.show();
            System.out.println(g3.getOb());

        }
    }
