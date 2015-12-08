package foo.bar.Controller.TestController;

import foo.bar.Model.Util.Response;
import foo.bar.Service.TestService.Test1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ewrfcas on 2015/12/7.
 */
@RestController
public class Test1Controller {
    @Autowired
    private transient Test1Service test1Service;

    @RequestMapping("/butter")
    public Response<String> test1(@RequestParam(value="name", defaultValue="World") String name) {
        return test1Service.Test1();
    }
}
