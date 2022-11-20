// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineOperation$$JsonObjectMapper extends JsonMapper<JsonTimelineOperation>
{
    public static JsonTimelineOperation _parse(final tge tge) throws IOException {
        final JsonTimelineOperation jsonTimelineOperation = new JsonTimelineOperation();
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
            parseField(jsonTimelineOperation, d, tge);
            tge.l0();
        }
        return jsonTimelineOperation;
    }
    
    public static void _serialize(final JsonTimelineOperation jsonTimelineOperation, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonTimelineOperation.a != null) {
            LoganSquare.typeConverterFor((Class)oqv.class).serialize((Object)jsonTimelineOperation.a, "cursor", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTimelineOperation jsonTimelineOperation, final String s, final tge tge) throws IOException {
        if ("cursor".equals(s)) {
            jsonTimelineOperation.a = (oqv)LoganSquare.typeConverterFor((Class)oqv.class).parse(tge);
        }
    }
    
    public JsonTimelineOperation parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTimelineOperation jsonTimelineOperation, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTimelineOperation, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTimelineOperation)o, afe, b);
    }
}
