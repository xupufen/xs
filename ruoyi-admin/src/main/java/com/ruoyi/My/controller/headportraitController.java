package com.ruoyi.My.controller;

import com.ruoyi.My.service.IKnowledgeService;
import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.common.core.domain.AjaxResult;
import org.apache.ibatis.annotations.Param;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import static com.ruoyi.common.core.domain.AjaxResult.success;

@Anonymous
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/getavatar")
public class headportraitController {
    @Resource
    private IKnowledgeService headportraitService;
    @PostMapping
    public AjaxResult getavatar(@Param("username") String username){
            return success(headportraitService.ByUserName(username));
    }
}
