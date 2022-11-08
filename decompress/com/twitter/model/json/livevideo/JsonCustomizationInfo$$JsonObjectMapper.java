// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.livevideo;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonCustomizationInfo$$JsonObjectMapper extends JsonMapper<JsonCustomizationInfo>
{
    public static JsonCustomizationInfo _parse(final khe khe) throws IOException {
        final JsonCustomizationInfo jsonCustomizationInfo = new JsonCustomizationInfo();
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
            parseField(jsonCustomizationInfo, d, khe);
            khe.m0();
        }
        return jsonCustomizationInfo;
    }
    
    public static void _serialize(final JsonCustomizationInfo jsonCustomizationInfo, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonCustomizationInfo.a != null) {
            LoganSquare.typeConverterFor((Class)v7d.class).serialize((Object)jsonCustomizationInfo.a, "badge_media", true, tfe);
        }
        tfe.u0("title_color", jsonCustomizationInfo.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonCustomizationInfo jsonCustomizationInfo, final String s, final khe khe) throws IOException {
        if ("badge_media".equals(s)) {
            jsonCustomizationInfo.a = (v7d)LoganSquare.typeConverterFor((Class)v7d.class).parse(khe);
        }
        else if ("title_color".equals(s)) {
            jsonCustomizationInfo.b = khe.T((String)null);
        }
    }
    
    public JsonCustomizationInfo parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonCustomizationInfo jsonCustomizationInfo, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonCustomizationInfo, tfe, b);
    }
}
