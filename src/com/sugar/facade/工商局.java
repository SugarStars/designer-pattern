package com.sugar.facade;

public interface 工商局  {
	void checkName();  //核名
}

class 南京工商局 implements 工商局 {

	@Override
	public void checkName() {
		System.out.println("检查名字是否有冲突！");
	}

}
