package io.mine.ft.train.biz.async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import io.mine.ft.train.biz.ShopBiz;
import lombok.extern.slf4j.Slf4j;

@Component("shopRunnable")
@Scope(value = "prototype")
@Slf4j
public class ShopRunnable implements Runnable {
	
	@Autowired
	private ShopBiz shopBiz;
	
	private Long shopId;
	
	private ShopRunnable(Long shopId) {
		this.shopId = shopId;
	}

	@Override
	public void run() {
	
	}
}
