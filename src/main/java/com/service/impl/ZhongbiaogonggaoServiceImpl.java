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


import com.dao.ZhongbiaogonggaoDao;
import com.entity.ZhongbiaogonggaoEntity;
import com.service.ZhongbiaogonggaoService;
import com.entity.vo.ZhongbiaogonggaoVO;
import com.entity.view.ZhongbiaogonggaoView;

@Service("zhongbiaogonggaoService")
public class ZhongbiaogonggaoServiceImpl extends ServiceImpl<ZhongbiaogonggaoDao, ZhongbiaogonggaoEntity> implements ZhongbiaogonggaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhongbiaogonggaoEntity> page = this.selectPage(
                new Query<ZhongbiaogonggaoEntity>(params).getPage(),
                new EntityWrapper<ZhongbiaogonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhongbiaogonggaoEntity> wrapper) {
		  Page<ZhongbiaogonggaoView> page =new Query<ZhongbiaogonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhongbiaogonggaoVO> selectListVO(Wrapper<ZhongbiaogonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhongbiaogonggaoVO selectVO(Wrapper<ZhongbiaogonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhongbiaogonggaoView> selectListView(Wrapper<ZhongbiaogonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhongbiaogonggaoView selectView(Wrapper<ZhongbiaogonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
