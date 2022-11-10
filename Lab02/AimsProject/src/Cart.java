import java.util.List;
import java.util.Scanner;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;

    private  DigitalVideoDisc[] itemsOrdered =
            new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    private int qtyOrdered = 0;

    public DigitalVideoDisc[] getItemsOrdered() {
        return itemsOrdered;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd){
        itemsOrdered[this.qtyOrdered] = dvd;
        this.qtyOrdered++;
        if(qtyOrdered >= MAX_NUMBERS_ORDERED){
            System.out.println(" Giỏ hàng gần đầy");
        }else{
            System.out.println(" Đĩa đã được thêm");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc dvd){
        int remove = 0;
        for(int i = 0; i < qtyOrdered; i++){
            if(itemsOrdered[i].equals(dvd)){
                System.out.println(" Xóa bỏ thành công");
                remove = i;
            }
        }
        qtyOrdered = qtyOrdered -1;
        for( int i = remove; i < qtyOrdered; i++){
            itemsOrdered[i] = itemsOrdered[i + 1];
        }

    }

    public float totalCost(){
        float total = 0;
        for(int i = 0; i < qtyOrdered; i++){
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    public void printDigitalVideoDisc(){
        for (int i = 0; i < qtyOrdered; i++){
            System.out.println(itemsOrdered[i]);
        }
    }


}
