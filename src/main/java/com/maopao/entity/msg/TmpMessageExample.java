package com.maopao.entity.msg;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TmpMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;



    private Integer limit;

    private Integer offset;

    public TmpMessageExample() {
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



    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andRowIdIsNull() {
            addCriterion("row_id is null");
            return (Criteria) this;
        }

        public Criteria andRowIdIsNotNull() {
            addCriterion("row_id is not null");
            return (Criteria) this;
        }

        public Criteria andRowIdEqualTo(Integer value) {
            addCriterion("row_id =", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdNotEqualTo(Integer value) {
            addCriterion("row_id <>", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdGreaterThan(Integer value) {
            addCriterion("row_id >", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("row_id >=", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdLessThan(Integer value) {
            addCriterion("row_id <", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdLessThanOrEqualTo(Integer value) {
            addCriterion("row_id <=", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdIn(List<Integer> values) {
            addCriterion("row_id in", values, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdNotIn(List<Integer> values) {
            addCriterion("row_id not in", values, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdBetween(Integer value1, Integer value2) {
            addCriterion("row_id between", value1, value2, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdNotBetween(Integer value1, Integer value2) {
            addCriterion("row_id not between", value1, value2, "rowId");
            return (Criteria) this;
        }

        public Criteria andTextIsNull() {
            addCriterion("text is null");
            return (Criteria) this;
        }

        public Criteria andTextIsNotNull() {
            addCriterion("text is not null");
            return (Criteria) this;
        }

        public Criteria andTextEqualTo(String value) {
            addCriterion("text =", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotEqualTo(String value) {
            addCriterion("text <>", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextGreaterThan(String value) {
            addCriterion("text >", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextGreaterThanOrEqualTo(String value) {
            addCriterion("text >=", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLessThan(String value) {
            addCriterion("text <", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLessThanOrEqualTo(String value) {
            addCriterion("text <=", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLike(String value) {
            addCriterion("text like", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotLike(String value) {
            addCriterion("text not like", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextIn(List<String> values) {
            addCriterion("text in", values, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotIn(List<String> values) {
            addCriterion("text not in", values, "text");
            return (Criteria) this;
        }

        public Criteria andTextBetween(String value1, String value2) {
            addCriterion("text between", value1, value2, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotBetween(String value1, String value2) {
            addCriterion("text not between", value1, value2, "text");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andPlantformIsNull() {
            addCriterion("plantform is null");
            return (Criteria) this;
        }

        public Criteria andPlantformIsNotNull() {
            addCriterion("plantform is not null");
            return (Criteria) this;
        }

        public Criteria andPlantformEqualTo(Integer value) {
            addCriterion("plantform =", value, "plantform");
            return (Criteria) this;
        }

        public Criteria andPlantformNotEqualTo(Integer value) {
            addCriterion("plantform <>", value, "plantform");
            return (Criteria) this;
        }

        public Criteria andPlantformGreaterThan(Integer value) {
            addCriterion("plantform >", value, "plantform");
            return (Criteria) this;
        }

        public Criteria andPlantformGreaterThanOrEqualTo(Integer value) {
            addCriterion("plantform >=", value, "plantform");
            return (Criteria) this;
        }

        public Criteria andPlantformLessThan(Integer value) {
            addCriterion("plantform <", value, "plantform");
            return (Criteria) this;
        }

        public Criteria andPlantformLessThanOrEqualTo(Integer value) {
            addCriterion("plantform <=", value, "plantform");
            return (Criteria) this;
        }

        public Criteria andPlantformIn(List<Integer> values) {
            addCriterion("plantform in", values, "plantform");
            return (Criteria) this;
        }

        public Criteria andPlantformNotIn(List<Integer> values) {
            addCriterion("plantform not in", values, "plantform");
            return (Criteria) this;
        }

        public Criteria andPlantformBetween(Integer value1, Integer value2) {
            addCriterion("plantform between", value1, value2, "plantform");
            return (Criteria) this;
        }

        public Criteria andPlantformNotBetween(Integer value1, Integer value2) {
            addCriterion("plantform not between", value1, value2, "plantform");
            return (Criteria) this;
        }

        public Criteria andLogIdataIsNull() {
            addCriterion("log_idata is null");
            return (Criteria) this;
        }

        public Criteria andLogIdataIsNotNull() {
            addCriterion("log_idata is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdataEqualTo(Integer value) {
            addCriterion("log_idata =", value, "logIdata");
            return (Criteria) this;
        }

        public Criteria andLogIdataNotEqualTo(Integer value) {
            addCriterion("log_idata <>", value, "logIdata");
            return (Criteria) this;
        }

        public Criteria andLogIdataGreaterThan(Integer value) {
            addCriterion("log_idata >", value, "logIdata");
            return (Criteria) this;
        }

        public Criteria andLogIdataGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_idata >=", value, "logIdata");
            return (Criteria) this;
        }

        public Criteria andLogIdataLessThan(Integer value) {
            addCriterion("log_idata <", value, "logIdata");
            return (Criteria) this;
        }

        public Criteria andLogIdataLessThanOrEqualTo(Integer value) {
            addCriterion("log_idata <=", value, "logIdata");
            return (Criteria) this;
        }

        public Criteria andLogIdataIn(List<Integer> values) {
            addCriterion("log_idata in", values, "logIdata");
            return (Criteria) this;
        }

        public Criteria andLogIdataNotIn(List<Integer> values) {
            addCriterion("log_idata not in", values, "logIdata");
            return (Criteria) this;
        }

        public Criteria andLogIdataBetween(Integer value1, Integer value2) {
            addCriterion("log_idata between", value1, value2, "logIdata");
            return (Criteria) this;
        }

        public Criteria andLogIdataNotBetween(Integer value1, Integer value2) {
            addCriterion("log_idata not between", value1, value2, "logIdata");
            return (Criteria) this;
        }

        public Criteria andLogDatetimeIsNull() {
            addCriterion("log_datetime is null");
            return (Criteria) this;
        }

        public Criteria andLogDatetimeIsNotNull() {
            addCriterion("log_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andLogDatetimeEqualTo(Date value) {
            addCriterion("log_datetime =", value, "logDatetime");
            return (Criteria) this;
        }

        public Criteria andLogDatetimeNotEqualTo(Date value) {
            addCriterion("log_datetime <>", value, "logDatetime");
            return (Criteria) this;
        }

        public Criteria andLogDatetimeGreaterThan(Date value) {
            addCriterion("log_datetime >", value, "logDatetime");
            return (Criteria) this;
        }

        public Criteria andLogDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("log_datetime >=", value, "logDatetime");
            return (Criteria) this;
        }

        public Criteria andLogDatetimeLessThan(Date value) {
            addCriterion("log_datetime <", value, "logDatetime");
            return (Criteria) this;
        }

        public Criteria andLogDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("log_datetime <=", value, "logDatetime");
            return (Criteria) this;
        }

        public Criteria andLogDatetimeIn(List<Date> values) {
            addCriterion("log_datetime in", values, "logDatetime");
            return (Criteria) this;
        }

        public Criteria andLogDatetimeNotIn(List<Date> values) {
            addCriterion("log_datetime not in", values, "logDatetime");
            return (Criteria) this;
        }

        public Criteria andLogDatetimeBetween(Date value1, Date value2) {
            addCriterion("log_datetime between", value1, value2, "logDatetime");
            return (Criteria) this;
        }

        public Criteria andLogDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("log_datetime not between", value1, value2, "logDatetime");
            return (Criteria) this;
        }

        public Criteria andIsCompleteIsNull() {
            addCriterion("is_complete is null");
            return (Criteria) this;
        }

        public Criteria andIsCompleteIsNotNull() {
            addCriterion("is_complete is not null");
            return (Criteria) this;
        }

        public Criteria andIsCompleteEqualTo(Integer value) {
            addCriterion("is_complete =", value, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteNotEqualTo(Integer value) {
            addCriterion("is_complete <>", value, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteGreaterThan(Integer value) {
            addCriterion("is_complete >", value, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_complete >=", value, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteLessThan(Integer value) {
            addCriterion("is_complete <", value, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_complete <=", value, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteIn(List<Integer> values) {
            addCriterion("is_complete in", values, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteNotIn(List<Integer> values) {
            addCriterion("is_complete not in", values, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteBetween(Integer value1, Integer value2) {
            addCriterion("is_complete between", value1, value2, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_complete not between", value1, value2, "isComplete");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andJMsgIdIsNull() {
            addCriterion("j_msg_id is null");
            return (Criteria) this;
        }

        public Criteria andJMsgIdIsNotNull() {
            addCriterion("j_msg_id is not null");
            return (Criteria) this;
        }

        public Criteria andJMsgIdEqualTo(Long value) {
            addCriterion("j_msg_id =", value, "jMsgId");
            return (Criteria) this;
        }

        public Criteria andJMsgIdNotEqualTo(Long value) {
            addCriterion("j_msg_id <>", value, "jMsgId");
            return (Criteria) this;
        }

        public Criteria andJMsgIdGreaterThan(Long value) {
            addCriterion("j_msg_id >", value, "jMsgId");
            return (Criteria) this;
        }

        public Criteria andJMsgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("j_msg_id >=", value, "jMsgId");
            return (Criteria) this;
        }

        public Criteria andJMsgIdLessThan(Long value) {
            addCriterion("j_msg_id <", value, "jMsgId");
            return (Criteria) this;
        }

        public Criteria andJMsgIdLessThanOrEqualTo(Long value) {
            addCriterion("j_msg_id <=", value, "jMsgId");
            return (Criteria) this;
        }

        public Criteria andJMsgIdIn(List<Long> values) {
            addCriterion("j_msg_id in", values, "jMsgId");
            return (Criteria) this;
        }

        public Criteria andJMsgIdNotIn(List<Long> values) {
            addCriterion("j_msg_id not in", values, "jMsgId");
            return (Criteria) this;
        }

        public Criteria andJMsgIdBetween(Long value1, Long value2) {
            addCriterion("j_msg_id between", value1, value2, "jMsgId");
            return (Criteria) this;
        }

        public Criteria andJMsgIdNotBetween(Long value1, Long value2) {
            addCriterion("j_msg_id not between", value1, value2, "jMsgId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("city_code is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("city_code is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(Integer value) {
            addCriterion("city_code =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(Integer value) {
            addCriterion("city_code <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(Integer value) {
            addCriterion("city_code >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_code >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(Integer value) {
            addCriterion("city_code <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(Integer value) {
            addCriterion("city_code <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<Integer> values) {
            addCriterion("city_code in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<Integer> values) {
            addCriterion("city_code not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(Integer value1, Integer value2) {
            addCriterion("city_code between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("city_code not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andOperUidIsNull() {
            addCriterion("oper_uid is null");
            return (Criteria) this;
        }

        public Criteria andOperUidIsNotNull() {
            addCriterion("oper_uid is not null");
            return (Criteria) this;
        }

        public Criteria andOperUidEqualTo(Long value) {
            addCriterion("oper_uid =", value, "operUid");
            return (Criteria) this;
        }

        public Criteria andOperUidNotEqualTo(Long value) {
            addCriterion("oper_uid <>", value, "operUid");
            return (Criteria) this;
        }

        public Criteria andOperUidGreaterThan(Long value) {
            addCriterion("oper_uid >", value, "operUid");
            return (Criteria) this;
        }

        public Criteria andOperUidGreaterThanOrEqualTo(Long value) {
            addCriterion("oper_uid >=", value, "operUid");
            return (Criteria) this;
        }

        public Criteria andOperUidLessThan(Long value) {
            addCriterion("oper_uid <", value, "operUid");
            return (Criteria) this;
        }

        public Criteria andOperUidLessThanOrEqualTo(Long value) {
            addCriterion("oper_uid <=", value, "operUid");
            return (Criteria) this;
        }

        public Criteria andOperUidIn(List<Long> values) {
            addCriterion("oper_uid in", values, "operUid");
            return (Criteria) this;
        }

        public Criteria andOperUidNotIn(List<Long> values) {
            addCriterion("oper_uid not in", values, "operUid");
            return (Criteria) this;
        }

        public Criteria andOperUidBetween(Long value1, Long value2) {
            addCriterion("oper_uid between", value1, value2, "operUid");
            return (Criteria) this;
        }

        public Criteria andOperUidNotBetween(Long value1, Long value2) {
            addCriterion("oper_uid not between", value1, value2, "operUid");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andToUidsIsNull() {
            addCriterion("to_uids is null");
            return (Criteria) this;
        }

        public Criteria andToUidsIsNotNull() {
            addCriterion("to_uids is not null");
            return (Criteria) this;
        }

        public Criteria andToUidsEqualTo(String value) {
            addCriterion("to_uids =", value, "toUids");
            return (Criteria) this;
        }

        public Criteria andToUidsNotEqualTo(String value) {
            addCriterion("to_uids <>", value, "toUids");
            return (Criteria) this;
        }

        public Criteria andToUidsGreaterThan(String value) {
            addCriterion("to_uids >", value, "toUids");
            return (Criteria) this;
        }

        public Criteria andToUidsGreaterThanOrEqualTo(String value) {
            addCriterion("to_uids >=", value, "toUids");
            return (Criteria) this;
        }

        public Criteria andToUidsLessThan(String value) {
            addCriterion("to_uids <", value, "toUids");
            return (Criteria) this;
        }

        public Criteria andToUidsLessThanOrEqualTo(String value) {
            addCriterion("to_uids <=", value, "toUids");
            return (Criteria) this;
        }

        public Criteria andToUidsLike(String value) {
            addCriterion("to_uids like", value, "toUids");
            return (Criteria) this;
        }

        public Criteria andToUidsNotLike(String value) {
            addCriterion("to_uids not like", value, "toUids");
            return (Criteria) this;
        }

        public Criteria andToUidsIn(List<String> values) {
            addCriterion("to_uids in", values, "toUids");
            return (Criteria) this;
        }

        public Criteria andToUidsNotIn(List<String> values) {
            addCriterion("to_uids not in", values, "toUids");
            return (Criteria) this;
        }

        public Criteria andToUidsBetween(String value1, String value2) {
            addCriterion("to_uids between", value1, value2, "toUids");
            return (Criteria) this;
        }

        public Criteria andToUidsNotBetween(String value1, String value2) {
            addCriterion("to_uids not between", value1, value2, "toUids");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andPreDatetimeIsNull() {
            addCriterion("pre_datetime is null");
            return (Criteria) this;
        }

        public Criteria andPreDatetimeIsNotNull() {
            addCriterion("pre_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andPreDatetimeEqualTo(Date value) {
            addCriterion("pre_datetime =", value, "preDatetime");
            return (Criteria) this;
        }

        public Criteria andPreDatetimeNotEqualTo(Date value) {
            addCriterion("pre_datetime <>", value, "preDatetime");
            return (Criteria) this;
        }

        public Criteria andPreDatetimeGreaterThan(Date value) {
            addCriterion("pre_datetime >", value, "preDatetime");
            return (Criteria) this;
        }

        public Criteria andPreDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pre_datetime >=", value, "preDatetime");
            return (Criteria) this;
        }

        public Criteria andPreDatetimeLessThan(Date value) {
            addCriterion("pre_datetime <", value, "preDatetime");
            return (Criteria) this;
        }

        public Criteria andPreDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("pre_datetime <=", value, "preDatetime");
            return (Criteria) this;
        }

        public Criteria andPreDatetimeIn(List<Date> values) {
            addCriterion("pre_datetime in", values, "preDatetime");
            return (Criteria) this;
        }

        public Criteria andPreDatetimeNotIn(List<Date> values) {
            addCriterion("pre_datetime not in", values, "preDatetime");
            return (Criteria) this;
        }

        public Criteria andPreDatetimeBetween(Date value1, Date value2) {
            addCriterion("pre_datetime between", value1, value2, "preDatetime");
            return (Criteria) this;
        }

        public Criteria andPreDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("pre_datetime not between", value1, value2, "preDatetime");
            return (Criteria) this;
        }
    }

    /**
     */
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