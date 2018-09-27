
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class FileListRenderer implements ListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList list, Object o, int i, boolean isSelected, boolean hasFocus) {
        JLabel label = new JLabel(o.toString());
        label.setOpaque(true);

        if (o instanceof Data) {
            Data d = (Data) o;

            if (d.isDirectory() || d.getName().equals("..")) {
                label.setForeground(Color.RED);
                label.setBackground(Color.LIGHT_GRAY);
            } else if (d.isFile()) {
                label.setForeground(Color.BLUE);
                label.setBackground(Color.LIGHT_GRAY);
            }

        }

        label.setBackground(isSelected ? Color.GRAY : Color.LIGHT_GRAY);

        return label;
    }

}
