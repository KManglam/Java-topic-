public class stringmethod {
    public static void main(String[] args) {
        String a="Delhi";
        String b="Patna";
        String c="Lucknow";
        String d= "";
        String e="Delhi";
        System.out.println(a.length());  // 4 ---->length
        System.out.println(a.isEmpty()); // return F ---->isEmpty
        System.out.println(d.isEmpty()); // True
        String s1= a.concat(b);
        System.out.println("New Concated string is: "+s1);  // DelhiPatna
        String s2 = "LION";
        String s3 = "cat";
        System.out.println(s2.toLowerCase());    // lion     -----> toLowerCase
        System.out.println(s3.toUpperCase());    // CAT      -----> toUpperCase

        //trim()
        String p="  helloo  ";
        System.out.println(p.trim());      // removes start and end space of a string

        System.out.println(a.equals(e));   // true
        System.out.println(a.equals(b));   //false
    }
}
