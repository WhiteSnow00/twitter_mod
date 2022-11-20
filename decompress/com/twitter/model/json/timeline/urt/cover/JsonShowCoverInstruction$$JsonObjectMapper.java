// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.cover;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonShowCoverInstruction$$JsonObjectMapper extends JsonMapper<JsonShowCoverInstruction>
{
    public static JsonShowCoverInstruction _parse(final tge tge) throws IOException {
        final JsonShowCoverInstruction jsonShowCoverInstruction = new JsonShowCoverInstruction();
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
            parseField(jsonShowCoverInstruction, d, tge);
            tge.l0();
        }
        return jsonShowCoverInstruction;
    }
    
    public static void _serialize(final JsonShowCoverInstruction jsonShowCoverInstruction, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonShowCoverInstruction.b != null) {
            LoganSquare.typeConverterFor((Class)h0p.class).serialize((Object)jsonShowCoverInstruction.b, "clientEventInfo", true, afe);
        }
        if (jsonShowCoverInstruction.a != null) {
            LoganSquare.typeConverterFor((Class)pov.class).serialize((Object)jsonShowCoverInstruction.a, "cover", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonShowCoverInstruction jsonShowCoverInstruction, final String s, final tge tge) throws IOException {
        if ("clientEventInfo".equals(s)) {
            jsonShowCoverInstruction.b = (h0p)LoganSquare.typeConverterFor((Class)h0p.class).parse(tge);
        }
        else if ("cover".equals(s)) {
            jsonShowCoverInstruction.a = (pov)LoganSquare.typeConverterFor((Class)pov.class).parse(tge);
        }
    }
    
    public JsonShowCoverInstruction parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonShowCoverInstruction jsonShowCoverInstruction, final afe afe, final boolean b) throws IOException {
        _serialize(jsonShowCoverInstruction, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonShowCoverInstruction)o, afe, b);
    }
}
