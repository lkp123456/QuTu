package com.xxx.service;

import com.xxx.dao.CommentMapper;
import com.xxx.dao.TagMapper;
import com.xxx.entity.Comment;
import com.xxx.entity.CommentExample;
import com.xxx.entity.Tag;
import com.xxx.entity.TagExample;
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
public class TagService {

    @Autowired
    private TagMapper tagMapper;


    public List<Tag> getTags() {
        TagExample tagExample = new TagExample();
        List<Tag> tags = tagMapper.selectByExample(tagExample);
        return tags;
    }


    @Transactional
    public boolean createTag(String name) {
        Tag tag = new Tag();
        tag.setTagName(name);
        tagMapper.insertSelective(tag);
        return true;
    }

    @Transactional
    public boolean deleteTag(long id) {
        tagMapper.deleteByPrimaryKey(id);
        return true;
    }



}
