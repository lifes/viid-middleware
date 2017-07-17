package com.hikvision.viid.middleware.repository;


import com.hikvision.viid.middleware.domain.LaneInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * Created by chenhuaming on 2017/7/14.
 */
public interface LaneInfoReository extends JpaRepository<LaneInfo, Long> {
    List<LaneInfo> findByCrossingId(Long id);
}
