package com.ksc.epc.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of CreateKey.
 * </p>
 */
public class CreateKeyResult implements Serializable, Cloneable {

    private String RequestId;
    private String PrivateKey;
    private Key Key;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateKeyResult that = (CreateKeyResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (PrivateKey != null ? !PrivateKey.equals(that.PrivateKey) : that.PrivateKey != null) return false;
        if (Key != null ? !Key.equals(that.Key) : that.Key != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (PrivateKey != null ? PrivateKey.hashCode() : 0);
        result = 31 * result + (Key != null ? Key.hashCode() : 0);
        return result;
    }

    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    public String getPrivateKey() {
        return PrivateKey;
    }

    public void setKey(Key Key) {
        this.Key = Key;
    }

    public Key getKey() {
        return Key;
    }


    @Override
    public CreateKeyResult clone() {
        try {
            return (CreateKeyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }

    public String toString() {
        return "CreateKeyResult(RequestId=" + this.getRequestId() + ",PrivateKey=" + this.getPrivateKey() + ",Key=" + this.getKey() + ")";
    }
}
