import com.rabbitmq.client.ConnectionFactory;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

/**
 * Created By jyotichabria on 01/01/23
 **/
public class ConnectionDetails {

    public static ConnectionFactory getRabbitMQConnection(String username,String password,
        String host) throws NoSuchAlgorithmException, KeyManagementException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setUsername("your_username");
        factory.setPassword("your_password");
        factory.setHost("your_host");
        factory.setPort(5671);
        factory.useSslProtocol();
        return factory;
    }


}
