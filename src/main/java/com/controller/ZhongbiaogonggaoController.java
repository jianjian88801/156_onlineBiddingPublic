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

import com.entity.ZhongbiaogonggaoEntity;
import com.entity.view.ZhongbiaogonggaoView;

import com.service.ZhongbiaogonggaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 中标公告
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-13 10:40:26
 */
@RestController
@RequestMapping("/zhongbiaogonggao")
public class ZhongbiaogonggaoController {
    @Autowired
    private ZhongbiaogonggaoService zhongbiaogonggaoService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhongbiaogonggaoEntity zhongbiaogonggao,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zerendanwei")) {
			zhongbiaogonggao.setZhaobiaodanwei((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("gongyingshang")) {
			zhongbiaogonggao.setGongyingshangmingcheng((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhongbiaogonggaoEntity> ew = new EntityWrapper<ZhongbiaogonggaoEntity>();
		PageUtils page = zhongbiaogonggaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhongbiaogonggao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhongbiaogonggaoEntity zhongbiaogonggao, 
		HttpServletRequest request){
        EntityWrapper<ZhongbiaogonggaoEntity> ew = new EntityWrapper<ZhongbiaogonggaoEntity>();
		PageUtils page = zhongbiaogonggaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhongbiaogonggao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhongbiaogonggaoEntity zhongbiaogonggao){
       	EntityWrapper<ZhongbiaogonggaoEntity> ew = new EntityWrapper<ZhongbiaogonggaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhongbiaogonggao, "zhongbiaogonggao")); 
        return R.ok().put("data", zhongbiaogonggaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhongbiaogonggaoEntity zhongbiaogonggao){
        EntityWrapper< ZhongbiaogonggaoEntity> ew = new EntityWrapper< ZhongbiaogonggaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhongbiaogonggao, "zhongbiaogonggao")); 
		ZhongbiaogonggaoView zhongbiaogonggaoView =  zhongbiaogonggaoService.selectView(ew);
		return R.ok("查询中标公告成功").put("data", zhongbiaogonggaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhongbiaogonggaoEntity zhongbiaogonggao = zhongbiaogonggaoService.selectById(id);
        return R.ok().put("data", zhongbiaogonggao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhongbiaogonggaoEntity zhongbiaogonggao = zhongbiaogonggaoService.selectById(id);
        return R.ok().put("data", zhongbiaogonggao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhongbiaogonggaoEntity zhongbiaogonggao, HttpServletRequest request){
    	zhongbiaogonggao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhongbiaogonggao);
        zhongbiaogonggaoService.insert(zhongbiaogonggao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhongbiaogonggaoEntity zhongbiaogonggao, HttpServletRequest request){
    	zhongbiaogonggao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhongbiaogonggao);
        zhongbiaogonggaoService.insert(zhongbiaogonggao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZhongbiaogonggaoEntity zhongbiaogonggao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhongbiaogonggao);
        zhongbiaogonggaoService.updateById(zhongbiaogonggao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhongbiaogonggaoService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ZhongbiaogonggaoEntity> wrapper = new EntityWrapper<ZhongbiaogonggaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zerendanwei")) {
			wrapper.eq("zhaobiaodanwei", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("gongyingshang")) {
			wrapper.eq("gongyingshangmingcheng", (String)request.getSession().getAttribute("username"));
		}

		int count = zhongbiaogonggaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
