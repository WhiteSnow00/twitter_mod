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
    public static JsonSelectAvatar _parse(final tge tge) throws IOException {
        final JsonSelectAvatar jsonSelectAvatar = new JsonSelectAvatar();
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
            parseField(jsonSelectAvatar, d, tge);
            tge.l0();
        }
        return jsonSelectAvatar;
    }
    
    public static void _serialize(final JsonSelectAvatar jsonSelectAvatar, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonSelectAvatar.e != null) {
            afe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonSelectAvatar.e, afe, true);
        }
        if (jsonSelectAvatar.c != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonSelectAvatar.c, "next_link", true, afe);
        }
        if (jsonSelectAvatar.a != null) {
            afe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonSelectAvatar.a, afe, true);
        }
        if (jsonSelectAvatar.b != null) {
            afe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonSelectAvatar.b, afe, true);
        }
        if (jsonSelectAvatar.d != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonSelectAvatar.d, "skip_link", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonSelectAvatar jsonSelectAvatar, final String s, final tge tge) throws IOException {
        if ("component_collection".equals(s)) {
            jsonSelectAvatar.e = JsonOcfComponentCollection$$JsonObjectMapper._parse(tge);
        }
        else if ("next_link".equals(s)) {
            jsonSelectAvatar.c = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("primary_text".equals(s)) {
            jsonSelectAvatar.a = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("secondary_text".equals(s)) {
            jsonSelectAvatar.b = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("skip_link".equals(s)) {
            jsonSelectAvatar.d = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
    }
    
    public JsonSelectAvatar parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonSelectAvatar jsonSelectAvatar, final afe afe, final boolean b) throws IOException {
        _serialize(jsonSelectAvatar, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonSelectAvatar)o, afe, b);
    }
}
