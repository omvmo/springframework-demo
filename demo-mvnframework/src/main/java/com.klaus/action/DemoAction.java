package com.klaus.action;

import com.klaus.mvcframework.annotation.Autowried;
import com.klaus.mvcframework.annotation.Controller;
import com.klaus.mvcframework.annotation.RequestMapping;
import com.klaus.mvcframework.annotation.RequestParam;
import com.klaus.service.IDemoService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/web")
public class DemoAction {

    @Autowried
    IDemoService demoService;

    @RequestMapping("query.json")
    public void query(HttpServletRequest request, HttpServletResponse response, @RequestParam("name") String name) {

        String result = demoService.get(name);

    }

}
