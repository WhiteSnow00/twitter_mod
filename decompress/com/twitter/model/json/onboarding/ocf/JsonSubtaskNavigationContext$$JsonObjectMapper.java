// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSubtaskNavigationContext$$JsonObjectMapper extends JsonMapper<JsonSubtaskNavigationContext>
{
    public static final wtr SUBTASK_NAVIGATION_CONTEXT_ACTION_TYPE_CONVERTER;
    
    static {
        SUBTASK_NAVIGATION_CONTEXT_ACTION_TYPE_CONVERTER = new wtr();
    }
    
    public static JsonSubtaskNavigationContext _parse(final qhe qhe) throws IOException {
        final JsonSubtaskNavigationContext jsonSubtaskNavigationContext = new JsonSubtaskNavigationContext();
        if (qhe.e() == null) {
            qhe.i0();
        }
        if (qhe.e() != rje.N0) {
            qhe.m0();
            return null;
        }
        while (qhe.i0() != rje.O0) {
            final String d = qhe.d();
            qhe.i0();
            parseField(jsonSubtaskNavigationContext, d, qhe);
            qhe.m0();
        }
        return jsonSubtaskNavigationContext;
    }
    
    public static void _serialize(final JsonSubtaskNavigationContext jsonSubtaskNavigationContext, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        ((StringBasedTypeConverter)JsonSubtaskNavigationContext$$JsonObjectMapper.SUBTASK_NAVIGATION_CONTEXT_ACTION_TYPE_CONVERTER).serialize((Object)jsonSubtaskNavigationContext.a, "action", true, yfe);
        yfe.u0("text", jsonSubtaskNavigationContext.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSubtaskNavigationContext jsonSubtaskNavigationContext, final String s, final qhe qhe) throws IOException {
        if ("action".equals(s)) {
            jsonSubtaskNavigationContext.a = (int)((StringBasedTypeConverter)JsonSubtaskNavigationContext$$JsonObjectMapper.SUBTASK_NAVIGATION_CONTEXT_ACTION_TYPE_CONVERTER).parse(qhe);
        }
        else if ("text".equals(s)) {
            jsonSubtaskNavigationContext.b = qhe.T((String)null);
        }
    }
    
    public JsonSubtaskNavigationContext parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSubtaskNavigationContext jsonSubtaskNavigationContext, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonSubtaskNavigationContext, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSubtaskNavigationContext)o, yfe, b);
    }
}
