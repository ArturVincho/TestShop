package jr.entities;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
@Entity
@Table(name = "PRODUCT")
public class Product implements Serializable {
    @Id
    @Column(name = "ID")
    @TableGenerator(name = "productid", table = "productpktb", pkColumnName = "idProduct", pkColumnValue = "idProductValue", allocationSize = 1)
    private Integer id;

    @Size(max = 45)
    @Column(name = "NAMEITEM")
    private String nameItem;

    @Column(name = "AGE")
    private Integer age;

    @Column(name = "AVALILABLE")
    private Boolean avalilable;

    public Product(Integer id, String nameItem, Integer age, Boolean avalilable) {
        this.id = id;
        this.nameItem = nameItem;
        this.age = age;
        this.avalilable = avalilable;
    }

    public Product(Integer id, @Size(max = 45) String nameItem, Integer age) {
        this.id = id;
        this.nameItem = nameItem;
        this.age = age;
    }

    public Product(Integer id, @Size(max = 45) String nameItem) {
        this.id = id;
        this.nameItem = nameItem;
    }

    public Product(Integer id) {
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getAvalilable() {
        return avalilable;
    }

    public void setAvalilable(Boolean avalilable) {
        this.avalilable = avalilable;
    }
}
