

package com.yami.shop.bean.app.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value= "设置用户信息")
public class UserInfoParam {
	
	@ApiModelProperty(value = "用户昵称")
	private String nickName;
	
	@ApiModelProperty(value = "用户头像")
	private String avatarUrl;

}
