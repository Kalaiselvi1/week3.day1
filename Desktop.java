package org.system;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("The desktop size is 13 inches.");

	}

	public static void main(String[] args) {
		Desktop obj=new Desktop();
		obj.computerModel();
		obj.desktopSize();
		

	}

}
