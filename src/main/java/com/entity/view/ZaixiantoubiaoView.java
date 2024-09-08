package com.entity.view;

import com.entity.ZaixiantoubiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 在线投标
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-13 10:40:26
 */
@TableName("zaixiantoubiao")
public class ZaixiantoubiaoView  extends ZaixiantoubiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZaixiantoubiaoView(){
	}
 
 	public ZaixiantoubiaoView(ZaixiantoubiaoEntity zaixiantoubiaoEntity){
 	try {
			BeanUtils.copyProperties(this, zaixiantoubiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
