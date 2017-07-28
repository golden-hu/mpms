package com.maopao.entity.bcf;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BcfGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;



    private Integer limit;

    private Integer offset;

    public BcfGroupExample() {
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

        public Criteria andPgidIsNull() {
            addCriterion("PGID is null");
            return (Criteria) this;
        }

        public Criteria andPgidIsNotNull() {
            addCriterion("PGID is not null");
            return (Criteria) this;
        }

        public Criteria andPgidEqualTo(Integer value) {
            addCriterion("PGID =", value, "pgid");
            return (Criteria) this;
        }

        public Criteria andPgidNotEqualTo(Integer value) {
            addCriterion("PGID <>", value, "pgid");
            return (Criteria) this;
        }

        public Criteria andPgidGreaterThan(Integer value) {
            addCriterion("PGID >", value, "pgid");
            return (Criteria) this;
        }

        public Criteria andPgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PGID >=", value, "pgid");
            return (Criteria) this;
        }

        public Criteria andPgidLessThan(Integer value) {
            addCriterion("PGID <", value, "pgid");
            return (Criteria) this;
        }

        public Criteria andPgidLessThanOrEqualTo(Integer value) {
            addCriterion("PGID <=", value, "pgid");
            return (Criteria) this;
        }

        public Criteria andPgidIn(List<Integer> values) {
            addCriterion("PGID in", values, "pgid");
            return (Criteria) this;
        }

        public Criteria andPgidNotIn(List<Integer> values) {
            addCriterion("PGID not in", values, "pgid");
            return (Criteria) this;
        }

        public Criteria andPgidBetween(Integer value1, Integer value2) {
            addCriterion("PGID between", value1, value2, "pgid");
            return (Criteria) this;
        }

        public Criteria andPgidNotBetween(Integer value1, Integer value2) {
            addCriterion("PGID not between", value1, value2, "pgid");
            return (Criteria) this;
        }

        public Criteria andPPgidIsNull() {
            addCriterion("P_PGID is null");
            return (Criteria) this;
        }

        public Criteria andPPgidIsNotNull() {
            addCriterion("P_PGID is not null");
            return (Criteria) this;
        }

        public Criteria andPPgidEqualTo(Integer value) {
            addCriterion("P_PGID =", value, "pPgid");
            return (Criteria) this;
        }

        public Criteria andPPgidNotEqualTo(Integer value) {
            addCriterion("P_PGID <>", value, "pPgid");
            return (Criteria) this;
        }

        public Criteria andPPgidGreaterThan(Integer value) {
            addCriterion("P_PGID >", value, "pPgid");
            return (Criteria) this;
        }

        public Criteria andPPgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("P_PGID >=", value, "pPgid");
            return (Criteria) this;
        }

        public Criteria andPPgidLessThan(Integer value) {
            addCriterion("P_PGID <", value, "pPgid");
            return (Criteria) this;
        }

        public Criteria andPPgidLessThanOrEqualTo(Integer value) {
            addCriterion("P_PGID <=", value, "pPgid");
            return (Criteria) this;
        }

        public Criteria andPPgidIn(List<Integer> values) {
            addCriterion("P_PGID in", values, "pPgid");
            return (Criteria) this;
        }

        public Criteria andPPgidNotIn(List<Integer> values) {
            addCriterion("P_PGID not in", values, "pPgid");
            return (Criteria) this;
        }

        public Criteria andPPgidBetween(Integer value1, Integer value2) {
            addCriterion("P_PGID between", value1, value2, "pPgid");
            return (Criteria) this;
        }

        public Criteria andPPgidNotBetween(Integer value1, Integer value2) {
            addCriterion("P_PGID not between", value1, value2, "pPgid");
            return (Criteria) this;
        }

        public Criteria andRPgidIsNull() {
            addCriterion("R_PGID is null");
            return (Criteria) this;
        }

        public Criteria andRPgidIsNotNull() {
            addCriterion("R_PGID is not null");
            return (Criteria) this;
        }

        public Criteria andRPgidEqualTo(Integer value) {
            addCriterion("R_PGID =", value, "rPgid");
            return (Criteria) this;
        }

        public Criteria andRPgidNotEqualTo(Integer value) {
            addCriterion("R_PGID <>", value, "rPgid");
            return (Criteria) this;
        }

        public Criteria andRPgidGreaterThan(Integer value) {
            addCriterion("R_PGID >", value, "rPgid");
            return (Criteria) this;
        }

        public Criteria andRPgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("R_PGID >=", value, "rPgid");
            return (Criteria) this;
        }

        public Criteria andRPgidLessThan(Integer value) {
            addCriterion("R_PGID <", value, "rPgid");
            return (Criteria) this;
        }

        public Criteria andRPgidLessThanOrEqualTo(Integer value) {
            addCriterion("R_PGID <=", value, "rPgid");
            return (Criteria) this;
        }

        public Criteria andRPgidIn(List<Integer> values) {
            addCriterion("R_PGID in", values, "rPgid");
            return (Criteria) this;
        }

        public Criteria andRPgidNotIn(List<Integer> values) {
            addCriterion("R_PGID not in", values, "rPgid");
            return (Criteria) this;
        }

        public Criteria andRPgidBetween(Integer value1, Integer value2) {
            addCriterion("R_PGID between", value1, value2, "rPgid");
            return (Criteria) this;
        }

        public Criteria andRPgidNotBetween(Integer value1, Integer value2) {
            addCriterion("R_PGID not between", value1, value2, "rPgid");
            return (Criteria) this;
        }

        public Criteria andPgCodeIsNull() {
            addCriterion("PG_Code is null");
            return (Criteria) this;
        }

        public Criteria andPgCodeIsNotNull() {
            addCriterion("PG_Code is not null");
            return (Criteria) this;
        }

        public Criteria andPgCodeEqualTo(String value) {
            addCriterion("PG_Code =", value, "pgCode");
            return (Criteria) this;
        }

        public Criteria andPgCodeNotEqualTo(String value) {
            addCriterion("PG_Code <>", value, "pgCode");
            return (Criteria) this;
        }

        public Criteria andPgCodeGreaterThan(String value) {
            addCriterion("PG_Code >", value, "pgCode");
            return (Criteria) this;
        }

        public Criteria andPgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PG_Code >=", value, "pgCode");
            return (Criteria) this;
        }

        public Criteria andPgCodeLessThan(String value) {
            addCriterion("PG_Code <", value, "pgCode");
            return (Criteria) this;
        }

        public Criteria andPgCodeLessThanOrEqualTo(String value) {
            addCriterion("PG_Code <=", value, "pgCode");
            return (Criteria) this;
        }

        public Criteria andPgCodeLike(String value) {
            addCriterion("PG_Code like", value, "pgCode");
            return (Criteria) this;
        }

        public Criteria andPgCodeNotLike(String value) {
            addCriterion("PG_Code not like", value, "pgCode");
            return (Criteria) this;
        }

        public Criteria andPgCodeIn(List<String> values) {
            addCriterion("PG_Code in", values, "pgCode");
            return (Criteria) this;
        }

        public Criteria andPgCodeNotIn(List<String> values) {
            addCriterion("PG_Code not in", values, "pgCode");
            return (Criteria) this;
        }

        public Criteria andPgCodeBetween(String value1, String value2) {
            addCriterion("PG_Code between", value1, value2, "pgCode");
            return (Criteria) this;
        }

        public Criteria andPgCodeNotBetween(String value1, String value2) {
            addCriterion("PG_Code not between", value1, value2, "pgCode");
            return (Criteria) this;
        }

        public Criteria andCnNameIsNull() {
            addCriterion("CN_Name is null");
            return (Criteria) this;
        }

        public Criteria andCnNameIsNotNull() {
            addCriterion("CN_Name is not null");
            return (Criteria) this;
        }

        public Criteria andCnNameEqualTo(String value) {
            addCriterion("CN_Name =", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameNotEqualTo(String value) {
            addCriterion("CN_Name <>", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameGreaterThan(String value) {
            addCriterion("CN_Name >", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameGreaterThanOrEqualTo(String value) {
            addCriterion("CN_Name >=", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameLessThan(String value) {
            addCriterion("CN_Name <", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameLessThanOrEqualTo(String value) {
            addCriterion("CN_Name <=", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameLike(String value) {
            addCriterion("CN_Name like", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameNotLike(String value) {
            addCriterion("CN_Name not like", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameIn(List<String> values) {
            addCriterion("CN_Name in", values, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameNotIn(List<String> values) {
            addCriterion("CN_Name not in", values, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameBetween(String value1, String value2) {
            addCriterion("CN_Name between", value1, value2, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameNotBetween(String value1, String value2) {
            addCriterion("CN_Name not between", value1, value2, "cnName");
            return (Criteria) this;
        }

        public Criteria andEnNameIsNull() {
            addCriterion("EN_Name is null");
            return (Criteria) this;
        }

        public Criteria andEnNameIsNotNull() {
            addCriterion("EN_Name is not null");
            return (Criteria) this;
        }

        public Criteria andEnNameEqualTo(String value) {
            addCriterion("EN_Name =", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotEqualTo(String value) {
            addCriterion("EN_Name <>", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameGreaterThan(String value) {
            addCriterion("EN_Name >", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("EN_Name >=", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLessThan(String value) {
            addCriterion("EN_Name <", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLessThanOrEqualTo(String value) {
            addCriterion("EN_Name <=", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLike(String value) {
            addCriterion("EN_Name like", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotLike(String value) {
            addCriterion("EN_Name not like", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameIn(List<String> values) {
            addCriterion("EN_Name in", values, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotIn(List<String> values) {
            addCriterion("EN_Name not in", values, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameBetween(String value1, String value2) {
            addCriterion("EN_Name between", value1, value2, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotBetween(String value1, String value2) {
            addCriterion("EN_Name not between", value1, value2, "enName");
            return (Criteria) this;
        }

        public Criteria andInLevelIsNull() {
            addCriterion("In_Level is null");
            return (Criteria) this;
        }

        public Criteria andInLevelIsNotNull() {
            addCriterion("In_Level is not null");
            return (Criteria) this;
        }

        public Criteria andInLevelEqualTo(Integer value) {
            addCriterion("In_Level =", value, "inLevel");
            return (Criteria) this;
        }

        public Criteria andInLevelNotEqualTo(Integer value) {
            addCriterion("In_Level <>", value, "inLevel");
            return (Criteria) this;
        }

        public Criteria andInLevelGreaterThan(Integer value) {
            addCriterion("In_Level >", value, "inLevel");
            return (Criteria) this;
        }

        public Criteria andInLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("In_Level >=", value, "inLevel");
            return (Criteria) this;
        }

        public Criteria andInLevelLessThan(Integer value) {
            addCriterion("In_Level <", value, "inLevel");
            return (Criteria) this;
        }

        public Criteria andInLevelLessThanOrEqualTo(Integer value) {
            addCriterion("In_Level <=", value, "inLevel");
            return (Criteria) this;
        }

        public Criteria andInLevelIn(List<Integer> values) {
            addCriterion("In_Level in", values, "inLevel");
            return (Criteria) this;
        }

        public Criteria andInLevelNotIn(List<Integer> values) {
            addCriterion("In_Level not in", values, "inLevel");
            return (Criteria) this;
        }

        public Criteria andInLevelBetween(Integer value1, Integer value2) {
            addCriterion("In_Level between", value1, value2, "inLevel");
            return (Criteria) this;
        }

        public Criteria andInLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("In_Level not between", value1, value2, "inLevel");
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

        public Criteria andOrderIndexIsNull() {
            addCriterion("Order_Index is null");
            return (Criteria) this;
        }

        public Criteria andOrderIndexIsNotNull() {
            addCriterion("Order_Index is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIndexEqualTo(Integer value) {
            addCriterion("Order_Index =", value, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexNotEqualTo(Integer value) {
            addCriterion("Order_Index <>", value, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexGreaterThan(Integer value) {
            addCriterion("Order_Index >", value, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("Order_Index >=", value, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexLessThan(Integer value) {
            addCriterion("Order_Index <", value, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexLessThanOrEqualTo(Integer value) {
            addCriterion("Order_Index <=", value, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexIn(List<Integer> values) {
            addCriterion("Order_Index in", values, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexNotIn(List<Integer> values) {
            addCriterion("Order_Index not in", values, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexBetween(Integer value1, Integer value2) {
            addCriterion("Order_Index between", value1, value2, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("Order_Index not between", value1, value2, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andIsDisabledIsNull() {
            addCriterion("Is_Disabled is null");
            return (Criteria) this;
        }

        public Criteria andIsDisabledIsNotNull() {
            addCriterion("Is_Disabled is not null");
            return (Criteria) this;
        }

        public Criteria andIsDisabledEqualTo(Boolean value) {
            addCriterion("Is_Disabled =", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledNotEqualTo(Boolean value) {
            addCriterion("Is_Disabled <>", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledGreaterThan(Boolean value) {
            addCriterion("Is_Disabled >", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Is_Disabled >=", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledLessThan(Boolean value) {
            addCriterion("Is_Disabled <", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledLessThanOrEqualTo(Boolean value) {
            addCriterion("Is_Disabled <=", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledIn(List<Boolean> values) {
            addCriterion("Is_Disabled in", values, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledNotIn(List<Boolean> values) {
            addCriterion("Is_Disabled not in", values, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledBetween(Boolean value1, Boolean value2) {
            addCriterion("Is_Disabled between", value1, value2, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Is_Disabled not between", value1, value2, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsVisibledIsNull() {
            addCriterion("Is_Visibled is null");
            return (Criteria) this;
        }

        public Criteria andIsVisibledIsNotNull() {
            addCriterion("Is_Visibled is not null");
            return (Criteria) this;
        }

        public Criteria andIsVisibledEqualTo(Boolean value) {
            addCriterion("Is_Visibled =", value, "isVisibled");
            return (Criteria) this;
        }

        public Criteria andIsVisibledNotEqualTo(Boolean value) {
            addCriterion("Is_Visibled <>", value, "isVisibled");
            return (Criteria) this;
        }

        public Criteria andIsVisibledGreaterThan(Boolean value) {
            addCriterion("Is_Visibled >", value, "isVisibled");
            return (Criteria) this;
        }

        public Criteria andIsVisibledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Is_Visibled >=", value, "isVisibled");
            return (Criteria) this;
        }

        public Criteria andIsVisibledLessThan(Boolean value) {
            addCriterion("Is_Visibled <", value, "isVisibled");
            return (Criteria) this;
        }

        public Criteria andIsVisibledLessThanOrEqualTo(Boolean value) {
            addCriterion("Is_Visibled <=", value, "isVisibled");
            return (Criteria) this;
        }

        public Criteria andIsVisibledIn(List<Boolean> values) {
            addCriterion("Is_Visibled in", values, "isVisibled");
            return (Criteria) this;
        }

        public Criteria andIsVisibledNotIn(List<Boolean> values) {
            addCriterion("Is_Visibled not in", values, "isVisibled");
            return (Criteria) this;
        }

        public Criteria andIsVisibledBetween(Boolean value1, Boolean value2) {
            addCriterion("Is_Visibled between", value1, value2, "isVisibled");
            return (Criteria) this;
        }

        public Criteria andIsVisibledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Is_Visibled not between", value1, value2, "isVisibled");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("Create_Time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("Create_Time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("Create_Time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("Create_Time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("Create_Time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Create_Time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("Create_Time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("Create_Time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("Create_Time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("Create_Time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("Create_Time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("Create_Time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNull() {
            addCriterion("Last_Update is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNotNull() {
            addCriterion("Last_Update is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEqualTo(Date value) {
            addCriterion("Last_Update =", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotEqualTo(Date value) {
            addCriterion("Last_Update <>", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThan(Date value) {
            addCriterion("Last_Update >", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("Last_Update >=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThan(Date value) {
            addCriterion("Last_Update <", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThanOrEqualTo(Date value) {
            addCriterion("Last_Update <=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIn(List<Date> values) {
            addCriterion("Last_Update in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotIn(List<Date> values) {
            addCriterion("Last_Update not in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateBetween(Date value1, Date value2) {
            addCriterion("Last_Update between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotBetween(Date value1, Date value2) {
            addCriterion("Last_Update not between", value1, value2, "lastUpdate");
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