package com.hikvision.kapu.external.dto;

import java.util.Calendar;

public class CrossingDTO {
	
	/** 卡口ID */
	private Long id;
	/** 卡口编号 */
	private String indexCode;
	/** 卡口名称 */
	private String name;
	/** 组织编号 */
	private String controlUnitIndexCode;
	/** 车道数 */
	private Integer laneNum;
	/** 经度 */
	private String longitude;
	/** 纬度 */
	private String latitude;
	/** 海拔 */
	private String altitude;
	/** 卡口示意图 */
	private String photo;
	/** 是否启用关联视频：0 不启用关联，1 启用关联 */
	private Integer enableRelate;
	/** 关联监控点indexcode */
	private String relatedCameraCode;
	/** 关联监控点名称 */
	private String relatedCameraName;
	/** 内部编号 */
	private Integer internalCode;
	/** 卡口厂商类型 */
	private Integer crossingType;
	/** 前端类型 */
	private Integer frontType;
	/** 卡口模式 前置 1 后置 2 */
	private Integer crossingMode;
	/** 卡口类型 1普通卡口 2 城际卡口 */
	private Integer intercity;
	/** 级联ID */
	private Integer cascadeId;
	/** 卡警服务器 */
	private Long crossingServerId;
	private String jccrossingIndexCode;
	/** 是否经过云分析 0不经过 1经过 */
	private Integer cloudAnalysis;
	/** 卡口更新时间 */
	private Calendar updateTime;
	/**
	 * 使用类型
	 * 80。治安卡口；81.交通卡口；82.其他卡口
	 */
	private Integer usageType;
	/**
	 * 国标编码（28181）
	 */
	private String gatCode;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getIndexCode() {
		return indexCode;
	}
	
	public void setIndexCode(String indexCode) {
		this.indexCode = indexCode;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getControlUnitIndexCode() {
		return controlUnitIndexCode;
	}
	
	public void setControlUnitIndexCode(String controlUnitIndexCode) {
		this.controlUnitIndexCode = controlUnitIndexCode;
	}
	
	public Integer getLaneNum() {
		return laneNum;
	}
	
	public void setLaneNum(Integer laneNum) {
		this.laneNum = laneNum;
	}
	
	public String getLongitude() {
		return longitude;
	}
	
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	public String getLatitude() {
		return latitude;
	}
	
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
	public String getAltitude() {
		return altitude;
	}
	
	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}
	
	public String getPhoto() {
		return photo;
	}
	
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	public Integer getEnableRelate() {
		return enableRelate;
	}
	
	public void setEnableRelate(Integer enableRelate) {
		this.enableRelate = enableRelate;
	}
	
	public Integer getInternalCode() {
		return internalCode;
	}
	
	public void setInternalCode(Integer internalCode) {
		this.internalCode = internalCode;
	}
	
	public Integer getCrossingType() {
		return crossingType;
	}
	
	public void setCrossingType(Integer crossingType) {
		this.crossingType = crossingType;
	}
	
	public Integer getFrontType() {
		return frontType;
	}
	
	public void setFrontType(Integer frontType) {
		this.frontType = frontType;
	}
	
	public Integer getCrossingMode() {
		return crossingMode;
	}
	
	public void setCrossingMode(Integer crossingMode) {
		this.crossingMode = crossingMode;
	}
	
	public Integer getIntercity() {
		return intercity;
	}
	
	public void setIntercity(Integer intercity) {
		this.intercity = intercity;
	}
	
	public Integer getCascadeId() {
		return cascadeId;
	}
	
	public void setCascadeId(Integer cascadeId) {
		this.cascadeId = cascadeId;
	}
	
	public Long getCrossingServerId() {
		return crossingServerId;
	}
	
	public void setCrossingServerId(Long crossingServerId) {
		this.crossingServerId = crossingServerId;
	}
	
	public String getJccrossingIndexCode() {
		return jccrossingIndexCode;
	}
	
	public void setJccrossingIndexCode(String jccrossingIndexCode) {
		this.jccrossingIndexCode = jccrossingIndexCode;
	}
	
	public Integer getCloudAnalysis() {
		return cloudAnalysis;
	}
	
	public void setCloudAnalysis(Integer cloudAnalysis) {
		this.cloudAnalysis = cloudAnalysis;
	}
	
	public Calendar getUpdateTime() {
		return updateTime;
	}
	
	public void setUpdateTime(Calendar updateTime) {
		this.updateTime = updateTime;
	}
	
	public Integer getUsageType() {
		return usageType;
	}
	
	public void setUsageType(Integer usageType) {
		this.usageType = usageType;
	}

	public String getGatCode() {
		return gatCode;
	}

	public void setGatCode(String gatCode) {
		this.gatCode = gatCode;
	}

	public String getRelatedCameraCode() {
		return relatedCameraCode;
	}

	public void setRelatedCameraCode(String relatedCameraCode) {
		this.relatedCameraCode = relatedCameraCode;
	}

	public String getRelatedCameraName() {
		return relatedCameraName;
	}

	public void setRelatedCameraName(String relatedCameraName) {
		this.relatedCameraName = relatedCameraName;
	}
	
}
