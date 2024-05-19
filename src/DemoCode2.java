import java.util.StringTokenizer;

public class DemoCode2 {
    public static void main(String[] args) {
        StringTokenizer tokens = new StringTokenizer("Nam/Developer/HN", "/", false);
        while (tokens.hasMoreTokens()) {
            System.out.println(tokens.nextToken());
        }
    }
}
