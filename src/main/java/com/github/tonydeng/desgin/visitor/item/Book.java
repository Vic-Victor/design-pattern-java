package com.github.tonydeng.desgin.visitor.item;

import com.github.tonydeng.desgin.visitor.ItemElement;
import com.github.tonydeng.desgin.visitor.ShoppingCartVisitor;

/**
 * Created by tonydeng on 15/9/26.
 */
public class Book implements ItemElement {
    private int price;
    private String isbnNumber;

    public Book(int cost,String isbn){
        this.price = cost;
        this.isbnNumber = isbn;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
