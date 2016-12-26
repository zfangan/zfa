package customers.imp1;

import kitcheners.IKitchener;
import customers.ICustomer;

public class CustomerImp1 implements ICustomer{
	private String  name;
	private IKitchener kitchener;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public IKitchener getKitchener() {
		return kitchener;
	}
	public void setKitchener(IKitchener kitchener) {
		this.kitchener = kitchener;
	}
	public void haveDinner(){
		
		System.out.println("  顾客    " + this.name +
				"  吃到了   "  + kitchener.doCooking());
	}
}
