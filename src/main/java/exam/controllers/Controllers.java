package exam.controllers;

import exam.entities.BrandsEntity;
import exam.entities.BrandsExtendEntity;
import exam.mappers.BrandsMapper;
import exam.mappers.BrandsExtendMapper;
import exam.mappers.CarsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;
import java.util.List;

/**
 * @author Your-Liya
 */

@Controller
@RequestMapping("/")
public class Controllers {
    @Autowired
    private BrandsMapper brandsMapper;

    @Autowired
    private CarsMapper carsMapper;

    @Autowired
    private BrandsExtendMapper brandsExtendMapper;

    @RequestMapping("/brands")
    public String showAllBrands(Model model) {
        List<BrandsEntity> brands = brandsMapper.findAll();
        model.addAttribute("brands", brands);
        return "brands/brandslist";
    }

    @RequestMapping("brands/extend")
    public String showBrandsExtend (Model model){
        List<BrandsExtendEntity> brands = brandsExtendMapper.findAll();
        model.addAttribute("brands", brands);
        return "brands/brandsextendlist";
    }



}

