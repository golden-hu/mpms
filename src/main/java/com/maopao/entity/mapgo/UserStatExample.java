package com.maopao.entity.mapgo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserStatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;



    private Integer limit;

    private Integer offset;

    public UserStatExample() {
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

        public Criteria andFansNumIsNull() {
            addCriterion("fans_num is null");
            return (Criteria) this;
        }

        public Criteria andFansNumIsNotNull() {
            addCriterion("fans_num is not null");
            return (Criteria) this;
        }

        public Criteria andFansNumEqualTo(Integer value) {
            addCriterion("fans_num =", value, "fansNum");
            return (Criteria) this;
        }

        public Criteria andFansNumNotEqualTo(Integer value) {
            addCriterion("fans_num <>", value, "fansNum");
            return (Criteria) this;
        }

        public Criteria andFansNumGreaterThan(Integer value) {
            addCriterion("fans_num >", value, "fansNum");
            return (Criteria) this;
        }

        public Criteria andFansNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("fans_num >=", value, "fansNum");
            return (Criteria) this;
        }

        public Criteria andFansNumLessThan(Integer value) {
            addCriterion("fans_num <", value, "fansNum");
            return (Criteria) this;
        }

        public Criteria andFansNumLessThanOrEqualTo(Integer value) {
            addCriterion("fans_num <=", value, "fansNum");
            return (Criteria) this;
        }

        public Criteria andFansNumIn(List<Integer> values) {
            addCriterion("fans_num in", values, "fansNum");
            return (Criteria) this;
        }

        public Criteria andFansNumNotIn(List<Integer> values) {
            addCriterion("fans_num not in", values, "fansNum");
            return (Criteria) this;
        }

        public Criteria andFansNumBetween(Integer value1, Integer value2) {
            addCriterion("fans_num between", value1, value2, "fansNum");
            return (Criteria) this;
        }

        public Criteria andFansNumNotBetween(Integer value1, Integer value2) {
            addCriterion("fans_num not between", value1, value2, "fansNum");
            return (Criteria) this;
        }

        public Criteria andFocusNumIsNull() {
            addCriterion("focus_num is null");
            return (Criteria) this;
        }

        public Criteria andFocusNumIsNotNull() {
            addCriterion("focus_num is not null");
            return (Criteria) this;
        }

        public Criteria andFocusNumEqualTo(Integer value) {
            addCriterion("focus_num =", value, "focusNum");
            return (Criteria) this;
        }

        public Criteria andFocusNumNotEqualTo(Integer value) {
            addCriterion("focus_num <>", value, "focusNum");
            return (Criteria) this;
        }

        public Criteria andFocusNumGreaterThan(Integer value) {
            addCriterion("focus_num >", value, "focusNum");
            return (Criteria) this;
        }

        public Criteria andFocusNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("focus_num >=", value, "focusNum");
            return (Criteria) this;
        }

        public Criteria andFocusNumLessThan(Integer value) {
            addCriterion("focus_num <", value, "focusNum");
            return (Criteria) this;
        }

        public Criteria andFocusNumLessThanOrEqualTo(Integer value) {
            addCriterion("focus_num <=", value, "focusNum");
            return (Criteria) this;
        }

        public Criteria andFocusNumIn(List<Integer> values) {
            addCriterion("focus_num in", values, "focusNum");
            return (Criteria) this;
        }

        public Criteria andFocusNumNotIn(List<Integer> values) {
            addCriterion("focus_num not in", values, "focusNum");
            return (Criteria) this;
        }

        public Criteria andFocusNumBetween(Integer value1, Integer value2) {
            addCriterion("focus_num between", value1, value2, "focusNum");
            return (Criteria) this;
        }

        public Criteria andFocusNumNotBetween(Integer value1, Integer value2) {
            addCriterion("focus_num not between", value1, value2, "focusNum");
            return (Criteria) this;
        }

        public Criteria andMarkNumIsNull() {
            addCriterion("mark_num is null");
            return (Criteria) this;
        }

        public Criteria andMarkNumIsNotNull() {
            addCriterion("mark_num is not null");
            return (Criteria) this;
        }

        public Criteria andMarkNumEqualTo(Integer value) {
            addCriterion("mark_num =", value, "markNum");
            return (Criteria) this;
        }

        public Criteria andMarkNumNotEqualTo(Integer value) {
            addCriterion("mark_num <>", value, "markNum");
            return (Criteria) this;
        }

        public Criteria andMarkNumGreaterThan(Integer value) {
            addCriterion("mark_num >", value, "markNum");
            return (Criteria) this;
        }

        public Criteria andMarkNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("mark_num >=", value, "markNum");
            return (Criteria) this;
        }

        public Criteria andMarkNumLessThan(Integer value) {
            addCriterion("mark_num <", value, "markNum");
            return (Criteria) this;
        }

        public Criteria andMarkNumLessThanOrEqualTo(Integer value) {
            addCriterion("mark_num <=", value, "markNum");
            return (Criteria) this;
        }

        public Criteria andMarkNumIn(List<Integer> values) {
            addCriterion("mark_num in", values, "markNum");
            return (Criteria) this;
        }

        public Criteria andMarkNumNotIn(List<Integer> values) {
            addCriterion("mark_num not in", values, "markNum");
            return (Criteria) this;
        }

        public Criteria andMarkNumBetween(Integer value1, Integer value2) {
            addCriterion("mark_num between", value1, value2, "markNum");
            return (Criteria) this;
        }

        public Criteria andMarkNumNotBetween(Integer value1, Integer value2) {
            addCriterion("mark_num not between", value1, value2, "markNum");
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