package com.hikvision.viid.middleware.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hikvision.viid.middleware.domain.CrossingInfo;

public interface CrossingInfoRepository extends JpaRepository<CrossingInfo, Long> {
	
}
