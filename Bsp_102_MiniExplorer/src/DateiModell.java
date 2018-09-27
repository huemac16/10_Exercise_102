
import java.io.File;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

public class DateiModell extends AbstractListModel {

    private ArrayList<Data> data = new ArrayList<>();

    public void showCurrent(String path) {
        File file = new File(path);

        data.add(new Data(".."));

        for (File f : file.listFiles()) {
            data.add(new Data(f.getAbsolutePath()));
        }

        fireIntervalAdded(this, data.size() - 1, data.size() - 1);

    }

    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Object getElementAt(int i) {
        return data.get(i);
    }

}
