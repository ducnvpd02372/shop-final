package group.shop.services;

import java.util.HashMap;

import group.shop.entity.Orders;

public class OrderBean extends HashMap<Object, Object>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void addSanPham(Orders od){
        int key =od.getProducts().getId();
        if(this.containsKey(key)){
            int soluongCu=((Orders)this.get(key)).getQuantity();
            ((Orders)this.get(key)).setQuantity(soluongCu+1);
        }else{
            this.put(od.getProducts().getId(),od);
        }
    }
    public boolean removeSanPham(int masp){
        if(this.containsKey(masp)){
            this.remove(masp);
            return  true;
        }
        return false;
    }
    
}
