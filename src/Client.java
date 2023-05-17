import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        ClientGUI gui = new ClientGUI();
        gui.guiRender();
        Socket socket = new Socket("localhost",12345);
        BufferedReader clientInput = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader serverMsg = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String sendingMsg,receivingMsg;

        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);

        while (true){
            receivingMsg = serverMsg.readLine();
            System.out.println("Server: "+ receivingMsg);
            sendingMsg = clientInput.readLine();
            printWriter.println(sendingMsg);
            printWriter.flush();
        }


    }
}
