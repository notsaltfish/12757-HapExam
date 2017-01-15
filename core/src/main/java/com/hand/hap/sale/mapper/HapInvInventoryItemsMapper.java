package com.hand.hap.sale.mapper;

import com.hand.hap.mybatis.common.Mapper;
import com.hand.hap.sale.dto.HapInvInventoryItems;

public interface HapInvInventoryItemsMapper extends Mapper<HapInvInventoryItems>{

	Long selectIdByCode(String string);

	long selectMaxLineNumber(Long headerId);

}