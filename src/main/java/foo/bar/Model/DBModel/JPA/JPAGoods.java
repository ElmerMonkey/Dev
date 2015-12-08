package foo.bar.Model.DBModel.JPA;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by ewrfcas on 2015/12/8.
 */

@Entity
@Table(name = "goods")
public class JPAGoods {
    @Id
    private String id;

    private String name;

    private String type;

    private int price;

    public JPAGoods() {
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public int getPrice() {
        return this.price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof JPAGoods)) return false;
        final JPAGoods other = (JPAGoods) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.id;
        final Object other$id = other.id;
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$name = this.name;
        final Object other$name = other.name;
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$type = this.type;
        final Object other$type = other.type;
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        if (this.price != other.price) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.id;
        result = result * PRIME + ($id == null ? 0 : $id.hashCode());
        final Object $name = this.name;
        result = result * PRIME + ($name == null ? 0 : $name.hashCode());
        final Object $type = this.type;
        result = result * PRIME + ($type == null ? 0 : $type.hashCode());
        result = result * PRIME + this.price;
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof JPAGoods;
    }

    public String toString() {
        return "foo.bar.Model.DBModel.JPA.JPAGoods(id=" + this.id + ", name=" + this.name + ", type=" + this.type + ", price=" + this.price + ")";
    }
}
