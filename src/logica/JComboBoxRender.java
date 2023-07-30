package logica;

import java.awt.Component;
import java.io.File;
import java.util.Hashtable;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class JComboBoxRender extends JLabel implements ListCellRenderer {
    
    Hashtable<Object, ImageIcon> mElementos;
    ImageIcon mImgNull = new ImageIcon(new ImageIcon(getClass().getResource("/icons/default.png")).getImage()
            .getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH));

    public JComboBoxRender(Hashtable<Object, ImageIcon> aElementos) {
        this.mElementos = aElementos;
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        if (mElementos.get(value) == null) {
            setIcon(mImgNull);
        } else {
            setIcon(mElementos.get(value));
        }        
        setText(value.toString());
        return this;
    }
}
