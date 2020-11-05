package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.CreateKeyRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for CreateKey.
 * </p>
 */
public class CreateKeyRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<CreateKeyRequest> {

    /**
     * 密钥名称
     */
    private String keyName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateKeyRequest that = (CreateKeyRequest) o;
        if (keyName != null ? !keyName.equals(that.keyName) : that.keyName != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (keyName != null ? keyName.hashCode() : 0);
        return result;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public String getKeyName() {
        return keyName;
    }


    @Override
    public Request<CreateKeyRequest> getDryRunRequest() {
        Request<CreateKeyRequest> request = new CreateKeyRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public CreateKeyRequest clone() {
        return (CreateKeyRequest) super.clone();
    }

    public String toString() {
        return "CreateKeyRequest(KeyName=" + this.getKeyName() + ")";
    }
}

