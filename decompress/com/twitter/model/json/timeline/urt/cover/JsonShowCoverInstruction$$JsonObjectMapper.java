// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.cover;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonShowCoverInstruction$$JsonObjectMapper extends JsonMapper<JsonShowCoverInstruction>
{
    public static JsonShowCoverInstruction _parse(final khe khe) throws IOException {
        final JsonShowCoverInstruction jsonShowCoverInstruction = new JsonShowCoverInstruction();
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
            parseField(jsonShowCoverInstruction, d, khe);
            khe.m0();
        }
        return jsonShowCoverInstruction;
    }
    
    public static void _serialize(final JsonShowCoverInstruction jsonShowCoverInstruction, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonShowCoverInstruction.b != null) {
            LoganSquare.typeConverterFor((Class)qzo.class).serialize((Object)jsonShowCoverInstruction.b, "clientEventInfo", true, tfe);
        }
        if (jsonShowCoverInstruction.a != null) {
            LoganSquare.typeConverterFor((Class)qnv.class).serialize((Object)jsonShowCoverInstruction.a, "cover", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonShowCoverInstruction jsonShowCoverInstruction, final String s, final khe khe) throws IOException {
        if ("clientEventInfo".equals(s)) {
            jsonShowCoverInstruction.b = (qzo)LoganSquare.typeConverterFor((Class)qzo.class).parse(khe);
        }
        else if ("cover".equals(s)) {
            jsonShowCoverInstruction.a = (qnv)LoganSquare.typeConverterFor((Class)qnv.class).parse(khe);
        }
    }
    
    public JsonShowCoverInstruction parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonShowCoverInstruction jsonShowCoverInstruction, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonShowCoverInstruction, tfe, b);
    }
}
