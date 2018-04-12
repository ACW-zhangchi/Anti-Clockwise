package org.acw.vo;

/**
 * @author yinliangyun
 *
 * 2018年3月30日-下午10:26:48
 */
public class CustomerVO {
	
	/**
	 * id和name的确定是根据sale_chance.ftl
	 * 中editable:false,valueField:'id',textField:'name', url:'${ctx}/customer/find_all'"
	 * 的属性来确定的
	 */
	private Integer id;
	private String name;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
