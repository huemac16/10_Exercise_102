
import java.util.Comparator;

public class FileComparer implements Comparator<Data> {

    @Override
    public int compare(Data t, Data t1) {
        if (t.isDirectory() && t1.isFile()) {
            return -1;
        }

        if (t.isFile() && t1.isDirectory()) {
            return 1;
        }

        return t.getName().compareTo(t1.getName());
    }

}
