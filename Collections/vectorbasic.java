import java.util.Vector;

public class vectorbasic {
    public static void main(String[] args) {
        // constructor 1
        Vector v=new Vector();
        v.add("amrita");
        v.add("shrivastava");
        v.add(23);
        v.add("-");
        v.add(01);
        v.add("-");
        v.add(2001);
        v.add(0,"ms.");
        v.addElement("i");
        v.addElement("dont");
        v.addElement("know");
        v.addElement("how");
        v.addElement("but");
        v.addElement("I");
        v.addElement("will");
        v.addElement("amen");
        System.out.println(v);
        v.remove("ms.");
        v.removeElement("shrivastava");
        v.remove(1);
        System.out.println(v);
        v.clear();// rmeoves the entire collection
        System.out.println(v);
        v.add(10);
        System.out.println(v.firstElement());
        System.out.println(v);
        v.removeAllElements();
        // to get any object firstElement, lastElement
        System.out.println(v.capacity());  // 2 times the i itial one
        // other constructors are

        Vector v1=new Vector(20);
        v1.addElement(10);
        v1.addElement(10);
        v1.addElement(10);
        v1.addElement(10);
        v1.addElement(10);
        System.out.println(v1.capacity());
        System.out.println(v1.size());
        Vector v2=new Vector(20, 5);
        v1.addElement(1100);
        v1.addElement(100);
        v1.addElement(1190909);
        v1.addElement(1190909);
        v1.addElement(1190909);
        v1.addElement(1190909);
        v1.addElement(1190909);
        v1.addElement(1190909);
        v1.addElement(1190909);
        v1.addElement(1190909);
        v1.addElement(1190909);
        v1.addElement(1190909);
        v1.addElement(1190909);
        v1.addElement(1190909);
        v1.addElement(1190909);
        v1.addElement(1190909);
        v1.addElement(1190909);
        v1.addElement(1190909);
        v1.addElement(1190909);
        v1.addElement(1190909);
        v1.addElement(1190909);
        v1.addElement(1190909);
        v1.addElement(1190909);
        v1.addElement(1190909);
        v1.addElement(1190909);
        v1.addElement(1190909);
        v1.addElement(1190909);
        v1.addElement(1190909);
        System.out.println(v2.capacity());
        System.out.println(v2.size());
        for(int i=0;i<100;i++) {
        v2.addElement(i);
        }System.out.println(v2.capacity());
        System.out.println(v2.size());
    }
}
