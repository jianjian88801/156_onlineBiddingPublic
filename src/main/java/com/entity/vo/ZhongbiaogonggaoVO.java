package com.entity.vo;

import com.entity.ZhongbiaogonggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 中标公告
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-13 10:40:26
 */
public class ZhongbiaogonggaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 招标分类
	 */
	
	private String zhaobiaofenlei;
		
	/**
	 * 招标单位
	 */
	
	private String zhaobiaodanwei;
		
	/**
	 * 投标编号
	 */
	
	private String toubiaobianhao;
		
	/**
	 * 供应商名称
	 */
	
	private String gongyingshangmingcheng;
		
	/**
	 * 投标价格
	 */
	
	private Float toubiaojiage;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 投标详情
	 */
	
	private String toubiaoxiangqing;
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：招标分类
	 */
	 
	public void setZhaobiaofenlei(String zhaobiaofenlei) {
		this.zhaobiaofenlei = zhaobiaofenlei;
	}
	
	/**
	 * 获取：招标分类
	 */
	public String getZhaobiaofenlei() {
		return zhaobiaofenlei;
	}
				
	
	/**
	 * 设置：招标单位
	 */
	 
	public void setZhaobiaodanwei(String zhaobiaodanwei) {
		this.zhaobiaodanwei = zhaobiaodanwei;
	}
	
	/**
	 * 获取：招标单位
	 */
	public String getZhaobiaodanwei() {
		return zhaobiaodanwei;
	}
				
	
	/**
	 * 设置：投标编号
	 */
	 
	public void setToubiaobianhao(String toubiaobianhao) {
		this.toubiaobianhao = toubiaobianhao;
	}
	
	/**
	 * 获取：投标编号
	 */
	public String getToubiaobianhao() {
		return toubiaobianhao;
	}
				
	
	/**
	 * 设置：供应商名称
	 */
	 
	public void setGongyingshangmingcheng(String gongyingshangmingcheng) {
		this.gongyingshangmingcheng = gongyingshangmingcheng;
	}
	
	/**
	 * 获取：供应商名称
	 */
	public String getGongyingshangmingcheng() {
		return gongyingshangmingcheng;
	}
				
	
	/**
	 * 设置：投标价格
	 */
	 
	public void setToubiaojiage(Float toubiaojiage) {
		this.toubiaojiage = toubiaojiage;
	}
	
	/**
	 * 获取：投标价格
	 */
	public Float getToubiaojiage() {
		return toubiaojiage;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：投标详情
	 */
	 
	public void setToubiaoxiangqing(String toubiaoxiangqing) {
		this.toubiaoxiangqing = toubiaoxiangqing;
	}
	
	/**
	 * 获取：投标详情
	 */
	public String getToubiaoxiangqing() {
		return toubiaoxiangqing;
	}
			
}
