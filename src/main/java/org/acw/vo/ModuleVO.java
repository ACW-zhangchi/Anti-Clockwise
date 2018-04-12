package org.acw.vo;

import java.io.Serializable;

/**
 * @author yinliangyun
 *
 * 2018年3月30日-下午10:26:59
 */
@SuppressWarnings("serial")
public class ModuleVO implements Serializable{

    private String moduleName;
    private Integer parentId;
    private Integer id;
    private boolean checked;
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	
}