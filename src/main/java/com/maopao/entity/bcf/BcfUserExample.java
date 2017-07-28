package com.maopao.entity.bcf;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BcfUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public BcfUserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("User_Id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("User_Id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("User_Id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("User_Id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("User_Id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("User_Id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("User_Id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("User_Id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("User_Id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("User_Id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("User_Id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("User_Id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("User_Id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("User_Id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andOutObjtIsNull() {
            addCriterion("OUT_OBJT is null");
            return (Criteria) this;
        }

        public Criteria andOutObjtIsNotNull() {
            addCriterion("OUT_OBJT is not null");
            return (Criteria) this;
        }

        public Criteria andOutObjtEqualTo(Integer value) {
            addCriterion("OUT_OBJT =", value, "outObjt");
            return (Criteria) this;
        }

        public Criteria andOutObjtNotEqualTo(Integer value) {
            addCriterion("OUT_OBJT <>", value, "outObjt");
            return (Criteria) this;
        }

        public Criteria andOutObjtGreaterThan(Integer value) {
            addCriterion("OUT_OBJT >", value, "outObjt");
            return (Criteria) this;
        }

        public Criteria andOutObjtGreaterThanOrEqualTo(Integer value) {
            addCriterion("OUT_OBJT >=", value, "outObjt");
            return (Criteria) this;
        }

        public Criteria andOutObjtLessThan(Integer value) {
            addCriterion("OUT_OBJT <", value, "outObjt");
            return (Criteria) this;
        }

        public Criteria andOutObjtLessThanOrEqualTo(Integer value) {
            addCriterion("OUT_OBJT <=", value, "outObjt");
            return (Criteria) this;
        }

        public Criteria andOutObjtIn(List<Integer> values) {
            addCriterion("OUT_OBJT in", values, "outObjt");
            return (Criteria) this;
        }

        public Criteria andOutObjtNotIn(List<Integer> values) {
            addCriterion("OUT_OBJT not in", values, "outObjt");
            return (Criteria) this;
        }

        public Criteria andOutObjtBetween(Integer value1, Integer value2) {
            addCriterion("OUT_OBJT between", value1, value2, "outObjt");
            return (Criteria) this;
        }

        public Criteria andOutObjtNotBetween(Integer value1, Integer value2) {
            addCriterion("OUT_OBJT not between", value1, value2, "outObjt");
            return (Criteria) this;
        }

        public Criteria andOutObjtIdIsNull() {
            addCriterion("OUT_OBJT_ID is null");
            return (Criteria) this;
        }

        public Criteria andOutObjtIdIsNotNull() {
            addCriterion("OUT_OBJT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOutObjtIdEqualTo(Integer value) {
            addCriterion("OUT_OBJT_ID =", value, "outObjtId");
            return (Criteria) this;
        }

        public Criteria andOutObjtIdNotEqualTo(Integer value) {
            addCriterion("OUT_OBJT_ID <>", value, "outObjtId");
            return (Criteria) this;
        }

        public Criteria andOutObjtIdGreaterThan(Integer value) {
            addCriterion("OUT_OBJT_ID >", value, "outObjtId");
            return (Criteria) this;
        }

        public Criteria andOutObjtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("OUT_OBJT_ID >=", value, "outObjtId");
            return (Criteria) this;
        }

        public Criteria andOutObjtIdLessThan(Integer value) {
            addCriterion("OUT_OBJT_ID <", value, "outObjtId");
            return (Criteria) this;
        }

        public Criteria andOutObjtIdLessThanOrEqualTo(Integer value) {
            addCriterion("OUT_OBJT_ID <=", value, "outObjtId");
            return (Criteria) this;
        }

        public Criteria andOutObjtIdIn(List<Integer> values) {
            addCriterion("OUT_OBJT_ID in", values, "outObjtId");
            return (Criteria) this;
        }

        public Criteria andOutObjtIdNotIn(List<Integer> values) {
            addCriterion("OUT_OBJT_ID not in", values, "outObjtId");
            return (Criteria) this;
        }

        public Criteria andOutObjtIdBetween(Integer value1, Integer value2) {
            addCriterion("OUT_OBJT_ID between", value1, value2, "outObjtId");
            return (Criteria) this;
        }

        public Criteria andOutObjtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("OUT_OBJT_ID not between", value1, value2, "outObjtId");
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

        public Criteria andPwMailIsNull() {
            addCriterion("PW_Mail is null");
            return (Criteria) this;
        }

        public Criteria andPwMailIsNotNull() {
            addCriterion("PW_Mail is not null");
            return (Criteria) this;
        }

        public Criteria andPwMailEqualTo(String value) {
            addCriterion("PW_Mail =", value, "pwMail");
            return (Criteria) this;
        }

        public Criteria andPwMailNotEqualTo(String value) {
            addCriterion("PW_Mail <>", value, "pwMail");
            return (Criteria) this;
        }

        public Criteria andPwMailGreaterThan(String value) {
            addCriterion("PW_Mail >", value, "pwMail");
            return (Criteria) this;
        }

        public Criteria andPwMailGreaterThanOrEqualTo(String value) {
            addCriterion("PW_Mail >=", value, "pwMail");
            return (Criteria) this;
        }

        public Criteria andPwMailLessThan(String value) {
            addCriterion("PW_Mail <", value, "pwMail");
            return (Criteria) this;
        }

        public Criteria andPwMailLessThanOrEqualTo(String value) {
            addCriterion("PW_Mail <=", value, "pwMail");
            return (Criteria) this;
        }

        public Criteria andPwMailLike(String value) {
            addCriterion("PW_Mail like", value, "pwMail");
            return (Criteria) this;
        }

        public Criteria andPwMailNotLike(String value) {
            addCriterion("PW_Mail not like", value, "pwMail");
            return (Criteria) this;
        }

        public Criteria andPwMailIn(List<String> values) {
            addCriterion("PW_Mail in", values, "pwMail");
            return (Criteria) this;
        }

        public Criteria andPwMailNotIn(List<String> values) {
            addCriterion("PW_Mail not in", values, "pwMail");
            return (Criteria) this;
        }

        public Criteria andPwMailBetween(String value1, String value2) {
            addCriterion("PW_Mail between", value1, value2, "pwMail");
            return (Criteria) this;
        }

        public Criteria andPwMailNotBetween(String value1, String value2) {
            addCriterion("PW_Mail not between", value1, value2, "pwMail");
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

        public Criteria andPassWdIsNull() {
            addCriterion("Pass_Wd is null");
            return (Criteria) this;
        }

        public Criteria andPassWdIsNotNull() {
            addCriterion("Pass_Wd is not null");
            return (Criteria) this;
        }

        public Criteria andPassWdEqualTo(String value) {
            addCriterion("Pass_Wd =", value, "passWd");
            return (Criteria) this;
        }

        public Criteria andPassWdNotEqualTo(String value) {
            addCriterion("Pass_Wd <>", value, "passWd");
            return (Criteria) this;
        }

        public Criteria andPassWdGreaterThan(String value) {
            addCriterion("Pass_Wd >", value, "passWd");
            return (Criteria) this;
        }

        public Criteria andPassWdGreaterThanOrEqualTo(String value) {
            addCriterion("Pass_Wd >=", value, "passWd");
            return (Criteria) this;
        }

        public Criteria andPassWdLessThan(String value) {
            addCriterion("Pass_Wd <", value, "passWd");
            return (Criteria) this;
        }

        public Criteria andPassWdLessThanOrEqualTo(String value) {
            addCriterion("Pass_Wd <=", value, "passWd");
            return (Criteria) this;
        }

        public Criteria andPassWdLike(String value) {
            addCriterion("Pass_Wd like", value, "passWd");
            return (Criteria) this;
        }

        public Criteria andPassWdNotLike(String value) {
            addCriterion("Pass_Wd not like", value, "passWd");
            return (Criteria) this;
        }

        public Criteria andPassWdIn(List<String> values) {
            addCriterion("Pass_Wd in", values, "passWd");
            return (Criteria) this;
        }

        public Criteria andPassWdNotIn(List<String> values) {
            addCriterion("Pass_Wd not in", values, "passWd");
            return (Criteria) this;
        }

        public Criteria andPassWdBetween(String value1, String value2) {
            addCriterion("Pass_Wd between", value1, value2, "passWd");
            return (Criteria) this;
        }

        public Criteria andPassWdNotBetween(String value1, String value2) {
            addCriterion("Pass_Wd not between", value1, value2, "passWd");
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