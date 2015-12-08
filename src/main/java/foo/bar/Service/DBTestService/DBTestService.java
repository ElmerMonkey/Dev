package foo.bar.Service.DBTestService;

import foo.bar.Model.DBModel.JPA.JPAGoods;
import foo.bar.Model.Util.Response;

/**
 * Created by ewrfcas on 2015/12/8.
 */
@SuppressWarnings("all")
public interface DBTestService {
    Response<JPAGoods> getGoodsById(String id);
}
