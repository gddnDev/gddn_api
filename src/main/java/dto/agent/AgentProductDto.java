package dto.agent;

import java.io.Serializable;

/**
 * @Auther: 36560
 * @Date: 2020/2/24 :8:35
 * @Description:
 */
public class AgentProductDto implements Serializable {

    /**
     * 代理商主键
     */
    private Integer agentId;

    /**
     * 产品主键
     */
    private Integer productId;

    /**
     * 产品数量
     */
    private Integer authorizedQuantity;

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getAuthorizedQuantity() {
        return authorizedQuantity;
    }

    public void setAuthorizedQuantity(Integer authorizedQuantity) {
        this.authorizedQuantity = authorizedQuantity;
    }
}
