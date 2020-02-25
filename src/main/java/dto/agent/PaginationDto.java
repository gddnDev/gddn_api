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
}
