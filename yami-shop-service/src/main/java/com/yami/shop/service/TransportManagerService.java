

package com.yami.shop.service;

import com.yami.shop.bean.app.dto.ProductItemDto;
import com.yami.shop.bean.model.UserAddr;

public interface TransportManagerService {

	Double calculateTransfee(ProductItemDto productItem, UserAddr userAddr);
}
