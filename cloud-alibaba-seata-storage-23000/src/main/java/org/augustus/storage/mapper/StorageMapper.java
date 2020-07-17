package org.augustus.storage.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author EiletXie
 * @Since 2020/3/18 22:52
 */
@Mapper
public interface StorageMapper {

    void decrease(@Param("productId") Long productId,@Param("count") Integer count);
}
