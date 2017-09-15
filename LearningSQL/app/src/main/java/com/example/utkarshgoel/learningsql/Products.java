package com.example.utkarshgoel.learningsql;

/**
 * Created by Utkarsh Goel on 03-Mar-16.
 */
public class Products {
    private int _id; //primary key is denoted by underscore in the begining
    private String _productName;
  //  private int _cost;

public Products(){

}
    public Products(String productName) {
        this._productName = productName;
     //   this._cost = cost;
    }

  /*  public void set_cost(int _cost) {
        this._cost = _cost;
    }*/

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_productName(String _productName) {
        this._productName = _productName;
    }

  /*  public int get_cost() {
        return _cost;
    }
*/
    public int get_id() {
        return _id;
    }

    public String get_productName() {
        return _productName;
    }
}
