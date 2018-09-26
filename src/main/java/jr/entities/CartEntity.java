package jr.entities;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "CART")
public class CartEntity implements Serializable {
    @Id
    @Column(name = "ID")
    @TableGenerator(name = "cartid", table = "cartpktb", pkColumnName = "idCart", pkColumnValue = "idCartValue", allocationSize = 1)
    private Integer id;

    @Size(max = 25)
    @Column(name = "NAMEITEM")
    private String nameItem;

    @Column(name = "PRICE")
    private Integer price;

    @Column(name = "AVALILABLE")
    private Boolean avalilable;

    public CartEntity(Integer id, @Size(max = 25) String nameItem, Integer price, Boolean avalilable) {
        this.id = id;
        this.nameItem = nameItem;
        this.price = price;
        this.avalilable = avalilable;
    }

    public CartEntity() {

    }

    public CartEntity(String nameItem, int price) {
        this.nameItem = nameItem;
        this.price = price;
    }

    public CartEntity(Integer id, String nameItem, int price) {
        this.id = id;
        this.nameItem = nameItem;
        this.price = price;
    }

    public CartEntity(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Boolean getAvalilable() {
        return avalilable;
    }

    public void setAvalilable(Boolean avalilable) {
        this.avalilable = avalilable;
    }
}
