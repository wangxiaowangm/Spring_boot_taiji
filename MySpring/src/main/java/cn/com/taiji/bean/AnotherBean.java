package cn.com.taiji.bean;

import org.springframework.stereotype.Component;

@Component
public class AnotherBean {
	private String name;
	
	private ExampleBean exampleBean;

	public String getName() {
		return name;
	}

	public AnotherBean() {
		super();
	}

	public AnotherBean(String name, ExampleBean exampleBean) {
		super();
		this.name = name;
		this.exampleBean = exampleBean;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ExampleBean getExampleBean() {
		return exampleBean;
	}

	public void setExampleBean(ExampleBean exampleBean) {
		this.exampleBean = exampleBean;
	}

}
