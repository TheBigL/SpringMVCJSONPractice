import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONTest
{
    
    private ObjectMapper objectMapper ;
    @BeforeEach
    public void setUp()
    {
        objectMapper = new ObjectMapper();



    }



    @AfterEach
    public void tearDown()
    {
        objectMapper = null;

    }

}
