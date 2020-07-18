package pl.sda.kamiennyniedzwiedz.model.dto;

public class ProductDto {
    private Long id;
    private String name;
    private Double price;
    private String pictureUrl;

    public ProductDto (){
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
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
