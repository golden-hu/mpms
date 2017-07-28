package com.maopao.entity.log;

import java.util.ArrayList;
import java.util.List;

public class WebRedirectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;



    private Integer limit;

    private Integer offset;

    public WebRedirectExample() {
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

        public Criteria andWebIdIsNull() {
            addCriterion("web_id is null");
            return (Criteria) this;
        }

        public Criteria andWebIdIsNotNull() {
            addCriterion("web_id is not null");
            return (Criteria) this;
        }

        public Criteria andWebIdEqualTo(Integer value) {
            addCriterion("web_id =", value, "webId");
            return (Criteria) this;
        }

        public Criteria andWebIdNotEqualTo(Integer value) {
            addCriterion("web_id <>", value, "webId");
            return (Criteria) this;
        }

        public Criteria andWebIdGreaterThan(Integer value) {
            addCriterion("web_id >", value, "webId");
            return (Criteria) this;
        }

        public Criteria andWebIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("web_id >=", value, "webId");
            return (Criteria) this;
        }

        public Criteria andWebIdLessThan(Integer value) {
            addCriterion("web_id <", value, "webId");
            return (Criteria) this;
        }

        public Criteria andWebIdLessThanOrEqualTo(Integer value) {
            addCriterion("web_id <=", value, "webId");
            return (Criteria) this;
        }

        public Criteria andWebIdIn(List<Integer> values) {
            addCriterion("web_id in", values, "webId");
            return (Criteria) this;
        }

        public Criteria andWebIdNotIn(List<Integer> values) {
            addCriterion("web_id not in", values, "webId");
            return (Criteria) this;
        }

        public Criteria andWebIdBetween(Integer value1, Integer value2) {
            addCriterion("web_id between", value1, value2, "webId");
            return (Criteria) this;
        }

        public Criteria andWebIdNotBetween(Integer value1, Integer value2) {
            addCriterion("web_id not between", value1, value2, "webId");
            return (Criteria) this;
        }

        public Criteria andWebKeyIsNull() {
            addCriterion("web_key is null");
            return (Criteria) this;
        }

        public Criteria andWebKeyIsNotNull() {
            addCriterion("web_key is not null");
            return (Criteria) this;
        }

        public Criteria andWebKeyEqualTo(String value) {
            addCriterion("web_key =", value, "webKey");
            return (Criteria) this;
        }

        public Criteria andWebKeyNotEqualTo(String value) {
            addCriterion("web_key <>", value, "webKey");
            return (Criteria) this;
        }

        public Criteria andWebKeyGreaterThan(String value) {
            addCriterion("web_key >", value, "webKey");
            return (Criteria) this;
        }

        public Criteria andWebKeyGreaterThanOrEqualTo(String value) {
            addCriterion("web_key >=", value, "webKey");
            return (Criteria) this;
        }

        public Criteria andWebKeyLessThan(String value) {
            addCriterion("web_key <", value, "webKey");
            return (Criteria) this;
        }

        public Criteria andWebKeyLessThanOrEqualTo(String value) {
            addCriterion("web_key <=", value, "webKey");
            return (Criteria) this;
        }

        public Criteria andWebKeyLike(String value) {
            addCriterion("web_key like", value, "webKey");
            return (Criteria) this;
        }

        public Criteria andWebKeyNotLike(String value) {
            addCriterion("web_key not like", value, "webKey");
            return (Criteria) this;
        }

        public Criteria andWebKeyIn(List<String> values) {
            addCriterion("web_key in", values, "webKey");
            return (Criteria) this;
        }

        public Criteria andWebKeyNotIn(List<String> values) {
            addCriterion("web_key not in", values, "webKey");
            return (Criteria) this;
        }

        public Criteria andWebKeyBetween(String value1, String value2) {
            addCriterion("web_key between", value1, value2, "webKey");
            return (Criteria) this;
        }

        public Criteria andWebKeyNotBetween(String value1, String value2) {
            addCriterion("web_key not between", value1, value2, "webKey");
            return (Criteria) this;
        }

        public Criteria andWebValIsNull() {
            addCriterion("web_val is null");
            return (Criteria) this;
        }

        public Criteria andWebValIsNotNull() {
            addCriterion("web_val is not null");
            return (Criteria) this;
        }

        public Criteria andWebValEqualTo(String value) {
            addCriterion("web_val =", value, "webVal");
            return (Criteria) this;
        }

        public Criteria andWebValNotEqualTo(String value) {
            addCriterion("web_val <>", value, "webVal");
            return (Criteria) this;
        }

        public Criteria andWebValGreaterThan(String value) {
            addCriterion("web_val >", value, "webVal");
            return (Criteria) this;
        }

        public Criteria andWebValGreaterThanOrEqualTo(String value) {
            addCriterion("web_val >=", value, "webVal");
            return (Criteria) this;
        }

        public Criteria andWebValLessThan(String value) {
            addCriterion("web_val <", value, "webVal");
            return (Criteria) this;
        }

        public Criteria andWebValLessThanOrEqualTo(String value) {
            addCriterion("web_val <=", value, "webVal");
            return (Criteria) this;
        }

        public Criteria andWebValLike(String value) {
            addCriterion("web_val like", value, "webVal");
            return (Criteria) this;
        }

        public Criteria andWebValNotLike(String value) {
            addCriterion("web_val not like", value, "webVal");
            return (Criteria) this;
        }

        public Criteria andWebValIn(List<String> values) {
            addCriterion("web_val in", values, "webVal");
            return (Criteria) this;
        }

        public Criteria andWebValNotIn(List<String> values) {
            addCriterion("web_val not in", values, "webVal");
            return (Criteria) this;
        }

        public Criteria andWebValBetween(String value1, String value2) {
            addCriterion("web_val between", value1, value2, "webVal");
            return (Criteria) this;
        }

        public Criteria andWebValNotBetween(String value1, String value2) {
            addCriterion("web_val not between", value1, value2, "webVal");
            return (Criteria) this;
        }

        public Criteria andWebCountIsNull() {
            addCriterion("web_count is null");
            return (Criteria) this;
        }

        public Criteria andWebCountIsNotNull() {
            addCriterion("web_count is not null");
            return (Criteria) this;
        }

        public Criteria andWebCountEqualTo(Long value) {
            addCriterion("web_count =", value, "webCount");
            return (Criteria) this;
        }

        public Criteria andWebCountNotEqualTo(Long value) {
            addCriterion("web_count <>", value, "webCount");
            return (Criteria) this;
        }

        public Criteria andWebCountGreaterThan(Long value) {
            addCriterion("web_count >", value, "webCount");
            return (Criteria) this;
        }

        public Criteria andWebCountGreaterThanOrEqualTo(Long value) {
            addCriterion("web_count >=", value, "webCount");
            return (Criteria) this;
        }

        public Criteria andWebCountLessThan(Long value) {
            addCriterion("web_count <", value, "webCount");
            return (Criteria) this;
        }

        public Criteria andWebCountLessThanOrEqualTo(Long value) {
            addCriterion("web_count <=", value, "webCount");
            return (Criteria) this;
        }

        public Criteria andWebCountIn(List<Long> values) {
            addCriterion("web_count in", values, "webCount");
            return (Criteria) this;
        }

        public Criteria andWebCountNotIn(List<Long> values) {
            addCriterion("web_count not in", values, "webCount");
            return (Criteria) this;
        }

        public Criteria andWebCountBetween(Long value1, Long value2) {
            addCriterion("web_count between", value1, value2, "webCount");
            return (Criteria) this;
        }

        public Criteria andWebCountNotBetween(Long value1, Long value2) {
            addCriterion("web_count not between", value1, value2, "webCount");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
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