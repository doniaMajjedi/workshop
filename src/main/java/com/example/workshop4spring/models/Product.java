package com.example.workshop4spring.models;
@entity
public class Product {

 Long id;
 String code;
 String name;
 Double price;
 Integer quantity;
 String image ;

 public Product(Long id,String code,String name,Double price, Integer quantity,String image){
    this.id=id;
    this.code=code;
    this.name=name;
    this.price=price;
    this.quantity=quantity;
    this.image=image;
 }

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getCode() {
    return code;
}

public void setCode(String code) {
    this.code = code;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public Double getPrice() {
    return price;
}

public void setPrice(Double price) {
    this.price = price;
}

public Integer getQuantity() {
    return quantity;
}

public void setQuantity(Integer quantity) {
    this.quantity = quantity;
}

public String getImage() {
    return image;
}

public void setImage(String image) {
    this.image = image;
}

 
}