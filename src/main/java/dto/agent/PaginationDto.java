package dto.agent;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: Administrator
 * @Date: 2019/12/10 :11:18
 * @Description:
 */
public class PaginationDto<T> implements Serializable {
    /**
     * 页码
     */
    private Integer page;
    /**
     * 每页行数
     */
    private Integer size;
    /**
     * 总页数
     */
    private Integer totalPage;
    /**
     * 总行数
     */
    private Integer totalRows;
    /**
     * 结果列表
     */
    private List<T> list;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
