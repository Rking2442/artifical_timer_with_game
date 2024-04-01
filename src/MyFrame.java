import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JFrame frame;
    JPanel panel;
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;
    JLabel label;
    JButton button;

    MyFrame() {
        button = new JButton("I GO WHERE YOU GO");
        frame = new JFrame("KeyBinding Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        label = new JLabel();
        label.setBounds(100, 100, 100, 100);
        label.setOpaque(true);
        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();
        label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
        label.getActionMap().put("upAction", upAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
        label.getActionMap().put("downAction", downAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
        label.getActionMap().put("rightAction", rightAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
        label.getActionMap().put("leftAction", leftAction);
        label.setBackground(Color.red);
        button.setBackground(Color.gray);
        button.setSize(420, 420);
        button.setBounds(50, 50, 100, 50);
        frame.add(label);
        label.add(button);
        button.addActionListener(this);
        panel = new JPanel();
        panel.paint(getGraphics());
        frame.add(panel);
        frame.setVisible(true);


    }
    public void paint(Graphics2D g) {
        g.drawString("Get To Center", 180, 300);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }


    public class UpAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() - 10);
            label.setBackground(Color.CYAN);
            button.setLocation(label.getX(), label.getY() - 10);
        }

    }

    public class DownAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {

            label.setLocation(label.getX(), label.getY() + 10);
            label.setBackground(Color.BLUE);
            button.setLocation(label.getX(), label.getY() + 10);
        }
    }

    public class LeftAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() - 10, label.getY());
            label.setBackground(Color.orange);
            button.setLocation(label.getX() - 10, label.getY());

        }
    }

    public class RightAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() + 10, label.getY());
            button.setLocation(label.getX() + 10, label.getY());
            label.setBackground(Color.BLACK);

        }

    }

}
