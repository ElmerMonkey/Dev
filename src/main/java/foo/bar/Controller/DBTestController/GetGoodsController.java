package foo.bar.Controller.DBTestController;

import foo.bar.Model.DBModel.JPA.JPAGoods;
import foo.bar.Model.Util.Response;
import foo.bar.Service.DBTestService.DBTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by ewrfcas on 2015/12/8.
 */
@RestController
public class GetGoodsController {
    @Autowired
    private transient DBTestService dbTestService;

    @RequestMapping(value = "/getGoodsById", method = RequestMethod.GET)
    public Response<JPAGoods> getGoodsById(@Valid String Id) {
        return dbTestService.getGoodsById(Id);
    }
}
