package damir;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.validation.Valid;

@Controller
@SessionAttributes("calculationData")
public class WizardController extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/page1").setViewName("page1");
        registry.addViewController("/page2").setViewName("page2");
        registry.addViewController("/page3").setViewName("page3");
        registry.addViewController("/page4").setViewName("page4");
        registry.addViewController("/page5").setViewName("page5");
        registry.addViewController("/result").setViewName("result");
    }

    @ModelAttribute
    public CalculationData calculationData() {
        return new CalculationData();
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showForm(@ModelAttribute CalculationData calculationData) {
        return "redirect:page1";
    }

    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public String showForm(@ModelAttribute CalculationData calculationData, SessionStatus status) {
        status.setComplete();
        return "result";
    }

    @RequestMapping(value = "/page{id}", method = RequestMethod.GET)
    public String showForm(@ModelAttribute CalculationData calculationData, @PathVariable String id) {
        return "page" + id;
    }

    @RequestMapping(value = "/page{id}", method = RequestMethod.POST)
    public String toPageIdSubmit(@Valid CalculationData calculationData, BindingResult bindingResult,
                                 SessionStatus status, @PathVariable int id) {

        System.out.println("Page: page" + id);
        if (bindingResult.hasErrors()) {
            return "page" + id;
        }

        if (id == 5) {
            return "redirect:result";
        } else {
            int a = id + 1;
            System.out.println("Page redirect: page" + a);
            return "redirect:page" + a;
        }
    }
}