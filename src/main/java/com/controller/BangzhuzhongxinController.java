package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.BangzhuzhongxinEntity;
import com.entity.view.BangzhuzhongxinView;

import com.service.BangzhuzhongxinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 帮助中心
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-13 10:40:26
 */
@RestController
@RequestMapping("/bangzhuzhongxin")
public class BangzhuzhongxinController {
    @Autowired
    private BangzhuzhongxinService bangzhuzhongxinService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BangzhuzhongxinEntity bangzhuzhongxin,
		HttpServletRequest request){
        EntityWrapper<BangzhuzhongxinEntity> ew = new EntityWrapper<BangzhuzhongxinEntity>();
		PageUtils page = bangzhuzhongxinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, bangzhuzhongxin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BangzhuzhongxinEntity bangzhuzhongxin, 
		HttpServletRequest request){
        EntityWrapper<BangzhuzhongxinEntity> ew = new EntityWrapper<BangzhuzhongxinEntity>();
		PageUtils page = bangzhuzhongxinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, bangzhuzhongxin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BangzhuzhongxinEntity bangzhuzhongxin){
       	EntityWrapper<BangzhuzhongxinEntity> ew = new EntityWrapper<BangzhuzhongxinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( bangzhuzhongxin, "bangzhuzhongxin")); 
        return R.ok().put("data", bangzhuzhongxinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BangzhuzhongxinEntity bangzhuzhongxin){
        EntityWrapper< BangzhuzhongxinEntity> ew = new EntityWrapper< BangzhuzhongxinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( bangzhuzhongxin, "bangzhuzhongxin")); 
		BangzhuzhongxinView bangzhuzhongxinView =  bangzhuzhongxinService.selectView(ew);
		return R.ok("查询帮助中心成功").put("data", bangzhuzhongxinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BangzhuzhongxinEntity bangzhuzhongxin = bangzhuzhongxinService.selectById(id);
        return R.ok().put("data", bangzhuzhongxin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BangzhuzhongxinEntity bangzhuzhongxin = bangzhuzhongxinService.selectById(id);
        return R.ok().put("data", bangzhuzhongxin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BangzhuzhongxinEntity bangzhuzhongxin, HttpServletRequest request){
    	bangzhuzhongxin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(bangzhuzhongxin);
        bangzhuzhongxinService.insert(bangzhuzhongxin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BangzhuzhongxinEntity bangzhuzhongxin, HttpServletRequest request){
    	bangzhuzhongxin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(bangzhuzhongxin);
        bangzhuzhongxinService.insert(bangzhuzhongxin);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody BangzhuzhongxinEntity bangzhuzhongxin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(bangzhuzhongxin);
        bangzhuzhongxinService.updateById(bangzhuzhongxin);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        bangzhuzhongxinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<BangzhuzhongxinEntity> wrapper = new EntityWrapper<BangzhuzhongxinEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = bangzhuzhongxinService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
