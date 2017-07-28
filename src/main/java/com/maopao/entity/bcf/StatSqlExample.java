package com.maopao.entity.bcf;

import java.util.ArrayList;
import java.util.List;

public class StatSqlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;



    private Integer limit;

    private Integer offset;

    public StatSqlExample() {
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

        public Criteria andRowIdEqualTo(Integer value) {
            addCriterion("row_id =", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdNotEqualTo(Integer value) {
            addCriterion("row_id <>", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdGreaterThan(Integer value) {
            addCriterion("row_id >", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("row_id >=", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdLessThan(Integer value) {
            addCriterion("row_id <", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdLessThanOrEqualTo(Integer value) {
            addCriterion("row_id <=", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdIn(List<Integer> values) {
            addCriterion("row_id in", values, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdNotIn(List<Integer> values) {
            addCriterion("row_id not in", values, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdBetween(Integer value1, Integer value2) {
            addCriterion("row_id between", value1, value2, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andDbIsNull() {
            addCriterion("db is null");
            return (Criteria) this;
        }

        public Criteria andDbIsNotNull() {
            addCriterion("db is not null");
            return (Criteria) this;
        }

        public Criteria andDbEqualTo(String value) {
            addCriterion("db =", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotEqualTo(String value) {
            addCriterion("db <>", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbGreaterThan(String value) {
            addCriterion("db >", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbGreaterThanOrEqualTo(String value) {
            addCriterion("db >=", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLessThan(String value) {
            addCriterion("db <", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLessThanOrEqualTo(String value) {
            addCriterion("db <=", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLike(String value) {
            addCriterion("db like", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotLike(String value) {
            addCriterion("db not like", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbIn(List<String> values) {
            addCriterion("db in", values, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotIn(List<String> values) {
            addCriterion("db not in", values, "db");
            return (Criteria) this;
        }

        public Criteria andDbBetween(String value1, String value2) {
            addCriterion("db between", value1, value2, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotBetween(String value1, String value2) {
            addCriterion("db not between", value1, value2, "db");
            return (Criteria) this;
        }

        public Criteria andDefinitionIsNull() {
            addCriterion("definition is null");
            return (Criteria) this;
        }

        public Criteria andDefinitionIsNotNull() {
            addCriterion("definition is not null");
            return (Criteria) this;
        }

        public Criteria andDefinitionEqualTo(String value) {
            addCriterion("definition =", value, "definition");
            return (Criteria) this;
        }

        public Criteria andDefinitionNotEqualTo(String value) {
            addCriterion("definition <>", value, "definition");
            return (Criteria) this;
        }

        public Criteria andDefinitionGreaterThan(String value) {
            addCriterion("definition >", value, "definition");
            return (Criteria) this;
        }

        public Criteria andDefinitionGreaterThanOrEqualTo(String value) {
            addCriterion("definition >=", value, "definition");
            return (Criteria) this;
        }

        public Criteria andDefinitionLessThan(String value) {
            addCriterion("definition <", value, "definition");
            return (Criteria) this;
        }

        public Criteria andDefinitionLessThanOrEqualTo(String value) {
            addCriterion("definition <=", value, "definition");
            return (Criteria) this;
        }

        public Criteria andDefinitionLike(String value) {
            addCriterion("definition like", value, "definition");
            return (Criteria) this;
        }

        public Criteria andDefinitionNotLike(String value) {
            addCriterion("definition not like", value, "definition");
            return (Criteria) this;
        }

        public Criteria andDefinitionIn(List<String> values) {
            addCriterion("definition in", values, "definition");
            return (Criteria) this;
        }

        public Criteria andDefinitionNotIn(List<String> values) {
            addCriterion("definition not in", values, "definition");
            return (Criteria) this;
        }

        public Criteria andDefinitionBetween(String value1, String value2) {
            addCriterion("definition between", value1, value2, "definition");
            return (Criteria) this;
        }

        public Criteria andDefinitionNotBetween(String value1, String value2) {
            addCriterion("definition not between", value1, value2, "definition");
            return (Criteria) this;
        }

        public Criteria andSqlcodeIsNull() {
            addCriterion("sqlcode is null");
            return (Criteria) this;
        }

        public Criteria andSqlcodeIsNotNull() {
            addCriterion("sqlcode is not null");
            return (Criteria) this;
        }

        public Criteria andSqlcodeEqualTo(String value) {
            addCriterion("sqlcode =", value, "sqlcode");
            return (Criteria) this;
        }

        public Criteria andSqlcodeNotEqualTo(String value) {
            addCriterion("sqlcode <>", value, "sqlcode");
            return (Criteria) this;
        }

        public Criteria andSqlcodeGreaterThan(String value) {
            addCriterion("sqlcode >", value, "sqlcode");
            return (Criteria) this;
        }

        public Criteria andSqlcodeGreaterThanOrEqualTo(String value) {
            addCriterion("sqlcode >=", value, "sqlcode");
            return (Criteria) this;
        }

        public Criteria andSqlcodeLessThan(String value) {
            addCriterion("sqlcode <", value, "sqlcode");
            return (Criteria) this;
        }

        public Criteria andSqlcodeLessThanOrEqualTo(String value) {
            addCriterion("sqlcode <=", value, "sqlcode");
            return (Criteria) this;
        }

        public Criteria andSqlcodeLike(String value) {
            addCriterion("sqlcode like", value, "sqlcode");
            return (Criteria) this;
        }

        public Criteria andSqlcodeNotLike(String value) {
            addCriterion("sqlcode not like", value, "sqlcode");
            return (Criteria) this;
        }

        public Criteria andSqlcodeIn(List<String> values) {
            addCriterion("sqlcode in", values, "sqlcode");
            return (Criteria) this;
        }

        public Criteria andSqlcodeNotIn(List<String> values) {
            addCriterion("sqlcode not in", values, "sqlcode");
            return (Criteria) this;
        }

        public Criteria andSqlcodeBetween(String value1, String value2) {
            addCriterion("sqlcode between", value1, value2, "sqlcode");
            return (Criteria) this;
        }

        public Criteria andSqlcodeNotBetween(String value1, String value2) {
            addCriterion("sqlcode not between", value1, value2, "sqlcode");
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