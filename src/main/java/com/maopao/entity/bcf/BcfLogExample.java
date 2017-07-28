package com.maopao.entity.bcf;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BcfLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;



    private Integer limit;

    private Integer offset;

    public BcfLogExample() {
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

        public Criteria andLgidIsNull() {
            addCriterion("LGID is null");
            return (Criteria) this;
        }

        public Criteria andLgidIsNotNull() {
            addCriterion("LGID is not null");
            return (Criteria) this;
        }

        public Criteria andLgidEqualTo(Integer value) {
            addCriterion("LGID =", value, "lgid");
            return (Criteria) this;
        }

        public Criteria andLgidNotEqualTo(Integer value) {
            addCriterion("LGID <>", value, "lgid");
            return (Criteria) this;
        }

        public Criteria andLgidGreaterThan(Integer value) {
            addCriterion("LGID >", value, "lgid");
            return (Criteria) this;
        }

        public Criteria andLgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("LGID >=", value, "lgid");
            return (Criteria) this;
        }

        public Criteria andLgidLessThan(Integer value) {
            addCriterion("LGID <", value, "lgid");
            return (Criteria) this;
        }

        public Criteria andLgidLessThanOrEqualTo(Integer value) {
            addCriterion("LGID <=", value, "lgid");
            return (Criteria) this;
        }

        public Criteria andLgidIn(List<Integer> values) {
            addCriterion("LGID in", values, "lgid");
            return (Criteria) this;
        }

        public Criteria andLgidNotIn(List<Integer> values) {
            addCriterion("LGID not in", values, "lgid");
            return (Criteria) this;
        }

        public Criteria andLgidBetween(Integer value1, Integer value2) {
            addCriterion("LGID between", value1, value2, "lgid");
            return (Criteria) this;
        }

        public Criteria andLgidNotBetween(Integer value1, Integer value2) {
            addCriterion("LGID not between", value1, value2, "lgid");
            return (Criteria) this;
        }

        public Criteria andLgTypeIsNull() {
            addCriterion("LG_Type is null");
            return (Criteria) this;
        }

        public Criteria andLgTypeIsNotNull() {
            addCriterion("LG_Type is not null");
            return (Criteria) this;
        }

        public Criteria andLgTypeEqualTo(Integer value) {
            addCriterion("LG_Type =", value, "lgType");
            return (Criteria) this;
        }

        public Criteria andLgTypeNotEqualTo(Integer value) {
            addCriterion("LG_Type <>", value, "lgType");
            return (Criteria) this;
        }

        public Criteria andLgTypeGreaterThan(Integer value) {
            addCriterion("LG_Type >", value, "lgType");
            return (Criteria) this;
        }

        public Criteria andLgTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("LG_Type >=", value, "lgType");
            return (Criteria) this;
        }

        public Criteria andLgTypeLessThan(Integer value) {
            addCriterion("LG_Type <", value, "lgType");
            return (Criteria) this;
        }

        public Criteria andLgTypeLessThanOrEqualTo(Integer value) {
            addCriterion("LG_Type <=", value, "lgType");
            return (Criteria) this;
        }

        public Criteria andLgTypeIn(List<Integer> values) {
            addCriterion("LG_Type in", values, "lgType");
            return (Criteria) this;
        }

        public Criteria andLgTypeNotIn(List<Integer> values) {
            addCriterion("LG_Type not in", values, "lgType");
            return (Criteria) this;
        }

        public Criteria andLgTypeBetween(Integer value1, Integer value2) {
            addCriterion("LG_Type between", value1, value2, "lgType");
            return (Criteria) this;
        }

        public Criteria andLgTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("LG_Type not between", value1, value2, "lgType");
            return (Criteria) this;
        }

        public Criteria andPuidIsNull() {
            addCriterion("PUID is null");
            return (Criteria) this;
        }

        public Criteria andPuidIsNotNull() {
            addCriterion("PUID is not null");
            return (Criteria) this;
        }

        public Criteria andPuidEqualTo(Integer value) {
            addCriterion("PUID =", value, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidNotEqualTo(Integer value) {
            addCriterion("PUID <>", value, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidGreaterThan(Integer value) {
            addCriterion("PUID >", value, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PUID >=", value, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidLessThan(Integer value) {
            addCriterion("PUID <", value, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidLessThanOrEqualTo(Integer value) {
            addCriterion("PUID <=", value, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidIn(List<Integer> values) {
            addCriterion("PUID in", values, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidNotIn(List<Integer> values) {
            addCriterion("PUID not in", values, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidBetween(Integer value1, Integer value2) {
            addCriterion("PUID between", value1, value2, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidNotBetween(Integer value1, Integer value2) {
            addCriterion("PUID not between", value1, value2, "puid");
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

        public Criteria andAtWhereIsNull() {
            addCriterion("At_Where is null");
            return (Criteria) this;
        }

        public Criteria andAtWhereIsNotNull() {
            addCriterion("At_Where is not null");
            return (Criteria) this;
        }

        public Criteria andAtWhereEqualTo(String value) {
            addCriterion("At_Where =", value, "atWhere");
            return (Criteria) this;
        }

        public Criteria andAtWhereNotEqualTo(String value) {
            addCriterion("At_Where <>", value, "atWhere");
            return (Criteria) this;
        }

        public Criteria andAtWhereGreaterThan(String value) {
            addCriterion("At_Where >", value, "atWhere");
            return (Criteria) this;
        }

        public Criteria andAtWhereGreaterThanOrEqualTo(String value) {
            addCriterion("At_Where >=", value, "atWhere");
            return (Criteria) this;
        }

        public Criteria andAtWhereLessThan(String value) {
            addCriterion("At_Where <", value, "atWhere");
            return (Criteria) this;
        }

        public Criteria andAtWhereLessThanOrEqualTo(String value) {
            addCriterion("At_Where <=", value, "atWhere");
            return (Criteria) this;
        }

        public Criteria andAtWhereLike(String value) {
            addCriterion("At_Where like", value, "atWhere");
            return (Criteria) this;
        }

        public Criteria andAtWhereNotLike(String value) {
            addCriterion("At_Where not like", value, "atWhere");
            return (Criteria) this;
        }

        public Criteria andAtWhereIn(List<String> values) {
            addCriterion("At_Where in", values, "atWhere");
            return (Criteria) this;
        }

        public Criteria andAtWhereNotIn(List<String> values) {
            addCriterion("At_Where not in", values, "atWhere");
            return (Criteria) this;
        }

        public Criteria andAtWhereBetween(String value1, String value2) {
            addCriterion("At_Where between", value1, value2, "atWhere");
            return (Criteria) this;
        }

        public Criteria andAtWhereNotBetween(String value1, String value2) {
            addCriterion("At_Where not between", value1, value2, "atWhere");
            return (Criteria) this;
        }

        public Criteria andAtIpgeoIsNull() {
            addCriterion("At_IPGEO is null");
            return (Criteria) this;
        }

        public Criteria andAtIpgeoIsNotNull() {
            addCriterion("At_IPGEO is not null");
            return (Criteria) this;
        }

        public Criteria andAtIpgeoEqualTo(String value) {
            addCriterion("At_IPGEO =", value, "atIpgeo");
            return (Criteria) this;
        }

        public Criteria andAtIpgeoNotEqualTo(String value) {
            addCriterion("At_IPGEO <>", value, "atIpgeo");
            return (Criteria) this;
        }

        public Criteria andAtIpgeoGreaterThan(String value) {
            addCriterion("At_IPGEO >", value, "atIpgeo");
            return (Criteria) this;
        }

        public Criteria andAtIpgeoGreaterThanOrEqualTo(String value) {
            addCriterion("At_IPGEO >=", value, "atIpgeo");
            return (Criteria) this;
        }

        public Criteria andAtIpgeoLessThan(String value) {
            addCriterion("At_IPGEO <", value, "atIpgeo");
            return (Criteria) this;
        }

        public Criteria andAtIpgeoLessThanOrEqualTo(String value) {
            addCriterion("At_IPGEO <=", value, "atIpgeo");
            return (Criteria) this;
        }

        public Criteria andAtIpgeoLike(String value) {
            addCriterion("At_IPGEO like", value, "atIpgeo");
            return (Criteria) this;
        }

        public Criteria andAtIpgeoNotLike(String value) {
            addCriterion("At_IPGEO not like", value, "atIpgeo");
            return (Criteria) this;
        }

        public Criteria andAtIpgeoIn(List<String> values) {
            addCriterion("At_IPGEO in", values, "atIpgeo");
            return (Criteria) this;
        }

        public Criteria andAtIpgeoNotIn(List<String> values) {
            addCriterion("At_IPGEO not in", values, "atIpgeo");
            return (Criteria) this;
        }

        public Criteria andAtIpgeoBetween(String value1, String value2) {
            addCriterion("At_IPGEO between", value1, value2, "atIpgeo");
            return (Criteria) this;
        }

        public Criteria andAtIpgeoNotBetween(String value1, String value2) {
            addCriterion("At_IPGEO not between", value1, value2, "atIpgeo");
            return (Criteria) this;
        }

        public Criteria andOnWhenIsNull() {
            addCriterion("On_When is null");
            return (Criteria) this;
        }

        public Criteria andOnWhenIsNotNull() {
            addCriterion("On_When is not null");
            return (Criteria) this;
        }

        public Criteria andOnWhenEqualTo(Date value) {
            addCriterion("On_When =", value, "onWhen");
            return (Criteria) this;
        }

        public Criteria andOnWhenNotEqualTo(Date value) {
            addCriterion("On_When <>", value, "onWhen");
            return (Criteria) this;
        }

        public Criteria andOnWhenGreaterThan(Date value) {
            addCriterion("On_When >", value, "onWhen");
            return (Criteria) this;
        }

        public Criteria andOnWhenGreaterThanOrEqualTo(Date value) {
            addCriterion("On_When >=", value, "onWhen");
            return (Criteria) this;
        }

        public Criteria andOnWhenLessThan(Date value) {
            addCriterion("On_When <", value, "onWhen");
            return (Criteria) this;
        }

        public Criteria andOnWhenLessThanOrEqualTo(Date value) {
            addCriterion("On_When <=", value, "onWhen");
            return (Criteria) this;
        }

        public Criteria andOnWhenIn(List<Date> values) {
            addCriterion("On_When in", values, "onWhen");
            return (Criteria) this;
        }

        public Criteria andOnWhenNotIn(List<Date> values) {
            addCriterion("On_When not in", values, "onWhen");
            return (Criteria) this;
        }

        public Criteria andOnWhenBetween(Date value1, Date value2) {
            addCriterion("On_When between", value1, value2, "onWhen");
            return (Criteria) this;
        }

        public Criteria andOnWhenNotBetween(Date value1, Date value2) {
            addCriterion("On_When not between", value1, value2, "onWhen");
            return (Criteria) this;
        }

        public Criteria andVsWhoIsNull() {
            addCriterion("Vs_Who is null");
            return (Criteria) this;
        }

        public Criteria andVsWhoIsNotNull() {
            addCriterion("Vs_Who is not null");
            return (Criteria) this;
        }

        public Criteria andVsWhoEqualTo(String value) {
            addCriterion("Vs_Who =", value, "vsWho");
            return (Criteria) this;
        }

        public Criteria andVsWhoNotEqualTo(String value) {
            addCriterion("Vs_Who <>", value, "vsWho");
            return (Criteria) this;
        }

        public Criteria andVsWhoGreaterThan(String value) {
            addCriterion("Vs_Who >", value, "vsWho");
            return (Criteria) this;
        }

        public Criteria andVsWhoGreaterThanOrEqualTo(String value) {
            addCriterion("Vs_Who >=", value, "vsWho");
            return (Criteria) this;
        }

        public Criteria andVsWhoLessThan(String value) {
            addCriterion("Vs_Who <", value, "vsWho");
            return (Criteria) this;
        }

        public Criteria andVsWhoLessThanOrEqualTo(String value) {
            addCriterion("Vs_Who <=", value, "vsWho");
            return (Criteria) this;
        }

        public Criteria andVsWhoLike(String value) {
            addCriterion("Vs_Who like", value, "vsWho");
            return (Criteria) this;
        }

        public Criteria andVsWhoNotLike(String value) {
            addCriterion("Vs_Who not like", value, "vsWho");
            return (Criteria) this;
        }

        public Criteria andVsWhoIn(List<String> values) {
            addCriterion("Vs_Who in", values, "vsWho");
            return (Criteria) this;
        }

        public Criteria andVsWhoNotIn(List<String> values) {
            addCriterion("Vs_Who not in", values, "vsWho");
            return (Criteria) this;
        }

        public Criteria andVsWhoBetween(String value1, String value2) {
            addCriterion("Vs_Who between", value1, value2, "vsWho");
            return (Criteria) this;
        }

        public Criteria andVsWhoNotBetween(String value1, String value2) {
            addCriterion("Vs_Who not between", value1, value2, "vsWho");
            return (Criteria) this;
        }

        public Criteria andVsWhoKeyIsNull() {
            addCriterion("Vs_Who_Key is null");
            return (Criteria) this;
        }

        public Criteria andVsWhoKeyIsNotNull() {
            addCriterion("Vs_Who_Key is not null");
            return (Criteria) this;
        }

        public Criteria andVsWhoKeyEqualTo(String value) {
            addCriterion("Vs_Who_Key =", value, "vsWhoKey");
            return (Criteria) this;
        }

        public Criteria andVsWhoKeyNotEqualTo(String value) {
            addCriterion("Vs_Who_Key <>", value, "vsWhoKey");
            return (Criteria) this;
        }

        public Criteria andVsWhoKeyGreaterThan(String value) {
            addCriterion("Vs_Who_Key >", value, "vsWhoKey");
            return (Criteria) this;
        }

        public Criteria andVsWhoKeyGreaterThanOrEqualTo(String value) {
            addCriterion("Vs_Who_Key >=", value, "vsWhoKey");
            return (Criteria) this;
        }

        public Criteria andVsWhoKeyLessThan(String value) {
            addCriterion("Vs_Who_Key <", value, "vsWhoKey");
            return (Criteria) this;
        }

        public Criteria andVsWhoKeyLessThanOrEqualTo(String value) {
            addCriterion("Vs_Who_Key <=", value, "vsWhoKey");
            return (Criteria) this;
        }

        public Criteria andVsWhoKeyLike(String value) {
            addCriterion("Vs_Who_Key like", value, "vsWhoKey");
            return (Criteria) this;
        }

        public Criteria andVsWhoKeyNotLike(String value) {
            addCriterion("Vs_Who_Key not like", value, "vsWhoKey");
            return (Criteria) this;
        }

        public Criteria andVsWhoKeyIn(List<String> values) {
            addCriterion("Vs_Who_Key in", values, "vsWhoKey");
            return (Criteria) this;
        }

        public Criteria andVsWhoKeyNotIn(List<String> values) {
            addCriterion("Vs_Who_Key not in", values, "vsWhoKey");
            return (Criteria) this;
        }

        public Criteria andVsWhoKeyBetween(String value1, String value2) {
            addCriterion("Vs_Who_Key between", value1, value2, "vsWhoKey");
            return (Criteria) this;
        }

        public Criteria andVsWhoKeyNotBetween(String value1, String value2) {
            addCriterion("Vs_Who_Key not between", value1, value2, "vsWhoKey");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("State is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("State is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Short value) {
            addCriterion("State =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Short value) {
            addCriterion("State <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Short value) {
            addCriterion("State >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Short value) {
            addCriterion("State >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Short value) {
            addCriterion("State <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Short value) {
            addCriterion("State <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Short> values) {
            addCriterion("State in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Short> values) {
            addCriterion("State not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Short value1, Short value2) {
            addCriterion("State between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Short value1, Short value2) {
            addCriterion("State not between", value1, value2, "state");
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