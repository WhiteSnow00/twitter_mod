// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSubtaskNavigationContext$$JsonObjectMapper extends JsonMapper<JsonSubtaskNavigationContext>
{
    public static final ysr SUBTASK_NAVIGATION_CONTEXT_ACTION_TYPE_CONVERTER;
    
    static {
        SUBTASK_NAVIGATION_CONTEXT_ACTION_TYPE_CONVERTER = new ysr();
    }
    
    public static JsonSubtaskNavigationContext _parse(final tge tge) throws IOException {
        final JsonSubtaskNavigationContext jsonSubtaskNavigationContext = new JsonSubtaskNavigationContext();
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
            parseField(jsonSubtaskNavigationContext, d, tge);
            tge.l0();
        }
        return jsonSubtaskNavigationContext;
    }
    
    public static void _serialize(final JsonSubtaskNavigationContext jsonSubtaskNavigationContext, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        ((StringBasedTypeConverter)JsonSubtaskNavigationContext$$JsonObjectMapper.SUBTASK_NAVIGATION_CONTEXT_ACTION_TYPE_CONVERTER).serialize((Object)jsonSubtaskNavigationContext.a, "action", true, afe);
        afe.t0("text", jsonSubtaskNavigationContext.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonSubtaskNavigationContext jsonSubtaskNavigationContext, final String s, final tge tge) throws IOException {
        if ("action".equals(s)) {
            jsonSubtaskNavigationContext.a = (int)((StringBasedTypeConverter)JsonSubtaskNavigationContext$$JsonObjectMapper.SUBTASK_NAVIGATION_CONTEXT_ACTION_TYPE_CONVERTER).parse(tge);
        }
        else if ("text".equals(s)) {
            jsonSubtaskNavigationContext.b = tge.T((String)null);
        }
    }
    
    public JsonSubtaskNavigationContext parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonSubtaskNavigationContext jsonSubtaskNavigationContext, final afe afe, final boolean b) throws IOException {
        _serialize(jsonSubtaskNavigationContext, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonSubtaskNavigationContext)o, afe, b);
    }
}
