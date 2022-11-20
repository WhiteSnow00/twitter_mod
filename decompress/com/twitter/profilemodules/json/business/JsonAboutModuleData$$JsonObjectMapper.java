// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.business;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAboutModuleData$$JsonObjectMapper extends JsonMapper<JsonAboutModuleData>
{
    public static JsonAboutModuleData _parse(final tge tge) throws IOException {
        final JsonAboutModuleData jsonAboutModuleData = new JsonAboutModuleData();
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
            parseField(jsonAboutModuleData, d, tge);
            tge.l0();
        }
        return jsonAboutModuleData;
    }
    
    public static void _serialize(final JsonAboutModuleData jsonAboutModuleData, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonAboutModuleData.e != null) {
            LoganSquare.typeConverterFor((Class)ot2.class).serialize((Object)jsonAboutModuleData.e, "address", true, afe);
        }
        if (jsonAboutModuleData.a != null) {
            LoganSquare.typeConverterFor((Class)lu2.class).serialize((Object)jsonAboutModuleData.a, "contact", true, afe);
        }
        if (jsonAboutModuleData.f != null) {
            LoganSquare.typeConverterFor((Class)p5c.class).serialize((Object)jsonAboutModuleData.f, "google_verification_data", true, afe);
        }
        if (jsonAboutModuleData.b != null) {
            LoganSquare.typeConverterFor((Class)z13.class).serialize((Object)jsonAboutModuleData.b, "open_times", true, afe);
        }
        if (jsonAboutModuleData.c != null) {
            LoganSquare.typeConverterFor((Class)j33.class).serialize((Object)jsonAboutModuleData.c, "timezone", true, afe);
        }
        if (jsonAboutModuleData.d != null) {
            LoganSquare.typeConverterFor((Class)h6w.class).serialize((Object)jsonAboutModuleData.d, "website", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonAboutModuleData jsonAboutModuleData, final String s, final tge tge) throws IOException {
        if ("address".equals(s)) {
            jsonAboutModuleData.e = (ot2)LoganSquare.typeConverterFor((Class)ot2.class).parse(tge);
        }
        else if ("contact".equals(s)) {
            jsonAboutModuleData.a = (lu2)LoganSquare.typeConverterFor((Class)lu2.class).parse(tge);
        }
        else if ("google_verification_data".equals(s)) {
            jsonAboutModuleData.f = (p5c)LoganSquare.typeConverterFor((Class)p5c.class).parse(tge);
        }
        else if ("open_times".equals(s)) {
            jsonAboutModuleData.b = (z13)LoganSquare.typeConverterFor((Class)z13.class).parse(tge);
        }
        else if ("timezone".equals(s)) {
            jsonAboutModuleData.c = (j33)LoganSquare.typeConverterFor((Class)j33.class).parse(tge);
        }
        else if ("website".equals(s)) {
            jsonAboutModuleData.d = (h6w)LoganSquare.typeConverterFor((Class)h6w.class).parse(tge);
        }
    }
    
    public JsonAboutModuleData parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonAboutModuleData jsonAboutModuleData, final afe afe, final boolean b) throws IOException {
        _serialize(jsonAboutModuleData, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonAboutModuleData)o, afe, b);
    }
}
