package foo.bar.Service.DBTestService.Impl;

import foo.bar.Dao.DBTestDao.GetGoodsDao;
import foo.bar.Model.DBModel.JPA.JPAGoods;
import foo.bar.Model.Util.Response;
import foo.bar.Model.Util.ResponseStatus;
import foo.bar.Service.DBTestService.DBTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ewrfcas on 2015/12/8.
 */
@SuppressWarnings("all")
@Service
public class DBTestServiceImpl implements DBTestService{
    @Autowired
    private transient GetGoodsDao getGoodsDao;

    @Override
    public Response<JPAGoods> getGoodsById(String id)
    {
        JPAGoods jpaGoods=new JPAGoods();
        jpaGoods=getGoodsDao.getGoodsById(id);
        Response<JPAGoods> response=new Response<JPAGoods>();
        if(jpaGoods!=null)
        {
            response.setStatus(ResponseStatus.SUCCESS);
            response.setData(jpaGoods);
        }
        else
        {
            response.setStatus(ResponseStatus.FAIL);
            response.setData(null);
        }
        return response;
    }
}
