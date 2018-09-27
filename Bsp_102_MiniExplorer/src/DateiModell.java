
import java.io.File;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

public class DateiModell extends AbstractListModel {

    private ArrayList<Datei> data = new ArrayList<>();

    public void showCurrent() {
        

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
