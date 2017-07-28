package com.maopao.entity.bcf;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StatBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;



    private Integer limit;

    private Integer offset;

    public StatBaseExample() {
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

        public Criteria andStatisProIdIsNull() {
            addCriterion("statis_pro_id is null");
            return (Criteria) this;
        }

        public Criteria andStatisProIdIsNotNull() {
            addCriterion("statis_pro_id is not null");
            return (Criteria) this;
        }

        public Criteria andStatisProIdEqualTo(Integer value) {
            addCriterion("statis_pro_id =", value, "statisProId");
            return (Criteria) this;
        }

        public Criteria andStatisProIdNotEqualTo(Integer value) {
            addCriterion("statis_pro_id <>", value, "statisProId");
            return (Criteria) this;
        }

        public Criteria andStatisProIdGreaterThan(Integer value) {
            addCriterion("statis_pro_id >", value, "statisProId");
            return (Criteria) this;
        }

        public Criteria andStatisProIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("statis_pro_id >=", value, "statisProId");
            return (Criteria) this;
        }

        public Criteria andStatisProIdLessThan(Integer value) {
            addCriterion("statis_pro_id <", value, "statisProId");
            return (Criteria) this;
        }

        public Criteria andStatisProIdLessThanOrEqualTo(Integer value) {
            addCriterion("statis_pro_id <=", value, "statisProId");
            return (Criteria) this;
        }

        public Criteria andStatisProIdIn(List<Integer> values) {
            addCriterion("statis_pro_id in", values, "statisProId");
            return (Criteria) this;
        }

        public Criteria andStatisProIdNotIn(List<Integer> values) {
            addCriterion("statis_pro_id not in", values, "statisProId");
            return (Criteria) this;
        }

        public Criteria andStatisProIdBetween(Integer value1, Integer value2) {
            addCriterion("statis_pro_id between", value1, value2, "statisProId");
            return (Criteria) this;
        }

        public Criteria andStatisProIdNotBetween(Integer value1, Integer value2) {
            addCriterion("statis_pro_id not between", value1, value2, "statisProId");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Integer value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Integer value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Integer value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Integer value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Integer value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Integer> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Integer> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Integer value1, Integer value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Integer value1, Integer value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andRegUserNumIsNull() {
            addCriterion("reg_user_num is null");
            return (Criteria) this;
        }

        public Criteria andRegUserNumIsNotNull() {
            addCriterion("reg_user_num is not null");
            return (Criteria) this;
        }

        public Criteria andRegUserNumEqualTo(Integer value) {
            addCriterion("reg_user_num =", value, "regUserNum");
            return (Criteria) this;
        }

        public Criteria andRegUserNumNotEqualTo(Integer value) {
            addCriterion("reg_user_num <>", value, "regUserNum");
            return (Criteria) this;
        }

        public Criteria andRegUserNumGreaterThan(Integer value) {
            addCriterion("reg_user_num >", value, "regUserNum");
            return (Criteria) this;
        }

        public Criteria andRegUserNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("reg_user_num >=", value, "regUserNum");
            return (Criteria) this;
        }

        public Criteria andRegUserNumLessThan(Integer value) {
            addCriterion("reg_user_num <", value, "regUserNum");
            return (Criteria) this;
        }

        public Criteria andRegUserNumLessThanOrEqualTo(Integer value) {
            addCriterion("reg_user_num <=", value, "regUserNum");
            return (Criteria) this;
        }

        public Criteria andRegUserNumIn(List<Integer> values) {
            addCriterion("reg_user_num in", values, "regUserNum");
            return (Criteria) this;
        }

        public Criteria andRegUserNumNotIn(List<Integer> values) {
            addCriterion("reg_user_num not in", values, "regUserNum");
            return (Criteria) this;
        }

        public Criteria andRegUserNumBetween(Integer value1, Integer value2) {
            addCriterion("reg_user_num between", value1, value2, "regUserNum");
            return (Criteria) this;
        }

        public Criteria andRegUserNumNotBetween(Integer value1, Integer value2) {
            addCriterion("reg_user_num not between", value1, value2, "regUserNum");
            return (Criteria) this;
        }

        public Criteria andDowUserNumIsNull() {
            addCriterion("dow_user_num is null");
            return (Criteria) this;
        }

        public Criteria andDowUserNumIsNotNull() {
            addCriterion("dow_user_num is not null");
            return (Criteria) this;
        }

        public Criteria andDowUserNumEqualTo(Integer value) {
            addCriterion("dow_user_num =", value, "dowUserNum");
            return (Criteria) this;
        }

        public Criteria andDowUserNumNotEqualTo(Integer value) {
            addCriterion("dow_user_num <>", value, "dowUserNum");
            return (Criteria) this;
        }

        public Criteria andDowUserNumGreaterThan(Integer value) {
            addCriterion("dow_user_num >", value, "dowUserNum");
            return (Criteria) this;
        }

        public Criteria andDowUserNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("dow_user_num >=", value, "dowUserNum");
            return (Criteria) this;
        }

        public Criteria andDowUserNumLessThan(Integer value) {
            addCriterion("dow_user_num <", value, "dowUserNum");
            return (Criteria) this;
        }

        public Criteria andDowUserNumLessThanOrEqualTo(Integer value) {
            addCriterion("dow_user_num <=", value, "dowUserNum");
            return (Criteria) this;
        }

        public Criteria andDowUserNumIn(List<Integer> values) {
            addCriterion("dow_user_num in", values, "dowUserNum");
            return (Criteria) this;
        }

        public Criteria andDowUserNumNotIn(List<Integer> values) {
            addCriterion("dow_user_num not in", values, "dowUserNum");
            return (Criteria) this;
        }

        public Criteria andDowUserNumBetween(Integer value1, Integer value2) {
            addCriterion("dow_user_num between", value1, value2, "dowUserNum");
            return (Criteria) this;
        }

        public Criteria andDowUserNumNotBetween(Integer value1, Integer value2) {
            addCriterion("dow_user_num not between", value1, value2, "dowUserNum");
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