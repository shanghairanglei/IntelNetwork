package org.forbes.comm.enums;

/***
 * BizResultEnum概要说明：业务系统错误代码
 * @author niehy(Frunk)
 */
public enum BizResultEnum {
    /***
     * 009-智工网
     * 功能暂无-表示通用异常
     * 001-为空判断
     */

    EMPTY("009001000", "参数为空", "%s参数为空"),
    ENTITY_EMPTY("009002000", "对象为空", ""),

    /****发布需求002****/
    R_NAME("009002000", "任务名称为空", "%s任务名称为空"),
    TASKTYPE("009002001", "任务类型为空", "%s任务类型为空"),
    CYCLETIME("009002003", "任务周期为空", "%s任务周期为空"),
    SALARY("009002004", "薪资范围为空", "%s薪资范围为空"),
    DESCRIPTION("009002005", "任务描述为空", "%s任务描述为空"),
    USER_ID("009002006", "发布人id为空", "%s发布人id为空"),
    VOCATION_TYPE_ID("009002006", "行业类别id为空", "%s行业类别id为空"),

    /****需求竞标003****/
    REQUIRE_ID("009003000", "需求任务id为空", "%s需求任务id为空"),
    WORKER_ID("009003001", "用户id（竞标人员id）为空", "%s用户id（竞标人员id）为空"),
    STATE("009003002", "状态为空", "%状态为空"),;


    /**
     * 错误编码业务系统代码+功能编码+错误代码
     **/
    private String bizCode;
    /**
     * 错误描述
     ****/
    private String bizMessage;
    /**
     * 带格式错误描述
     ****/
    private String bizFormateMessage;

    /***
     * 构造函数:
     * @param bizCode
     * @param bizMessage
     * @param bizFormateMessage
     */
    BizResultEnum(String bizCode, String bizMessage, String bizFormateMessage) {
        this.bizCode = bizCode;
        this.bizMessage = bizMessage;
        this.bizFormateMessage = bizFormateMessage;
    }

    /**
     * @return bizCode
     */
    public String getBizCode() {
        return bizCode;
    }

    /**
     * @param bizCode 要设置的 bizCode
     */
    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }

    /**
     * @return bizMessage
     */
    public String getBizMessage() {
        return bizMessage;
    }

    /**
     * @param bizMessage 要设置的 bizMessage
     */
    public void setBizMessage(String bizMessage) {
        this.bizMessage = bizMessage;
    }

    /**
     * @return bizFormateMessage
     */
    public String getBizFormateMessage() {
        return bizFormateMessage;
    }

    /**
     * @param bizFormateMessage 要设置的 bizFormateMessage
     */
    public void setBizFormateMessage(String bizFormateMessage) {
        this.bizFormateMessage = bizFormateMessage;
    }
}
