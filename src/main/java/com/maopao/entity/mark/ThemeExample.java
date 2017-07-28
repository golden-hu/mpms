package com.maopao.entity.mark;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ThemeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;



    private Integer limit;

    private Integer offset;

    public ThemeExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
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

        public Criteria andPlantIsNull() {
            addCriterion("plant is null");
            return (Criteria) this;
        }

        public Criteria andPlantIsNotNull() {
            addCriterion("plant is not null");
            return (Criteria) this;
        }

        public Criteria andPlantEqualTo(Integer value) {
            addCriterion("plant =", value, "plant");
            return (Criteria) this;
        }

        public Criteria andPlantNotEqualTo(Integer value) {
            addCriterion("plant <>", value, "plant");
            return (Criteria) this;
        }

        public Criteria andPlantGreaterThan(Integer value) {
            addCriterion("plant >", value, "plant");
            return (Criteria) this;
        }

        public Criteria andPlantGreaterThanOrEqualTo(Integer value) {
            addCriterion("plant >=", value, "plant");
            return (Criteria) this;
        }

        public Criteria andPlantLessThan(Integer value) {
            addCriterion("plant <", value, "plant");
            return (Criteria) this;
        }

        public Criteria andPlantLessThanOrEqualTo(Integer value) {
            addCriterion("plant <=", value, "plant");
            return (Criteria) this;
        }

        public Criteria andPlantIn(List<Integer> values) {
            addCriterion("plant in", values, "plant");
            return (Criteria) this;
        }

        public Criteria andPlantNotIn(List<Integer> values) {
            addCriterion("plant not in", values, "plant");
            return (Criteria) this;
        }

        public Criteria andPlantBetween(Integer value1, Integer value2) {
            addCriterion("plant between", value1, value2, "plant");
            return (Criteria) this;
        }

        public Criteria andPlantNotBetween(Integer value1, Integer value2) {
            addCriterion("plant not between", value1, value2, "plant");
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