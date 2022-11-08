// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.message;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonURTMessageTextAction$$JsonObjectMapper extends JsonMapper<JsonURTMessageTextAction>
{
    public static JsonURTMessageTextAction _parse(final khe khe) throws IOException {
        final JsonURTMessageTextAction jsonURTMessageTextAction = new JsonURTMessageTextAction();
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
            parseField(jsonURTMessageTextAction, d, khe);
            khe.m0();
        }
        return jsonURTMessageTextAction;
    }
    
    public static void _serialize(final JsonURTMessageTextAction jsonURTMessageTextAction, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonURTMessageTextAction.b != null) {
            LoganSquare.typeConverterFor((Class)apv.class).serialize((Object)jsonURTMessageTextAction.b, "action", true, tfe);
        }
        tfe.u0("text", jsonURTMessageTextAction.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonURTMessageTextAction jsonURTMessageTextAction, final String s, final khe khe) throws IOException {
        if ("action".equals(s)) {
            jsonURTMessageTextAction.b = (apv)LoganSquare.typeConverterFor((Class)apv.class).parse(khe);
        }
        else if ("text".equals(s)) {
            jsonURTMessageTextAction.a = khe.T((String)null);
        }
    }
    
    public JsonURTMessageTextAction parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonURTMessageTextAction jsonURTMessageTextAction, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonURTMessageTextAction, tfe, b);
    }
}
