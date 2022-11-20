// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.livevideo;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonCustomizationInfo$$JsonObjectMapper extends JsonMapper<JsonCustomizationInfo>
{
    public static JsonCustomizationInfo _parse(final tge tge) throws IOException {
        final JsonCustomizationInfo jsonCustomizationInfo = new JsonCustomizationInfo();
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
            parseField(jsonCustomizationInfo, d, tge);
            tge.l0();
        }
        return jsonCustomizationInfo;
    }
    
    public static void _serialize(final JsonCustomizationInfo jsonCustomizationInfo, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonCustomizationInfo.a != null) {
            LoganSquare.typeConverterFor((Class)z6d.class).serialize((Object)jsonCustomizationInfo.a, "badge_media", true, afe);
        }
        afe.t0("title_color", jsonCustomizationInfo.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonCustomizationInfo jsonCustomizationInfo, final String s, final tge tge) throws IOException {
        if ("badge_media".equals(s)) {
            jsonCustomizationInfo.a = (z6d)LoganSquare.typeConverterFor((Class)z6d.class).parse(tge);
        }
        else if ("title_color".equals(s)) {
            jsonCustomizationInfo.b = tge.T((String)null);
        }
    }
    
    public JsonCustomizationInfo parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonCustomizationInfo jsonCustomizationInfo, final afe afe, final boolean b) throws IOException {
        _serialize(jsonCustomizationInfo, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonCustomizationInfo)o, afe, b);
    }
}
