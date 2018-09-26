package jr.entities;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "CUSTOMER")
public class Customer {
    @Id
    @Column(name = "ID")
    @TableGenerator(name = "customertid", table = "customertpktb", pkColumnName = "idCustomer", pkColumnValue = "idCustomerValue", allocationSize = 1)
    private Integer id;

    @Size(max = 25)
    @Column(name = "NAME")
    private String name;

    @Column(name = "ADRESS")
    private String adress;

    @Column(name = "PRICE")
    private Integer price;

    public Customer(Integer id, @Size(max = 25) String name, String adress, Integer price) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.price = price;
    }

    public Customer(Integer id, @Size(max = 25) String name, String adress) {
        this.id = id;
        this.name = name;
        this.adress = adress;
    }

    public Customer(Integer id, @Size(max = 25) String name) {
        this.id = id;
        this.name = name;
    }

    public Customer(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
