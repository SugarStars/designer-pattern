package com.sugar.facade;

public interface 税务局 {
	void taxCertificate();  //办理税务登记证
}


class 南京税务局 implements 税务局 {

	@Override
	public void taxCertificate() {
		System.out.println("在南京税务局办理税务登记证！");
	}

}
