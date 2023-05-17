import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientGUI implements ActionListener {
    JFrame frame = new JFrame("Client");
    JTextArea ChatArea = new JTextArea();
    JTextField chatBox = new JTextField();
    JButton sendBtn = new JButton("Send");

    void Render(){
        ChatArea.setBounds(20,20,630,500);
        chatBox.setBounds(30,540,490,80);
        sendBtn.setBounds(530,550,90,50);
        sendBtn.addActionListener(this);
        frame.add(chatBox);
        frame.add(sendBtn);
        frame.add(ChatArea);

    }
    void guiRender(){
        Render();
        frame.setSize(700,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = chatBox.getText();
        System.out.println("btn clicked");
        System.out.println(text);
    }

}
