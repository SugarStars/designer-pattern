package com.sugar.facade;

public interface 质检局 {
	void  orgCodeCertificate();  //办理组织机构代码证
}



class 南京质检局 implements 质检局 {

	@Override
	public void orgCodeCertificate() {
		System.out.println("在南京质检局办理组织机构代码证！");
	}

}
