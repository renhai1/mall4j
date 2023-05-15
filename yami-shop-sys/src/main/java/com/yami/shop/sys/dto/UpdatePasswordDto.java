

package com.yami.shop.sys.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@ApiModel(value= "更新密码参数")
public class UpdatePasswordDto {

	@NotBlank(message="旧密码不能为空")
	@Size(max = 50)
	@ApiModelProperty(value = "旧密码",required=true)
	private String password;
	
	@NotBlank(message="新密码不能为空")
	@Size(max = 50)
	@ApiModelProperty(value = "新密码",required=true)
	private String newPassword;
}
