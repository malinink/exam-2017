package exam.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ServerController{
    @RequestMapping("/")
    public String index(){return "addBrand.html";}

    @RequestMapping("/create")
    public String shaowAkk(){
        return "bd.html";
    }

    @RequestMapping(value="/added")
    public String addBrand(@RequestParam(value = "name") String name,
                           @RequestParam(value = "date") String date,
                           @RequestParam(value = "premium") String premium,
                           Model model){
        try{
            name = name.trim();
            date = date.trim();
            premium = premium.trim();
            model.addAttribute("message");
        } catch (Exception e){
            //log.error(e.getMessage());
            return String.format(name, date, premium);
        }
        return "status";

    }
}