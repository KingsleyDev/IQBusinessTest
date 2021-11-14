import com.rabbitmq.client.*;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

public class RabbitMq {

    public static void main(String [] args) {

        enterName();





    }

    private void createConnection(String name) {

        ConnectionFactory connectionFactory = new ConnectionFactory();


        try {
            Connection connection = connectionFactory.newConnection();
            Channel channel = connection.createChannel();
            channel.queueDeclare("QUEUENAME",false,false,false,null);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

    }

    private static String enterName() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name");
        String Name = scanner.nextLine();

        System.out.println(Name);

        return Name;
    }

    
}
