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
		System.out.println(getSize() + "��ġ" + tvColor + "�÷�");
	}
}

public class IPTV extends ColorTV {
	private String address;
	public IPTV (String address, int size, int tvColor) {
		super(size, tvColor);
		this.address = address;
	}
	public void printProperty() {
		System.out.println("���� IPTV��" + address + "�ּ���" + getSize() + "��ġ" + getColor() + "����");
	}
	public static void main(String[] arsg) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}

}
