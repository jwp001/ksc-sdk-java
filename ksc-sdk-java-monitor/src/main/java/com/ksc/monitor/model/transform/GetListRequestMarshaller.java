package com.ksc.monitor.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kvs.model.GetListRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class GetListRequestMarshaller implements
Marshaller<Request<GetListRequest>, GetListRequest> {

	public Request<GetListRequest> marshall(GetListRequest kvsRequest) {
		if (kvsRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }
		Request<GetListRequest> request = new DefaultRequest<GetListRequest>(
				kvsRequest, "kvs");
		
        request.addParameter("Action", "GetPresetList");
        String version=kvsRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
        	version="2017-01-01";
        }
        request.addParameter("Version", version);
        
        request.addParameter("PresetType", StringUtils.fromString(kvsRequest.getPresettype()));
        
        
        if(kvsRequest.getPresettype()!=null){
        	request.addParameter("PresetType", StringUtils.fromString(kvsRequest.getPresettype()));
        }
        if(kvsRequest.getPreset()!=null){
        	request.addParameter("Presets", StringUtils.fromString(kvsRequest.getPreset()));
        }
        
        request.addParameter("WithDetail", StringUtils.fromInteger(kvsRequest.getWithDetail()));
       
        
        request.setHttpMethod(HttpMethodName.GET);
      
		return request;
	}

}
