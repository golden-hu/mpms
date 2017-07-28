package com.maopao.entity.bcf;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BcfResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;



    private Integer limit;

    private Integer offset;

    public BcfResourceExample() {
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

        public Criteria andRsCodeIsNull() {
            addCriterion("RS_Code is null");
            return (Criteria) this;
        }

        public Criteria andRsCodeIsNotNull() {
            addCriterion("RS_Code is not null");
            return (Criteria) this;
        }

        public Criteria andRsCodeEqualTo(String value) {
            addCriterion("RS_Code =", value, "rsCode");
            return (Criteria) this;
        }

        public Criteria andRsCodeNotEqualTo(String value) {
            addCriterion("RS_Code <>", value, "rsCode");
            return (Criteria) this;
        }

        public Criteria andRsCodeGreaterThan(String value) {
            addCriterion("RS_Code >", value, "rsCode");
            return (Criteria) this;
        }

        public Criteria andRsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RS_Code >=", value, "rsCode");
            return (Criteria) this;
        }

        public Criteria andRsCodeLessThan(String value) {
            addCriterion("RS_Code <", value, "rsCode");
            return (Criteria) this;
        }

        public Criteria andRsCodeLessThanOrEqualTo(String value) {
            addCriterion("RS_Code <=", value, "rsCode");
            return (Criteria) this;
        }

        public Criteria andRsCodeLike(String value) {
            addCriterion("RS_Code like", value, "rsCode");
            return (Criteria) this;
        }

        public Criteria andRsCodeNotLike(String value) {
            addCriterion("RS_Code not like", value, "rsCode");
            return (Criteria) this;
        }

        public Criteria andRsCodeIn(List<String> values) {
            addCriterion("RS_Code in", values, "rsCode");
            return (Criteria) this;
        }

        public Criteria andRsCodeNotIn(List<String> values) {
            addCriterion("RS_Code not in", values, "rsCode");
            return (Criteria) this;
        }

        public Criteria andRsCodeBetween(String value1, String value2) {
            addCriterion("RS_Code between", value1, value2, "rsCode");
            return (Criteria) this;
        }

        public Criteria andRsCodeNotBetween(String value1, String value2) {
            addCriterion("RS_Code not between", value1, value2, "rsCode");
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

        public Criteria andUriPathIsNull() {
            addCriterion("Uri_Path is null");
            return (Criteria) this;
        }

        public Criteria andUriPathIsNotNull() {
            addCriterion("Uri_Path is not null");
            return (Criteria) this;
        }

        public Criteria andUriPathEqualTo(String value) {
            addCriterion("Uri_Path =", value, "uriPath");
            return (Criteria) this;
        }

        public Criteria andUriPathNotEqualTo(String value) {
            addCriterion("Uri_Path <>", value, "uriPath");
            return (Criteria) this;
        }

        public Criteria andUriPathGreaterThan(String value) {
            addCriterion("Uri_Path >", value, "uriPath");
            return (Criteria) this;
        }

        public Criteria andUriPathGreaterThanOrEqualTo(String value) {
            addCriterion("Uri_Path >=", value, "uriPath");
            return (Criteria) this;
        }

        public Criteria andUriPathLessThan(String value) {
            addCriterion("Uri_Path <", value, "uriPath");
            return (Criteria) this;
        }

        public Criteria andUriPathLessThanOrEqualTo(String value) {
            addCriterion("Uri_Path <=", value, "uriPath");
            return (Criteria) this;
        }

        public Criteria andUriPathLike(String value) {
            addCriterion("Uri_Path like", value, "uriPath");
            return (Criteria) this;
        }

        public Criteria andUriPathNotLike(String value) {
            addCriterion("Uri_Path not like", value, "uriPath");
            return (Criteria) this;
        }

        public Criteria andUriPathIn(List<String> values) {
            addCriterion("Uri_Path in", values, "uriPath");
            return (Criteria) this;
        }

        public Criteria andUriPathNotIn(List<String> values) {
            addCriterion("Uri_Path not in", values, "uriPath");
            return (Criteria) this;
        }

        public Criteria andUriPathBetween(String value1, String value2) {
            addCriterion("Uri_Path between", value1, value2, "uriPath");
            return (Criteria) this;
        }

        public Criteria andUriPathNotBetween(String value1, String value2) {
            addCriterion("Uri_Path not between", value1, value2, "uriPath");
            return (Criteria) this;
        }

        public Criteria andUriTargetIsNull() {
            addCriterion("Uri_Target is null");
            return (Criteria) this;
        }

        public Criteria andUriTargetIsNotNull() {
            addCriterion("Uri_Target is not null");
            return (Criteria) this;
        }

        public Criteria andUriTargetEqualTo(String value) {
            addCriterion("Uri_Target =", value, "uriTarget");
            return (Criteria) this;
        }

        public Criteria andUriTargetNotEqualTo(String value) {
            addCriterion("Uri_Target <>", value, "uriTarget");
            return (Criteria) this;
        }

        public Criteria andUriTargetGreaterThan(String value) {
            addCriterion("Uri_Target >", value, "uriTarget");
            return (Criteria) this;
        }

        public Criteria andUriTargetGreaterThanOrEqualTo(String value) {
            addCriterion("Uri_Target >=", value, "uriTarget");
            return (Criteria) this;
        }

        public Criteria andUriTargetLessThan(String value) {
            addCriterion("Uri_Target <", value, "uriTarget");
            return (Criteria) this;
        }

        public Criteria andUriTargetLessThanOrEqualTo(String value) {
            addCriterion("Uri_Target <=", value, "uriTarget");
            return (Criteria) this;
        }

        public Criteria andUriTargetLike(String value) {
            addCriterion("Uri_Target like", value, "uriTarget");
            return (Criteria) this;
        }

        public Criteria andUriTargetNotLike(String value) {
            addCriterion("Uri_Target not like", value, "uriTarget");
            return (Criteria) this;
        }

        public Criteria andUriTargetIn(List<String> values) {
            addCriterion("Uri_Target in", values, "uriTarget");
            return (Criteria) this;
        }

        public Criteria andUriTargetNotIn(List<String> values) {
            addCriterion("Uri_Target not in", values, "uriTarget");
            return (Criteria) this;
        }

        public Criteria andUriTargetBetween(String value1, String value2) {
            addCriterion("Uri_Target between", value1, value2, "uriTarget");
            return (Criteria) this;
        }

        public Criteria andUriTargetNotBetween(String value1, String value2) {
            addCriterion("Uri_Target not between", value1, value2, "uriTarget");
            return (Criteria) this;
        }

        public Criteria andIcoPathIsNull() {
            addCriterion("Ico_Path is null");
            return (Criteria) this;
        }

        public Criteria andIcoPathIsNotNull() {
            addCriterion("Ico_Path is not null");
            return (Criteria) this;
        }

        public Criteria andIcoPathEqualTo(String value) {
            addCriterion("Ico_Path =", value, "icoPath");
            return (Criteria) this;
        }

        public Criteria andIcoPathNotEqualTo(String value) {
            addCriterion("Ico_Path <>", value, "icoPath");
            return (Criteria) this;
        }

        public Criteria andIcoPathGreaterThan(String value) {
            addCriterion("Ico_Path >", value, "icoPath");
            return (Criteria) this;
        }

        public Criteria andIcoPathGreaterThanOrEqualTo(String value) {
            addCriterion("Ico_Path >=", value, "icoPath");
            return (Criteria) this;
        }

        public Criteria andIcoPathLessThan(String value) {
            addCriterion("Ico_Path <", value, "icoPath");
            return (Criteria) this;
        }

        public Criteria andIcoPathLessThanOrEqualTo(String value) {
            addCriterion("Ico_Path <=", value, "icoPath");
            return (Criteria) this;
        }

        public Criteria andIcoPathLike(String value) {
            addCriterion("Ico_Path like", value, "icoPath");
            return (Criteria) this;
        }

        public Criteria andIcoPathNotLike(String value) {
            addCriterion("Ico_Path not like", value, "icoPath");
            return (Criteria) this;
        }

        public Criteria andIcoPathIn(List<String> values) {
            addCriterion("Ico_Path in", values, "icoPath");
            return (Criteria) this;
        }

        public Criteria andIcoPathNotIn(List<String> values) {
            addCriterion("Ico_Path not in", values, "icoPath");
            return (Criteria) this;
        }

        public Criteria andIcoPathBetween(String value1, String value2) {
            addCriterion("Ico_Path between", value1, value2, "icoPath");
            return (Criteria) this;
        }

        public Criteria andIcoPathNotBetween(String value1, String value2) {
            addCriterion("Ico_Path not between", value1, value2, "icoPath");
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

        public Criteria andNoteIsNull() {
            addCriterion("Note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("Note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("Note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("Note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("Note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("Note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("Note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("Note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("Note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("Note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("Note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("Note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("Note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("Note not between", value1, value2, "note");
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