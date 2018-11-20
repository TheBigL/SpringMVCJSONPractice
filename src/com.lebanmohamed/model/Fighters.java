import com.fasterxml.jackson.annotation.JsonGetter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Fighters implements Serializable
{
    private Fighter fighter;
    int numberOfFighters = 0;

    public static final int MAXFIGHTERS = 100;

    public List<Fighter> fighters = new ArrayList<>();

    @JsonGetter("fighters")
    public List<Fighter> getFighters()
    {
        return fighters;
    }


    public int getFightersSize()
    {
        return numberOfFighters;
    }

}
