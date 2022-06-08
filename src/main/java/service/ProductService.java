package service;

import model.Product;

import java.util.List;

public interface ProductService extends GeneralService<Product> {
    public List<Product> Price(int p1,int p2);
}
