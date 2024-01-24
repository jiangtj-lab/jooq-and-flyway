/*
 * This file is generated by jOOQ.
 */
package com.jiangtj.demovdsegf.jooq.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * 管理员帐号
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public record AdminUser(
    Long id,
    LocalDateTime createTime,
    LocalDateTime modifyTime,
    String username,
    String password,
    Byte isDeleted
) implements Serializable {

    private static final long serialVersionUID = 1L;


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final AdminUser other = (AdminUser) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.createTime == null) {
            if (other.createTime != null)
                return false;
        }
        else if (!this.createTime.equals(other.createTime))
            return false;
        if (this.modifyTime == null) {
            if (other.modifyTime != null)
                return false;
        }
        else if (!this.modifyTime.equals(other.modifyTime))
            return false;
        if (this.username == null) {
            if (other.username != null)
                return false;
        }
        else if (!this.username.equals(other.username))
            return false;
        if (this.password == null) {
            if (other.password != null)
                return false;
        }
        else if (!this.password.equals(other.password))
            return false;
        if (this.isDeleted == null) {
            if (other.isDeleted != null)
                return false;
        }
        else if (!this.isDeleted.equals(other.isDeleted))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.createTime == null) ? 0 : this.createTime.hashCode());
        result = prime * result + ((this.modifyTime == null) ? 0 : this.modifyTime.hashCode());
        result = prime * result + ((this.username == null) ? 0 : this.username.hashCode());
        result = prime * result + ((this.password == null) ? 0 : this.password.hashCode());
        result = prime * result + ((this.isDeleted == null) ? 0 : this.isDeleted.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AdminUser (");

        sb.append(id);
        sb.append(", ").append(createTime);
        sb.append(", ").append(modifyTime);
        sb.append(", ").append(username);
        sb.append(", ").append(password);
        sb.append(", ").append(isDeleted);

        sb.append(")");
        return sb.toString();
    }
}
