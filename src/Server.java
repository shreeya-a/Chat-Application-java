import javax.swing.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        GUI gui = new GUI();
        gui.guiRender();
        ServerSocket serverSocket = new ServerSocket(12345);
       Socket socket= serverSocket.accept();
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader socketInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);
        String sendingMsg, receivingMsg;
        while (true){
            sendingMsg = userInput.readLine();
            printWriter.println(sendingMsg);
            printWriter.flush();

            receivingMsg = socketInput.readLine();
            System.out.println("Client: "+ receivingMsg);
        }
    }

}