// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelinesScoreInfo$$JsonObjectMapper extends JsonMapper<JsonTimelinesScoreInfo>
{
    public static JsonTimelinesScoreInfo _parse(final khe khe) throws IOException {
        final JsonTimelinesScoreInfo jsonTimelinesScoreInfo = new JsonTimelinesScoreInfo();
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
            parseField(jsonTimelinesScoreInfo, d, khe);
            khe.m0();
        }
        return jsonTimelinesScoreInfo;
    }
    
    public static void _serialize(final JsonTimelinesScoreInfo jsonTimelinesScoreInfo, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.P("score", jsonTimelinesScoreInfo.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTimelinesScoreInfo jsonTimelinesScoreInfo, final String s, final khe khe) throws IOException {
        if ("score".equals(s)) {
            jsonTimelinesScoreInfo.a = (float)khe.p();
        }
    }
    
    public JsonTimelinesScoreInfo parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTimelinesScoreInfo jsonTimelinesScoreInfo, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonTimelinesScoreInfo, tfe, b);
    }
}
