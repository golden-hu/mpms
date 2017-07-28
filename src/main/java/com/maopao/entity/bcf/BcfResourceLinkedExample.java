package com.maopao.entity.bcf;

import java.util.ArrayList;
import java.util.List;

public class BcfResourceLinkedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;



    private Integer limit;

    private Integer offset;

    public BcfResourceLinkedExample() {
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

        public Criteria andRsidIsNull() {
            addCriterion("RSID is null");
            return (Criteria) this;
        }

        public Criteria andRsidIsNotNull() {
            addCriterion("RSID is not null");
            return (Criteria) this;
        }

        public Criteria andRsidEqualTo(Integer value) {
            addCriterion("RSID =", value, "rsid");
            return (Criteria) this;
        }

        public Criteria andRsidNotEqualTo(Integer value) {
            addCriterion("RSID <>", value, "rsid");
            return (Criteria) this;
        }

        public Criteria andRsidGreaterThan(Integer value) {
            addCriterion("RSID >", value, "rsid");
            return (Criteria) this;
        }

        public Criteria andRsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RSID >=", value, "rsid");
            return (Criteria) this;
        }

        public Criteria andRsidLessThan(Integer value) {
            addCriterion("RSID <", value, "rsid");
            return (Criteria) this;
        }

        public Criteria andRsidLessThanOrEqualTo(Integer value) {
            addCriterion("RSID <=", value, "rsid");
            return (Criteria) this;
        }

        public Criteria andRsidIn(List<Integer> values) {
            addCriterion("RSID in", values, "rsid");
            return (Criteria) this;
        }

        public Criteria andRsidNotIn(List<Integer> values) {
            addCriterion("RSID not in", values, "rsid");
            return (Criteria) this;
        }

        public Criteria andRsidBetween(Integer value1, Integer value2) {
            addCriterion("RSID between", value1, value2, "rsid");
            return (Criteria) this;
        }

        public Criteria andRsidNotBetween(Integer value1, Integer value2) {
            addCriterion("RSID not between", value1, value2, "rsid");
            return (Criteria) this;
        }

        public Criteria andLkObjtIsNull() {
            addCriterion("LK_OBJT is null");
            return (Criteria) this;
        }

        public Criteria andLkObjtIsNotNull() {
            addCriterion("LK_OBJT is not null");
            return (Criteria) this;
        }

        public Criteria andLkObjtEqualTo(Integer value) {
            addCriterion("LK_OBJT =", value, "lkObjt");
            return (Criteria) this;
        }

        public Criteria andLkObjtNotEqualTo(Integer value) {
            addCriterion("LK_OBJT <>", value, "lkObjt");
            return (Criteria) this;
        }

        public Criteria andLkObjtGreaterThan(Integer value) {
            addCriterion("LK_OBJT >", value, "lkObjt");
            return (Criteria) this;
        }

        public Criteria andLkObjtGreaterThanOrEqualTo(Integer value) {
            addCriterion("LK_OBJT >=", value, "lkObjt");
            return (Criteria) this;
        }

        public Criteria andLkObjtLessThan(Integer value) {
            addCriterion("LK_OBJT <", value, "lkObjt");
            return (Criteria) this;
        }

        public Criteria andLkObjtLessThanOrEqualTo(Integer value) {
            addCriterion("LK_OBJT <=", value, "lkObjt");
            return (Criteria) this;
        }

        public Criteria andLkObjtIn(List<Integer> values) {
            addCriterion("LK_OBJT in", values, "lkObjt");
            return (Criteria) this;
        }

        public Criteria andLkObjtNotIn(List<Integer> values) {
            addCriterion("LK_OBJT not in", values, "lkObjt");
            return (Criteria) this;
        }

        public Criteria andLkObjtBetween(Integer value1, Integer value2) {
            addCriterion("LK_OBJT between", value1, value2, "lkObjt");
            return (Criteria) this;
        }

        public Criteria andLkObjtNotBetween(Integer value1, Integer value2) {
            addCriterion("LK_OBJT not between", value1, value2, "lkObjt");
            return (Criteria) this;
        }

        public Criteria andLkObjtIdIsNull() {
            addCriterion("LK_OBJT_ID is null");
            return (Criteria) this;
        }

        public Criteria andLkObjtIdIsNotNull() {
            addCriterion("LK_OBJT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLkObjtIdEqualTo(Integer value) {
            addCriterion("LK_OBJT_ID =", value, "lkObjtId");
            return (Criteria) this;
        }

        public Criteria andLkObjtIdNotEqualTo(Integer value) {
            addCriterion("LK_OBJT_ID <>", value, "lkObjtId");
            return (Criteria) this;
        }

        public Criteria andLkObjtIdGreaterThan(Integer value) {
            addCriterion("LK_OBJT_ID >", value, "lkObjtId");
            return (Criteria) this;
        }

        public Criteria andLkObjtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LK_OBJT_ID >=", value, "lkObjtId");
            return (Criteria) this;
        }

        public Criteria andLkObjtIdLessThan(Integer value) {
            addCriterion("LK_OBJT_ID <", value, "lkObjtId");
            return (Criteria) this;
        }

        public Criteria andLkObjtIdLessThanOrEqualTo(Integer value) {
            addCriterion("LK_OBJT_ID <=", value, "lkObjtId");
            return (Criteria) this;
        }

        public Criteria andLkObjtIdIn(List<Integer> values) {
            addCriterion("LK_OBJT_ID in", values, "lkObjtId");
            return (Criteria) this;
        }

        public Criteria andLkObjtIdNotIn(List<Integer> values) {
            addCriterion("LK_OBJT_ID not in", values, "lkObjtId");
            return (Criteria) this;
        }

        public Criteria andLkObjtIdBetween(Integer value1, Integer value2) {
            addCriterion("LK_OBJT_ID between", value1, value2, "lkObjtId");
            return (Criteria) this;
        }

        public Criteria andLkObjtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LK_OBJT_ID not between", value1, value2, "lkObjtId");
            return (Criteria) this;
        }

        public Criteria andLkOperateIsNull() {
            addCriterion("LK_Operate is null");
            return (Criteria) this;
        }

        public Criteria andLkOperateIsNotNull() {
            addCriterion("LK_Operate is not null");
            return (Criteria) this;
        }

        public Criteria andLkOperateEqualTo(String value) {
            addCriterion("LK_Operate =", value, "lkOperate");
            return (Criteria) this;
        }

        public Criteria andLkOperateNotEqualTo(String value) {
            addCriterion("LK_Operate <>", value, "lkOperate");
            return (Criteria) this;
        }

        public Criteria andLkOperateGreaterThan(String value) {
            addCriterion("LK_Operate >", value, "lkOperate");
            return (Criteria) this;
        }

        public Criteria andLkOperateGreaterThanOrEqualTo(String value) {
            addCriterion("LK_Operate >=", value, "lkOperate");
            return (Criteria) this;
        }

        public Criteria andLkOperateLessThan(String value) {
            addCriterion("LK_Operate <", value, "lkOperate");
            return (Criteria) this;
        }

        public Criteria andLkOperateLessThanOrEqualTo(String value) {
            addCriterion("LK_Operate <=", value, "lkOperate");
            return (Criteria) this;
        }

        public Criteria andLkOperateLike(String value) {
            addCriterion("LK_Operate like", value, "lkOperate");
            return (Criteria) this;
        }

        public Criteria andLkOperateNotLike(String value) {
            addCriterion("LK_Operate not like", value, "lkOperate");
            return (Criteria) this;
        }

        public Criteria andLkOperateIn(List<String> values) {
            addCriterion("LK_Operate in", values, "lkOperate");
            return (Criteria) this;
        }

        public Criteria andLkOperateNotIn(List<String> values) {
            addCriterion("LK_Operate not in", values, "lkOperate");
            return (Criteria) this;
        }

        public Criteria andLkOperateBetween(String value1, String value2) {
            addCriterion("LK_Operate between", value1, value2, "lkOperate");
            return (Criteria) this;
        }

        public Criteria andLkOperateNotBetween(String value1, String value2) {
            addCriterion("LK_Operate not between", value1, value2, "lkOperate");
            return (Criteria) this;
        }

        public Criteria andPExpressIsNull() {
            addCriterion("P_Express is null");
            return (Criteria) this;
        }

        public Criteria andPExpressIsNotNull() {
            addCriterion("P_Express is not null");
            return (Criteria) this;
        }

        public Criteria andPExpressEqualTo(Byte value) {
            addCriterion("P_Express =", value, "pExpress");
            return (Criteria) this;
        }

        public Criteria andPExpressNotEqualTo(Byte value) {
            addCriterion("P_Express <>", value, "pExpress");
            return (Criteria) this;
        }

        public Criteria andPExpressGreaterThan(Byte value) {
            addCriterion("P_Express >", value, "pExpress");
            return (Criteria) this;
        }

        public Criteria andPExpressGreaterThanOrEqualTo(Byte value) {
            addCriterion("P_Express >=", value, "pExpress");
            return (Criteria) this;
        }

        public Criteria andPExpressLessThan(Byte value) {
            addCriterion("P_Express <", value, "pExpress");
            return (Criteria) this;
        }

        public Criteria andPExpressLessThanOrEqualTo(Byte value) {
            addCriterion("P_Express <=", value, "pExpress");
            return (Criteria) this;
        }

        public Criteria andPExpressIn(List<Byte> values) {
            addCriterion("P_Express in", values, "pExpress");
            return (Criteria) this;
        }

        public Criteria andPExpressNotIn(List<Byte> values) {
            addCriterion("P_Express not in", values, "pExpress");
            return (Criteria) this;
        }

        public Criteria andPExpressBetween(Byte value1, Byte value2) {
            addCriterion("P_Express between", value1, value2, "pExpress");
            return (Criteria) this;
        }

        public Criteria andPExpressNotBetween(Byte value1, Byte value2) {
            addCriterion("P_Express not between", value1, value2, "pExpress");
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