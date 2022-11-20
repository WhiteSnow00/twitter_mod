// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLiveSportsScore$JsonLiveSportsScoreData$$JsonObjectMapper extends JsonMapper<JsonLiveSportsScore.JsonLiveSportsScoreData>
{
    public static JsonLiveSportsScore.JsonLiveSportsScoreData _parse(final tge tge) throws IOException {
        final JsonLiveSportsScore.JsonLiveSportsScoreData jsonLiveSportsScoreData = new JsonLiveSportsScore.JsonLiveSportsScoreData();
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
            parseField(jsonLiveSportsScoreData, d, tge);
            tge.l0();
        }
        return jsonLiveSportsScoreData;
    }
    
    public static void _serialize(final JsonLiveSportsScore.JsonLiveSportsScoreData jsonLiveSportsScoreData, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonLiveSportsScoreData.a != null) {
            LoganSquare.typeConverterFor((Class)mph.class).serialize((Object)jsonLiveSportsScoreData.a, "moments", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonLiveSportsScore.JsonLiveSportsScoreData jsonLiveSportsScoreData, final String s, final tge tge) throws IOException {
        if ("moments".equals(s)) {
            jsonLiveSportsScoreData.a = (mph)LoganSquare.typeConverterFor((Class)mph.class).parse(tge);
        }
    }
    
    public JsonLiveSportsScore.JsonLiveSportsScoreData parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonLiveSportsScore.JsonLiveSportsScoreData jsonLiveSportsScoreData, final afe afe, final boolean b) throws IOException {
        _serialize(jsonLiveSportsScoreData, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonLiveSportsScore.JsonLiveSportsScoreData)o, afe, b);
    }
}
