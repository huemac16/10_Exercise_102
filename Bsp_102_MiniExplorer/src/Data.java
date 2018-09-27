
import java.io.File;

public class Data extends File {

    public Data(String absolutePath) {
        super(absolutePath);

    }

    @Override
    public String toString() {
        if (isDirectory()) {
            return this.getName();
        } else {
            return this.getName();
        }

    }

}
