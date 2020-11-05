package com.ksc.epc.model;

import java.io.Serializable;
import com.ksc.internal.SdkInternalList;
import java.util.List;

/**
 * <p>
 * Contains the output of DescribeKeys.
 * </p>
 */
public class DescribeKeysResult implements Serializable, Cloneable {

    private String RequestId;
    private SdkInternalList<Key> KeySet;
    private Integer TotalCount;
    private String NextToken;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeKeysResult that = (DescribeKeysResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (KeySet != null ? !KeySet.equals(that.KeySet) : that.KeySet != null) return false;
        if (TotalCount != null ? !TotalCount.equals(that.TotalCount) : that.TotalCount != null) return false;
        if (NextToken != null ? !NextToken.equals(that.NextToken) : that.NextToken != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (KeySet != null ? KeySet.hashCode() : 0);
        result = 31 * result + (TotalCount != null ? TotalCount.hashCode() : 0);
        result = 31 * result + (NextToken != null ? NextToken.hashCode() : 0);
        return result;
    }

    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void addKeySet(Key... keys) {
		if (this.KeySet == null) {
			this.KeySet = new SdkInternalList<Key>();
		}
		for (Key key : keys) {
			this.KeySet.add(key);
		}
	}

    public void setKeySet(List<Key> keys) {
        this.KeySet = new SdkInternalList<Key>(keys);
    }

    public  List<Key> getKeySet() {
        return KeySet;
    }

    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    public Integer getTotalCount() {
        return TotalCount;
    }

    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    public String getNextToken() {
        return NextToken;
    }


    @Override
    public DescribeKeysResult clone() {
        try {
            return (DescribeKeysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }

    public String toString() {
        return "DescribeKeysResult(RequestId=" + this.getRequestId() + ",KeySet=" + this.getKeySet() + ",TotalCount=" + this.getTotalCount() + ",NextToken=" + this.getNextToken() + ")";
    }
}
