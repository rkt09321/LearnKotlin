package javatest.collection;

/*import java.util.HashMap;

public class EqualsAndHasCode {
 
    public static void kotlintest.trickyquestion.main(String a[]){
         
        HashMap<Price, String> hm = new HashMap<Price, String>();
        hm.put(new Price("Banana", 20), "Banana");
        hm.put(new Price("Apple", 40), "Apple");
        hm.put(new Price("Orange", 30), "Orange");
        //creating new object to use as key to get value
        Price key = new Price("Banana", 20);
        System.out.println("Hashcode of the key: "+key.hashCode());
        System.out.println("Value from map: "+hm.get(key));
    }
}
 
class Price{
     
    private String item;
    private int price;
     
    public Price(String itm, int pr){
        this.item = itm;
        this.price = pr;
    }
     
    public int hashCode(){
        System.out.println("In hashcode");
        int hashcode = 0;
        hashcode = price*20;
        hashcode += item.hashCode();
        return hashcode;
    }
     
    public boolean equals(Object obj){
        System.out.println("In equals");
        if (obj instanceof Price) {
            Price pp = (Price) obj;
            return (pp.item.equals(this.item) && pp.price == this.price);
        } else {
            return false;
        }
    }
     
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
     
    public String toString(){
        return "item: "+item+"  price: "+price;
    }
}*/


public class EqualsAndHasCode {
	private String color;
	private String stripePattern;
	@Override
	public boolean equals(Object object) {
		boolean result = false;
		if (object == null || object.getClass() != getClass()) {
			result = false;
		} else {
			EqualsAndHasCode tiger = (EqualsAndHasCode) object;
				result = this.color.equals(tiger.getColor())
						&& this.stripePattern.equals(tiger.getStripePattern());
		}
		return result;
	}

	// just omitted null checks
	@Override
	public int hashCode() {
		int hash = 3;
		hash = 7 * hash + this.color.hashCode();
		hash = 7 * hash + this.stripePattern.hashCode();
		return hash;
	}

	public static void main(String args[]) {
		EqualsAndHasCode bengalTiger1 = new EqualsAndHasCode("Yellow", "Dense", 3);
		EqualsAndHasCode bengalTiger2 = new EqualsAndHasCode("Yellow", "Dense", 2);
		EqualsAndHasCode siberianTiger = new EqualsAndHasCode("White", "Sparse", 4);
		System.out.println("bengalTiger1 and bengalTiger2: "
				+ bengalTiger1.equals(bengalTiger2));
		System.out.println("bengalTiger1 and siberianTiger: "
				+ bengalTiger1.equals(siberianTiger));

		System.out.println("bengalTiger1 hashCode: " + bengalTiger1.hashCode());
		System.out.println("bengalTiger2 hashCode: " + bengalTiger2.hashCode());
		System.out.println("siberianTiger hashCode: "
				+ siberianTiger.hashCode());
	}

	public String getColor() {
		return color;
	}

	public String getStripePattern() {
		return stripePattern;
	}

	public EqualsAndHasCode(String color, String stripePattern, int height) {
		this.color = color;
		this.stripePattern = stripePattern;

	}
}