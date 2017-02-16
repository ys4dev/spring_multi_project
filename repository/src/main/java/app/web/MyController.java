package app.web;

import app.domain.Model;
import app.service.ServiceA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class MyController {

    @Autowired
    ServiceA serviceA;

    @RequestMapping("/")
    public Model index() {
        return serviceA.f();
    }
}
