package com.nageoffer.shortlink.project.dto.req;

import lombok.Data;

@Data
public class ShortLinkStatsAccessRecordReqDTO {

    /**
     * 完整短链接
     */
    private String fullShortUrl;

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 开始日期
     */
    private String startDate;

    /**
     * 结束日期
     */
    private String endDate;

    /**
     * 启用标识 0：启用 1：未启用
     */
    private Integer enableStatus;

    // 新增的分页相关属性
    private long current;
    private long size;

    // 获取当前页码的方法
    public long getCurrent() {
        return current;
    }

    // 获取每页记录数量的方法
    public long getSize() {
        return size;
    }
}
