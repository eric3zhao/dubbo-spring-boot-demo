
package com.azi.demo.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.azi.demo.service.api.DemoService;
import com.azi.demo.service.dto.TestVO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author azizwz@aliyun.com
 *         Function:
 */
@RestController("demo/")
public class DemoController {

    @Reference
    private DemoService demoService;

    @RequestMapping(value = "test", method = RequestMethod.POST)
    public String addTest(@RequestParam String name) {
        demoService.insertModel(name);
        return "Add a new Test";
    }

    @RequestMapping(value = "test/{id}", method = RequestMethod.GET)
    public TestVO getTest(@PathVariable String id) {
        return demoService.getTestById(id);
    }

    @RequestMapping(value = "test/name/{name}", method = RequestMethod.GET)
    public List<TestVO> getTests(@PathVariable String name) {
        return demoService.getTestByName(name);
    }
}
