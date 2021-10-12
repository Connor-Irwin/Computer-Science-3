import static java.lang.System.out;

public class PartsRunner {
    public static void main(String[] args) {
        PartList list = new PartList("partinfo.dat");
        out.println(list);
    }
}
