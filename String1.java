public class String1 {
    public static void main(String[] args) {
        String s2= "ABCD";
        String s = "abcd";
        String s1= new String("abcd").intern();// .intern add this string object in the string
        // pool so that it alocate the same position
        System.out.println(s==s1);

        
        String s3 = new String("abcd");
        System.out.println(s1==s3); // false because 2 object never be same
        System.out.println(s.length());
        System.out.println(s.equals(s1)); //.equals checks the value only == checks the memory allocation 
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.equalsIgnoreCase(s1));// we can ignore the case sensitivity 
        StringBuffer buffer = new StringBuffer(s);
        StringBuilder bulider= new StringBuilder(s);
        bulider.reverse();
        System.out.println(bulider);
        System.out.println(s.substring(1,4));
        for ( int i=0 ; i<s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }
    //String builder and string buffer is use to create mutable string 
}