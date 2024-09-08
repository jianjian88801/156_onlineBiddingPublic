package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZaixiantoubiaoDao;
import com.entity.ZaixiantoubiaoEntity;
import com.service.ZaixiantoubiaoService;
import com.entity.vo.ZaixiantoubiaoVO;
import com.entity.view.ZaixiantoubiaoView;

@Service("zaixiantoubiaoService")
public class ZaixiantoubiaoServiceImpl extends ServiceImpl<ZaixiantoubiaoDao, ZaixiantoubiaoEntity> implements ZaixiantoubiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZaixiantoubiaoEntity> page = this.selectPage(
                new Query<ZaixiantoubiaoEntity>(params).getPage(),
                new EntityWrapper<ZaixiantoubiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZaixiantoubiaoEntity> wrapper) {
		  Page<ZaixiantoubiaoView> page =new Query<ZaixiantoubiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZaixiantoubiaoVO> selectListVO(Wrapper<ZaixiantoubiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZaixiantoubiaoVO selectVO(Wrapper<ZaixiantoubiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZaixiantoubiaoView> selectListView(Wrapper<ZaixiantoubiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZaixiantoubiaoView selectView(Wrapper<ZaixiantoubiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ZaixiantoubiaoEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ZaixiantoubiaoEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ZaixiantoubiaoEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
