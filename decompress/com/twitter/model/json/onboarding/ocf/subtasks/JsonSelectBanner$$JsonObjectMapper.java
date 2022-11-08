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
    public static JsonSelectBanner _parse(final khe khe) throws IOException {
        final JsonSelectBanner jsonSelectBanner = new JsonSelectBanner();
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
            parseField(jsonSelectBanner, d, khe);
            khe.m0();
        }
        return jsonSelectBanner;
    }
    
    public static void _serialize(final JsonSelectBanner jsonSelectBanner, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonSelectBanner.e != null) {
            LoganSquare.typeConverterFor((Class)dsr.class).serialize((Object)jsonSelectBanner.e, "avatar_image_reference", true, tfe);
        }
        if (jsonSelectBanner.f != null) {
            tfe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonSelectBanner.f, tfe, true);
        }
        if (jsonSelectBanner.c != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonSelectBanner.c, "next_link", true, tfe);
        }
        if (jsonSelectBanner.a != null) {
            tfe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonSelectBanner.a, tfe, true);
        }
        if (jsonSelectBanner.b != null) {
            tfe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonSelectBanner.b, tfe, true);
        }
        if (jsonSelectBanner.d != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonSelectBanner.d, "skip_link", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonSelectBanner jsonSelectBanner, final String s, final khe khe) throws IOException {
        if ("avatar_image_reference".equals(s)) {
            jsonSelectBanner.e = (dsr)LoganSquare.typeConverterFor((Class)dsr.class).parse(khe);
        }
        else if ("component_collection".equals(s)) {
            jsonSelectBanner.f = JsonOcfComponentCollection$$JsonObjectMapper._parse(khe);
        }
        else if ("next_link".equals(s)) {
            jsonSelectBanner.c = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("primary_text".equals(s)) {
            jsonSelectBanner.a = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("secondary_text".equals(s)) {
            jsonSelectBanner.b = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("skip_link".equals(s)) {
            jsonSelectBanner.d = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
    }
    
    public JsonSelectBanner parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonSelectBanner jsonSelectBanner, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonSelectBanner, tfe, b);
    }
}
