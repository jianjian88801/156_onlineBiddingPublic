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


import com.dao.ShichangjianduDao;
import com.entity.ShichangjianduEntity;
import com.service.ShichangjianduService;
import com.entity.vo.ShichangjianduVO;
import com.entity.view.ShichangjianduView;

@Service("shichangjianduService")
public class ShichangjianduServiceImpl extends ServiceImpl<ShichangjianduDao, ShichangjianduEntity> implements ShichangjianduService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShichangjianduEntity> page = this.selectPage(
                new Query<ShichangjianduEntity>(params).getPage(),
                new EntityWrapper<ShichangjianduEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShichangjianduEntity> wrapper) {
		  Page<ShichangjianduView> page =new Query<ShichangjianduView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShichangjianduVO> selectListVO(Wrapper<ShichangjianduEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShichangjianduVO selectVO(Wrapper<ShichangjianduEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShichangjianduView> selectListView(Wrapper<ShichangjianduEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShichangjianduView selectView(Wrapper<ShichangjianduEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
