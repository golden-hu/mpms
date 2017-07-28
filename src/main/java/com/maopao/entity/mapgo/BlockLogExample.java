package com.maopao.entity.mapgo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlockLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;



    private Integer limit;

    private Integer offset;

    public BlockLogExample() {
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

        public Criteria andBlockReasonIsNull() {
            addCriterion("block_reason is null");
            return (Criteria) this;
        }

        public Criteria andBlockReasonIsNotNull() {
            addCriterion("block_reason is not null");
            return (Criteria) this;
        }

        public Criteria andBlockReasonEqualTo(Integer value) {
            addCriterion("block_reason =", value, "blockReason");
            return (Criteria) this;
        }

        public Criteria andBlockReasonNotEqualTo(Integer value) {
            addCriterion("block_reason <>", value, "blockReason");
            return (Criteria) this;
        }

        public Criteria andBlockReasonGreaterThan(Integer value) {
            addCriterion("block_reason >", value, "blockReason");
            return (Criteria) this;
        }

        public Criteria andBlockReasonGreaterThanOrEqualTo(Integer value) {
            addCriterion("block_reason >=", value, "blockReason");
            return (Criteria) this;
        }

        public Criteria andBlockReasonLessThan(Integer value) {
            addCriterion("block_reason <", value, "blockReason");
            return (Criteria) this;
        }

        public Criteria andBlockReasonLessThanOrEqualTo(Integer value) {
            addCriterion("block_reason <=", value, "blockReason");
            return (Criteria) this;
        }

        public Criteria andBlockReasonIn(List<Integer> values) {
            addCriterion("block_reason in", values, "blockReason");
            return (Criteria) this;
        }

        public Criteria andBlockReasonNotIn(List<Integer> values) {
            addCriterion("block_reason not in", values, "blockReason");
            return (Criteria) this;
        }

        public Criteria andBlockReasonBetween(Integer value1, Integer value2) {
            addCriterion("block_reason between", value1, value2, "blockReason");
            return (Criteria) this;
        }

        public Criteria andBlockReasonNotBetween(Integer value1, Integer value2) {
            addCriterion("block_reason not between", value1, value2, "blockReason");
            return (Criteria) this;
        }

        public Criteria andBlockStimeIsNull() {
            addCriterion("block_stime is null");
            return (Criteria) this;
        }

        public Criteria andBlockStimeIsNotNull() {
            addCriterion("block_stime is not null");
            return (Criteria) this;
        }

        public Criteria andBlockStimeEqualTo(Date value) {
            addCriterion("block_stime =", value, "blockStime");
            return (Criteria) this;
        }

        public Criteria andBlockStimeNotEqualTo(Date value) {
            addCriterion("block_stime <>", value, "blockStime");
            return (Criteria) this;
        }

        public Criteria andBlockStimeGreaterThan(Date value) {
            addCriterion("block_stime >", value, "blockStime");
            return (Criteria) this;
        }

        public Criteria andBlockStimeGreaterThanOrEqualTo(Date value) {
            addCriterion("block_stime >=", value, "blockStime");
            return (Criteria) this;
        }

        public Criteria andBlockStimeLessThan(Date value) {
            addCriterion("block_stime <", value, "blockStime");
            return (Criteria) this;
        }

        public Criteria andBlockStimeLessThanOrEqualTo(Date value) {
            addCriterion("block_stime <=", value, "blockStime");
            return (Criteria) this;
        }

        public Criteria andBlockStimeIn(List<Date> values) {
            addCriterion("block_stime in", values, "blockStime");
            return (Criteria) this;
        }

        public Criteria andBlockStimeNotIn(List<Date> values) {
            addCriterion("block_stime not in", values, "blockStime");
            return (Criteria) this;
        }

        public Criteria andBlockStimeBetween(Date value1, Date value2) {
            addCriterion("block_stime between", value1, value2, "blockStime");
            return (Criteria) this;
        }

        public Criteria andBlockStimeNotBetween(Date value1, Date value2) {
            addCriterion("block_stime not between", value1, value2, "blockStime");
            return (Criteria) this;
        }

        public Criteria andBlockEtimeIsNull() {
            addCriterion("block_etime is null");
            return (Criteria) this;
        }

        public Criteria andBlockEtimeIsNotNull() {
            addCriterion("block_etime is not null");
            return (Criteria) this;
        }

        public Criteria andBlockEtimeEqualTo(Date value) {
            addCriterion("block_etime =", value, "blockEtime");
            return (Criteria) this;
        }

        public Criteria andBlockEtimeNotEqualTo(Date value) {
            addCriterion("block_etime <>", value, "blockEtime");
            return (Criteria) this;
        }

        public Criteria andBlockEtimeGreaterThan(Date value) {
            addCriterion("block_etime >", value, "blockEtime");
            return (Criteria) this;
        }

        public Criteria andBlockEtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("block_etime >=", value, "blockEtime");
            return (Criteria) this;
        }

        public Criteria andBlockEtimeLessThan(Date value) {
            addCriterion("block_etime <", value, "blockEtime");
            return (Criteria) this;
        }

        public Criteria andBlockEtimeLessThanOrEqualTo(Date value) {
            addCriterion("block_etime <=", value, "blockEtime");
            return (Criteria) this;
        }

        public Criteria andBlockEtimeIn(List<Date> values) {
            addCriterion("block_etime in", values, "blockEtime");
            return (Criteria) this;
        }

        public Criteria andBlockEtimeNotIn(List<Date> values) {
            addCriterion("block_etime not in", values, "blockEtime");
            return (Criteria) this;
        }

        public Criteria andBlockEtimeBetween(Date value1, Date value2) {
            addCriterion("block_etime between", value1, value2, "blockEtime");
            return (Criteria) this;
        }

        public Criteria andBlockEtimeNotBetween(Date value1, Date value2) {
            addCriterion("block_etime not between", value1, value2, "blockEtime");
            return (Criteria) this;
        }

        public Criteria andLogTimeIsNull() {
            addCriterion("log_time is null");
            return (Criteria) this;
        }

        public Criteria andLogTimeIsNotNull() {
            addCriterion("log_time is not null");
            return (Criteria) this;
        }

        public Criteria andLogTimeEqualTo(Date value) {
            addCriterion("log_time =", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotEqualTo(Date value) {
            addCriterion("log_time <>", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeGreaterThan(Date value) {
            addCriterion("log_time >", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("log_time >=", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeLessThan(Date value) {
            addCriterion("log_time <", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeLessThanOrEqualTo(Date value) {
            addCriterion("log_time <=", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeIn(List<Date> values) {
            addCriterion("log_time in", values, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotIn(List<Date> values) {
            addCriterion("log_time not in", values, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeBetween(Date value1, Date value2) {
            addCriterion("log_time between", value1, value2, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotBetween(Date value1, Date value2) {
            addCriterion("log_time not between", value1, value2, "logTime");
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