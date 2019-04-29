package io.mine.ft.train.biz.async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import io.mine.ft.train.biz.ShopBiz;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class AsyncShopBiz {
	
	@Autowired
	private ShopBiz shopBiz;
	
	@Async
	public void getShopBase (Long id) {
	
	}

}
