import org.apache.catalina.startup.Tomcat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Paths;
import java.time.Duration;

public class Main {

        public static void main(String[] args) throws IOException {
            ServerSocket serverSocket = new ServerSocket(6868);

            while(true) {
                Socket socket = serverSocket.accept();
                OutputStream output = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(output, true);
                writer.println("This is a message sent to the server");
                socket.close();
            }

//            serverSocket.close();

        }
    }
