package exam;

import exam.entities.Flat;
import exam.mappers.FlatMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by alex on 02.06.17.
 */
@Controller
@RequestMapping("/")
public class Controllers {

    @Autowired
    private FlatMapper flatMapper;

    @RequestMapping("/flats")
    public String showAllFlats(Model model) {
        List<Flat> flats = flatMapper.findAll();
        model.addAttribute("flats", flats);
        return "flats/list";
    }

}