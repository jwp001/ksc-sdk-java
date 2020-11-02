package com.ksc.epc.model.transform;

import com.ksc.epc.model.PhysicalDiskDevice;
import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.ListUnmarshaller;
import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

public class PhysicalDiskDeviceJsonUnmarshaller implements Unmarshaller<PhysicalDiskDevice, JsonUnmarshallerContext> {
    private static PhysicalDiskDeviceJsonUnmarshaller instance;

    public static PhysicalDiskDeviceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PhysicalDiskDeviceJsonUnmarshaller();
        return instance;
    }

    @Override
    public PhysicalDiskDevice unmarshall(JsonUnmarshallerContext context) throws Exception {
        PhysicalDiskDevice PhysicalDiskDevice = new PhysicalDiskDevice();
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
                    if (context.testExpression("DiskAttribute", targetDepth)) {
                        context.nextToken();
                        PhysicalDiskDevice.setDiskAttribute(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("DiskCount", targetDepth)) {
                        context.nextToken();
                        PhysicalDiskDevice.setDiskCount(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("Space", targetDepth)) {
                        context.nextToken();
                        PhysicalDiskDevice.setSpace(context.getUnmarshaller(String.class).unmarshall(context));
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
        return PhysicalDiskDevice;
    }
}
