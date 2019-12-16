package com.whpu.MyRule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

/**
 * 注意自定义的负载均衡策略不能放到springboot的@component扫描路径之下（主启动类所在的包以及所有的子包）
 * @author xxh
 *
 */

@Configuration
public class MySelfRule{

	@Bean
	public IRule myRule() {
		
		return new RandomRule_ZY();
	}

}
