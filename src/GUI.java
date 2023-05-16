import javax.swing.*;

public class GUI {
    JFrame frame = new JFrame("Chat Application");
    JTextArea ChatArea = new JTextArea();

    void Render(){
        ChatArea.setBounds(2,1,1000,800);
        frame.add(ChatArea);
    }
    void guiRender(){
        Render();
        frame.setSize(1000,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
