package com.atguigu.gulimall.product.service;

import com.atguigu.gulimall.product.entity.SpuInfoDescEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * spu–≈œ¢ΩÈ…‹
 *
 * @author dylan
 * @email lichien001@163.com
 * @date 2020-04-02 21:05:54
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

