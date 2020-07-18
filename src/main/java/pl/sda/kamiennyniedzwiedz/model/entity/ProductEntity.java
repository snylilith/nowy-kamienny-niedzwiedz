package pl.sda.kamiennyniedzwiedz.model.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Entity
public class ProductEntity {
    @Id
    @GeneratedValue (strategy = AUTO)
    private Long id;

    @Basic (optional = false)

    private String name;
    private Double price;
    private String pictureUrl;

    public ProductEntity() {
    }

    public ProductEntity(Long id, String name, Double price, String pictureUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.pictureUrl = pictureUrl;
    }


    public Double getPrice() {
        return price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
