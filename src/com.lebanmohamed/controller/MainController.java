import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class MainController
{
    @GetMapping("/")
    public String IndexController(Model m)
    {
        m.addAttribute("someAttribute", "someValue");
        return "index";

    }

}
