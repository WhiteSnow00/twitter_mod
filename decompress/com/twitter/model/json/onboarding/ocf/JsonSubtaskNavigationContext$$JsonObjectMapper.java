// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSubtaskNavigationContext$$JsonObjectMapper extends JsonMapper<JsonSubtaskNavigationContext>
{
    public static final gsr SUBTASK_NAVIGATION_CONTEXT_ACTION_TYPE_CONVERTER;
    
    static {
        SUBTASK_NAVIGATION_CONTEXT_ACTION_TYPE_CONVERTER = new gsr();
    }
    
    public static JsonSubtaskNavigationContext _parse(final khe khe) throws IOException {
        final JsonSubtaskNavigationContext jsonSubtaskNavigationContext = new JsonSubtaskNavigationContext();
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
            parseField(jsonSubtaskNavigationContext, d, khe);
            khe.m0();
        }
        return jsonSubtaskNavigationContext;
    }
    
    public static void _serialize(final JsonSubtaskNavigationContext jsonSubtaskNavigationContext, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        ((StringBasedTypeConverter)JsonSubtaskNavigationContext$$JsonObjectMapper.SUBTASK_NAVIGATION_CONTEXT_ACTION_TYPE_CONVERTER).serialize((Object)jsonSubtaskNavigationContext.a, "action", true, tfe);
        tfe.u0("text", jsonSubtaskNavigationContext.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonSubtaskNavigationContext jsonSubtaskNavigationContext, final String s, final khe khe) throws IOException {
        if ("action".equals(s)) {
            jsonSubtaskNavigationContext.a = (int)((StringBasedTypeConverter)JsonSubtaskNavigationContext$$JsonObjectMapper.SUBTASK_NAVIGATION_CONTEXT_ACTION_TYPE_CONVERTER).parse(khe);
        }
        else if ("text".equals(s)) {
            jsonSubtaskNavigationContext.b = khe.T((String)null);
        }
    }
    
    public JsonSubtaskNavigationContext parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonSubtaskNavigationContext jsonSubtaskNavigationContext, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonSubtaskNavigationContext, tfe, b);
    }
}
