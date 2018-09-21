package com.xxx.service;

import com.xxx.dao.CommentMapper;
import com.xxx.entity.Comment;
import com.xxx.entity.CommentExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2018/9/18 16:10
 * @Description:
 */
@Service
public class CommentService {

    @Autowired
    private CommentMapper commentMapper;


    public List<Comment> getCommentsByUserId(long userId) {
        CommentExample commentExample = new CommentExample();
        commentExample.createCriteria().andUserIdEqualTo(userId);
        List<Comment> comments = commentMapper.selectByExample(commentExample);
        return comments;
    }

    public List<Comment> getCommentsByTargetId(long targetId) {
        CommentExample commentExample = new CommentExample();
        commentExample.createCriteria().andTargetIdEqualTo(targetId);
        List<Comment> comments = commentMapper.selectByExample(commentExample);
        return comments;
    }

    @Transactional
    public boolean createComment(long targetId, Long parent_id, Long user_id, Long reply_user_id, String content) {
        Comment comment = new Comment();
        comment.setTargetId(targetId);
        if (parent_id != null)
            comment.setParentId(parent_id);
        if (reply_user_id != null)
            comment.setReplyUserId(reply_user_id);
        comment.setUpCount(user_id);
        comment.setContent(content);
        commentMapper.insertSelective(comment);
        return true;
    }

    @Transactional
    public boolean deleteComment(long targetId,long id,long user_id) {
        Comment comment = new Comment();
        comment.setDeleteStatus(1);
        CommentExample commentExample = new CommentExample();
        commentExample.createCriteria().andUserIdEqualTo(user_id).andIdEqualTo(id).andTargetIdEqualTo(targetId);
        commentMapper.updateByExampleSelective(comment,commentExample);
        return true;
    }

    @Transactional
    public boolean upComment(long targetId,long id,long user_id) {
        return true;
    }

    @Transactional
    public boolean downComment(long targetId,long id,long user_id) {
        return true;
    }


}
