package com.nageoffer.shortlink.project.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nageoffer.shortlink.project.dao.entity.LinkAccessStatsDO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * 短链接基础访问监控持久层
 */
public interface LinkAccessStatsMapper extends BaseMapper<LinkAccessStatsDO> {

    /**
     * 记录基础访问监控数据
     */
    @Insert("INSERT INTO t_link_access_stats (full_short_url, gid, date, pv, uv, uip, hour, weekday, create_time, update_time, del_flag )" +
            "VALUES(#{LinkAccessStats.fullShortUrl}, #{LinkAccessStats.gid}, #{LinkAccessStats.date}, #{LinkAccessStats.pv}, #{LinkAccessStats.uv}, #{LinkAccessStats.uip}, #{LinkAccessStats.hour}, #{LinkAccessStats.weekday}, NOW(), NOW(), 0 )ON DUPLICATE KEY UPDATE pv = pv +  #{LinkAccessStats.pv}," +
            "uv = uv +  #{LinkAccessStats.uv}," +
            "uip = uip +  #{LinkAccessStats.uip};")
    void shortLinkStats(@Param("LinkAccessStats")LinkAccessStatsDO linkAccessStatsDO);
}
