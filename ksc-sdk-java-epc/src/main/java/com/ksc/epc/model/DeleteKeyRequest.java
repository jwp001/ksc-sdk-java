package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.DeleteKeyRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DeleteKey.
 * </p>
 */
public class DeleteKeyRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteKeyRequest> {

    /**
     * 密钥ID
     */
    private String keyId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DeleteKeyRequest that = (DeleteKeyRequest) o;
        if (keyId != null ? !keyId.equals(that.keyId) : that.keyId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (keyId != null ? keyId.hashCode() : 0);
        return result;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getKeyId() {
        return keyId;
    }


    @Override
    public Request<DeleteKeyRequest> getDryRunRequest() {
        Request<DeleteKeyRequest> request = new DeleteKeyRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DeleteKeyRequest clone() {
        return (DeleteKeyRequest) super.clone();
    }

    public String toString() {
        return "DeleteKeyRequest(KeyId=" + this.getKeyId() + ")";
    }
}

