package com.xxx.controller.pic;

import com.xxx.base.RequestURI;
import com.xxx.base.ResponseResult;
import com.xxx.controller.BaseController;
import com.xxx.entity.Comment;
import com.xxx.service.CommentService;
import com.xxx.service.PicService;
import com.xxx.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class CommentController extends BaseController {

    @Autowired
    private UserService userService;
    @Autowired
    private RedisTemplate<String, String> redisTemplate;
    @Autowired
    private CommentService commentService;

    @Value("${appId}")
    private String appId;

    @Value("${appSecret}")
    private String appSecret;


    @RequestMapping(RequestURI.USER_BASE + "/saveComment")
    public ResponseResult saveComment(@RequestParam long targetId,@RequestParam  Long parent_id,@RequestParam  Long user_id, @RequestParam Long reply_user_id, @RequestParam String content) {
        commentService.createComment(targetId,parent_id,user_id,reply_user_id,content);
        return ResponseResult.OK;
    }

    @RequestMapping(RequestURI.USER_BASE + "/getComments")
    public ResponseResult getComments(@RequestParam long targetId) {
        List<Comment> commentsByTargetId = commentService.getCommentsByTargetId(targetId);
        return ResponseResult.data("OK",commentsByTargetId);
    }


}
