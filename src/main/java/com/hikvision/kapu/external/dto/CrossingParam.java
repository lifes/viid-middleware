package com.hikvision.kapu.external.dto;

import java.util.List;

/**
 * @author shanguoming 2016年1月11日 下午4:41:32
 * @version V1.0
 * @modify: {原因} by shanguoming 2016年1月11日 下午4:41:32
 */
public class CrossingParam {
	
	private CrossingDTO crossingInfo;
	private List<LaneInfoDTO> lanes;
	
	public CrossingDTO getCrossingInfo() {
		return crossingInfo;
	}
	
	public void setCrossingInfo(CrossingDTO crossingInfo) {
		this.crossingInfo = crossingInfo;
	}

	public List<LaneInfoDTO> getLanes() {
		return lanes;
	}

	public void setLanes(List<LaneInfoDTO> lanes) {
		this.lanes = lanes;
	}
	
}
