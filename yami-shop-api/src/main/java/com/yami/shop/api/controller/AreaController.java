

package com.yami.shop.api.controller;

import java.util.List;

import com.yami.shop.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yami.shop.bean.model.Area;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/p/area")
@Api(tags="省市区接口")
public class AreaController {

    @Autowired
    private AreaService areaService;
    
    /**
	 * 分页获取
	 */
    @GetMapping("/listByPid")
    @ApiOperation(value="获取省市区信息", notes="根据省市区的pid获取地址信息")
    @ApiImplicitParam(name = "pid", value = "省市区的pid(pid为0获取所有省份)", required = true, dataType = "String")
	public ResponseEntity<List<Area>> listByPid(Long pid){
		List<Area> list = areaService.listByPid(pid);
		return ResponseEntity.ok(list);
	}
    
}
