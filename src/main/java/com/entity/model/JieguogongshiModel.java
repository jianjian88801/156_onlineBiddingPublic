package com.entity.model;

import com.entity.JieguogongshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 结果公示
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-13 10:40:26
 */
public class JieguogongshiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 项目名称
	 */
	
	private String xiangmumingcheng;
		
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
	 * 公示期
	 */
	
	private String gongshiqi;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 中标候选人
	 */
	
	private String zhongbiaohouxuanren;
				
	
	/**
	 * 设置：项目名称
	 */
	 
	public void setXiangmumingcheng(String xiangmumingcheng) {
		this.xiangmumingcheng = xiangmumingcheng;
	}
	
	/**
	 * 获取：项目名称
	 */
	public String getXiangmumingcheng() {
		return xiangmumingcheng;
	}
				
	
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
	 * 设置：公示期
	 */
	 
	public void setGongshiqi(String gongshiqi) {
		this.gongshiqi = gongshiqi;
	}
	
	/**
	 * 获取：公示期
	 */
	public String getGongshiqi() {
		return gongshiqi;
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
	 * 设置：中标候选人
	 */
	 
	public void setZhongbiaohouxuanren(String zhongbiaohouxuanren) {
		this.zhongbiaohouxuanren = zhongbiaohouxuanren;
	}
	
	/**
	 * 获取：中标候选人
	 */
	public String getZhongbiaohouxuanren() {
		return zhongbiaohouxuanren;
	}
			
}
