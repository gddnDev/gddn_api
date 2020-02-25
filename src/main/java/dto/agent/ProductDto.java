package dto.agent;

import java.io.Serializable;
import java.util.Date;

public class ProductDto implements Serializable {

    private Integer id;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 产品类型：0 企业级 1 项目级
     */
    private Byte type;

    /**
     * 产品包含的应用的集合
     */
    private Integer[] applications;

    public Integer[] getApplications() {
        return applications;
    }

    public void setApplications(Integer[] applications) {
        this.applications = applications;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

}