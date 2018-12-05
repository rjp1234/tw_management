package cn.deepclue.eyes.domain.po.management;

import java.util.Date;
import java.util.List;

public class AccountBO {

    private Long id;

    private Long groupId;

    private String username;

    private String department;

    private String phone;

    private String mail;

    private String remark;

    // 上边的是从po中取，下边的set进去

    private String seriesCode;

    private boolean isAdmin;

    private Boolean hideGraph;

    private String showName;

    private List<Role> roles;

    public static class Role {
        private String code;

        private String name;

        private Date expireTime;

        private Boolean expire;

        private Boolean trial;

        public String getCode() {
            return code;
        }

        public Role setCode(String code) {
            this.code = code;
            return this;
        }

        public String getName() {
            return name;
        }

        public Role setName(String name) {
            this.name = name;
            return this;
        }

        public Date getExpireTime() {
            return expireTime;
        }

        public Role setExpireTime(Date expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        public Boolean getExpire() {
            return expire;
        }

        public Role setExpire(Boolean expire) {
            this.expire = expire;
            return this;
        }

        public Boolean getTrial() {
            return trial;
        }

        public Role setTrial(Boolean trial) {
            this.trial = trial;
            return this;
        }
    }

    public Long getId() {
        return id;
    }

    public AccountBO setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getGroupId() {
        return groupId;
    }

    public AccountBO setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public AccountBO setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getDepartment() {
        return department;
    }

    public AccountBO setDepartment(String department) {
        this.department = department;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public AccountBO setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getMail() {
        return mail;
    }

    public AccountBO setMail(String mail) {
        this.mail = mail;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public AccountBO setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public String getSeriesCode() {
        return seriesCode;
    }

    public AccountBO setSeriesCode(String seriesCode) {
        this.seriesCode = seriesCode;
        return this;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public AccountBO setAdmin(boolean admin) {
        isAdmin = admin;
        return this;
    }

    public Boolean getHideGraph() {
        return hideGraph;
    }

    public AccountBO setHideGraph(Boolean hideGraph) {
        this.hideGraph = hideGraph;
        return this;
    }

    public String getShowName() {
        return showName;
    }

    public AccountBO setShowName(String showName) {
        this.showName = showName;
        return this;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public AccountBO setRoles(List<Role> roles) {
        this.roles = roles;
        return this;
    }
}
