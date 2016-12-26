package kitcheners.imp1;

import kitcheners.IKitchener;

public class KitchenerImp1 implements IKitchener {
	private String name;
	private String specialty;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public String doCooking() {
		// TODO Auto-generated method stub
		System.out.println("  厨师  " + name  + " 为您服务");
		return this.specialty;
	}

}