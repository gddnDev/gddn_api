package api;

import dto.agent.PaginationDto;

import java.io.Serializable;
import java.util.List;

/**
 * 通用的服务方法的接口
 */
public interface BaseService<T extends Serializable>  {

    /**
     * 获得单个对象，调用框架方法，获得对象属性数据
     * @param id 主键ID
     * @return 数据对象
     */
    T findOne(final int id);

    /**
     * 获得全部对象
     * @return 数据列表
     */
    List<T> findAll();

    /**
     * 新建一个对象，调用框架响应验证方法
     * @param entity 数据对象
     */
    void create(final T entity);

    /**
     * 修改一个对象，调用框架响应验证方法
     * @param entity 数据对象
     */
    void update(final T entity);

    /**
     * 删除一个对象，调用框架响应验证方法
     * @param entity 数据对象
     */
    void delete(final T entity);

    PaginationDto<T> paginationList(PaginationDto<T> paginationDto);
}