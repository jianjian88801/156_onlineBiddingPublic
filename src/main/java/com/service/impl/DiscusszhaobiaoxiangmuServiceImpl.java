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


import com.dao.DiscusszhaobiaoxiangmuDao;
import com.entity.DiscusszhaobiaoxiangmuEntity;
import com.service.DiscusszhaobiaoxiangmuService;
import com.entity.vo.DiscusszhaobiaoxiangmuVO;
import com.entity.view.DiscusszhaobiaoxiangmuView;

@Service("discusszhaobiaoxiangmuService")
public class DiscusszhaobiaoxiangmuServiceImpl extends ServiceImpl<DiscusszhaobiaoxiangmuDao, DiscusszhaobiaoxiangmuEntity> implements DiscusszhaobiaoxiangmuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszhaobiaoxiangmuEntity> page = this.selectPage(
                new Query<DiscusszhaobiaoxiangmuEntity>(params).getPage(),
                new EntityWrapper<DiscusszhaobiaoxiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszhaobiaoxiangmuEntity> wrapper) {
		  Page<DiscusszhaobiaoxiangmuView> page =new Query<DiscusszhaobiaoxiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszhaobiaoxiangmuVO> selectListVO(Wrapper<DiscusszhaobiaoxiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszhaobiaoxiangmuVO selectVO(Wrapper<DiscusszhaobiaoxiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszhaobiaoxiangmuView> selectListView(Wrapper<DiscusszhaobiaoxiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszhaobiaoxiangmuView selectView(Wrapper<DiscusszhaobiaoxiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
