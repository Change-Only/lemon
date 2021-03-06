package com.mossle.disk.persistence.domain;

// Generated by Hibernate Tools
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DiskMember .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "DISK_MEMBER")
public class DiskMember implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private DiskSpace diskSpace;

    /** null. */
    private DiskShare diskShare;

    /** null. */
    private String catalog;

    /** null. */
    private String type;

    /** null. */
    private String name;

    /** null. */
    private Integer mask;

    /** null. */
    private String description;

    /** null. */
    private String userId;

    /** null. */
    private String creator;

    /** null. */
    private Date createTime;

    /** null. */
    private Date expireTime;

    /** null. */
    private String status;

    /** null. */
    private Integer priority;

    public DiskMember() {
    }

    public DiskMember(Long id) {
        this.id = id;
    }

    public DiskMember(Long id, DiskSpace diskSpace, DiskShare diskShare,
            String catalog, String type, String name, Integer mask,
            String description, String userId, String creator, Date createTime,
            Date expireTime, String status, Integer priority) {
        this.id = id;
        this.diskSpace = diskSpace;
        this.diskShare = diskShare;
        this.catalog = catalog;
        this.type = type;
        this.name = name;
        this.mask = mask;
        this.description = description;
        this.userId = userId;
        this.creator = creator;
        this.createTime = createTime;
        this.expireTime = expireTime;
        this.status = status;
        this.priority = priority;
    }

    /** @return null. */
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SPACE_ID")
    public DiskSpace getDiskSpace() {
        return this.diskSpace;
    }

    /**
     * @param diskSpace
     *            null.
     */
    public void setDiskSpace(DiskSpace diskSpace) {
        this.diskSpace = diskSpace;
    }

    /** @return null. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SHARE_ID")
    public DiskShare getDiskShare() {
        return this.diskShare;
    }

    /**
     * @param diskShare
     *            null.
     */
    public void setDiskShare(DiskShare diskShare) {
        this.diskShare = diskShare;
    }

    /** @return null. */
    @Column(name = "CATALOG", length = 50)
    public String getCatalog() {
        return this.catalog;
    }

    /**
     * @param catalog
     *            null.
     */
    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    /** @return null. */
    @Column(name = "TYPE", length = 50)
    public String getType() {
        return this.type;
    }

    /**
     * @param type
     *            null.
     */
    public void setType(String type) {
        this.type = type;
    }

    /** @return null. */
    @Column(name = "NAME", length = 200)
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     *            null.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** @return null. */
    @Column(name = "MASK")
    public Integer getMask() {
        return this.mask;
    }

    /**
     * @param mask
     *            null.
     */
    public void setMask(Integer mask) {
        this.mask = mask;
    }

    /** @return null. */
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     *            null.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** @return null. */
    @Column(name = "USER_ID", length = 64)
    public String getUserId() {
        return this.userId;
    }

    /**
     * @param userId
     *            null.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /** @return null. */
    @Column(name = "CREATOR", length = 64)
    public String getCreator() {
        return this.creator;
    }

    /**
     * @param creator
     *            null.
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_TIME", length = 26)
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * @param createTime
     *            null.
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "EXPIRE_TIME", length = 26)
    public Date getExpireTime() {
        return this.expireTime;
    }

    /**
     * @param expireTime
     *            null.
     */
    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    /** @return null. */
    @Column(name = "STATUS", length = 50)
    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     *            null.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** @return null. */
    @Column(name = "PRIORITY")
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @param priority
     *            null.
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}
