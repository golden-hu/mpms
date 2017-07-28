package com.maopao.entity.bcf;

import java.util.ArrayList;
import java.util.List;

public class BcfOpsxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;



    private Integer limit;

    private Integer offset;

    public BcfOpsxExample() {
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

        public Criteria andTagsIsNull() {
            addCriterion("Tags is null");
            return (Criteria) this;
        }

        public Criteria andTagsIsNotNull() {
            addCriterion("Tags is not null");
            return (Criteria) this;
        }

        public Criteria andTagsEqualTo(String value) {
            addCriterion("Tags =", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotEqualTo(String value) {
            addCriterion("Tags <>", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThan(String value) {
            addCriterion("Tags >", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThanOrEqualTo(String value) {
            addCriterion("Tags >=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThan(String value) {
            addCriterion("Tags <", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThanOrEqualTo(String value) {
            addCriterion("Tags <=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLike(String value) {
            addCriterion("Tags like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotLike(String value) {
            addCriterion("Tags not like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsIn(List<String> values) {
            addCriterion("Tags in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotIn(List<String> values) {
            addCriterion("Tags not in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsBetween(String value1, String value2) {
            addCriterion("Tags between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotBetween(String value1, String value2) {
            addCriterion("Tags not between", value1, value2, "tags");
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