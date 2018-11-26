package cn.com.taiji.bean;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ExampleBean {
	@Autowired
	// @Qualifier("ab")
	// @Resource(name = "ab")
	private AnotherBean beanOne;

	@Autowired
	private YetAnotherBean beanTwo;

	private int i;

	public ExampleBean() {
		super();
	}

	public ExampleBean(AnotherBean beanOne, YetAnotherBean beanTwo, int i) {
		super();
		this.beanOne = beanOne;
		this.beanTwo = beanTwo;
		this.i = i;
	}

	public AnotherBean getBeanOne() {
		return beanOne;
	}

	public void setBeanOne(AnotherBean beanOne) {
		this.beanOne = beanOne;
	}

	public YetAnotherBean getBeanTwo() {
		return beanTwo;
	}

	public void setBeanTwo(YetAnotherBean beanTwo) {
		this.beanTwo = beanTwo;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}
