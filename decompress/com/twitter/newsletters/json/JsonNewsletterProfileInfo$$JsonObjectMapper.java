// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.newsletters.json;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNewsletterProfileInfo$$JsonObjectMapper extends JsonMapper<JsonNewsletterProfileInfo>
{
    public static JsonNewsletterProfileInfo _parse(final qhe qhe) throws IOException {
        final JsonNewsletterProfileInfo jsonNewsletterProfileInfo = new JsonNewsletterProfileInfo();
        if (qhe.e() == null) {
            qhe.i0();
        }
        if (qhe.e() != rje.N0) {
            qhe.m0();
            return null;
        }
        while (qhe.i0() != rje.O0) {
            final String d = qhe.d();
            qhe.i0();
            parseField(jsonNewsletterProfileInfo, d, qhe);
            qhe.m0();
        }
        return jsonNewsletterProfileInfo;
    }
    
    public static void _serialize(final JsonNewsletterProfileInfo jsonNewsletterProfileInfo, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonNewsletterProfileInfo.b != null) {
            yfe.i("account_settings");
            JsonAccountSettings$$JsonObjectMapper._serialize(jsonNewsletterProfileInfo.b, yfe, true);
        }
        if (jsonNewsletterProfileInfo.a != null) {
            LoganSquare.typeConverterFor((Class)hhi.class).serialize((Object)jsonNewsletterProfileInfo.a, "newsletter_info", true, yfe);
        }
        if (jsonNewsletterProfileInfo.c != null) {
            LoganSquare.typeConverterFor((Class)zwm.class).serialize((Object)jsonNewsletterProfileInfo.c, "profile_info", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNewsletterProfileInfo jsonNewsletterProfileInfo, final String s, final qhe qhe) throws IOException {
        if ("account_settings".equals(s)) {
            jsonNewsletterProfileInfo.b = JsonAccountSettings$$JsonObjectMapper._parse(qhe);
        }
        else if ("newsletter_info".equals(s)) {
            jsonNewsletterProfileInfo.a = (hhi)LoganSquare.typeConverterFor((Class)hhi.class).parse(qhe);
        }
        else if ("profile_info".equals(s)) {
            jsonNewsletterProfileInfo.c = (zwm)LoganSquare.typeConverterFor((Class)zwm.class).parse(qhe);
        }
    }
    
    public JsonNewsletterProfileInfo parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNewsletterProfileInfo jsonNewsletterProfileInfo, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNewsletterProfileInfo, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNewsletterProfileInfo)o, yfe, b);
    }
}
