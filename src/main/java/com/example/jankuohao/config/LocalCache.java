package com.example.jankuohao.config;

import cn.hutool.cache.CacheUtil;
import cn.hutool.cache.impl.TimedCache;
import cn.hutool.core.date.DateUnit;

/**
 * 描述：定时缓存，对被缓存的对象定义一个过期时间，当对象超过过期时间会被清理。此缓存没有容量限制，对象只有在过期后才会被移除。
 *
 * @author  langshen
 * @date 2023-03-28
 */
public class LocalCache {
    /**
     * 缓存时长
     */
    public static final long TIMEOUT = 5 * DateUnit.MINUTE.getMillis();
    /**
     * 清理间隔
     */
    private static final long CLEAN_TIMEOUT = 5 * DateUnit.MINUTE.getMillis();
    /**
     * 缓存对象
     */
    public static final TimedCache<String, Object> CACHE = CacheUtil.newTimedCache(TIMEOUT);

    static {
        //启动定时任务
        CACHE.schedulePrune(CLEAN_TIMEOUT);
    }
}
