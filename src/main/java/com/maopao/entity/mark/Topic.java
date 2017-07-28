package com.maopao.entity.mark;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Topic implements Serializable {
    private Long topicId;

    private String topicName;

    private Date logDatetime;

    private Integer logIdate;

    /**
     * 是否推荐
     */
    private Integer isRec;

    private Integer rank;

    /**
     * 引用次数
     */
    private Integer quoteNum;

    private Integer isDel;

    /**
     * 平台
     */
    private Integer plant;



    private static final long serialVersionUID = 1L;

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public Date getLogDatetime() {
        return logDatetime;
    }

    public void setLogDatetime(Date logDatetime) {
        this.logDatetime = logDatetime;
    }

    public Integer getLogIdate() {
        return logIdate;
    }

    public void setLogIdate(Integer logIdate) {
        this.logIdate = logIdate;
    }

    public Integer getIsRec() {
        return isRec;
    }

    public void setIsRec(Integer isRec) {
        this.isRec = isRec;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getQuoteNum() {
        return quoteNum;
    }

    public void setQuoteNum(Integer quoteNum) {
        this.quoteNum = quoteNum;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getPlant() {
        return plant;
    }

    public void setPlant(Integer plant) {
        this.plant = plant;
    }
}