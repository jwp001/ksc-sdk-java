package com.ksc.epc.model;

import java.io.Serializable;
import com.ksc.internal.SdkInternalList;
import java.util.List;

/**
 * <p>
 * Contains the output of DescribeImages.
 * </p>
 */
public class DescribeImagesResult implements Serializable, Cloneable {

    private String RequestId;
    private SdkInternalList<Image> ImageSet;
    private Integer TotalCount;
    private String NextToken;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeImagesResult that = (DescribeImagesResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (ImageSet != null ? !ImageSet.equals(that.ImageSet) : that.ImageSet != null) return false;
        if (TotalCount != null ? !TotalCount.equals(that.TotalCount) : that.TotalCount != null) return false;
        if (NextToken != null ? !NextToken.equals(that.NextToken) : that.NextToken != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (ImageSet != null ? ImageSet.hashCode() : 0);
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

    public void addImageSet(Image... images) {
		if (this.ImageSet == null) {
			this.ImageSet = new SdkInternalList<Image>();
		}
		for (Image image : images) {
			this.ImageSet.add(image);
		}
	}

    public void setImageSet(List<Image> images) {
        this.ImageSet = new SdkInternalList<Image>(images);
    }

    public  List<Image> getImageSet() {
        return ImageSet;
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
    public DescribeImagesResult clone() {
        try {
            return (DescribeImagesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }

    public String toString() {
        return "DescribeImagesResult(RequestId=" + this.getRequestId() + ",ImageSet=" + this.getImageSet() + ",TotalCount=" + this.getTotalCount() + ",NextToken=" + this.getNextToken() + ")";
    }
}
