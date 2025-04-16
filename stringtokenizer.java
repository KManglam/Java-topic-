import java.util.StringTokenizer;
public class stringtokenizer {
    public static void main(String[] args) {
        StringTokenizer d = new StringTokenizer("My name is Km");
        while (d.hasMoreTokens()) {
             System.out.println(d.nextToken());
        }
    }
}
