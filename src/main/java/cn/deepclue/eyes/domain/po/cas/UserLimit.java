package cn.deepclue.eyes.domain.po.cas;

import java.util.Date;

public class UserLimit {
    private String id;
    private Integer alreadyOnline;
    private Boolean authCoverable;
    private Date lasteIncrementTime;
    private Integer macOnline;
    private Boolean trial;
    private String limitCaseId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAlreadyOnline() {
        return alreadyOnline;
    }

    public void setAlreadyOnline(Integer alreadyOnline) {
        this.alreadyOnline = alreadyOnline;
    }

    public Boolean getAuthCoverable() {
        return authCoverable;
    }

    public void setAuthCoverable(Boolean authCoverable) {
        this.authCoverable = authCoverable;
    }

    public Date getLasteIncrementTime() {
        return lasteIncrementTime;
    }

    public void setLasteIncrementTime(Date lasteIncrementTime) {
        this.lasteIncrementTime = lasteIncrementTime;
    }

    public Integer getMacOnline() {
        return macOnline;
    }

    public void setMacOnline(Integer macOnline) {
        this.macOnline = macOnline;
    }

    public Boolean getTrial() {
        return trial;
    }

    public void setTrial(Boolean trial) {
        this.trial = trial;
    }

    public String getLimitCaseId() {
        return limitCaseId;
    }

    public void setLimitCaseId(String limitCaseId) {
        this.limitCaseId = limitCaseId;
    }
}
