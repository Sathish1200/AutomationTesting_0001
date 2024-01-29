package org.user;

import org.base.BaseClass;
import org.pojo.PurchasePage;

public class ProductPurchasePage extends BaseClass {

	public void purchaseProduct() throws InterruptedException {
		PurchasePage pc = new PurchasePage();
		passText("14.1-inch Laptop", pc.getSerchBtn());
		clickBtn(pc.getClickBtn());
		clickBtn(pc.getAddcartBtn());
		clickBtn(pc.getShopCart());
		Thread.sleep(3000);
		clickBtn(pc.getCheckBox());
		clickBtn(pc.getCheckOut());
		Thread.sleep(3000);
		passText("inmakes infotech", pc.getComName());
		clickBtn(pc.getBilling());
		clickBtn(pc.getArmenia());
		passText("chennai", pc.getCity());
		Thread.sleep(3000);
		passText("karala,top tower street,inmakes info tech,", pc.getAddress1());
		
		passText("chennai", pc.getAddress2());
		passText("6067", pc.getPostalCode());
		passText("8255053537", pc.getPhoneNo());
		passText("123625", pc.getFaxNo());
		clickBtn(pc.getContinueBtn());
		Thread.sleep(3000);
		clickBtn(pc.getCheckBox1());
		clickBtn(pc.getContinueBtn1());
		Thread.sleep(3000);
		clickBtn(pc.getContinueBtn2());
		Thread.sleep(3000);
		clickBtn(pc.getContinueBtn3());
		Thread.sleep(3000);
		clickBtn(pc.getContinueBtn4());
		Thread.sleep(3000);
		clickBtn(pc.getContinueBtn5());

	}

}
