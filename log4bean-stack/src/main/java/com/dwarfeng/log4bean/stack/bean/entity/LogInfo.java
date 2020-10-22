package com.dwarfeng.log4bean.stack.bean.entity;

import com.dwarfeng.subgrade.stack.bean.entity.Entity;
import com.dwarfeng.subgrade.stack.bean.key.LongIdKey;
import com.dwarfeng.subgrade.stack.bean.key.StringIdKey;

import java.util.Date;

/**
 * 日志信息。
 *
 * @author DwArFeng
 * @since 1.0.0
 */
public class LogInfo implements Entity<LongIdKey> {

    private static final long serialVersionUID = -3093854043039163711L;

    private LongIdKey key;
    private StringIdKey clazzInfoKey;
    private String user;
    private String method;
    private String content;
    private Date happenedDate;
    private String remark;

    public LogInfo() {
    }

    public LogInfo(
            LongIdKey key, StringIdKey clazzInfoKey, String user, String method, String content, Date happenedDate,
            String remark) {
        this.key = key;
        this.clazzInfoKey = clazzInfoKey;
        this.user = user;
        this.method = method;
        this.content = content;
        this.happenedDate = happenedDate;
        this.remark = remark;
    }

    @Override
    public LongIdKey getKey() {
        return key;
    }

    @Override
    public void setKey(LongIdKey key) {
        this.key = key;
    }

    public StringIdKey getClazzInfoKey() {
        return clazzInfoKey;
    }

    public void setClazzInfoKey(StringIdKey clazzInfoKey) {
        this.clazzInfoKey = clazzInfoKey;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getHappenedDate() {
        return happenedDate;
    }

    public void setHappenedDate(Date happenedDate) {
        this.happenedDate = happenedDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "LogInfo{" +
                "key=" + key +
                ", clazzInfoKey=" + clazzInfoKey +
                ", user='" + user + '\'' +
                ", method='" + method + '\'' +
                ", content='" + content + '\'' +
                ", happenedDate=" + happenedDate +
                ", remark='" + remark + '\'' +
                '}';
    }
}
