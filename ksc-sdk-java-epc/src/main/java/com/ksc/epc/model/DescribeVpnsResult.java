package com.ksc.epc.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of DescribeVpns.
 * </p>
 */
public class DescribeVpnsResult implements Serializable, Cloneable {

    private String RequestId;
    private String UserName;
    private String Password;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeVpnsResult that = (DescribeVpnsResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (UserName != null ? !UserName.equals(that.UserName) : that.UserName != null) return false;
        if (Password != null ? !Password.equals(that.Password) : that.Password != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (UserName != null ? UserName.hashCode() : 0);
        result = 31 * result + (Password != null ? Password.hashCode() : 0);
        return result;
    }

    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPassword() {
        return Password;
    }


    @Override
    public DescribeVpnsResult clone() {
        try {
            return (DescribeVpnsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }

    public String toString() {
        return "DescribeVpnsResult(RequestId=" + this.getRequestId() + ",UserName=" + this.getUserName() + ",Password=" + this.getPassword() + ")";
    }
}
