import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

public class FighterJSONTest
{


    @Test
    public void CreateJSONFighter() throws JsonProcessingException
    {
        Fighter mario = new Fighter("01", "Mario");

        String result = new ObjectMapper().writeValueAsString(mario);

        assert(result.contains("Mario"));




    }
}
