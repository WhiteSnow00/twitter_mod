// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSelectAvatar$$JsonObjectMapper extends JsonMapper<JsonSelectAvatar>
{
    public static JsonSelectAvatar _parse(final khe khe) throws IOException {
        final JsonSelectAvatar jsonSelectAvatar = new JsonSelectAvatar();
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
            parseField(jsonSelectAvatar, d, khe);
            khe.m0();
        }
        return jsonSelectAvatar;
    }
    
    public static void _serialize(final JsonSelectAvatar jsonSelectAvatar, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonSelectAvatar.e != null) {
            tfe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonSelectAvatar.e, tfe, true);
        }
        if (jsonSelectAvatar.c != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonSelectAvatar.c, "next_link", true, tfe);
        }
        if (jsonSelectAvatar.a != null) {
            tfe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonSelectAvatar.a, tfe, true);
        }
        if (jsonSelectAvatar.b != null) {
            tfe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonSelectAvatar.b, tfe, true);
        }
        if (jsonSelectAvatar.d != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonSelectAvatar.d, "skip_link", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonSelectAvatar jsonSelectAvatar, final String s, final khe khe) throws IOException {
        if ("component_collection".equals(s)) {
            jsonSelectAvatar.e = JsonOcfComponentCollection$$JsonObjectMapper._parse(khe);
        }
        else if ("next_link".equals(s)) {
            jsonSelectAvatar.c = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("primary_text".equals(s)) {
            jsonSelectAvatar.a = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("secondary_text".equals(s)) {
            jsonSelectAvatar.b = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("skip_link".equals(s)) {
            jsonSelectAvatar.d = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
    }
    
    public JsonSelectAvatar parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonSelectAvatar jsonSelectAvatar, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonSelectAvatar, tfe, b);
    }
}
