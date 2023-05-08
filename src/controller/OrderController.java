package controller;

public class OrderController
{
    private final String id;

    private String customer;
    private String clothes;

    private Boolean status;

    public OrderController(String id, CustomerController CustomerController, ClothesController ClothesController, Boolean status)
    {
        this.id = id;
        this.customer = CustomerController.getId();
        this.clothes = ClothesController.getId();
        this.status = status;
    }

    // id
    public String getId()
    {
        return id;
    }

    // user
    public void setCustomer(CustomerController user) {
        this.customer = user.getId();
    }
    public String getCustomer() {
        return customer;
    }


    // clothes
    public void setClothes(ClothesController ClothesController) {
        this.clothes = ClothesController.getId();
    }
    public String getClothes() {
        return clothes;
    }


    // status
    public void setStatus(Boolean status)
    {
        this.status = status;
    }
    public Boolean getStatus()
    {
        return status;
    }

    // toString
    public String toString()
    {
        return String.format("%s,%s,%s,%s", this.getId(), this.getCustomer(), this.getClothes(), String.valueOf(this.getStatus()));
    }

}
