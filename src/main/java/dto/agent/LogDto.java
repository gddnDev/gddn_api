package dto.agent;


import java.io.Serializable;

/**
 * @Auther: 36560
 * @Date: 2020/2/19 :14:17
 * @Description: 日志信息
 */
public class LogDto implements Serializable {

    private Integer id;

    /**
     * 操作人id
     */
    private String operateUserId;

    /**
     * 操作企业id
     */
    private Integer operationCompanyId;

    /**
     * 操作项目id
     */
    private Integer operationProjectId;

    /**
     * 操作代理商姓名
     */
    private String operateUserName;

    private String operationCompanyName;

    private String operationProjectName;

    /**
     * 0 代理商管理 1 产品管理 2 代理商企业管理 3 代理商项目管理 4 产品授权
     */
    private Byte operationType;

    /**
     * 操作详细类型：0 新增 1 更新 2 删除
     */
    private Byte operationTypeDetail;

    private String operationRemark;

    private Long timestampCreate;

    private Long timestampModify;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOperateUserId() {
        return operateUserId;
    }

    public void setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
    }

    public Integer getOperationCompanyId() {
        return operationCompanyId;
    }

    public void setOperationCompanyId(Integer operationCompanyId) {
        this.operationCompanyId = operationCompanyId;
    }

    public Integer getOperationProjectId() {
        return operationProjectId;
    }

    public void setOperationProjectId(Integer operationProjectId) {
        this.operationProjectId = operationProjectId;
    }

    public String getOperateUserName() {
        return operateUserName;
    }

    public void setOperateUserName(String operateUserName) {
        this.operateUserName = operateUserName;
    }

    public String getOperationCompanyName() {
        return operationCompanyName;
    }

    public void setOperationCompanyName(String operationCompanyName) {
        this.operationCompanyName = operationCompanyName;
    }

    public String getOperationProjectName() {
        return operationProjectName;
    }

    public void setOperationProjectName(String operationProjectName) {
        this.operationProjectName = operationProjectName;
    }

    public Byte getOperationType() {
        return operationType;
    }

    public void setOperationType(Byte operationType) {
        this.operationType = operationType;
    }

    public Byte getOperationTypeDetail() {
        return operationTypeDetail;
    }

    public void setOperationTypeDetail(Byte operationTypeDetail) {
        this.operationTypeDetail = operationTypeDetail;
    }

    public String getOperationRemark() {
        return operationRemark;
    }

    public void setOperationRemark(String operationRemark) {
        this.operationRemark = operationRemark;
    }

    public Long getTimestampCreate() {
        return timestampCreate;
    }

    public void setTimestampCreate(Long timestampCreate) {
        this.timestampCreate = timestampCreate;
    }

    public Long getTimestampModify() {
        return timestampModify;
    }

    public void setTimestampModify(Long timestampModify) {
        this.timestampModify = timestampModify;
    }
}
