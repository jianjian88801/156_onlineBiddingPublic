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

import com.entity.ZhaobiaoxiangmuEntity;
import com.entity.view.ZhaobiaoxiangmuView;

import com.service.ZhaobiaoxiangmuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 招标项目
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-13 10:40:26
 */
@RestController
@RequestMapping("/zhaobiaoxiangmu")
public class ZhaobiaoxiangmuController {
    @Autowired
    private ZhaobiaoxiangmuService zhaobiaoxiangmuService;

    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhaobiaoxiangmuEntity zhaobiaoxiangmu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zerendanwei")) {
			zhaobiaoxiangmu.setZhaobiaodanwei((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhaobiaoxiangmuEntity> ew = new EntityWrapper<ZhaobiaoxiangmuEntity>();
		PageUtils page = zhaobiaoxiangmuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhaobiaoxiangmu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhaobiaoxiangmuEntity zhaobiaoxiangmu, 
		HttpServletRequest request){
        EntityWrapper<ZhaobiaoxiangmuEntity> ew = new EntityWrapper<ZhaobiaoxiangmuEntity>();
		PageUtils page = zhaobiaoxiangmuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhaobiaoxiangmu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhaobiaoxiangmuEntity zhaobiaoxiangmu){
       	EntityWrapper<ZhaobiaoxiangmuEntity> ew = new EntityWrapper<ZhaobiaoxiangmuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhaobiaoxiangmu, "zhaobiaoxiangmu")); 
        return R.ok().put("data", zhaobiaoxiangmuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhaobiaoxiangmuEntity zhaobiaoxiangmu){
        EntityWrapper< ZhaobiaoxiangmuEntity> ew = new EntityWrapper< ZhaobiaoxiangmuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhaobiaoxiangmu, "zhaobiaoxiangmu")); 
		ZhaobiaoxiangmuView zhaobiaoxiangmuView =  zhaobiaoxiangmuService.selectView(ew);
		return R.ok("查询招标项目成功").put("data", zhaobiaoxiangmuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhaobiaoxiangmuEntity zhaobiaoxiangmu = zhaobiaoxiangmuService.selectById(id);
		zhaobiaoxiangmu.setClicknum(zhaobiaoxiangmu.getClicknum()+1);
		zhaobiaoxiangmu.setClicktime(new Date());
		zhaobiaoxiangmuService.updateById(zhaobiaoxiangmu);
        return R.ok().put("data", zhaobiaoxiangmu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhaobiaoxiangmuEntity zhaobiaoxiangmu = zhaobiaoxiangmuService.selectById(id);
		zhaobiaoxiangmu.setClicknum(zhaobiaoxiangmu.getClicknum()+1);
		zhaobiaoxiangmu.setClicktime(new Date());
		zhaobiaoxiangmuService.updateById(zhaobiaoxiangmu);
        return R.ok().put("data", zhaobiaoxiangmu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhaobiaoxiangmuEntity zhaobiaoxiangmu, HttpServletRequest request){
    	zhaobiaoxiangmu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhaobiaoxiangmu);
        zhaobiaoxiangmuService.insert(zhaobiaoxiangmu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhaobiaoxiangmuEntity zhaobiaoxiangmu, HttpServletRequest request){
    	zhaobiaoxiangmu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhaobiaoxiangmu);
        zhaobiaoxiangmuService.insert(zhaobiaoxiangmu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZhaobiaoxiangmuEntity zhaobiaoxiangmu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhaobiaoxiangmu);
        zhaobiaoxiangmuService.updateById(zhaobiaoxiangmu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhaobiaoxiangmuService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ZhaobiaoxiangmuEntity> wrapper = new EntityWrapper<ZhaobiaoxiangmuEntity>();
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

		int count = zhaobiaoxiangmuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,ZhaobiaoxiangmuEntity zhaobiaoxiangmu, HttpServletRequest request,String pre){
        EntityWrapper<ZhaobiaoxiangmuEntity> ew = new EntityWrapper<ZhaobiaoxiangmuEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = zhaobiaoxiangmuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhaobiaoxiangmu), params), params));
        return R.ok().put("data", page);
    }


    /**
     * 协同算法（按收藏推荐）
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params,ZhaobiaoxiangmuEntity zhaobiaoxiangmu, HttpServletRequest request){
        String userId = request.getSession().getAttribute("userId").toString();
        String inteltypeColumn = "zhaobiaofenlei";
        List<StoreupEntity> storeups = storeupService.selectList(new EntityWrapper<StoreupEntity>().eq("type", 1).eq("userid", userId).eq("tablename", "zhaobiaoxiangmu").orderBy("addtime", false));
        List<String> inteltypes = new ArrayList<String>();
        Integer limit = params.get("limit")==null?10:Integer.parseInt(params.get("limit").toString());
        List<ZhaobiaoxiangmuEntity> zhaobiaoxiangmuList = new ArrayList<ZhaobiaoxiangmuEntity>();
        //去重
        if(storeups!=null && storeups.size()>0) {
            for(StoreupEntity s : storeups) {
                zhaobiaoxiangmuList.addAll(zhaobiaoxiangmuService.selectList(new EntityWrapper<ZhaobiaoxiangmuEntity>().eq(inteltypeColumn, s.getInteltype())));
            }
        }
        EntityWrapper<ZhaobiaoxiangmuEntity> ew = new EntityWrapper<ZhaobiaoxiangmuEntity>();
        params.put("sort", "id");
        params.put("order", "desc");
        PageUtils page = zhaobiaoxiangmuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhaobiaoxiangmu), params), params));
        List<ZhaobiaoxiangmuEntity> pageList = (List<ZhaobiaoxiangmuEntity>)page.getList();
        if(zhaobiaoxiangmuList.size()<limit) {
            int toAddNum = (limit-zhaobiaoxiangmuList.size())<=pageList.size()?(limit-zhaobiaoxiangmuList.size()):pageList.size();
            for(ZhaobiaoxiangmuEntity o1 : pageList) {
                boolean addFlag = true;
                for(ZhaobiaoxiangmuEntity o2 : zhaobiaoxiangmuList) {
                    if(o1.getId().intValue()==o2.getId().intValue()) {
                        addFlag = false;
                        break;
                    }
                }
                if(addFlag) {
                    zhaobiaoxiangmuList.add(o1);
                    if(--toAddNum==0) break;
                }
            }
        } else if(zhaobiaoxiangmuList.size()>limit) {
            zhaobiaoxiangmuList = zhaobiaoxiangmuList.subList(0, limit);
        }
        page.setList(zhaobiaoxiangmuList);
        return R.ok().put("data", page);
    }





}
