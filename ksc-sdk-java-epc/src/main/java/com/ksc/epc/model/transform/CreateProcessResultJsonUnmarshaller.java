package com.ksc.epc.model.transform;

import com.ksc.epc.model.CreateProcessResult;
import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.ListUnmarshaller;
import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

/**
 * CreateProcessResult Json Unmarshaller
 */
public class CreateProcessResultJsonUnmarshaller implements Unmarshaller<CreateProcessResult, JsonUnmarshallerContext> {
    @Override
    public CreateProcessResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateProcessResult createProcessResult = new CreateProcessResult();
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
        token = context.nextToken();
        if (token == VALUE_NULL)
        return null;
        while (true) {
            if (token == null)
            break;
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("RequestId", targetDepth)) {
                    context.nextToken();
                    createProcessResult.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                if (context.testExpression("Return", targetDepth)) {
                    context.nextToken();
                    createProcessResult.setReturn(context.getUnmarshaller(Boolean.class).unmarshall(context));
                    }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }
        return createProcessResult;
    }

    private static CreateProcessResultJsonUnmarshaller instance;

    public static CreateProcessResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateProcessResultJsonUnmarshaller();
        return instance;
    }
}
