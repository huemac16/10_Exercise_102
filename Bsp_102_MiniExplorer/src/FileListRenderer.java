
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
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
                label.setBackground(new Color(200, 200, 200));
                label.setFont(new Font("Courier New", Font.ITALIC + Font.BOLD, 12));
            } else if (d.isFile()) {
                label.setForeground(Color.BLUE);
                label.setBackground(new Color(230, 230, 230));
                label.setFont(new Font("Courier New", Font.ITALIC + Font.BOLD, 12));
            }

            if (d.isDirectory() || d.getName().equals("..")) {
                label.setBackground(isSelected ? Color.GRAY : new Color(200, 200, 200));
            } else if (d.isFile()) {
                label.setBackground(isSelected ? Color.GRAY : new Color(230, 230, 230));

            }

        }

        return label;
    }

}
