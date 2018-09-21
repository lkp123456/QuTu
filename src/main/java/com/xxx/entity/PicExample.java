package com.xxx.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PicExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPicDescIsNull() {
            addCriterion("pic_desc is null");
            return (Criteria) this;
        }

        public Criteria andPicDescIsNotNull() {
            addCriterion("pic_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPicDescEqualTo(String value) {
            addCriterion("pic_desc =", value, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescNotEqualTo(String value) {
            addCriterion("pic_desc <>", value, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescGreaterThan(String value) {
            addCriterion("pic_desc >", value, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescGreaterThanOrEqualTo(String value) {
            addCriterion("pic_desc >=", value, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescLessThan(String value) {
            addCriterion("pic_desc <", value, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescLessThanOrEqualTo(String value) {
            addCriterion("pic_desc <=", value, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescLike(String value) {
            addCriterion("pic_desc like", value, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescNotLike(String value) {
            addCriterion("pic_desc not like", value, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescIn(List<String> values) {
            addCriterion("pic_desc in", values, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescNotIn(List<String> values) {
            addCriterion("pic_desc not in", values, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescBetween(String value1, String value2) {
            addCriterion("pic_desc between", value1, value2, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescNotBetween(String value1, String value2) {
            addCriterion("pic_desc not between", value1, value2, "picDesc");
            return (Criteria) this;
        }

        public Criteria andOriginUrlIsNull() {
            addCriterion("origin_url is null");
            return (Criteria) this;
        }

        public Criteria andOriginUrlIsNotNull() {
            addCriterion("origin_url is not null");
            return (Criteria) this;
        }

        public Criteria andOriginUrlEqualTo(String value) {
            addCriterion("origin_url =", value, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlNotEqualTo(String value) {
            addCriterion("origin_url <>", value, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlGreaterThan(String value) {
            addCriterion("origin_url >", value, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlGreaterThanOrEqualTo(String value) {
            addCriterion("origin_url >=", value, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlLessThan(String value) {
            addCriterion("origin_url <", value, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlLessThanOrEqualTo(String value) {
            addCriterion("origin_url <=", value, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlLike(String value) {
            addCriterion("origin_url like", value, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlNotLike(String value) {
            addCriterion("origin_url not like", value, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlIn(List<String> values) {
            addCriterion("origin_url in", values, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlNotIn(List<String> values) {
            addCriterion("origin_url not in", values, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlBetween(String value1, String value2) {
            addCriterion("origin_url between", value1, value2, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlNotBetween(String value1, String value2) {
            addCriterion("origin_url not between", value1, value2, "originUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnailUrlIsNull() {
            addCriterion("thumbnail_url is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailUrlIsNotNull() {
            addCriterion("thumbnail_url is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailUrlEqualTo(String value) {
            addCriterion("thumbnail_url =", value, "thumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnailUrlNotEqualTo(String value) {
            addCriterion("thumbnail_url <>", value, "thumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnailUrlGreaterThan(String value) {
            addCriterion("thumbnail_url >", value, "thumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnailUrlGreaterThanOrEqualTo(String value) {
            addCriterion("thumbnail_url >=", value, "thumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnailUrlLessThan(String value) {
            addCriterion("thumbnail_url <", value, "thumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnailUrlLessThanOrEqualTo(String value) {
            addCriterion("thumbnail_url <=", value, "thumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnailUrlLike(String value) {
            addCriterion("thumbnail_url like", value, "thumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnailUrlNotLike(String value) {
            addCriterion("thumbnail_url not like", value, "thumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnailUrlIn(List<String> values) {
            addCriterion("thumbnail_url in", values, "thumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnailUrlNotIn(List<String> values) {
            addCriterion("thumbnail_url not in", values, "thumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnailUrlBetween(String value1, String value2) {
            addCriterion("thumbnail_url between", value1, value2, "thumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnailUrlNotBetween(String value1, String value2) {
            addCriterion("thumbnail_url not between", value1, value2, "thumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andWatermarkUrlIsNull() {
            addCriterion("watermark_url is null");
            return (Criteria) this;
        }

        public Criteria andWatermarkUrlIsNotNull() {
            addCriterion("watermark_url is not null");
            return (Criteria) this;
        }

        public Criteria andWatermarkUrlEqualTo(String value) {
            addCriterion("watermark_url =", value, "watermarkUrl");
            return (Criteria) this;
        }

        public Criteria andWatermarkUrlNotEqualTo(String value) {
            addCriterion("watermark_url <>", value, "watermarkUrl");
            return (Criteria) this;
        }

        public Criteria andWatermarkUrlGreaterThan(String value) {
            addCriterion("watermark_url >", value, "watermarkUrl");
            return (Criteria) this;
        }

        public Criteria andWatermarkUrlGreaterThanOrEqualTo(String value) {
            addCriterion("watermark_url >=", value, "watermarkUrl");
            return (Criteria) this;
        }

        public Criteria andWatermarkUrlLessThan(String value) {
            addCriterion("watermark_url <", value, "watermarkUrl");
            return (Criteria) this;
        }

        public Criteria andWatermarkUrlLessThanOrEqualTo(String value) {
            addCriterion("watermark_url <=", value, "watermarkUrl");
            return (Criteria) this;
        }

        public Criteria andWatermarkUrlLike(String value) {
            addCriterion("watermark_url like", value, "watermarkUrl");
            return (Criteria) this;
        }

        public Criteria andWatermarkUrlNotLike(String value) {
            addCriterion("watermark_url not like", value, "watermarkUrl");
            return (Criteria) this;
        }

        public Criteria andWatermarkUrlIn(List<String> values) {
            addCriterion("watermark_url in", values, "watermarkUrl");
            return (Criteria) this;
        }

        public Criteria andWatermarkUrlNotIn(List<String> values) {
            addCriterion("watermark_url not in", values, "watermarkUrl");
            return (Criteria) this;
        }

        public Criteria andWatermarkUrlBetween(String value1, String value2) {
            addCriterion("watermark_url between", value1, value2, "watermarkUrl");
            return (Criteria) this;
        }

        public Criteria andWatermarkUrlNotBetween(String value1, String value2) {
            addCriterion("watermark_url not between", value1, value2, "watermarkUrl");
            return (Criteria) this;
        }

        public Criteria andOriginMd5IsNull() {
            addCriterion("origin_md5 is null");
            return (Criteria) this;
        }

        public Criteria andOriginMd5IsNotNull() {
            addCriterion("origin_md5 is not null");
            return (Criteria) this;
        }

        public Criteria andOriginMd5EqualTo(String value) {
            addCriterion("origin_md5 =", value, "originMd5");
            return (Criteria) this;
        }

        public Criteria andOriginMd5NotEqualTo(String value) {
            addCriterion("origin_md5 <>", value, "originMd5");
            return (Criteria) this;
        }

        public Criteria andOriginMd5GreaterThan(String value) {
            addCriterion("origin_md5 >", value, "originMd5");
            return (Criteria) this;
        }

        public Criteria andOriginMd5GreaterThanOrEqualTo(String value) {
            addCriterion("origin_md5 >=", value, "originMd5");
            return (Criteria) this;
        }

        public Criteria andOriginMd5LessThan(String value) {
            addCriterion("origin_md5 <", value, "originMd5");
            return (Criteria) this;
        }

        public Criteria andOriginMd5LessThanOrEqualTo(String value) {
            addCriterion("origin_md5 <=", value, "originMd5");
            return (Criteria) this;
        }

        public Criteria andOriginMd5Like(String value) {
            addCriterion("origin_md5 like", value, "originMd5");
            return (Criteria) this;
        }

        public Criteria andOriginMd5NotLike(String value) {
            addCriterion("origin_md5 not like", value, "originMd5");
            return (Criteria) this;
        }

        public Criteria andOriginMd5In(List<String> values) {
            addCriterion("origin_md5 in", values, "originMd5");
            return (Criteria) this;
        }

        public Criteria andOriginMd5NotIn(List<String> values) {
            addCriterion("origin_md5 not in", values, "originMd5");
            return (Criteria) this;
        }

        public Criteria andOriginMd5Between(String value1, String value2) {
            addCriterion("origin_md5 between", value1, value2, "originMd5");
            return (Criteria) this;
        }

        public Criteria andOriginMd5NotBetween(String value1, String value2) {
            addCriterion("origin_md5 not between", value1, value2, "originMd5");
            return (Criteria) this;
        }

        public Criteria andThumbnailMd5IsNull() {
            addCriterion("thumbnail_md5 is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailMd5IsNotNull() {
            addCriterion("thumbnail_md5 is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailMd5EqualTo(String value) {
            addCriterion("thumbnail_md5 =", value, "thumbnailMd5");
            return (Criteria) this;
        }

        public Criteria andThumbnailMd5NotEqualTo(String value) {
            addCriterion("thumbnail_md5 <>", value, "thumbnailMd5");
            return (Criteria) this;
        }

        public Criteria andThumbnailMd5GreaterThan(String value) {
            addCriterion("thumbnail_md5 >", value, "thumbnailMd5");
            return (Criteria) this;
        }

        public Criteria andThumbnailMd5GreaterThanOrEqualTo(String value) {
            addCriterion("thumbnail_md5 >=", value, "thumbnailMd5");
            return (Criteria) this;
        }

        public Criteria andThumbnailMd5LessThan(String value) {
            addCriterion("thumbnail_md5 <", value, "thumbnailMd5");
            return (Criteria) this;
        }

        public Criteria andThumbnailMd5LessThanOrEqualTo(String value) {
            addCriterion("thumbnail_md5 <=", value, "thumbnailMd5");
            return (Criteria) this;
        }

        public Criteria andThumbnailMd5Like(String value) {
            addCriterion("thumbnail_md5 like", value, "thumbnailMd5");
            return (Criteria) this;
        }

        public Criteria andThumbnailMd5NotLike(String value) {
            addCriterion("thumbnail_md5 not like", value, "thumbnailMd5");
            return (Criteria) this;
        }

        public Criteria andThumbnailMd5In(List<String> values) {
            addCriterion("thumbnail_md5 in", values, "thumbnailMd5");
            return (Criteria) this;
        }

        public Criteria andThumbnailMd5NotIn(List<String> values) {
            addCriterion("thumbnail_md5 not in", values, "thumbnailMd5");
            return (Criteria) this;
        }

        public Criteria andThumbnailMd5Between(String value1, String value2) {
            addCriterion("thumbnail_md5 between", value1, value2, "thumbnailMd5");
            return (Criteria) this;
        }

        public Criteria andThumbnailMd5NotBetween(String value1, String value2) {
            addCriterion("thumbnail_md5 not between", value1, value2, "thumbnailMd5");
            return (Criteria) this;
        }

        public Criteria andWatermarkMd5IsNull() {
            addCriterion("watermark_md5 is null");
            return (Criteria) this;
        }

        public Criteria andWatermarkMd5IsNotNull() {
            addCriterion("watermark_md5 is not null");
            return (Criteria) this;
        }

        public Criteria andWatermarkMd5EqualTo(String value) {
            addCriterion("watermark_md5 =", value, "watermarkMd5");
            return (Criteria) this;
        }

        public Criteria andWatermarkMd5NotEqualTo(String value) {
            addCriterion("watermark_md5 <>", value, "watermarkMd5");
            return (Criteria) this;
        }

        public Criteria andWatermarkMd5GreaterThan(String value) {
            addCriterion("watermark_md5 >", value, "watermarkMd5");
            return (Criteria) this;
        }

        public Criteria andWatermarkMd5GreaterThanOrEqualTo(String value) {
            addCriterion("watermark_md5 >=", value, "watermarkMd5");
            return (Criteria) this;
        }

        public Criteria andWatermarkMd5LessThan(String value) {
            addCriterion("watermark_md5 <", value, "watermarkMd5");
            return (Criteria) this;
        }

        public Criteria andWatermarkMd5LessThanOrEqualTo(String value) {
            addCriterion("watermark_md5 <=", value, "watermarkMd5");
            return (Criteria) this;
        }

        public Criteria andWatermarkMd5Like(String value) {
            addCriterion("watermark_md5 like", value, "watermarkMd5");
            return (Criteria) this;
        }

        public Criteria andWatermarkMd5NotLike(String value) {
            addCriterion("watermark_md5 not like", value, "watermarkMd5");
            return (Criteria) this;
        }

        public Criteria andWatermarkMd5In(List<String> values) {
            addCriterion("watermark_md5 in", values, "watermarkMd5");
            return (Criteria) this;
        }

        public Criteria andWatermarkMd5NotIn(List<String> values) {
            addCriterion("watermark_md5 not in", values, "watermarkMd5");
            return (Criteria) this;
        }

        public Criteria andWatermarkMd5Between(String value1, String value2) {
            addCriterion("watermark_md5 between", value1, value2, "watermarkMd5");
            return (Criteria) this;
        }

        public Criteria andWatermarkMd5NotBetween(String value1, String value2) {
            addCriterion("watermark_md5 not between", value1, value2, "watermarkMd5");
            return (Criteria) this;
        }

        public Criteria andUpCountIsNull() {
            addCriterion("up_count is null");
            return (Criteria) this;
        }

        public Criteria andUpCountIsNotNull() {
            addCriterion("up_count is not null");
            return (Criteria) this;
        }

        public Criteria andUpCountEqualTo(Long value) {
            addCriterion("up_count =", value, "upCount");
            return (Criteria) this;
        }

        public Criteria andUpCountNotEqualTo(Long value) {
            addCriterion("up_count <>", value, "upCount");
            return (Criteria) this;
        }

        public Criteria andUpCountGreaterThan(Long value) {
            addCriterion("up_count >", value, "upCount");
            return (Criteria) this;
        }

        public Criteria andUpCountGreaterThanOrEqualTo(Long value) {
            addCriterion("up_count >=", value, "upCount");
            return (Criteria) this;
        }

        public Criteria andUpCountLessThan(Long value) {
            addCriterion("up_count <", value, "upCount");
            return (Criteria) this;
        }

        public Criteria andUpCountLessThanOrEqualTo(Long value) {
            addCriterion("up_count <=", value, "upCount");
            return (Criteria) this;
        }

        public Criteria andUpCountIn(List<Long> values) {
            addCriterion("up_count in", values, "upCount");
            return (Criteria) this;
        }

        public Criteria andUpCountNotIn(List<Long> values) {
            addCriterion("up_count not in", values, "upCount");
            return (Criteria) this;
        }

        public Criteria andUpCountBetween(Long value1, Long value2) {
            addCriterion("up_count between", value1, value2, "upCount");
            return (Criteria) this;
        }

        public Criteria andUpCountNotBetween(Long value1, Long value2) {
            addCriterion("up_count not between", value1, value2, "upCount");
            return (Criteria) this;
        }

        public Criteria andDownCountIsNull() {
            addCriterion("down_count is null");
            return (Criteria) this;
        }

        public Criteria andDownCountIsNotNull() {
            addCriterion("down_count is not null");
            return (Criteria) this;
        }

        public Criteria andDownCountEqualTo(Long value) {
            addCriterion("down_count =", value, "downCount");
            return (Criteria) this;
        }

        public Criteria andDownCountNotEqualTo(Long value) {
            addCriterion("down_count <>", value, "downCount");
            return (Criteria) this;
        }

        public Criteria andDownCountGreaterThan(Long value) {
            addCriterion("down_count >", value, "downCount");
            return (Criteria) this;
        }

        public Criteria andDownCountGreaterThanOrEqualTo(Long value) {
            addCriterion("down_count >=", value, "downCount");
            return (Criteria) this;
        }

        public Criteria andDownCountLessThan(Long value) {
            addCriterion("down_count <", value, "downCount");
            return (Criteria) this;
        }

        public Criteria andDownCountLessThanOrEqualTo(Long value) {
            addCriterion("down_count <=", value, "downCount");
            return (Criteria) this;
        }

        public Criteria andDownCountIn(List<Long> values) {
            addCriterion("down_count in", values, "downCount");
            return (Criteria) this;
        }

        public Criteria andDownCountNotIn(List<Long> values) {
            addCriterion("down_count not in", values, "downCount");
            return (Criteria) this;
        }

        public Criteria andDownCountBetween(Long value1, Long value2) {
            addCriterion("down_count between", value1, value2, "downCount");
            return (Criteria) this;
        }

        public Criteria andDownCountNotBetween(Long value1, Long value2) {
            addCriterion("down_count not between", value1, value2, "downCount");
            return (Criteria) this;
        }

        public Criteria andTagListIsNull() {
            addCriterion("tag_list is null");
            return (Criteria) this;
        }

        public Criteria andTagListIsNotNull() {
            addCriterion("tag_list is not null");
            return (Criteria) this;
        }

        public Criteria andTagListEqualTo(String value) {
            addCriterion("tag_list =", value, "tagList");
            return (Criteria) this;
        }

        public Criteria andTagListNotEqualTo(String value) {
            addCriterion("tag_list <>", value, "tagList");
            return (Criteria) this;
        }

        public Criteria andTagListGreaterThan(String value) {
            addCriterion("tag_list >", value, "tagList");
            return (Criteria) this;
        }

        public Criteria andTagListGreaterThanOrEqualTo(String value) {
            addCriterion("tag_list >=", value, "tagList");
            return (Criteria) this;
        }

        public Criteria andTagListLessThan(String value) {
            addCriterion("tag_list <", value, "tagList");
            return (Criteria) this;
        }

        public Criteria andTagListLessThanOrEqualTo(String value) {
            addCriterion("tag_list <=", value, "tagList");
            return (Criteria) this;
        }

        public Criteria andTagListLike(String value) {
            addCriterion("tag_list like", value, "tagList");
            return (Criteria) this;
        }

        public Criteria andTagListNotLike(String value) {
            addCriterion("tag_list not like", value, "tagList");
            return (Criteria) this;
        }

        public Criteria andTagListIn(List<String> values) {
            addCriterion("tag_list in", values, "tagList");
            return (Criteria) this;
        }

        public Criteria andTagListNotIn(List<String> values) {
            addCriterion("tag_list not in", values, "tagList");
            return (Criteria) this;
        }

        public Criteria andTagListBetween(String value1, String value2) {
            addCriterion("tag_list between", value1, value2, "tagList");
            return (Criteria) this;
        }

        public Criteria andTagListNotBetween(String value1, String value2) {
            addCriterion("tag_list not between", value1, value2, "tagList");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIsNull() {
            addCriterion("delete_status is null");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIsNotNull() {
            addCriterion("delete_status is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusEqualTo(Integer value) {
            addCriterion("delete_status =", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotEqualTo(Integer value) {
            addCriterion("delete_status <>", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusGreaterThan(Integer value) {
            addCriterion("delete_status >", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("delete_status >=", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusLessThan(Integer value) {
            addCriterion("delete_status <", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusLessThanOrEqualTo(Integer value) {
            addCriterion("delete_status <=", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIn(List<Integer> values) {
            addCriterion("delete_status in", values, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotIn(List<Integer> values) {
            addCriterion("delete_status not in", values, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusBetween(Integer value1, Integer value2) {
            addCriterion("delete_status between", value1, value2, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("delete_status not between", value1, value2, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}