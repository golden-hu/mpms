package com.maopao.entity.mark;

import java.util.ArrayList;
import java.util.List;

public class MarkStatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;



    private Integer limit;

    private Integer offset;

    public MarkStatExample() {
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

        public Criteria andMarkIdIsNull() {
            addCriterion("mark_id is null");
            return (Criteria) this;
        }

        public Criteria andMarkIdIsNotNull() {
            addCriterion("mark_id is not null");
            return (Criteria) this;
        }

        public Criteria andMarkIdEqualTo(Long value) {
            addCriterion("mark_id =", value, "markId");
            return (Criteria) this;
        }

        public Criteria andMarkIdNotEqualTo(Long value) {
            addCriterion("mark_id <>", value, "markId");
            return (Criteria) this;
        }

        public Criteria andMarkIdGreaterThan(Long value) {
            addCriterion("mark_id >", value, "markId");
            return (Criteria) this;
        }

        public Criteria andMarkIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mark_id >=", value, "markId");
            return (Criteria) this;
        }

        public Criteria andMarkIdLessThan(Long value) {
            addCriterion("mark_id <", value, "markId");
            return (Criteria) this;
        }

        public Criteria andMarkIdLessThanOrEqualTo(Long value) {
            addCriterion("mark_id <=", value, "markId");
            return (Criteria) this;
        }

        public Criteria andMarkIdIn(List<Long> values) {
            addCriterion("mark_id in", values, "markId");
            return (Criteria) this;
        }

        public Criteria andMarkIdNotIn(List<Long> values) {
            addCriterion("mark_id not in", values, "markId");
            return (Criteria) this;
        }

        public Criteria andMarkIdBetween(Long value1, Long value2) {
            addCriterion("mark_id between", value1, value2, "markId");
            return (Criteria) this;
        }

        public Criteria andMarkIdNotBetween(Long value1, Long value2) {
            addCriterion("mark_id not between", value1, value2, "markId");
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

        public Criteria andLatIsNull() {
            addCriterion("lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(Double value) {
            addCriterion("lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(Double value) {
            addCriterion("lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(Double value) {
            addCriterion("lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(Double value) {
            addCriterion("lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(Double value) {
            addCriterion("lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(Double value) {
            addCriterion("lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<Double> values) {
            addCriterion("lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<Double> values) {
            addCriterion("lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(Double value1, Double value2) {
            addCriterion("lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(Double value1, Double value2) {
            addCriterion("lat not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLngIsNull() {
            addCriterion("lng is null");
            return (Criteria) this;
        }

        public Criteria andLngIsNotNull() {
            addCriterion("lng is not null");
            return (Criteria) this;
        }

        public Criteria andLngEqualTo(Double value) {
            addCriterion("lng =", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotEqualTo(Double value) {
            addCriterion("lng <>", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThan(Double value) {
            addCriterion("lng >", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThanOrEqualTo(Double value) {
            addCriterion("lng >=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThan(Double value) {
            addCriterion("lng <", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThanOrEqualTo(Double value) {
            addCriterion("lng <=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngIn(List<Double> values) {
            addCriterion("lng in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotIn(List<Double> values) {
            addCriterion("lng not in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngBetween(Double value1, Double value2) {
            addCriterion("lng between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotBetween(Double value1, Double value2) {
            addCriterion("lng not between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLookIsNull() {
            addCriterion("look is null");
            return (Criteria) this;
        }

        public Criteria andLookIsNotNull() {
            addCriterion("look is not null");
            return (Criteria) this;
        }

        public Criteria andLookEqualTo(Integer value) {
            addCriterion("look =", value, "look");
            return (Criteria) this;
        }

        public Criteria andLookNotEqualTo(Integer value) {
            addCriterion("look <>", value, "look");
            return (Criteria) this;
        }

        public Criteria andLookGreaterThan(Integer value) {
            addCriterion("look >", value, "look");
            return (Criteria) this;
        }

        public Criteria andLookGreaterThanOrEqualTo(Integer value) {
            addCriterion("look >=", value, "look");
            return (Criteria) this;
        }

        public Criteria andLookLessThan(Integer value) {
            addCriterion("look <", value, "look");
            return (Criteria) this;
        }

        public Criteria andLookLessThanOrEqualTo(Integer value) {
            addCriterion("look <=", value, "look");
            return (Criteria) this;
        }

        public Criteria andLookIn(List<Integer> values) {
            addCriterion("look in", values, "look");
            return (Criteria) this;
        }

        public Criteria andLookNotIn(List<Integer> values) {
            addCriterion("look not in", values, "look");
            return (Criteria) this;
        }

        public Criteria andLookBetween(Integer value1, Integer value2) {
            addCriterion("look between", value1, value2, "look");
            return (Criteria) this;
        }

        public Criteria andLookNotBetween(Integer value1, Integer value2) {
            addCriterion("look not between", value1, value2, "look");
            return (Criteria) this;
        }

        public Criteria andPraiseIsNull() {
            addCriterion("praise is null");
            return (Criteria) this;
        }

        public Criteria andPraiseIsNotNull() {
            addCriterion("praise is not null");
            return (Criteria) this;
        }

        public Criteria andPraiseEqualTo(Integer value) {
            addCriterion("praise =", value, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseNotEqualTo(Integer value) {
            addCriterion("praise <>", value, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseGreaterThan(Integer value) {
            addCriterion("praise >", value, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseGreaterThanOrEqualTo(Integer value) {
            addCriterion("praise >=", value, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseLessThan(Integer value) {
            addCriterion("praise <", value, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseLessThanOrEqualTo(Integer value) {
            addCriterion("praise <=", value, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseIn(List<Integer> values) {
            addCriterion("praise in", values, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseNotIn(List<Integer> values) {
            addCriterion("praise not in", values, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseBetween(Integer value1, Integer value2) {
            addCriterion("praise between", value1, value2, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseNotBetween(Integer value1, Integer value2) {
            addCriterion("praise not between", value1, value2, "praise");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(Integer value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(Integer value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(Integer value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(Integer value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(Integer value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<Integer> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<Integer> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(Integer value1, Integer value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(Integer value1, Integer value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andRankIsNull() {
            addCriterion("rank is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("rank is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(Integer value) {
            addCriterion("rank =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(Integer value) {
            addCriterion("rank <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(Integer value) {
            addCriterion("rank >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("rank >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(Integer value) {
            addCriterion("rank <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(Integer value) {
            addCriterion("rank <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<Integer> values) {
            addCriterion("rank in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<Integer> values) {
            addCriterion("rank not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(Integer value1, Integer value2) {
            addCriterion("rank between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(Integer value1, Integer value2) {
            addCriterion("rank not between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andLogIdateIsNull() {
            addCriterion("log_idate is null");
            return (Criteria) this;
        }

        public Criteria andLogIdateIsNotNull() {
            addCriterion("log_idate is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdateEqualTo(Integer value) {
            addCriterion("log_idate =", value, "logIdate");
            return (Criteria) this;
        }

        public Criteria andLogIdateNotEqualTo(Integer value) {
            addCriterion("log_idate <>", value, "logIdate");
            return (Criteria) this;
        }

        public Criteria andLogIdateGreaterThan(Integer value) {
            addCriterion("log_idate >", value, "logIdate");
            return (Criteria) this;
        }

        public Criteria andLogIdateGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_idate >=", value, "logIdate");
            return (Criteria) this;
        }

        public Criteria andLogIdateLessThan(Integer value) {
            addCriterion("log_idate <", value, "logIdate");
            return (Criteria) this;
        }

        public Criteria andLogIdateLessThanOrEqualTo(Integer value) {
            addCriterion("log_idate <=", value, "logIdate");
            return (Criteria) this;
        }

        public Criteria andLogIdateIn(List<Integer> values) {
            addCriterion("log_idate in", values, "logIdate");
            return (Criteria) this;
        }

        public Criteria andLogIdateNotIn(List<Integer> values) {
            addCriterion("log_idate not in", values, "logIdate");
            return (Criteria) this;
        }

        public Criteria andLogIdateBetween(Integer value1, Integer value2) {
            addCriterion("log_idate between", value1, value2, "logIdate");
            return (Criteria) this;
        }

        public Criteria andLogIdateNotBetween(Integer value1, Integer value2) {
            addCriterion("log_idate not between", value1, value2, "logIdate");
            return (Criteria) this;
        }

        public Criteria andForwardIsNull() {
            addCriterion("forward is null");
            return (Criteria) this;
        }

        public Criteria andForwardIsNotNull() {
            addCriterion("forward is not null");
            return (Criteria) this;
        }

        public Criteria andForwardEqualTo(Integer value) {
            addCriterion("forward =", value, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardNotEqualTo(Integer value) {
            addCriterion("forward <>", value, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardGreaterThan(Integer value) {
            addCriterion("forward >", value, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardGreaterThanOrEqualTo(Integer value) {
            addCriterion("forward >=", value, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardLessThan(Integer value) {
            addCriterion("forward <", value, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardLessThanOrEqualTo(Integer value) {
            addCriterion("forward <=", value, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardIn(List<Integer> values) {
            addCriterion("forward in", values, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardNotIn(List<Integer> values) {
            addCriterion("forward not in", values, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardBetween(Integer value1, Integer value2) {
            addCriterion("forward between", value1, value2, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardNotBetween(Integer value1, Integer value2) {
            addCriterion("forward not between", value1, value2, "forward");
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