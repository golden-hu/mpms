package com.maopao.entity.log;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StatUserStateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;



    private Integer limit;

    private Integer offset;

    public StatUserStateExample() {
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

        public Criteria andDauIsNull() {
            addCriterion("dau is null");
            return (Criteria) this;
        }

        public Criteria andDauIsNotNull() {
            addCriterion("dau is not null");
            return (Criteria) this;
        }

        public Criteria andDauEqualTo(Integer value) {
            addCriterion("dau =", value, "dau");
            return (Criteria) this;
        }

        public Criteria andDauNotEqualTo(Integer value) {
            addCriterion("dau <>", value, "dau");
            return (Criteria) this;
        }

        public Criteria andDauGreaterThan(Integer value) {
            addCriterion("dau >", value, "dau");
            return (Criteria) this;
        }

        public Criteria andDauGreaterThanOrEqualTo(Integer value) {
            addCriterion("dau >=", value, "dau");
            return (Criteria) this;
        }

        public Criteria andDauLessThan(Integer value) {
            addCriterion("dau <", value, "dau");
            return (Criteria) this;
        }

        public Criteria andDauLessThanOrEqualTo(Integer value) {
            addCriterion("dau <=", value, "dau");
            return (Criteria) this;
        }

        public Criteria andDauIn(List<Integer> values) {
            addCriterion("dau in", values, "dau");
            return (Criteria) this;
        }

        public Criteria andDauNotIn(List<Integer> values) {
            addCriterion("dau not in", values, "dau");
            return (Criteria) this;
        }

        public Criteria andDauBetween(Integer value1, Integer value2) {
            addCriterion("dau between", value1, value2, "dau");
            return (Criteria) this;
        }

        public Criteria andDauNotBetween(Integer value1, Integer value2) {
            addCriterion("dau not between", value1, value2, "dau");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNull() {
            addCriterion("last_time is null");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNotNull() {
            addCriterion("last_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastTimeEqualTo(Date value) {
            addCriterion("last_time =", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotEqualTo(Date value) {
            addCriterion("last_time <>", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThan(Date value) {
            addCriterion("last_time >", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_time >=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThan(Date value) {
            addCriterion("last_time <", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_time <=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeIn(List<Date> values) {
            addCriterion("last_time in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotIn(List<Date> values) {
            addCriterion("last_time not in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeBetween(Date value1, Date value2) {
            addCriterion("last_time between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_time not between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastLatIsNull() {
            addCriterion("last_lat is null");
            return (Criteria) this;
        }

        public Criteria andLastLatIsNotNull() {
            addCriterion("last_lat is not null");
            return (Criteria) this;
        }

        public Criteria andLastLatEqualTo(Double value) {
            addCriterion("last_lat =", value, "lastLat");
            return (Criteria) this;
        }

        public Criteria andLastLatNotEqualTo(Double value) {
            addCriterion("last_lat <>", value, "lastLat");
            return (Criteria) this;
        }

        public Criteria andLastLatGreaterThan(Double value) {
            addCriterion("last_lat >", value, "lastLat");
            return (Criteria) this;
        }

        public Criteria andLastLatGreaterThanOrEqualTo(Double value) {
            addCriterion("last_lat >=", value, "lastLat");
            return (Criteria) this;
        }

        public Criteria andLastLatLessThan(Double value) {
            addCriterion("last_lat <", value, "lastLat");
            return (Criteria) this;
        }

        public Criteria andLastLatLessThanOrEqualTo(Double value) {
            addCriterion("last_lat <=", value, "lastLat");
            return (Criteria) this;
        }

        public Criteria andLastLatIn(List<Double> values) {
            addCriterion("last_lat in", values, "lastLat");
            return (Criteria) this;
        }

        public Criteria andLastLatNotIn(List<Double> values) {
            addCriterion("last_lat not in", values, "lastLat");
            return (Criteria) this;
        }

        public Criteria andLastLatBetween(Double value1, Double value2) {
            addCriterion("last_lat between", value1, value2, "lastLat");
            return (Criteria) this;
        }

        public Criteria andLastLatNotBetween(Double value1, Double value2) {
            addCriterion("last_lat not between", value1, value2, "lastLat");
            return (Criteria) this;
        }

        public Criteria andLastLngIsNull() {
            addCriterion("last_lng is null");
            return (Criteria) this;
        }

        public Criteria andLastLngIsNotNull() {
            addCriterion("last_lng is not null");
            return (Criteria) this;
        }

        public Criteria andLastLngEqualTo(Double value) {
            addCriterion("last_lng =", value, "lastLng");
            return (Criteria) this;
        }

        public Criteria andLastLngNotEqualTo(Double value) {
            addCriterion("last_lng <>", value, "lastLng");
            return (Criteria) this;
        }

        public Criteria andLastLngGreaterThan(Double value) {
            addCriterion("last_lng >", value, "lastLng");
            return (Criteria) this;
        }

        public Criteria andLastLngGreaterThanOrEqualTo(Double value) {
            addCriterion("last_lng >=", value, "lastLng");
            return (Criteria) this;
        }

        public Criteria andLastLngLessThan(Double value) {
            addCriterion("last_lng <", value, "lastLng");
            return (Criteria) this;
        }

        public Criteria andLastLngLessThanOrEqualTo(Double value) {
            addCriterion("last_lng <=", value, "lastLng");
            return (Criteria) this;
        }

        public Criteria andLastLngIn(List<Double> values) {
            addCriterion("last_lng in", values, "lastLng");
            return (Criteria) this;
        }

        public Criteria andLastLngNotIn(List<Double> values) {
            addCriterion("last_lng not in", values, "lastLng");
            return (Criteria) this;
        }

        public Criteria andLastLngBetween(Double value1, Double value2) {
            addCriterion("last_lng between", value1, value2, "lastLng");
            return (Criteria) this;
        }

        public Criteria andLastLngNotBetween(Double value1, Double value2) {
            addCriterion("last_lng not between", value1, value2, "lastLng");
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