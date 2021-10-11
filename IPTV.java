package Prac05;

class TV {
	private int size;
	public TV (int size) {
		this.size = size;
	}
	protected int getSize() {
		return size;
	}
}
class ColorTV extends TV {
	private int tvColor;
	public ColorTV (int size, int tvColor) {
		super(size);
		this.tvColor = tvColor;
	}
	protected int getColor() {
		return tvColor;
	}
	public void printProperty() {
		System.out.println(getSize() + "인치" + tvColor + "컬러");
	}
}

public class IPTV extends ColorTV {
	private String address;
	public IPTV (String address, int size, int tvColor) {
		super(size, tvColor);
		this.address = address;
	}
	public void printProperty() {
		System.out.println("나의 IPTV는" + address + "주소의" + getSize() + "인치" + getColor() + "색깔");
	}
	public static void main(String[] arsg) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}

}
