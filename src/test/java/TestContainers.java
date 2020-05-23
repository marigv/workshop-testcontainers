import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import org.testcontainers.containers.*;
import org.testcontainers.containers.output.Slf4jLogConsumer;
import org.testcontainers.images.RemoteDockerImage;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestContainers {
    //KafkaContainer kafka = new KafkaContainer();
    //GenericContainer container = new GenericContainer();
    //PostgreSQLContainer postgreSQLContainer = new PostgreSQLContainer();


    @Test
    public void testTime() {
       GenericContainer redis = new GenericContainer("redis:3.0.2")
               .withExposedPorts(6379);
       redis.start();
       System.out.println("noe");
       redis.close();
    }
}
