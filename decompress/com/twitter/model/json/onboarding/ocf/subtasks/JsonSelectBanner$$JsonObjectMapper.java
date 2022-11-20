// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection$$JsonObjectMapper;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSelectBanner$$JsonObjectMapper extends JsonMapper<JsonSelectBanner>
{
    public static JsonSelectBanner _parse(final tge tge) throws IOException {
        final JsonSelectBanner jsonSelectBanner = new JsonSelectBanner();
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
            parseField(jsonSelectBanner, d, tge);
            tge.l0();
        }
        return jsonSelectBanner;
    }
    
    public static void _serialize(final JsonSelectBanner jsonSelectBanner, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonSelectBanner.e != null) {
            LoganSquare.typeConverterFor((Class)vsr.class).serialize((Object)jsonSelectBanner.e, "avatar_image_reference", true, afe);
        }
        if (jsonSelectBanner.f != null) {
            afe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonSelectBanner.f, afe, true);
        }
        if (jsonSelectBanner.c != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonSelectBanner.c, "next_link", true, afe);
        }
        if (jsonSelectBanner.a != null) {
            afe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonSelectBanner.a, afe, true);
        }
        if (jsonSelectBanner.b != null) {
            afe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonSelectBanner.b, afe, true);
        }
        if (jsonSelectBanner.d != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonSelectBanner.d, "skip_link", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonSelectBanner jsonSelectBanner, final String s, final tge tge) throws IOException {
        if ("avatar_image_reference".equals(s)) {
            jsonSelectBanner.e = (vsr)LoganSquare.typeConverterFor((Class)vsr.class).parse(tge);
        }
        else if ("component_collection".equals(s)) {
            jsonSelectBanner.f = JsonOcfComponentCollection$$JsonObjectMapper._parse(tge);
        }
        else if ("next_link".equals(s)) {
            jsonSelectBanner.c = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("primary_text".equals(s)) {
            jsonSelectBanner.a = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("secondary_text".equals(s)) {
            jsonSelectBanner.b = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("skip_link".equals(s)) {
            jsonSelectBanner.d = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
    }
    
    public JsonSelectBanner parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonSelectBanner jsonSelectBanner, final afe afe, final boolean b) throws IOException {
        _serialize(jsonSelectBanner, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonSelectBanner)o, afe, b);
    }
}
