package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.DescribeProcessesRequestMarshaller;
import com.ksc.model.Filter;
import java.util.List;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DescribeProcesses.
 * </p>
 */
public class DescribeProcessesRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DescribeProcessesRequest> {

    /**
     * 过滤器
     */
    private com.ksc.internal.SdkInternalList<Filter> filters;
    /**
     * 工单的ID
     */
    private com.ksc.internal.SdkInternalList<String> operationProcessIds;
    /**
     * 单次调用可返回的最大条目数量.
     */
    private String maxResults;
    /**
     * 获取另一页返回结果的 token.
     */
    private String nextToken;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeProcessesRequest that = (DescribeProcessesRequest) o;
        if (filters != null ? !filters.equals(that.filters) : that.filters != null)
            return false;
        if (operationProcessIds != null ? !operationProcessIds.equals(that.operationProcessIds) : that.operationProcessIds != null)
            return false;
        if (maxResults != null ? !maxResults.equals(that.maxResults) : that.maxResults != null)
            return false;
        if (nextToken != null ? !nextToken.equals(that.nextToken) : that.nextToken != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (filters != null ? filters.hashCode() : 0);
        result = 31 * result + (operationProcessIds != null ? operationProcessIds.hashCode() : 0);
        result = 31 * result + (maxResults != null ? maxResults.hashCode() : 0);
        result = 31 * result + (nextToken != null ? nextToken.hashCode() : 0);
        return result;
    }

    public void addFilters(Filter... filters) {
		if (this.filters == null) {
			this.filters = new com.ksc.internal.SdkInternalList<Filter>();
		}
		for (Filter filter : filters) {
			this.filters.add(filter);
		}
	}
    public void setFilters(List<Filter> filters) {
        this.filters = new com.ksc.internal.SdkInternalList<Filter>(filters);
    }
    public  List<Filter> getFilters() {
        return filters;
    }
    public void addOperationProcessIds(String... operationProcessIds){
        if (this.operationProcessIds == null) {
            this.operationProcessIds = new com.ksc.internal.SdkInternalList<String>();
        }
        for(String value : operationProcessIds){
            this.operationProcessIds.add(value);
        }
    }
    public void setOperationProcessIds(List<String> operationProcessIds) {
        this.operationProcessIds = new com.ksc.internal.SdkInternalList<String>(operationProcessIds);
    }
    public  List<String> getOperationProcessIds() {
        return operationProcessIds;
    }
    public void setMaxResults(String maxResults) {
        this.maxResults = maxResults;
    }
    public String getMaxResults() {
        return maxResults;
    }
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    public String getNextToken() {
        return nextToken;
    }

    @Override
    public Request<DescribeProcessesRequest> getDryRunRequest() {
        Request<DescribeProcessesRequest> request = new DescribeProcessesRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DescribeProcessesRequest clone() {
        return (DescribeProcessesRequest) super.clone();
    }
}

