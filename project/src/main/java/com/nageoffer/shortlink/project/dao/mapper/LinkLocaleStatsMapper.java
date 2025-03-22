package com.nageoffer.shortlink.project.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nageoffer.shortlink.project.dao.entity.LinkLocaleStatsDO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;


/**
 * 地区访问实体持久层
 */
public interface LinkLocaleStatsMapper extends BaseMapper<LinkLocaleStatsDO> {

    /**
     * 记录基地区访问监控数据
     */
    @Insert("INSERT INTO t_link_locale_stats (full_short_url, gid, date, cnt, country, province, city, adcode, create_time, update_time, del_flag )" +
            "VALUES(#{LinkLocaleStats.fullShortUrl}, #{LinkLocaleStats.gid}, #{LinkLocaleStats.date}, #{LinkLocaleStats.cnt}, #{LinkLocaleStats.country},  #{LinkLocaleStats.province},  #{LinkLocaleStats.city},  #{LinkLocaleStats.adcode}, NOW(), NOW(), 0 )" +
            "ON DUPLICATE KEY UPDATE cnt = cnt +  #{LinkLocaleStats.cnt};" )
    void linkLocaleStats(@Param("LinkLocaleStats")LinkLocaleStatsDO linkLocaleStatsDO);
}
