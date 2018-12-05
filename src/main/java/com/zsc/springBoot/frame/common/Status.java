package com.zsc.springBoot.frame.common;

/**
 * 
 * @ClassName:  Status   
 * @Description:全局状态码   
 * @author: zhushuncheng
 * @date:   2018年12月5日 下午2:19:01
 */
public interface Status {
	//获得状态值
	int  getStatus();
	//获得返回信息
	String getInfo();
	
	enum Common implements Status{
		//成功
		SUCCESS(0,"成功"),
		//失败
		ERROR(-1,"失败");
		
		private int status;
		private String info;
		
		private Common(int status,String info) {
			this.status= status;
			this.info = info;
		}
		
		@Override
		public int getStatus() {
			return status;
		}

		@Override
		public String getInfo() {
			return info;
		}

	}
	
}
