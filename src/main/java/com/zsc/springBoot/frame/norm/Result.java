package com.zsc.springBoot.frame.norm;

import java.util.HashMap;
import java.util.Map;

import com.zsc.springBoot.frame.common.Status;

/**
 * 
 * @ClassName:  Result   
 * @Description:定义数据返回格式 
 * @author: zhushuncheng
 * @date:   2018年12月5日 下午1:58:04
 */
public class Result {
	
	//定义返回的状态码 默认0
	private int status = Status.Common.SUCCESS.getStatus();
	
	//定义返回的信息  默认成功
	private String info = Status.Common.SUCCESS.getInfo();
	
	//定义返回的数据
	private Map<String,Object> data = new HashMap<>();

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}
	
	
}
