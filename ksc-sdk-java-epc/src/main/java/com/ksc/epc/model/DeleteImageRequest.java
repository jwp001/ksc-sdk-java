package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.DeleteImageRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DeleteImage.
 * </p>
 */
public class DeleteImageRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteImageRequest> {

    /**
     * 镜像ID
     */
    private String imageId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DeleteImageRequest that = (DeleteImageRequest) o;
        if (imageId != null ? !imageId.equals(that.imageId) : that.imageId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (imageId != null ? imageId.hashCode() : 0);
        return result;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getImageId() {
        return imageId;
    }


    @Override
    public Request<DeleteImageRequest> getDryRunRequest() {
        Request<DeleteImageRequest> request = new DeleteImageRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DeleteImageRequest clone() {
        return (DeleteImageRequest) super.clone();
    }

    public String toString() {
        return "DeleteImageRequest(ImageId=" + this.getImageId() + ")";
    }
}

