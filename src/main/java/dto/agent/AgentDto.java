package dto.agent;

import java.io.Serializable;
import java.util.List;

public class AgentDto implements Serializable {

    private Integer id;

    /**
     * 代理商类型：0 全国代理商1 区域代理商
     */
    private Byte type;

    /**
     * 关联的桩桩企业id
     */
    private Integer companyId;

    /**
     * 产品列表
     */
    private List<AgentProductDto> products;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public List<AgentProductDto> getProducts() {
        return products;
    }

    public void setProducts(List<AgentProductDto> products) {
        this.products = products;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

}