package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 供应商
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-13 10:40:26
 */
@TableName("gongyingshang")
public class GongyingshangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GongyingshangEntity() {
		
	}
	
	public GongyingshangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 供应商名称
	 */
					
	private String gongyingshangmingcheng;
	
	/**
	 * 识别码
	 */
					
	private String shibiema;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 供应商封面
	 */
					
	private String gongyingshangfengmian;
	
	/**
	 * 供应商性质
	 */
					
	private String gongyingshangxingzhi;
	
	/**
	 * 供应商电话
	 */
					
	private String gongyingshangdianhua;
	
	/**
	 * 负责人
	 */
					
	private String fuzeren;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 供应商地址
	 */
					
	private String gongyingshangdizhi;
	
	/**
	 * 资质证明
	 */
					
	private String zizhizhengming;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	 * 设置：识别码
	 */
	public void setShibiema(String shibiema) {
		this.shibiema = shibiema;
	}
	/**
	 * 获取：识别码
	 */
	public String getShibiema() {
		return shibiema;
	}
	/**
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
	/**
	 * 设置：供应商封面
	 */
	public void setGongyingshangfengmian(String gongyingshangfengmian) {
		this.gongyingshangfengmian = gongyingshangfengmian;
	}
	/**
	 * 获取：供应商封面
	 */
	public String getGongyingshangfengmian() {
		return gongyingshangfengmian;
	}
	/**
	 * 设置：供应商性质
	 */
	public void setGongyingshangxingzhi(String gongyingshangxingzhi) {
		this.gongyingshangxingzhi = gongyingshangxingzhi;
	}
	/**
	 * 获取：供应商性质
	 */
	public String getGongyingshangxingzhi() {
		return gongyingshangxingzhi;
	}
	/**
	 * 设置：供应商电话
	 */
	public void setGongyingshangdianhua(String gongyingshangdianhua) {
		this.gongyingshangdianhua = gongyingshangdianhua;
	}
	/**
	 * 获取：供应商电话
	 */
	public String getGongyingshangdianhua() {
		return gongyingshangdianhua;
	}
	/**
	 * 设置：负责人
	 */
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：供应商地址
	 */
	public void setGongyingshangdizhi(String gongyingshangdizhi) {
		this.gongyingshangdizhi = gongyingshangdizhi;
	}
	/**
	 * 获取：供应商地址
	 */
	public String getGongyingshangdizhi() {
		return gongyingshangdizhi;
	}
	/**
	 * 设置：资质证明
	 */
	public void setZizhizhengming(String zizhizhengming) {
		this.zizhizhengming = zizhizhengming;
	}
	/**
	 * 获取：资质证明
	 */
	public String getZizhizhengming() {
		return zizhizhengming;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
