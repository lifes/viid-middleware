package com.hikvision.kapu.external.dto;

import java.util.Calendar;

public class LaneInfoDTO {
	
	/** 车道ID */
	private Long id;
	/** 车道编号 */
	private String indexCode;
	/** 车道名称 */
	private String name;
	/** 车道序号 */
	private Integer laneNumber;
	/** 卡口ID */
	private Long crossingId;
	/** 车道类型：0 机动车道， 1 非机动车道 */
	private Integer laneType;
	/** 触发类型：0线圈触发，1视频触发 */
	private Integer triggerType;
	/** 方向序号 */
	private Integer directionNo;
	/** 方向 */
	private String directionName;
	/** 执法限速 */
	private Integer speedLimit;
	/** 是否启用关联视频：0 不启用关联，1 启用关联 */
	private Integer enableRelate;
	/** 关联视频通道编号 */
	private String relatedCameraIndexCode;
	/** 级联ID */
	private Integer cascadeId;
	/** 抓拍机Id */
	private Long crossingCameraId;
	private Integer jcLaneNo;
	private Integer jcDirType;
	/** 卡口更新时间 */
	private Calendar updateTime;
	/** 出入城方向,1表示出城,2表示入城 */
	private Integer interCityDirection;
	
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
	
	public Integer getLaneNumber() {
		return laneNumber;
	}
	
	public void setLaneNumber(Integer laneNumber) {
		this.laneNumber = laneNumber;
	}
	
	public Long getCrossingId() {
		return crossingId;
	}
	
	public void setCrossingId(Long crossingId) {
		this.crossingId = crossingId;
	}
	
	public Integer getLaneType() {
		return laneType;
	}
	
	public void setLaneType(Integer laneType) {
		this.laneType = laneType;
	}
	
	public Integer getTriggerType() {
		return triggerType;
	}
	
	public void setTriggerType(Integer triggerType) {
		this.triggerType = triggerType;
	}
	
	public Integer getDirectionNo() {
		return directionNo;
	}
	
	public void setDirectionNo(Integer directionNo) {
		this.directionNo = directionNo;
	}
	
	public String getDirectionName() {
		return directionName;
	}
	
	public void setDirectionName(String directionName) {
		this.directionName = directionName;
	}
	
	public Integer getSpeedLimit() {
		return speedLimit;
	}
	
	public void setSpeedLimit(Integer speedLimit) {
		this.speedLimit = speedLimit;
	}
	
	public Integer getEnableRelate() {
		return enableRelate;
	}
	
	public void setEnableRelate(Integer enableRelate) {
		this.enableRelate = enableRelate;
	}
	
	public String getRelatedCameraIndexCode() {
		return relatedCameraIndexCode;
	}
	
	public void setRelatedCameraIndexCode(String relatedCameraIndexCode) {
		this.relatedCameraIndexCode = relatedCameraIndexCode;
	}
	
	public Integer getCascadeId() {
		return cascadeId;
	}
	
	public void setCascadeId(Integer cascadeId) {
		this.cascadeId = cascadeId;
	}
	
	public Long getCrossingCameraId() {
		return crossingCameraId;
	}
	
	public void setCrossingCameraId(Long crossingCameraId) {
		this.crossingCameraId = crossingCameraId;
	}
	
	public Integer getJcLaneNo() {
		return jcLaneNo;
	}
	
	public void setJcLaneNo(Integer jcLaneNo) {
		this.jcLaneNo = jcLaneNo;
	}
	
	public Integer getJcDirType() {
		return jcDirType;
	}
	
	public void setJcDirType(Integer jcDirType) {
		this.jcDirType = jcDirType;
	}
	
	public Calendar getUpdateTime() {
		return updateTime;
	}
	
	public void setUpdateTime(Calendar updateTime) {
		this.updateTime = updateTime;
	}
	
	public Integer getInterCityDirection() {
		return interCityDirection;
	}
	
	public void setInterCityDirection(Integer interCityDirection) {
		this.interCityDirection = interCityDirection;
	}
}
