package com.pan.hystrix;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandKey;
import com.netflix.hystrix.HystrixCommandProperties;
import com.netflix.hystrix.HystrixThreadPoolKey;
import com.netflix.hystrix.HystrixThreadPoolProperties;

public class HelloHystrixCommand extends HystrixCommand<String> {

	public HelloHystrixCommand() {
		super(setter());
	}

	//隔离机制
	private static Setter setter() {
		
		//服务组名
		HystrixCommandGroupKey groupKey= HystrixCommandGroupKey.Factory.asKey("hello");
		// 服务标识
		HystrixCommandKey commandKey =HystrixCommandKey.Factory.asKey("hello");
		// 服务线程池名称
		HystrixThreadPoolKey hystrixThreadPoolKey=HystrixThreadPoolKey.Factory.asKey("hello-pool");
		//线程池配置
		HystrixThreadPoolProperties.Setter commandKeySetter = HystrixThreadPoolProperties
				.Setter()
				.withCoreSize(10) 	//核心线程数
				.withKeepAliveTimeMinutes(15)	//等待时长
				.withQueueSizeRejectionThreshold(100);	//最大队列数量
		
		// 命令属性配置hystrix 开启超时
		HystrixCommandProperties.Setter commandPropertiesSetter =HystrixCommandProperties.Setter()
				.withExecutionIsolationStrategy(HystrixCommandProperties.ExecutionIsolationStrategy.THREAD)
				;
		// 禁用超时
		//.withExecutionTimeoutEnabled(false)
		
		return HystrixCommand.Setter
				.withGroupKey(groupKey)
				.andCommandKey(commandKey)
				.andThreadPoolKey(hystrixThreadPoolKey)
				.andThreadPoolPropertiesDefaults(commandKeySetter)
				.andCommandPropertiesDefaults(commandPropertiesSetter);
	}
	
	@Override
	protected String run() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
