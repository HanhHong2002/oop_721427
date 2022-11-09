import java.util.ArrayList;
import java.util.List;
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

	private int qtyOrdered = 0;

	void addDigitalVideoDisc(DigitalVideoDisc dvd) {
		this.qtyOrdered++;
		if (qtyOrdered >= 20) {
			System.out.println("The cart is almost full !");

		} else {

			itemsOrdered[qtyOrdered] = dvd;
			System.out.println("The disc has been added");
		}

	}
/*     void removeDigitalVideoDisc(DigitalVideoDisc[] dvds, DigitalVideoDisc dvd){
        for(int i = 0; i < dvds.length; i++){
            if(dvds[i].equals(dvd)){
                System.out.println(" Xóa bỏ thành công");
                break;
            }
        }

    }

    float totalCost(DigitalVideoDisc[] dvds){
        float total = 0;
        for(int i = 0; i < dvds.length; i++){
            total += dvds[i].getCost();
        }
        return total;
    }*/
	float totalCost() {
		float sum = 0;
		for (int i = 0; i < this.qtyOrdered; i++) {
			sum = sum + itemsOrdered[i].getCost();

		}
		return sum;
	}
	void removeDigitalVideoDisc(DigitalVideoDisc dvd) {
		
		
	}

}
