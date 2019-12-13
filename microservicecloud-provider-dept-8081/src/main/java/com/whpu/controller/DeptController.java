package com.whpu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.whpu.entiy.Dept;
import com.whpu.service.DeptServiceImpl;

@RestController
public class DeptController {
	@Autowired
	private DeptServiceImpl service;
	
	
	
	 @RequestMapping(value="/dept/add",method=RequestMethod.POST)
	  public boolean add(@RequestBody Dept dept)
	  {
		 return service.add(dept);
	  }
	  
	  @RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
	  public Dept get(@PathVariable("id") Long id)
	  {
		  return service.get(id);
	  }
	  
	  @RequestMapping(value="/dept/list",method=RequestMethod.GET)
	  public List<Dept> list()
	  {
		  return service.list();
	  }
	  
	  //服务发现
	  @Autowired
		private DiscoveryClient client;
	  
	  @RequestMapping("/dept/discovery")
	  public Object discovery() {
		  List<String> list = client.getServices();
		  System.out.println("******"+list);
		  List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-DEPT");
		  for(ServiceInstance ele:srvList) {
			  System.out.println(ele.getServiceId()+"\t"+ele.getHost()+"\t"+ele.getUri());
		  }
		  		  	  
		return client;	  
	  }
	  


}
