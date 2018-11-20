import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder(value = {"id", "fighterName"}, alphabetic = true)
@JsonAutoDetect
public class Fighter
{
    private String id;
    private String fighterName;

    public Fighter(String id, String fighterName) {
        this.id = id;
        this.fighterName = fighterName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFighterName() {
        return fighterName;
    }

    public void setFighterName(String fighterName) {
        this.fighterName = fighterName;
    }
}