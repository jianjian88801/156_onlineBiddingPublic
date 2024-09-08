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


import com.dao.ZerendanweiDao;
import com.entity.ZerendanweiEntity;
import com.service.ZerendanweiService;
import com.entity.vo.ZerendanweiVO;
import com.entity.view.ZerendanweiView;

@Service("zerendanweiService")
public class ZerendanweiServiceImpl extends ServiceImpl<ZerendanweiDao, ZerendanweiEntity> implements ZerendanweiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZerendanweiEntity> page = this.selectPage(
                new Query<ZerendanweiEntity>(params).getPage(),
                new EntityWrapper<ZerendanweiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZerendanweiEntity> wrapper) {
		  Page<ZerendanweiView> page =new Query<ZerendanweiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZerendanweiVO> selectListVO(Wrapper<ZerendanweiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZerendanweiVO selectVO(Wrapper<ZerendanweiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZerendanweiView> selectListView(Wrapper<ZerendanweiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZerendanweiView selectView(Wrapper<ZerendanweiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
