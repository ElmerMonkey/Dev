package foo.bar.Dao.DBTestDao;

import foo.bar.Model.DBModel.JPA.JPAGoods;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by ewrfcas on 2015/12/8.
 */
public interface GetGoodsDao extends PagingAndSortingRepository<JPAGoods,String> {
    @Query("select Goods from JPAGoods Goods where Goods.id=?1")
    public JPAGoods getGoodsById(String id);
}
