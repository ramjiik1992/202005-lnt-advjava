package demo.threading09.workerdemo1;

public class Basket {
	
	long items;

	
	public  void addItem(){
		long item=items;
		item++;
		items=item;
	
	}

	public long getItems() {
		return items;
	}

}



