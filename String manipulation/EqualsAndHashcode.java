public class EqualsAndHashcode{
    public static void main(String args[]){
        String a = "hello";
        String b = new String("hello");
        System.out.println("a==b:"+a.equals(b));
        System.out.println("hashcode of a and b equal?:"+a==b);
        System.out.println(a.hashCode());
        System.out.println(a.hashCode());
        System.out.println(a);
        System.out.println(b);
    }
}