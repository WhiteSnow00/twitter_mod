// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLiveSportsScore$JsonLiveSportsScoreData$$JsonObjectMapper extends JsonMapper<JsonLiveSportsScore.JsonLiveSportsScoreData>
{
    public static JsonLiveSportsScore.JsonLiveSportsScoreData _parse(final khe khe) throws IOException {
        final JsonLiveSportsScore.JsonLiveSportsScoreData jsonLiveSportsScoreData = new JsonLiveSportsScore.JsonLiveSportsScoreData();
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
            parseField(jsonLiveSportsScoreData, d, khe);
            khe.m0();
        }
        return jsonLiveSportsScoreData;
    }
    
    public static void _serialize(final JsonLiveSportsScore.JsonLiveSportsScoreData jsonLiveSportsScoreData, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonLiveSportsScoreData.a != null) {
            LoganSquare.typeConverterFor((Class)hph.class).serialize((Object)jsonLiveSportsScoreData.a, "moments", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonLiveSportsScore.JsonLiveSportsScoreData jsonLiveSportsScoreData, final String s, final khe khe) throws IOException {
        if ("moments".equals(s)) {
            jsonLiveSportsScoreData.a = (hph)LoganSquare.typeConverterFor((Class)hph.class).parse(khe);
        }
    }
    
    public JsonLiveSportsScore.JsonLiveSportsScoreData parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonLiveSportsScore.JsonLiveSportsScoreData jsonLiveSportsScoreData, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonLiveSportsScoreData, tfe, b);
    }
}
