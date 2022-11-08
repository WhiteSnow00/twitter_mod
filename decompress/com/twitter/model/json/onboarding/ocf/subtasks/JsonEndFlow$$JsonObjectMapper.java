// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonEndFlow$$JsonObjectMapper extends JsonMapper<JsonEndFlow>
{
    public static final bbi NAVIGATION_LINK_TYPE_TYPE_CONVERTER;
    public static final kfr STATUS_TYPE_CONVERTER;
    
    static {
        STATUS_TYPE_CONVERTER = new kfr();
        NAVIGATION_LINK_TYPE_TYPE_CONVERTER = new bbi();
    }
    
    public static JsonEndFlow _parse(final khe khe) throws IOException {
        final JsonEndFlow jsonEndFlow = new JsonEndFlow();
        if (khe.e() == null) {
            khe.i0();
        }
        if (khe.e() != lje.K0) {
            khe.m0();
            return null;
        }
        while (khe.i0() != lje.L0) {
            final String d = khe.d();
            khe.i0();
            parseField(jsonEndFlow, d, khe);
            khe.m0();
        }
        return jsonEndFlow;
    }
    
    public static void _serialize(final JsonEndFlow jsonEndFlow, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        ((StringBasedTypeConverter)JsonEndFlow$$JsonObjectMapper.NAVIGATION_LINK_TYPE_TYPE_CONVERTER).serialize((Object)jsonEndFlow.b, "end_flow_type", true, tfe);
        ((StringBasedTypeConverter)JsonEndFlow$$JsonObjectMapper.STATUS_TYPE_CONVERTER).serialize((Object)jsonEndFlow.a, "status", true, tfe);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonEndFlow jsonEndFlow, final String s, final khe khe) throws IOException {
        if ("end_flow_type".equals(s)) {
            jsonEndFlow.b = (int)((StringBasedTypeConverter)JsonEndFlow$$JsonObjectMapper.NAVIGATION_LINK_TYPE_TYPE_CONVERTER).parse(khe);
        }
        else if ("status".equals(s)) {
            jsonEndFlow.a = (int)((StringBasedTypeConverter)JsonEndFlow$$JsonObjectMapper.STATUS_TYPE_CONVERTER).parse(khe);
        }
    }
    
    public JsonEndFlow parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonEndFlow jsonEndFlow, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonEndFlow, tfe, b);
    }
}
