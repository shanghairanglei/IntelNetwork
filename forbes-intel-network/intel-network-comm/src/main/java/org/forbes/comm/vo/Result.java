package org.forbes.comm.vo;

import java.io.Serializable;

import org.forbes.comm.constant.CommonConstant;

import lombok.Data;
/***
 * Result概要说明：统一返回错误
 * @author Huanghy
 */
@Data
public class Result<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 成功标志
	 */
	private boolean success = true;

	/**
	 * 返回处理消息
	 */
	private String message = "操作成功！";



	/******导航分组相关提示信息****/
	/******导航分组校验信息****/
	public static final  String EXISTS_NAV_GROUP_NAME_MSG = "已存在相同导航分组名称";
	public static final  String NOT_EXISTS_NAV_GROUP_NAME_MSG = "导航分组名称可用";

	public static final  String NAVIGATION_GROUP_MSG = "导航分组信息查询成功";
	public static final  String NAVIGATION_GROUP_NOT_ERROR_MSG = "导航分组信息查询失败";

	public static final  String ADD_NAVIGATION_GROUP_MSG = "添加导航分组成功";
	public static final  String ADD_NAVIGATION_GROUP_NOT_ERROR_MSG = "添加导航分组失败";

	public static final  String UPDATE_NAVIGATION_GROUP_MSG = "修改导航分组成功";
	public static final  String UPDATE_NAVIGATION_GROUP_NOT_ERROR_MSG = "修改导航分组失败";

	public static final  String DELETE_NAVIGATION_GROUP_MSG = "删除导航分组成功";
	public static final  String DELETE_NAVIGATION_GROUP_NOT_ERROR_MSG = "删除导航分组失败";

	/******导航相关提示信息****/
	/******导航校验信息****/
	public static final  String EXISTS_NAV_NAME_MSG = "此分组下已存在相同导航名称";
	public static final  String NOT_EXISTS_NAV_NAME_MSG = "导航名称可用";

	public static final  String NAVIGATION_MSG = "导航信息查询成功";
	public static final  String NAVIGATION_NOT_ERROR_MSG = "导航信息查询失败";

	public static final  String ADD_NAVIGATION_MSG = "添加导航成功";
	public static final  String ADD_NAVIGATION_NOT_ERROR_MSG = "添加导航失败";

	public static final  String UPDATE_NAVIGATION_MSG = "修改导航成功";
	public static final  String UPDATE_NAVIGATION_NOT_ERROR_MSG = "修改导航失败";

	public static final  String DELETE_NAVIGATION_MSG = "删除导航成功";
	public static final  String DELETE_NAVIGATION_NOT_ERROR_MSG = "删除导航失败";

	/******楼层相关提示信息****/
	/******楼层校验信息****/
	public static final  String EXISTS_FLOOR_NAME_MSG = "已存在相同楼层名称";
	public static final  String NOT_EXISTS_FLOOR_NAME_MSG = "楼层名称可用";

	public static final  String FLOOR_MSG = "楼层信息查询成功";
	public static final  String FLOOR_ERROR_MSG = "楼层信息查询失败";

	public static final  String ADD_FLOOR_MSG = "添加楼层成功";
	public static final  String ADD_FLOOR_ERROR_MSG = "添加楼层失败";

	public static final  String UPDATE_FLOOR_MSG = "修改楼层成功";
	public static final  String UPDATE_FLOOR_ERROR_MSG = "修改楼层失败";

	public static final  String DELETE_FLOOR_MSG = "删除楼层成功";
	public static final  String DELETE_FLOOR_ERROR_MSG = "删除楼层失败";

	/******广告位相关提示信息****/
	/******广告位校验信息****/
	public static final  String EXISTS_ADP_NAME_MSG = "已存在相同广告位名称";
	public static final  String NOT_EXISTS_ADP_NAME_MSG = "广告位名称可用";

	public static final  String ADP_MSG = "广告位信息查询成功";
	public static final  String ADP_ERROR_MSG = "广告位信息查询失败";

	public static final  String ADD_ADP_MSG = "添加广告位成功";
	public static final  String ADD_ADP_ERROR_MSG = "添加广告位失败";

	public static final  String UPDATE_ADP_MSG = "修改广告位成功";
	public static final  String UPDATE_ADP_ERROR_MSG = "修改广告位失败";

	public static final  String DELETE_ADP_MSG = "删除广告位成功";
	public static final  String DELETE_ADP_ERROR_MSG = "删除广告位失败";


	/******广告附件相关提示信息****/
	/******广告附件校验信息****/
	public static final  String AP_MSG = "广告附件信息查询成功";
	public static final  String AP_ERROR_MSG = "广告附件信息查询失败";

	public static final  String ADD_AP_MSG = "添加广告附件成功";
	public static final  String ADD_AP_ERROR_MSG = "添加广告附件失败";

	public static final  String UPDATE_AP_MSG = "修改广告附件成功";
	public static final  String UPDATE_AP_ERROR_MSG = "修改广告附件失败";

	public static final  String DELETE_AP_MSG = "删除广告附件成功";
	public static final  String DELETE_AP_ERROR_MSG = "删除广告附件失败";

	/******新闻相关提示信息****/
	/******新闻校验信息****/
	public static final  String EXISTS_NEWS_NAME_MSG = "已存在相同新闻标题";
	public static final  String NOT_EXISTS_NEWS_NAME_MSG = "新闻标题可用";

	public static final  String NEWS_MSG = "新闻信息查询成功";
	public static final  String NEWS_ERROR_MSG = "新闻信息查询失败";

	public static final  String ADD_NEWS_MSG = "添加新闻成功";
	public static final  String ADD_NEWS_ERROR_MSG = "添加新闻失败";

	public static final  String UPDATE_NEWS_MSG = "修改新闻成功";
	public static final  String UPDATE_NEWS_ERROR_MSG = "修改新闻失败";

	public static final  String DELETE_NEWS_MSG = "删除新闻成功";
	public static final  String DELETE_NEWS_ERROR_MSG = "删除新闻失败";

	public static final  String WITHDRAW_NEWS_MSG = "下架新闻成功";
	public static final  String WITHDRAW_NEWS_ERROR_MSG = "下架新闻失败";

	public static final  String EXAMINE_NEWS_MSG = "审核新闻成功";
	public static final  String EXAMINE_NEWS_ERROR_MSG = "审核新闻失败";

	/******新闻附件相关提示信息****/
	/******新闻附件校验信息****/
	public static final  String EXISTS_NEWS_ATTACH_NAME_MSG = "已存在相同新闻附件名称";

	public static final  String NEWS_ATTACH_MSG = "新闻附件信息查询成功";
	public static final  String NEWS_ATTACH_ERROR_MSG = "新闻附件信息查询失败";

	public static final  String ADD_NEWS_ATTACH_MSG = "添加新闻附件成功";
	public static final  String ADD_NEWS_ATTACH_ERROR_MSG = "添加新闻附件失败";

	public static final  String UPDATE_NEWS_ATTACH_MSG = "修改新闻附件成功";
	public static final  String UPDATE_NEWS_ATTACH_ERROR_MSG = "修改新闻附件失败";

	public static final  String DELETE_NEWS_ATTACH_MSG = "删除新闻附件成功";
	public static final  String DELETE_NEWS_ATTACH_ERROR_MSG = "删除新闻附件失败";






	/**
	 * 返回代码
	 */
	private Integer code = CommonConstant.SC_OK_200;
	private String  bizCode = "";
	
	/**
	 * 返回数据对象 data
	 */
	private T result;

	public Result() {
		
	}
	
	/**
	 * 时间戳
	 */
	private long timestamp = System.currentTimeMillis();

	public void error500(String message) {
		this.message = message;
		this.code = CommonConstant.SC_INTERNAL_SERVER_ERROR_500;
		this.success = false;
	}

	public void success(String message) {
		this.message = message;
		this.code = CommonConstant.SC_OK_200;
		this.success = true;
	}
	
	public static Result<Object> error(String msg) {
		return error(CommonConstant.SC_INTERNAL_SERVER_ERROR_500, msg);
	}
	
	public static Result<Object> error(int code, String msg) {
		Result<Object> r = new Result<Object>();
		r.setCode(code);
		r.setMessage(msg);
		r.setSuccess(false);
		return r;
	}
	
	/***
	 * error方法慨述:
	 * @param bizCode
	 * @param msg
	 * @return Result<Object>
	 * @创建人 huanghy
	 * @创建时间 2019年12月7日 下午4:07:04
	 * @修改人 (修改了该文件，请填上修改人的名字)
	 * @修改日期 (请填上修改该文件时的日期)
	 */
	public  void error(String bizCode, String msg) {
		this.bizCode = bizCode;
		this.message = msg;
		this.success = false;
	}
	
	public static Result<Object> ok(String msg) {
		Result<Object> r = new Result<Object>();
		r.setSuccess(true);
		r.setCode(CommonConstant.SC_OK_200);
		r.setMessage(msg);
		return r;
	}
	
	public static Result<Object> ok(Object data) {
		Result<Object> r = new Result<Object>();
		r.setSuccess(true);
		r.setCode(CommonConstant.SC_OK_200);
		r.setResult(data);
		return r;
	}
}

