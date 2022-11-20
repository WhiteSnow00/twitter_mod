// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonContactsLiveSyncPermissionPrompt$$JsonObjectMapper extends JsonMapper<JsonContactsLiveSyncPermissionPrompt>
{
    public static JsonContactsLiveSyncPermissionPrompt _parse(final tge tge) throws IOException {
        final JsonContactsLiveSyncPermissionPrompt jsonContactsLiveSyncPermissionPrompt = new JsonContactsLiveSyncPermissionPrompt();
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
            parseField(jsonContactsLiveSyncPermissionPrompt, d, tge);
            tge.l0();
        }
        return jsonContactsLiveSyncPermissionPrompt;
    }
    
    public static void _serialize(final JsonContactsLiveSyncPermissionPrompt jsonContactsLiveSyncPermissionPrompt, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonContactsLiveSyncPermissionPrompt.f != null) {
            afe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonContactsLiveSyncPermissionPrompt.f, afe, true);
        }
        if (jsonContactsLiveSyncPermissionPrompt.b != null) {
            afe.i("detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonContactsLiveSyncPermissionPrompt.b, afe, true);
        }
        if (jsonContactsLiveSyncPermissionPrompt.e != null) {
            LoganSquare.typeConverterFor((Class)pdj.class).serialize((Object)jsonContactsLiveSyncPermissionPrompt.e, "header_image", true, afe);
        }
        if (jsonContactsLiveSyncPermissionPrompt.c != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonContactsLiveSyncPermissionPrompt.c, "next_link", true, afe);
        }
        afe.t0("primary_text", jsonContactsLiveSyncPermissionPrompt.a);
        if (jsonContactsLiveSyncPermissionPrompt.d != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonContactsLiveSyncPermissionPrompt.d, "skip_link", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonContactsLiveSyncPermissionPrompt jsonContactsLiveSyncPermissionPrompt, final String s, final tge tge) throws IOException {
        if ("component_collection".equals(s)) {
            jsonContactsLiveSyncPermissionPrompt.f = JsonOcfComponentCollection$$JsonObjectMapper._parse(tge);
        }
        else if ("detail_text".equals(s)) {
            jsonContactsLiveSyncPermissionPrompt.b = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("header_image".equals(s)) {
            jsonContactsLiveSyncPermissionPrompt.e = (pdj)LoganSquare.typeConverterFor((Class)pdj.class).parse(tge);
        }
        else if ("next_link".equals(s)) {
            jsonContactsLiveSyncPermissionPrompt.c = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("primary_text".equals(s)) {
            jsonContactsLiveSyncPermissionPrompt.a = tge.T((String)null);
        }
        else if ("skip_link".equals(s)) {
            jsonContactsLiveSyncPermissionPrompt.d = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
    }
    
    public JsonContactsLiveSyncPermissionPrompt parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonContactsLiveSyncPermissionPrompt jsonContactsLiveSyncPermissionPrompt, final afe afe, final boolean b) throws IOException {
        _serialize(jsonContactsLiveSyncPermissionPrompt, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonContactsLiveSyncPermissionPrompt)o, afe, b);
    }
}
