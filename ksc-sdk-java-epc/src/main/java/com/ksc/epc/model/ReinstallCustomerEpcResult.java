package com.ksc.epc.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of ReinstallCustomerEpc.
 * </p>
 */
public class ReinstallCustomerEpcResult implements Serializable, Cloneable {

    private String RequestId;
    private Boolean Return;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ReinstallCustomerEpcResult that = (ReinstallCustomerEpcResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (Return != null ? !Return.equals(that.Return) : that.Return != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (Return != null ? Return.hashCode() : 0);
        return result;
    }

    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setReturn(Boolean Return) {
        this.Return = Return;
    }

    public Boolean getReturn() {
        return Return;
    }


    @Override
    public ReinstallCustomerEpcResult clone() {
        try {
            return (ReinstallCustomerEpcResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }

    public String toString() {
        return "ReinstallCustomerEpcResult(RequestId=" + this.getRequestId() + ",Return=" + this.getReturn() + ")";
    }
}
