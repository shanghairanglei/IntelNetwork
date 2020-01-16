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

	/****需求返回消息****/
	public static final  String REQUIREMENT_MSG = "需求查询成功";
	public static final  String REQUIREMENT_ERROR_MSG = "需求查询失败";
	public static final  String ADD_REQUIREMENT_MSG = "添加需求成功";
	public static final  String ADD_REQUIREMENT_ERROR_MSG = "添加需求失败";

	/****行业类别返回消息****/
	public static final  String VOCATION_TYPE_MSG = "行业类别查询成功";
	public static final  String VOCATION_TYPE_ERROR_MSG = "行业类别查询失败";



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

