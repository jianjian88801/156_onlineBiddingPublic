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


import com.dao.BangzhuzhongxinDao;
import com.entity.BangzhuzhongxinEntity;
import com.service.BangzhuzhongxinService;
import com.entity.vo.BangzhuzhongxinVO;
import com.entity.view.BangzhuzhongxinView;

@Service("bangzhuzhongxinService")
public class BangzhuzhongxinServiceImpl extends ServiceImpl<BangzhuzhongxinDao, BangzhuzhongxinEntity> implements BangzhuzhongxinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BangzhuzhongxinEntity> page = this.selectPage(
                new Query<BangzhuzhongxinEntity>(params).getPage(),
                new EntityWrapper<BangzhuzhongxinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BangzhuzhongxinEntity> wrapper) {
		  Page<BangzhuzhongxinView> page =new Query<BangzhuzhongxinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BangzhuzhongxinVO> selectListVO(Wrapper<BangzhuzhongxinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BangzhuzhongxinVO selectVO(Wrapper<BangzhuzhongxinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BangzhuzhongxinView> selectListView(Wrapper<BangzhuzhongxinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BangzhuzhongxinView selectView(Wrapper<BangzhuzhongxinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
