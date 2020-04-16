package com.example.infomanor.Model;

public class Food {

    private String name,pic,price,MenuID;

    public Food(){

    }

    public Food(String n,String p,String pr,String menuId) {
       this.name = n;
       this.pic = p;
       this.price = pr;
        this.MenuID = menuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMenuID() {
        return MenuID;
    }

    public void setMenuID(String menuID) {
        MenuID = menuID;
    }
}

