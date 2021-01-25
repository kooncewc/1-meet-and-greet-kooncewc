import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PersonReader {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("txt files", "txt");
        chooser.setFileFilter(filter);
        String student = chooser.getSelectedFile().getName();



    }
}
