

package com.yami.shop.bean.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
@ApiModel(value= "设置用户信息")
public class UserRegisterParam {

	@ApiModelProperty(value = "密码")
	private String passWord;

	@ApiModelProperty(value = "邮箱")
	private String userMail;

	@ApiModelProperty(value = "昵称")
	private String nickName;

	@ApiModelProperty(value = "用户名")
	private String userName;

	@ApiModelProperty(value = "手机号")
	private String mobile;

	@ApiModelProperty(value = "头像")
	private String img;

	@ApiModelProperty(value = "校验登陆注册验证码成功的标识")
	private String checkRegisterSmsFlag;

	@ApiModelProperty(value = "当账户未绑定时，临时的uid")
	private String tempUid;

	@ApiModelProperty(value = "用户id")
	private Long userId;
}
