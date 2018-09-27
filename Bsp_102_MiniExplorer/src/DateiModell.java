
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.AbstractListModel;

public class DateiModell extends AbstractListModel {

    private ArrayList<Data> data = new ArrayList<>();

    public void showCurrent(String path) {
        data.clear();
        File file = new File(path);

        data.add(new Data(".."));

        for (File f : file.listFiles()) {
            data.add(new Data(f.getAbsolutePath()));
        }
        sort();
        fireContentsChanged(this, 0, data.size() - 1);

    }

    public void sort() {
        Collections.sort(data, new FileComparer());
        fireContentsChanged(this, 0, data.size() - 1);
    }

    public String showNext(String path, int idx) {
        String newP = path + "\\" + data.get(idx).getName();
        showCurrent(newP);
        
        return newP;
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
