package CreateOrder.Models;

import java.util.List;

public class OrderModel {
	//header sub -class
	 private Header header;
	//header sub -class
	 private Items items;

	
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public Items getItems() {
		return items;
	}
	public void setItems(Items items) {
		this.items = items;
	}
     

   
}
