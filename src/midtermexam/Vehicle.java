package midtermexam;

import java.util.Objects;

public abstract class Vehicle implements Steerable {

    private String productId;
    private Integer weight;

    Vehicle(){
        this.productId = null;
        this.weight = null;
    }

    Vehicle(String productId){
        this.productId = productId;
        this.weight = null;
    }

    Vehicle(String productId, Integer weight){
        this.productId = productId;
        if (weight < 0){
            this.weight = null;
        }else {
            this.weight = weight;
        }
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "productId='" + productId + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(productId, vehicle.productId) && Objects.equals(weight, vehicle.weight);
    }
}
