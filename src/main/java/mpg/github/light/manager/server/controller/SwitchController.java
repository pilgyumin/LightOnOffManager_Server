package mpg.github.light.manager.server.controller;

import mpg.github.light.manager.server.common.SwitchRequest;
import mpg.github.light.manager.server.common.SwitchResponse;
import mpg.github.light.manager.server.service.SwitchService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class SwitchController {


    @Resource
    private SwitchService switchService;

    @RequestMapping(value = "manage/switch", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public SwitchResponse manageSwitch(@ModelAttribute SwitchRequest switchRequest){
        return switchService.manageSwitch(switchRequest);
    }
}
