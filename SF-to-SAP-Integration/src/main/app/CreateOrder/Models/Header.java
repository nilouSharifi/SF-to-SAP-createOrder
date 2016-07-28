package CreateOrder.Models;

public class Header {
	 private String name;
	 private String SFId;
	 private String SAPId;
	
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSFId() {
		return SFId;
	}
	public void setSFId(String sFId) {
		SFId = sFId;
	}
	public String getSAPId() {
		return SAPId;
	}
	public void setSAPId(String sAPId) {
		SAPId = sAPId;
	}
}
