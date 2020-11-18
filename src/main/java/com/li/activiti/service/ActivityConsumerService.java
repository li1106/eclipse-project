package com.li.activiti.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("activityService")
@RestController
public interface ActivityConsumerService {
    /**
     * 流程demo
     * @return
     */
    @RequestMapping(value="/startActivityDemo",method= RequestMethod.GET)
    public boolean startActivityDemo();
}
