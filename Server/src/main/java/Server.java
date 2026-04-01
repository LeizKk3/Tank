import java.io.IOException;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) {
        int port = 8080;
        //Quando utilizar classes que precisam de recursos de fora, precisa ter a
        // confirmação de que esses recursos realmente estejam disponíveis

        try {
            ServerSocket serverSocket = new ServerSocket(port);
            serverSocket.accept();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

