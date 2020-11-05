package com.ksc.epc.model;

import java.io.Serializable;
import com.ksc.internal.SdkInternalList;
import java.util.List;

/**
 * <p>
 * Contains the output of DescribeInspections.
 * </p>
 */
public class DescribeInspectionsResult implements Serializable, Cloneable {

    private String RequestId;
    private SdkInternalList<Inspection> InspectionSet;
    private Integer TotalCount;
    private String NextToken;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeInspectionsResult that = (DescribeInspectionsResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (InspectionSet != null ? !InspectionSet.equals(that.InspectionSet) : that.InspectionSet != null) return false;
        if (TotalCount != null ? !TotalCount.equals(that.TotalCount) : that.TotalCount != null) return false;
        if (NextToken != null ? !NextToken.equals(that.NextToken) : that.NextToken != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (InspectionSet != null ? InspectionSet.hashCode() : 0);
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

    public void addInspectionSet(Inspection... inspections) {
		if (this.InspectionSet == null) {
			this.InspectionSet = new SdkInternalList<Inspection>();
		}
		for (Inspection inspection : inspections) {
			this.InspectionSet.add(inspection);
		}
	}

    public void setInspectionSet(List<Inspection> inspections) {
        this.InspectionSet = new SdkInternalList<Inspection>(inspections);
    }

    public  List<Inspection> getInspectionSet() {
        return InspectionSet;
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
    public DescribeInspectionsResult clone() {
        try {
            return (DescribeInspectionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }

    public String toString() {
        return "DescribeInspectionsResult(RequestId=" + this.getRequestId() + ",InspectionSet=" + this.getInspectionSet() + ",TotalCount=" + this.getTotalCount() + ",NextToken=" + this.getNextToken() + ")";
    }
}
