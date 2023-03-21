import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;

public class KeyWindow {
    //private JPanel panelkey;
    //private JPanel panel;
    private JFrame frame;
    private JDialog dialog;

    //private SettingsManager sm = SettingsManager.getInstance();


    public JButton createButtonWithToolTip(String text, String tooltip, Color bgColor) {
        JButton button = new JButton(text);
        button.setToolTipText(tooltip);
        button.setBackground(bgColor);
        return button;
    }

    public JButton createWiderButtonWithToolTip(String text, String tooltip, Color bgColor, int width) {
        JButton button = new JButton(text);
        button.setToolTipText(tooltip);
        button.setBackground(bgColor);
        button.setPreferredSize(new Dimension(width, button.getPreferredSize().height));
        return button;
    }


    public void createKeyboard() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        UIManager.put("Button.font", new FontUIResource(new Font("Arial", Font.PLAIN, 18)));
        frame = new JFrame("Keyboard demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500, 400);
        frame.setLayout(new GridLayout(5, 1));


        //KeysWindow panel = new KeysWindow();
        //panel.setLayout(new GridLayout(5, 1));
        //panel.setToolTipText("");
        UIManager.put("ToolTip.font", new Font("Arial", Font.PLAIN, 20));


        JPanel row01 = new JPanel(new GridLayout(1, 14));
        row01.add(createButtonWithToolTip("Esc", "", Color.WHITE));
        row01.add(createButtonWithToolTip("F1", "", Color.WHITE));
        row01.add(createButtonWithToolTip("F2", "<html><ul>" +
                "<li>F2+4 = TOGGLE OVERVIEW TREE</li>" +
                "<li>F2+2 = EXPAND TREE ELEMENTS</li>" +
                "<li>F2+8 = COLLAPSE TREE ELEMENTS</li>" +
                "<li>F2+5 = REFRESH TREE</li>" +
                "<li>F2+6 = SHOW/ HIDE OUTPUT WINDOW</li>" +
                "<li>F2+1 = SHOW/ HIDE HOTKEYS DEMO</li>" +
                "</ul></html>", Color.YELLOW));
        row01.add(createButtonWithToolTip("F3", "", Color.WHITE));
        row01.add(createButtonWithToolTip("F4", "", Color.WHITE));
        row01.add(createButtonWithToolTip("F5", "", Color.WHITE));
        row01.add(createButtonWithToolTip("F6", "", Color.WHITE));
        row01.add(createButtonWithToolTip("F7", "", Color.WHITE));
        row01.add(createButtonWithToolTip("F8", "", Color.WHITE));
        row01.add(createButtonWithToolTip("F9", "", Color.WHITE));
        row01.add(createButtonWithToolTip("F10", "", Color.WHITE));
        row01.add(createButtonWithToolTip("F11", "", Color.WHITE));
        row01.add(createButtonWithToolTip("F12", "", Color.WHITE));
        row01.add(createButtonWithToolTip("", "", Color.LIGHT_GRAY));
        row01.add(createButtonWithToolTip("PrtSc", "", Color.WHITE));
        frame.add(row01);

        JPanel row02 = new JPanel(new GridLayout(1, 17));
        row02.add(createButtonWithToolTip("Backspace", "", Color.WHITE));
        row02.add(createButtonWithToolTip("Tab", "", Color.WHITE));
        row02.add(createButtonWithToolTip("Q", "", Color.WHITE));
        row02.add(createButtonWithToolTip("W", "", Color.WHITE));
        row02.add(createButtonWithToolTip("E", "", Color.WHITE));
        row02.add(createButtonWithToolTip("R", "", Color.WHITE));
        row02.add(createButtonWithToolTip("T", "", Color.WHITE));
        row02.add(createButtonWithToolTip("Y", "", Color.WHITE));
        row02.add(createButtonWithToolTip("U", "", Color.WHITE));
        row02.add(createButtonWithToolTip("I", "", Color.WHITE));
        row02.add(createButtonWithToolTip("O", "", Color.WHITE));
        row02.add(createButtonWithToolTip("P", "", Color.WHITE));
        row02.add(createButtonWithToolTip("[", "", Color.WHITE));
        row02.add(createButtonWithToolTip("]", "", Color.WHITE));
        row02.add(createButtonWithToolTip("", "", Color.LIGHT_GRAY));
        row02.add(createButtonWithToolTip("Insert", "OVERWRITE", Color.WHITE));
        row02.add(createButtonWithToolTip("Home", "", Color.WHITE));
        row02.add(createButtonWithToolTip("End", "", Color.WHITE));
        frame.add(row02);

        JPanel row03 = new JPanel(new GridLayout(1, 13));
        row03.add(createButtonWithToolTip("Caps Lock", "", Color.WHITE));
        row03.add(createButtonWithToolTip("A", "", Color.WHITE));
        row03.add(createButtonWithToolTip("S", "", Color.WHITE));
        row03.add(createButtonWithToolTip("D", "", Color.WHITE));
        row03.add(createButtonWithToolTip("F", "", Color.WHITE));
        row03.add(createButtonWithToolTip("G", "", Color.WHITE));
        row03.add(createButtonWithToolTip("H", "", Color.WHITE));
        row03.add(createButtonWithToolTip("J", "", Color.WHITE));
        row03.add(createButtonWithToolTip("K", "", Color.WHITE));
        row03.add(createButtonWithToolTip("L", "", Color.WHITE));
        row03.add(createButtonWithToolTip(": ;", "", Color.WHITE));
        row03.add(createButtonWithToolTip("'", "", Color.WHITE));
        row03.add(createButtonWithToolTip("", "", Color.LIGHT_GRAY));
        row03.add(createButtonWithToolTip("Enter", "", Color.WHITE));
        row03.add(createButtonWithToolTip("Delete", "", Color.WHITE));
        frame.add(row03);


        JPanel row04 = new JPanel(new GridLayout(1, 17));
        row04.add(createButtonWithToolTip("Shift", "action", Color.YELLOW));
        row04.add(createButtonWithToolTip("Z", "", Color.WHITE));
        row04.add(createButtonWithToolTip("X", "", Color.WHITE));
        row04.add(createButtonWithToolTip("C", "", Color.WHITE));
        row04.add(createButtonWithToolTip("V", "", Color.WHITE));
        row04.add(createButtonWithToolTip("B", "", Color.WHITE));
        row04.add(createButtonWithToolTip("N", "", Color.WHITE));
        row04.add(createButtonWithToolTip("M", "", Color.WHITE));
        row04.add(createButtonWithToolTip("< ,", "", Color.WHITE));
        row04.add(createButtonWithToolTip("> .", "", Color.WHITE));
        row04.add(createButtonWithToolTip("? /", "", Color.WHITE));
        row04.add(createButtonWithToolTip("Shift", "", Color.WHITE));
        row04.add(createButtonWithToolTip("", "", Color.LIGHT_GRAY));
        row04.add(createButtonWithToolTip("", "", Color.LIGHT_GRAY));
        row04.add(createButtonWithToolTip("", "", Color.LIGHT_GRAY));
        row04.add(createButtonWithToolTip("Up", "", Color.WHITE));
        row04.add(createButtonWithToolTip("", "", Color.LIGHT_GRAY));
        row04.add(createButtonWithToolTip("", "", Color.LIGHT_GRAY));

        frame.add(row04);


        JPanel row05 = new JPanel(new GridLayout(1, 17));
        row05.add(createButtonWithToolTip("Ctrl", "<html><ul>" +
                "<li>Default Hotkeys:</lI>" +
                "<li>Ctrl + Backspace = BACKSPACE_WORD</lI>" +
                "<li>Ctrl + Delete = DELETE_WORD</lI>" +
                "<li>Ctrl + \\ = , TOGGLE_RECT</lI>" +
                "<li>Ctrl + A =  SELECT_ALL</li>" +
                "<li>Ctrl + Home = DOCUMENT_HOME</li>" +
                "<li>Ctrl + End = DOCUMENT_END</li>" +
                "<li>Ctrl + Enter = REPEAT</li>" +
                "<li>Ctrl + Shift + Home = SELECT_DOC_HOME</li>" +
                "<li>Ctrl + Shift + End = SELECT_DOC_END</li>" + "<li></li>" +
                "</ul></html>", Color.YELLOW));
        row05.add(createButtonWithToolTip("Win Key", "", Color.WHITE));
        row05.add(createButtonWithToolTip("Alt", "", Color.WHITE));
        row05.add(createWiderButtonWithToolTip("Space Bar", "", Color.WHITE, 1000));
        row05.add(createButtonWithToolTip("Alt", "", Color.WHITE));
        row05.add(createButtonWithToolTip("Win Key", "", Color.WHITE));
        row05.add(createButtonWithToolTip("Menu", "", Color.WHITE));
        row05.add(createButtonWithToolTip("Ctrl", "", Color.YELLOW));
        row05.add(createButtonWithToolTip("", "", Color.LIGHT_GRAY));
        row05.add(createButtonWithToolTip("Left", "", Color.WHITE));
        row05.add(createButtonWithToolTip("Down", "", Color.WHITE));
        row05.add(createButtonWithToolTip("Right", "", Color.WHITE));


        frame.add(row05);
        //frame.add(frame);
        frame.setVisible(true);
        //show();
    }


    public void hide() {
        if (frame != null)
            frame.dispose();
    }


    public boolean isVisible() {
        if (dialog == null) {
            return false;
        }
        return dialog.isVisible();
    }


    public static void main(String[] args) {
        KeyWindow kw = new KeyWindow();
        kw.createKeyboard();
    }
}



