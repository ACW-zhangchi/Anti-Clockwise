package org.acw.vo;

import java.io.Serializable;

/**
 * @author yinliangyun
 *
 * 2018年3月30日-下午10:27:08
 */
@SuppressWarnings("serial")
public class RoleVO implements Serializable {
	
	private Integer id;
	private String roleName;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
