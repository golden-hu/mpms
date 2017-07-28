package com.maopao.entity.mapgo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserStateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;



    private Integer limit;

    private Integer offset;

    public UserStateExample() {
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

        public Criteria andLastUdidIsNull() {
            addCriterion("last_udid is null");
            return (Criteria) this;
        }

        public Criteria andLastUdidIsNotNull() {
            addCriterion("last_udid is not null");
            return (Criteria) this;
        }

        public Criteria andLastUdidEqualTo(String value) {
            addCriterion("last_udid =", value, "lastUdid");
            return (Criteria) this;
        }

        public Criteria andLastUdidNotEqualTo(String value) {
            addCriterion("last_udid <>", value, "lastUdid");
            return (Criteria) this;
        }

        public Criteria andLastUdidGreaterThan(String value) {
            addCriterion("last_udid >", value, "lastUdid");
            return (Criteria) this;
        }

        public Criteria andLastUdidGreaterThanOrEqualTo(String value) {
            addCriterion("last_udid >=", value, "lastUdid");
            return (Criteria) this;
        }

        public Criteria andLastUdidLessThan(String value) {
            addCriterion("last_udid <", value, "lastUdid");
            return (Criteria) this;
        }

        public Criteria andLastUdidLessThanOrEqualTo(String value) {
            addCriterion("last_udid <=", value, "lastUdid");
            return (Criteria) this;
        }

        public Criteria andLastUdidLike(String value) {
            addCriterion("last_udid like", value, "lastUdid");
            return (Criteria) this;
        }

        public Criteria andLastUdidNotLike(String value) {
            addCriterion("last_udid not like", value, "lastUdid");
            return (Criteria) this;
        }

        public Criteria andLastUdidIn(List<String> values) {
            addCriterion("last_udid in", values, "lastUdid");
            return (Criteria) this;
        }

        public Criteria andLastUdidNotIn(List<String> values) {
            addCriterion("last_udid not in", values, "lastUdid");
            return (Criteria) this;
        }

        public Criteria andLastUdidBetween(String value1, String value2) {
            addCriterion("last_udid between", value1, value2, "lastUdid");
            return (Criteria) this;
        }

        public Criteria andLastUdidNotBetween(String value1, String value2) {
            addCriterion("last_udid not between", value1, value2, "lastUdid");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNull() {
            addCriterion("device_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("device_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(Integer value) {
            addCriterion("device_id =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(Integer value) {
            addCriterion("device_id <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(Integer value) {
            addCriterion("device_id >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_id >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(Integer value) {
            addCriterion("device_id <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(Integer value) {
            addCriterion("device_id <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<Integer> values) {
            addCriterion("device_id in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<Integer> values) {
            addCriterion("device_id not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(Integer value1, Integer value2) {
            addCriterion("device_id between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("device_id not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andIsBlockIsNull() {
            addCriterion("is_block is null");
            return (Criteria) this;
        }

        public Criteria andIsBlockIsNotNull() {
            addCriterion("is_block is not null");
            return (Criteria) this;
        }

        public Criteria andIsBlockEqualTo(Integer value) {
            addCriterion("is_block =", value, "isBlock");
            return (Criteria) this;
        }

        public Criteria andIsBlockNotEqualTo(Integer value) {
            addCriterion("is_block <>", value, "isBlock");
            return (Criteria) this;
        }

        public Criteria andIsBlockGreaterThan(Integer value) {
            addCriterion("is_block >", value, "isBlock");
            return (Criteria) this;
        }

        public Criteria andIsBlockGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_block >=", value, "isBlock");
            return (Criteria) this;
        }

        public Criteria andIsBlockLessThan(Integer value) {
            addCriterion("is_block <", value, "isBlock");
            return (Criteria) this;
        }

        public Criteria andIsBlockLessThanOrEqualTo(Integer value) {
            addCriterion("is_block <=", value, "isBlock");
            return (Criteria) this;
        }

        public Criteria andIsBlockIn(List<Integer> values) {
            addCriterion("is_block in", values, "isBlock");
            return (Criteria) this;
        }

        public Criteria andIsBlockNotIn(List<Integer> values) {
            addCriterion("is_block not in", values, "isBlock");
            return (Criteria) this;
        }

        public Criteria andIsBlockBetween(Integer value1, Integer value2) {
            addCriterion("is_block between", value1, value2, "isBlock");
            return (Criteria) this;
        }

        public Criteria andIsBlockNotBetween(Integer value1, Integer value2) {
            addCriterion("is_block not between", value1, value2, "isBlock");
            return (Criteria) this;
        }

        public Criteria andBlockSdateIsNull() {
            addCriterion("block_sdate is null");
            return (Criteria) this;
        }

        public Criteria andBlockSdateIsNotNull() {
            addCriterion("block_sdate is not null");
            return (Criteria) this;
        }

        public Criteria andBlockSdateEqualTo(String value) {
            addCriterion("block_sdate =", value, "blockSdate");
            return (Criteria) this;
        }

        public Criteria andBlockSdateNotEqualTo(String value) {
            addCriterion("block_sdate <>", value, "blockSdate");
            return (Criteria) this;
        }

        public Criteria andBlockSdateGreaterThan(String value) {
            addCriterion("block_sdate >", value, "blockSdate");
            return (Criteria) this;
        }

        public Criteria andBlockSdateGreaterThanOrEqualTo(String value) {
            addCriterion("block_sdate >=", value, "blockSdate");
            return (Criteria) this;
        }

        public Criteria andBlockSdateLessThan(String value) {
            addCriterion("block_sdate <", value, "blockSdate");
            return (Criteria) this;
        }

        public Criteria andBlockSdateLessThanOrEqualTo(String value) {
            addCriterion("block_sdate <=", value, "blockSdate");
            return (Criteria) this;
        }

        public Criteria andBlockSdateLike(String value) {
            addCriterion("block_sdate like", value, "blockSdate");
            return (Criteria) this;
        }

        public Criteria andBlockSdateNotLike(String value) {
            addCriterion("block_sdate not like", value, "blockSdate");
            return (Criteria) this;
        }

        public Criteria andBlockSdateIn(List<String> values) {
            addCriterion("block_sdate in", values, "blockSdate");
            return (Criteria) this;
        }

        public Criteria andBlockSdateNotIn(List<String> values) {
            addCriterion("block_sdate not in", values, "blockSdate");
            return (Criteria) this;
        }

        public Criteria andBlockSdateBetween(String value1, String value2) {
            addCriterion("block_sdate between", value1, value2, "blockSdate");
            return (Criteria) this;
        }

        public Criteria andBlockSdateNotBetween(String value1, String value2) {
            addCriterion("block_sdate not between", value1, value2, "blockSdate");
            return (Criteria) this;
        }

        public Criteria andBlockDatetimeIsNull() {
            addCriterion("block_datetime is null");
            return (Criteria) this;
        }

        public Criteria andBlockDatetimeIsNotNull() {
            addCriterion("block_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andBlockDatetimeEqualTo(Date value) {
            addCriterion("block_datetime =", value, "blockDatetime");
            return (Criteria) this;
        }

        public Criteria andBlockDatetimeNotEqualTo(Date value) {
            addCriterion("block_datetime <>", value, "blockDatetime");
            return (Criteria) this;
        }

        public Criteria andBlockDatetimeGreaterThan(Date value) {
            addCriterion("block_datetime >", value, "blockDatetime");
            return (Criteria) this;
        }

        public Criteria andBlockDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("block_datetime >=", value, "blockDatetime");
            return (Criteria) this;
        }

        public Criteria andBlockDatetimeLessThan(Date value) {
            addCriterion("block_datetime <", value, "blockDatetime");
            return (Criteria) this;
        }

        public Criteria andBlockDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("block_datetime <=", value, "blockDatetime");
            return (Criteria) this;
        }

        public Criteria andBlockDatetimeIn(List<Date> values) {
            addCriterion("block_datetime in", values, "blockDatetime");
            return (Criteria) this;
        }

        public Criteria andBlockDatetimeNotIn(List<Date> values) {
            addCriterion("block_datetime not in", values, "blockDatetime");
            return (Criteria) this;
        }

        public Criteria andBlockDatetimeBetween(Date value1, Date value2) {
            addCriterion("block_datetime between", value1, value2, "blockDatetime");
            return (Criteria) this;
        }

        public Criteria andBlockDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("block_datetime not between", value1, value2, "blockDatetime");
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

        public Criteria andBlockReasonEqualTo(String value) {
            addCriterion("block_reason =", value, "blockReason");
            return (Criteria) this;
        }

        public Criteria andBlockReasonNotEqualTo(String value) {
            addCriterion("block_reason <>", value, "blockReason");
            return (Criteria) this;
        }

        public Criteria andBlockReasonGreaterThan(String value) {
            addCriterion("block_reason >", value, "blockReason");
            return (Criteria) this;
        }

        public Criteria andBlockReasonGreaterThanOrEqualTo(String value) {
            addCriterion("block_reason >=", value, "blockReason");
            return (Criteria) this;
        }

        public Criteria andBlockReasonLessThan(String value) {
            addCriterion("block_reason <", value, "blockReason");
            return (Criteria) this;
        }

        public Criteria andBlockReasonLessThanOrEqualTo(String value) {
            addCriterion("block_reason <=", value, "blockReason");
            return (Criteria) this;
        }

        public Criteria andBlockReasonLike(String value) {
            addCriterion("block_reason like", value, "blockReason");
            return (Criteria) this;
        }

        public Criteria andBlockReasonNotLike(String value) {
            addCriterion("block_reason not like", value, "blockReason");
            return (Criteria) this;
        }

        public Criteria andBlockReasonIn(List<String> values) {
            addCriterion("block_reason in", values, "blockReason");
            return (Criteria) this;
        }

        public Criteria andBlockReasonNotIn(List<String> values) {
            addCriterion("block_reason not in", values, "blockReason");
            return (Criteria) this;
        }

        public Criteria andBlockReasonBetween(String value1, String value2) {
            addCriterion("block_reason between", value1, value2, "blockReason");
            return (Criteria) this;
        }

        public Criteria andBlockReasonNotBetween(String value1, String value2) {
            addCriterion("block_reason not between", value1, value2, "blockReason");
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