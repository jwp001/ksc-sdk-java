package com.ksc.epc.model.transform;

import com.ksc.epc.model.BuyAccessoryResult;
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
 * BuyAccessoryResult Json Unmarshaller
 */
public class BuyAccessoryResultJsonUnmarshaller implements Unmarshaller<BuyAccessoryResult, JsonUnmarshallerContext> {
    @Override
    public BuyAccessoryResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        BuyAccessoryResult buyAccessoryResult = new BuyAccessoryResult();
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
                    buyAccessoryResult.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                if (context.testExpression("Accessory", targetDepth)) {
                    context.nextToken();
                    buyAccessoryResult.setAccessory(AccessoryJsonUnmarshaller.getInstance().unmarshall(context));
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
        return buyAccessoryResult;
    }

    private static BuyAccessoryResultJsonUnmarshaller instance;

    public static BuyAccessoryResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BuyAccessoryResultJsonUnmarshaller();
        return instance;
    }
}
