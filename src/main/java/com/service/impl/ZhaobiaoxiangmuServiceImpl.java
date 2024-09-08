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


import com.dao.ZhaobiaoxiangmuDao;
import com.entity.ZhaobiaoxiangmuEntity;
import com.service.ZhaobiaoxiangmuService;
import com.entity.vo.ZhaobiaoxiangmuVO;
import com.entity.view.ZhaobiaoxiangmuView;

@Service("zhaobiaoxiangmuService")
public class ZhaobiaoxiangmuServiceImpl extends ServiceImpl<ZhaobiaoxiangmuDao, ZhaobiaoxiangmuEntity> implements ZhaobiaoxiangmuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhaobiaoxiangmuEntity> page = this.selectPage(
                new Query<ZhaobiaoxiangmuEntity>(params).getPage(),
                new EntityWrapper<ZhaobiaoxiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhaobiaoxiangmuEntity> wrapper) {
		  Page<ZhaobiaoxiangmuView> page =new Query<ZhaobiaoxiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhaobiaoxiangmuVO> selectListVO(Wrapper<ZhaobiaoxiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhaobiaoxiangmuVO selectVO(Wrapper<ZhaobiaoxiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhaobiaoxiangmuView> selectListView(Wrapper<ZhaobiaoxiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhaobiaoxiangmuView selectView(Wrapper<ZhaobiaoxiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
