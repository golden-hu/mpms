package com.maopao.entity.log;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogApiError30dExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;



    private Integer limit;

    private Integer offset;

    public LogApiError30dExample() {
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

        public Criteria andRowIdEqualTo(Long value) {
            addCriterion("row_id =", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdNotEqualTo(Long value) {
            addCriterion("row_id <>", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdGreaterThan(Long value) {
            addCriterion("row_id >", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdGreaterThanOrEqualTo(Long value) {
            addCriterion("row_id >=", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdLessThan(Long value) {
            addCriterion("row_id <", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdLessThanOrEqualTo(Long value) {
            addCriterion("row_id <=", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdIn(List<Long> values) {
            addCriterion("row_id in", values, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdNotIn(List<Long> values) {
            addCriterion("row_id not in", values, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdBetween(Long value1, Long value2) {
            addCriterion("row_id between", value1, value2, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdNotBetween(Long value1, Long value2) {
            addCriterion("row_id not between", value1, value2, "rowId");
            return (Criteria) this;
        }

        public Criteria andCmdIsNull() {
            addCriterion("cmd is null");
            return (Criteria) this;
        }

        public Criteria andCmdIsNotNull() {
            addCriterion("cmd is not null");
            return (Criteria) this;
        }

        public Criteria andCmdEqualTo(String value) {
            addCriterion("cmd =", value, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdNotEqualTo(String value) {
            addCriterion("cmd <>", value, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdGreaterThan(String value) {
            addCriterion("cmd >", value, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdGreaterThanOrEqualTo(String value) {
            addCriterion("cmd >=", value, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdLessThan(String value) {
            addCriterion("cmd <", value, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdLessThanOrEqualTo(String value) {
            addCriterion("cmd <=", value, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdLike(String value) {
            addCriterion("cmd like", value, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdNotLike(String value) {
            addCriterion("cmd not like", value, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdIn(List<String> values) {
            addCriterion("cmd in", values, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdNotIn(List<String> values) {
            addCriterion("cmd not in", values, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdBetween(String value1, String value2) {
            addCriterion("cmd between", value1, value2, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdNotBetween(String value1, String value2) {
            addCriterion("cmd not between", value1, value2, "cmd");
            return (Criteria) this;
        }

        public Criteria andArgIsNull() {
            addCriterion("arg is null");
            return (Criteria) this;
        }

        public Criteria andArgIsNotNull() {
            addCriterion("arg is not null");
            return (Criteria) this;
        }

        public Criteria andArgEqualTo(String value) {
            addCriterion("arg =", value, "arg");
            return (Criteria) this;
        }

        public Criteria andArgNotEqualTo(String value) {
            addCriterion("arg <>", value, "arg");
            return (Criteria) this;
        }

        public Criteria andArgGreaterThan(String value) {
            addCriterion("arg >", value, "arg");
            return (Criteria) this;
        }

        public Criteria andArgGreaterThanOrEqualTo(String value) {
            addCriterion("arg >=", value, "arg");
            return (Criteria) this;
        }

        public Criteria andArgLessThan(String value) {
            addCriterion("arg <", value, "arg");
            return (Criteria) this;
        }

        public Criteria andArgLessThanOrEqualTo(String value) {
            addCriterion("arg <=", value, "arg");
            return (Criteria) this;
        }

        public Criteria andArgLike(String value) {
            addCriterion("arg like", value, "arg");
            return (Criteria) this;
        }

        public Criteria andArgNotLike(String value) {
            addCriterion("arg not like", value, "arg");
            return (Criteria) this;
        }

        public Criteria andArgIn(List<String> values) {
            addCriterion("arg in", values, "arg");
            return (Criteria) this;
        }

        public Criteria andArgNotIn(List<String> values) {
            addCriterion("arg not in", values, "arg");
            return (Criteria) this;
        }

        public Criteria andArgBetween(String value1, String value2) {
            addCriterion("arg between", value1, value2, "arg");
            return (Criteria) this;
        }

        public Criteria andArgNotBetween(String value1, String value2) {
            addCriterion("arg not between", value1, value2, "arg");
            return (Criteria) this;
        }

        public Criteria andTxtIsNull() {
            addCriterion("txt is null");
            return (Criteria) this;
        }

        public Criteria andTxtIsNotNull() {
            addCriterion("txt is not null");
            return (Criteria) this;
        }

        public Criteria andTxtEqualTo(String value) {
            addCriterion("txt =", value, "txt");
            return (Criteria) this;
        }

        public Criteria andTxtNotEqualTo(String value) {
            addCriterion("txt <>", value, "txt");
            return (Criteria) this;
        }

        public Criteria andTxtGreaterThan(String value) {
            addCriterion("txt >", value, "txt");
            return (Criteria) this;
        }

        public Criteria andTxtGreaterThanOrEqualTo(String value) {
            addCriterion("txt >=", value, "txt");
            return (Criteria) this;
        }

        public Criteria andTxtLessThan(String value) {
            addCriterion("txt <", value, "txt");
            return (Criteria) this;
        }

        public Criteria andTxtLessThanOrEqualTo(String value) {
            addCriterion("txt <=", value, "txt");
            return (Criteria) this;
        }

        public Criteria andTxtLike(String value) {
            addCriterion("txt like", value, "txt");
            return (Criteria) this;
        }

        public Criteria andTxtNotLike(String value) {
            addCriterion("txt not like", value, "txt");
            return (Criteria) this;
        }

        public Criteria andTxtIn(List<String> values) {
            addCriterion("txt in", values, "txt");
            return (Criteria) this;
        }

        public Criteria andTxtNotIn(List<String> values) {
            addCriterion("txt not in", values, "txt");
            return (Criteria) this;
        }

        public Criteria andTxtBetween(String value1, String value2) {
            addCriterion("txt between", value1, value2, "txt");
            return (Criteria) this;
        }

        public Criteria andTxtNotBetween(String value1, String value2) {
            addCriterion("txt not between", value1, value2, "txt");
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

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(Integer value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(Integer value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(Integer value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(Integer value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(Integer value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<Integer> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<Integer> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(Integer value1, Integer value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(Integer value1, Integer value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppVerIsNull() {
            addCriterion("app_ver is null");
            return (Criteria) this;
        }

        public Criteria andAppVerIsNotNull() {
            addCriterion("app_ver is not null");
            return (Criteria) this;
        }

        public Criteria andAppVerEqualTo(Integer value) {
            addCriterion("app_ver =", value, "appVer");
            return (Criteria) this;
        }

        public Criteria andAppVerNotEqualTo(Integer value) {
            addCriterion("app_ver <>", value, "appVer");
            return (Criteria) this;
        }

        public Criteria andAppVerGreaterThan(Integer value) {
            addCriterion("app_ver >", value, "appVer");
            return (Criteria) this;
        }

        public Criteria andAppVerGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_ver >=", value, "appVer");
            return (Criteria) this;
        }

        public Criteria andAppVerLessThan(Integer value) {
            addCriterion("app_ver <", value, "appVer");
            return (Criteria) this;
        }

        public Criteria andAppVerLessThanOrEqualTo(Integer value) {
            addCriterion("app_ver <=", value, "appVer");
            return (Criteria) this;
        }

        public Criteria andAppVerIn(List<Integer> values) {
            addCriterion("app_ver in", values, "appVer");
            return (Criteria) this;
        }

        public Criteria andAppVerNotIn(List<Integer> values) {
            addCriterion("app_ver not in", values, "appVer");
            return (Criteria) this;
        }

        public Criteria andAppVerBetween(Integer value1, Integer value2) {
            addCriterion("app_ver between", value1, value2, "appVer");
            return (Criteria) this;
        }

        public Criteria andAppVerNotBetween(Integer value1, Integer value2) {
            addCriterion("app_ver not between", value1, value2, "appVer");
            return (Criteria) this;
        }

        public Criteria andLogFulltimeIsNull() {
            addCriterion("log_fulltime is null");
            return (Criteria) this;
        }

        public Criteria andLogFulltimeIsNotNull() {
            addCriterion("log_fulltime is not null");
            return (Criteria) this;
        }

        public Criteria andLogFulltimeEqualTo(Date value) {
            addCriterion("log_fulltime =", value, "logFulltime");
            return (Criteria) this;
        }

        public Criteria andLogFulltimeNotEqualTo(Date value) {
            addCriterion("log_fulltime <>", value, "logFulltime");
            return (Criteria) this;
        }

        public Criteria andLogFulltimeGreaterThan(Date value) {
            addCriterion("log_fulltime >", value, "logFulltime");
            return (Criteria) this;
        }

        public Criteria andLogFulltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("log_fulltime >=", value, "logFulltime");
            return (Criteria) this;
        }

        public Criteria andLogFulltimeLessThan(Date value) {
            addCriterion("log_fulltime <", value, "logFulltime");
            return (Criteria) this;
        }

        public Criteria andLogFulltimeLessThanOrEqualTo(Date value) {
            addCriterion("log_fulltime <=", value, "logFulltime");
            return (Criteria) this;
        }

        public Criteria andLogFulltimeIn(List<Date> values) {
            addCriterion("log_fulltime in", values, "logFulltime");
            return (Criteria) this;
        }

        public Criteria andLogFulltimeNotIn(List<Date> values) {
            addCriterion("log_fulltime not in", values, "logFulltime");
            return (Criteria) this;
        }

        public Criteria andLogFulltimeBetween(Date value1, Date value2) {
            addCriterion("log_fulltime between", value1, value2, "logFulltime");
            return (Criteria) this;
        }

        public Criteria andLogFulltimeNotBetween(Date value1, Date value2) {
            addCriterion("log_fulltime not between", value1, value2, "logFulltime");
            return (Criteria) this;
        }

        public Criteria andLogDateIsNull() {
            addCriterion("log_date is null");
            return (Criteria) this;
        }

        public Criteria andLogDateIsNotNull() {
            addCriterion("log_date is not null");
            return (Criteria) this;
        }

        public Criteria andLogDateEqualTo(Integer value) {
            addCriterion("log_date =", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateNotEqualTo(Integer value) {
            addCriterion("log_date <>", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateGreaterThan(Integer value) {
            addCriterion("log_date >", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_date >=", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateLessThan(Integer value) {
            addCriterion("log_date <", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateLessThanOrEqualTo(Integer value) {
            addCriterion("log_date <=", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateIn(List<Integer> values) {
            addCriterion("log_date in", values, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateNotIn(List<Integer> values) {
            addCriterion("log_date not in", values, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateBetween(Integer value1, Integer value2) {
            addCriterion("log_date between", value1, value2, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateNotBetween(Integer value1, Integer value2) {
            addCriterion("log_date not between", value1, value2, "logDate");
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