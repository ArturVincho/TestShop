package jr.entities;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "CAMERA")
public class Camera {
    @Id
    @Column(name = "ID")
    @TableGenerator(name = "cameraid", table = "cameratpktb", pkColumnName = "idCamera", pkColumnValue = "idCameraValue", allocationSize = 1)
    private Integer id;

    @Size(max = 25)
    @Column(name = "NAMEITEM")
    private String nameItem;

    @Column(name = "PRICE")
    private Integer price;

    @Column(name = "AVALILABLE")
    private Boolean avalilable;

    public Camera(Integer id, @Size(max = 25) String nameItem, Integer price, Boolean avalilable) {
        this.id = id;
        this.nameItem = nameItem;
        this.price = price;
        this.avalilable = avalilable;
    }

    public Camera(Integer id, @Size(max = 25) String nameItem, Integer price) {
        this.id = id;
        this.nameItem = nameItem;
        this.price = price;
    }

    public Camera(Integer id, @Size(max = 25) String nameItem) {
        this.id = id;
        this.nameItem = nameItem;
    }

    public Camera(Integer id) {
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
