package org.acw.base;

//import com.github.miemiedev.mybatis.paginator.domain.PageBounds;

/**
 * @author yinliangyun
 *
 * 2018年3月30日-下午10:30:26
 */
public class BaseQuery {
	
	private static final Integer PAGE = 1;
	private static final Integer ROWS = 10;
	private Integer page;
	private Integer rows;
	
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	
/*	public PageBounds buildPageBounds() {
		if (page == null || page < 1) {
			page = PAGE;
		}
		if (rows == null || rows < 1) {
			rows = ROWS;
		}
		PageBounds pageBounds = new PageBounds(page, rows);
		return pageBounds;
	}*/
	
}
