package com.maopao.entity.mapgo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;


    private Integer limit;

    private Integer offset;

    public AppExample() {
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

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(Integer value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(Integer value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(Integer value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(Integer value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(Integer value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<Integer> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<Integer> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(Integer value1, Integer value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(Integer value1, Integer value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppKeyIsNull() {
            addCriterion("app_key is null");
            return (Criteria) this;
        }

        public Criteria andAppKeyIsNotNull() {
            addCriterion("app_key is not null");
            return (Criteria) this;
        }

        public Criteria andAppKeyEqualTo(String value) {
            addCriterion("app_key =", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotEqualTo(String value) {
            addCriterion("app_key <>", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyGreaterThan(String value) {
            addCriterion("app_key >", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyGreaterThanOrEqualTo(String value) {
            addCriterion("app_key >=", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyLessThan(String value) {
            addCriterion("app_key <", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyLessThanOrEqualTo(String value) {
            addCriterion("app_key <=", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyLike(String value) {
            addCriterion("app_key like", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotLike(String value) {
            addCriterion("app_key not like", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyIn(List<String> values) {
            addCriterion("app_key in", values, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotIn(List<String> values) {
            addCriterion("app_key not in", values, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyBetween(String value1, String value2) {
            addCriterion("app_key between", value1, value2, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotBetween(String value1, String value2) {
            addCriterion("app_key not between", value1, value2, "appKey");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAlertVerIsNull() {
            addCriterion("alert_ver is null");
            return (Criteria) this;
        }

        public Criteria andAlertVerIsNotNull() {
            addCriterion("alert_ver is not null");
            return (Criteria) this;
        }

        public Criteria andAlertVerEqualTo(Integer value) {
            addCriterion("alert_ver =", value, "alertVer");
            return (Criteria) this;
        }

        public Criteria andAlertVerNotEqualTo(Integer value) {
            addCriterion("alert_ver <>", value, "alertVer");
            return (Criteria) this;
        }

        public Criteria andAlertVerGreaterThan(Integer value) {
            addCriterion("alert_ver >", value, "alertVer");
            return (Criteria) this;
        }

        public Criteria andAlertVerGreaterThanOrEqualTo(Integer value) {
            addCriterion("alert_ver >=", value, "alertVer");
            return (Criteria) this;
        }

        public Criteria andAlertVerLessThan(Integer value) {
            addCriterion("alert_ver <", value, "alertVer");
            return (Criteria) this;
        }

        public Criteria andAlertVerLessThanOrEqualTo(Integer value) {
            addCriterion("alert_ver <=", value, "alertVer");
            return (Criteria) this;
        }

        public Criteria andAlertVerIn(List<Integer> values) {
            addCriterion("alert_ver in", values, "alertVer");
            return (Criteria) this;
        }

        public Criteria andAlertVerNotIn(List<Integer> values) {
            addCriterion("alert_ver not in", values, "alertVer");
            return (Criteria) this;
        }

        public Criteria andAlertVerBetween(Integer value1, Integer value2) {
            addCriterion("alert_ver between", value1, value2, "alertVer");
            return (Criteria) this;
        }

        public Criteria andAlertVerNotBetween(Integer value1, Integer value2) {
            addCriterion("alert_ver not between", value1, value2, "alertVer");
            return (Criteria) this;
        }

        public Criteria andCheckVerIsNull() {
            addCriterion("check_ver is null");
            return (Criteria) this;
        }

        public Criteria andCheckVerIsNotNull() {
            addCriterion("check_ver is not null");
            return (Criteria) this;
        }

        public Criteria andCheckVerEqualTo(Integer value) {
            addCriterion("check_ver =", value, "checkVer");
            return (Criteria) this;
        }

        public Criteria andCheckVerNotEqualTo(Integer value) {
            addCriterion("check_ver <>", value, "checkVer");
            return (Criteria) this;
        }

        public Criteria andCheckVerGreaterThan(Integer value) {
            addCriterion("check_ver >", value, "checkVer");
            return (Criteria) this;
        }

        public Criteria andCheckVerGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_ver >=", value, "checkVer");
            return (Criteria) this;
        }

        public Criteria andCheckVerLessThan(Integer value) {
            addCriterion("check_ver <", value, "checkVer");
            return (Criteria) this;
        }

        public Criteria andCheckVerLessThanOrEqualTo(Integer value) {
            addCriterion("check_ver <=", value, "checkVer");
            return (Criteria) this;
        }

        public Criteria andCheckVerIn(List<Integer> values) {
            addCriterion("check_ver in", values, "checkVer");
            return (Criteria) this;
        }

        public Criteria andCheckVerNotIn(List<Integer> values) {
            addCriterion("check_ver not in", values, "checkVer");
            return (Criteria) this;
        }

        public Criteria andCheckVerBetween(Integer value1, Integer value2) {
            addCriterion("check_ver between", value1, value2, "checkVer");
            return (Criteria) this;
        }

        public Criteria andCheckVerNotBetween(Integer value1, Integer value2) {
            addCriterion("check_ver not between", value1, value2, "checkVer");
            return (Criteria) this;
        }

        public Criteria andPlantformIsNull() {
            addCriterion("plantform is null");
            return (Criteria) this;
        }

        public Criteria andPlantformIsNotNull() {
            addCriterion("plantform is not null");
            return (Criteria) this;
        }

        public Criteria andPlantformEqualTo(Integer value) {
            addCriterion("plantform =", value, "plantform");
            return (Criteria) this;
        }

        public Criteria andPlantformNotEqualTo(Integer value) {
            addCriterion("plantform <>", value, "plantform");
            return (Criteria) this;
        }

        public Criteria andPlantformGreaterThan(Integer value) {
            addCriterion("plantform >", value, "plantform");
            return (Criteria) this;
        }

        public Criteria andPlantformGreaterThanOrEqualTo(Integer value) {
            addCriterion("plantform >=", value, "plantform");
            return (Criteria) this;
        }

        public Criteria andPlantformLessThan(Integer value) {
            addCriterion("plantform <", value, "plantform");
            return (Criteria) this;
        }

        public Criteria andPlantformLessThanOrEqualTo(Integer value) {
            addCriterion("plantform <=", value, "plantform");
            return (Criteria) this;
        }

        public Criteria andPlantformIn(List<Integer> values) {
            addCriterion("plantform in", values, "plantform");
            return (Criteria) this;
        }

        public Criteria andPlantformNotIn(List<Integer> values) {
            addCriterion("plantform not in", values, "plantform");
            return (Criteria) this;
        }

        public Criteria andPlantformBetween(Integer value1, Integer value2) {
            addCriterion("plantform between", value1, value2, "plantform");
            return (Criteria) this;
        }

        public Criteria andPlantformNotBetween(Integer value1, Integer value2) {
            addCriterion("plantform not between", value1, value2, "plantform");
            return (Criteria) this;
        }

        public Criteria andIsForcedIsNull() {
            addCriterion("is_forced is null");
            return (Criteria) this;
        }

        public Criteria andIsForcedIsNotNull() {
            addCriterion("is_forced is not null");
            return (Criteria) this;
        }

        public Criteria andIsForcedEqualTo(Integer value) {
            addCriterion("is_forced =", value, "isForced");
            return (Criteria) this;
        }

        public Criteria andIsForcedNotEqualTo(Integer value) {
            addCriterion("is_forced <>", value, "isForced");
            return (Criteria) this;
        }

        public Criteria andIsForcedGreaterThan(Integer value) {
            addCriterion("is_forced >", value, "isForced");
            return (Criteria) this;
        }

        public Criteria andIsForcedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_forced >=", value, "isForced");
            return (Criteria) this;
        }

        public Criteria andIsForcedLessThan(Integer value) {
            addCriterion("is_forced <", value, "isForced");
            return (Criteria) this;
        }

        public Criteria andIsForcedLessThanOrEqualTo(Integer value) {
            addCriterion("is_forced <=", value, "isForced");
            return (Criteria) this;
        }

        public Criteria andIsForcedIn(List<Integer> values) {
            addCriterion("is_forced in", values, "isForced");
            return (Criteria) this;
        }

        public Criteria andIsForcedNotIn(List<Integer> values) {
            addCriterion("is_forced not in", values, "isForced");
            return (Criteria) this;
        }

        public Criteria andIsForcedBetween(Integer value1, Integer value2) {
            addCriterion("is_forced between", value1, value2, "isForced");
            return (Criteria) this;
        }

        public Criteria andIsForcedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_forced not between", value1, value2, "isForced");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlIsNull() {
            addCriterion("download_url is null");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlIsNotNull() {
            addCriterion("download_url is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlEqualTo(String value) {
            addCriterion("download_url =", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlNotEqualTo(String value) {
            addCriterion("download_url <>", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlGreaterThan(String value) {
            addCriterion("download_url >", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlGreaterThanOrEqualTo(String value) {
            addCriterion("download_url >=", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlLessThan(String value) {
            addCriterion("download_url <", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlLessThanOrEqualTo(String value) {
            addCriterion("download_url <=", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlLike(String value) {
            addCriterion("download_url like", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlNotLike(String value) {
            addCriterion("download_url not like", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlIn(List<String> values) {
            addCriterion("download_url in", values, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlNotIn(List<String> values) {
            addCriterion("download_url not in", values, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlBetween(String value1, String value2) {
            addCriterion("download_url between", value1, value2, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlNotBetween(String value1, String value2) {
            addCriterion("download_url not between", value1, value2, "downloadUrl");
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

        public Criteria andIntroIsNull() {
            addCriterion("intro is null");
            return (Criteria) this;
        }

        public Criteria andIntroIsNotNull() {
            addCriterion("intro is not null");
            return (Criteria) this;
        }

        public Criteria andIntroEqualTo(String value) {
            addCriterion("intro =", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotEqualTo(String value) {
            addCriterion("intro <>", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroGreaterThan(String value) {
            addCriterion("intro >", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroGreaterThanOrEqualTo(String value) {
            addCriterion("intro >=", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLessThan(String value) {
            addCriterion("intro <", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLessThanOrEqualTo(String value) {
            addCriterion("intro <=", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLike(String value) {
            addCriterion("intro like", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotLike(String value) {
            addCriterion("intro not like", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroIn(List<String> values) {
            addCriterion("intro in", values, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotIn(List<String> values) {
            addCriterion("intro not in", values, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroBetween(String value1, String value2) {
            addCriterion("intro between", value1, value2, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotBetween(String value1, String value2) {
            addCriterion("intro not between", value1, value2, "intro");
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