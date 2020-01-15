package org.forbes.comm.constant;
/***
 * CommonConstant概要说明：常用常量
 * @author Huanghy
 */
public interface CommonConstant {
	
	
	/*******http状态码********/
	public static final String X_ACCESS_TOKEN = "X-Access-Token";
	/** {@code 500 Server Error} (HTTP/1.0 - RFC 1945) */
    public static final Integer SC_INTERNAL_SERVER_ERROR_500 = 500;
    /** {@code 200 OK} (HTTP/1.0 - RFC 1945) */
    public static final Integer SC_OK_200 = 200;
    /***********/
    public static final String PREFIX_USER_ROLE = "PREFIX_USER_ROLE";
    public static final String PREFIX_USER_PERMISSION  = "PREFIX_USER_PERMISSION";
    public static final int  TOKEN_EXPIRE_TIME  = 3600; //3600秒即是一小时
    public static final String PREFIX_USER_TOKEN  = "PREFIX_USER_TOKEN";
    public static final String PREFIX_USER  = "PREFIX_USER%s";
    /****默认空值
     */
    public static final String DEFAULT_EMPTY = "";
    public static final String SEPARATOR = ",";
    public static final String FILE_SEPARATOR = ".";
    public static final String USER_NAME = "username";
    public static final String PROVILES_CODE = "spring.profiles.active";
    public static final String ACTIVE_CODE = "dev";
    /***返回文件对象***/
    public static final String CN_NAME_CODE = "cnName";
    public static final String EN_NAME_CODE = "enName";
    public static final String SUFFIX_CODE = "suffix";
    public static final String FILE_PATH_CODE = "filePath";
    /***日期年月**/
    public  final String YEAR_MONTH_FORMAT = "yyyyMM";

    /**d导航分组实体类常量**/
    public static final String AGV_GROUP_NAME = "name";//名称


    /**导航实体类常量**/
    public static final String GROUP_ID = "group_id";//分组id
    public static final String NAV_NAME = "name";//导航名称

    /**楼层实体类常量**/
    public static final String FLOOR_ORDERS = "floor_orders";//楼层序号
    public static final String FLOOR_NAME = "name";//楼层名称

    /**广告位实体类常量**/
    public static final String ADPOSITION_FLOOR_ID = "floor_id";//楼层id
    public static final String DPOSITION_NAME = "name";//广告位名称
    public static final String ADPOSITION_ID = "id";//广告位主键id
    /**广告位附件实体类常量**/
    public static final String DATA_ID = "data_id";//广告位名称

    /**新闻实体类常量**/
    public static final String NEWS_TITLE = "title";//新闻标题
    public static final String RELEASE_STATUS = "release_status";//新闻状态
    public static final String TYPE_ID = "type_id";//新闻类型ID

    /**新闻附件实体类常量**/
    public static final String NEWS_ATTACH_CN_NAME = "cn_name";//新附件中文名称


    /**新闻分类实体类常量**/
    public static final String NEWS_TYPE_NAME = "name";//新闻分类名称
    public static final String NEWS_TYPE_CODE = "code";//新闻分类编码

    /**广告位实体类常量**/
    public static final String AD_POSITION_NAME = "name";//广告位名称

    /**广告附件实体类常量**/
    public static final String AD_ATTACH_CH_NAME = "cn_name";//广告附件中文名称

}
