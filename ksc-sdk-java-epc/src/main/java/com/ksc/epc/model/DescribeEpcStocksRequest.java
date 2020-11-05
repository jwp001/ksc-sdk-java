package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.DescribeEpcStocksRequestMarshaller;
import com.ksc.model.Filter;
import java.util.List;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DescribeEpcStocks.
 * </p>
 */
public class DescribeEpcStocksRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DescribeEpcStocksRequest> {

    /**
     * 过滤器
     */
    private com.ksc.internal.SdkInternalList<Filter> filters;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeEpcStocksRequest that = (DescribeEpcStocksRequest) o;
        if (filters != null ? !filters.equals(that.filters) : that.filters != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (filters != null ? filters.hashCode() : 0);
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


    @Override
    public Request<DescribeEpcStocksRequest> getDryRunRequest() {
        Request<DescribeEpcStocksRequest> request = new DescribeEpcStocksRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DescribeEpcStocksRequest clone() {
        return (DescribeEpcStocksRequest) super.clone();
    }

    public String toString() {
        return "DescribeEpcStocksRequest(filters=" + this.getFilters() + ")";
    }
}

