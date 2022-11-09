
public class Aims {
	public static void main(String[] args) {
		Cart anOrder = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc ("The Lion King","Animation","Roger Allers",87,19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc ("Star Wars","Science Fiction","George Lucas",87,24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		anOrder.addDigitalVideoDisc(dvd2);
		anOrder.addDigitalVideoDisc(dvd1);
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc[] dvds = {dvd1, dvd2, dvd3};
		System.out.println("Total cost is :");
		System.out.println(anOrder.totalCost());
        System.out.println(" danh sách trước khi xóa: ");
        for (DigitalVideoDisc dvd : dvds){
            System.out.println(dvd);
        }
        //anOrder.removeDigitalVideoDisc(dvds, dvd2);
        System.out.println(" Danh sách sau khi xóa");
        for (DigitalVideoDisc dvd : dvds){
            System.out.println(dvd);
        }
	}
}
