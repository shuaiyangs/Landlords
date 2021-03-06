package site.pushy.landlords.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.pushy.landlords.common.util.RespEntity;
import site.pushy.landlords.service.AchievementService;

/**
 * @author Pushy
 * @since 2019/2/10 19:32
 */
@RestController
@RequestMapping("/achievement")
public class AchievementController {

    @Autowired
    private AchievementService achievementService;

    @GetMapping("/{userId}")
    public String getAchievementByUserId(@PathVariable String userId) {
        return RespEntity.success(achievementService.getAchievementByUserId(userId));
    }

}
