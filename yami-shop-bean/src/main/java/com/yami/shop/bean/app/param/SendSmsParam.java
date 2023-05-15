

package com.yami.shop.bean.app.param;

import javax.validation.constraints.Pattern;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value= "发送验证码参数")
public class SendSmsParam {
	
	@ApiModelProperty(value = "手机号")
	@Pattern(regexp="1[0-9]{10}",message = "请输入正确的手机号")
	private String mobile;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	
}
