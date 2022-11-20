// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonEndFlow$$JsonObjectMapper extends JsonMapper<JsonEndFlow>
{
    public static final dbi NAVIGATION_LINK_TYPE_TYPE_CONVERTER;
    public static final egr STATUS_TYPE_CONVERTER;
    
    static {
        STATUS_TYPE_CONVERTER = new egr();
        NAVIGATION_LINK_TYPE_TYPE_CONVERTER = new dbi();
    }
    
    public static JsonEndFlow _parse(final tge tge) throws IOException {
        final JsonEndFlow jsonEndFlow = new JsonEndFlow();
        if (tge.e() == null) {
            tge.h0();
        }
        if (tge.e() != vie.L0) {
            tge.l0();
            return null;
        }
        while (tge.h0() != vie.M0) {
            final String d = tge.d();
            tge.h0();
            parseField(jsonEndFlow, d, tge);
            tge.l0();
        }
        return jsonEndFlow;
    }
    
    public static void _serialize(final JsonEndFlow jsonEndFlow, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        ((StringBasedTypeConverter)JsonEndFlow$$JsonObjectMapper.NAVIGATION_LINK_TYPE_TYPE_CONVERTER).serialize((Object)jsonEndFlow.b, "end_flow_type", true, afe);
        ((StringBasedTypeConverter)JsonEndFlow$$JsonObjectMapper.STATUS_TYPE_CONVERTER).serialize((Object)jsonEndFlow.a, "status", true, afe);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonEndFlow jsonEndFlow, final String s, final tge tge) throws IOException {
        if ("end_flow_type".equals(s)) {
            jsonEndFlow.b = (int)((StringBasedTypeConverter)JsonEndFlow$$JsonObjectMapper.NAVIGATION_LINK_TYPE_TYPE_CONVERTER).parse(tge);
        }
        else if ("status".equals(s)) {
            jsonEndFlow.a = (int)((StringBasedTypeConverter)JsonEndFlow$$JsonObjectMapper.STATUS_TYPE_CONVERTER).parse(tge);
        }
    }
    
    public JsonEndFlow parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonEndFlow jsonEndFlow, final afe afe, final boolean b) throws IOException {
        _serialize(jsonEndFlow, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonEndFlow)o, afe, b);
    }
}
