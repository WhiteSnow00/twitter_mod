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
    public static JsonContactsLiveSyncPermissionPrompt _parse(final khe khe) throws IOException {
        final JsonContactsLiveSyncPermissionPrompt jsonContactsLiveSyncPermissionPrompt = new JsonContactsLiveSyncPermissionPrompt();
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
            parseField(jsonContactsLiveSyncPermissionPrompt, d, khe);
            khe.m0();
        }
        return jsonContactsLiveSyncPermissionPrompt;
    }
    
    public static void _serialize(final JsonContactsLiveSyncPermissionPrompt jsonContactsLiveSyncPermissionPrompt, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonContactsLiveSyncPermissionPrompt.f != null) {
            tfe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonContactsLiveSyncPermissionPrompt.f, tfe, true);
        }
        if (jsonContactsLiveSyncPermissionPrompt.b != null) {
            tfe.i("detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonContactsLiveSyncPermissionPrompt.b, tfe, true);
        }
        if (jsonContactsLiveSyncPermissionPrompt.e != null) {
            LoganSquare.typeConverterFor((Class)kdj.class).serialize((Object)jsonContactsLiveSyncPermissionPrompt.e, "header_image", true, tfe);
        }
        if (jsonContactsLiveSyncPermissionPrompt.c != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonContactsLiveSyncPermissionPrompt.c, "next_link", true, tfe);
        }
        tfe.u0("primary_text", jsonContactsLiveSyncPermissionPrompt.a);
        if (jsonContactsLiveSyncPermissionPrompt.d != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonContactsLiveSyncPermissionPrompt.d, "skip_link", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonContactsLiveSyncPermissionPrompt jsonContactsLiveSyncPermissionPrompt, final String s, final khe khe) throws IOException {
        if ("component_collection".equals(s)) {
            jsonContactsLiveSyncPermissionPrompt.f = JsonOcfComponentCollection$$JsonObjectMapper._parse(khe);
        }
        else if ("detail_text".equals(s)) {
            jsonContactsLiveSyncPermissionPrompt.b = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("header_image".equals(s)) {
            jsonContactsLiveSyncPermissionPrompt.e = (kdj)LoganSquare.typeConverterFor((Class)kdj.class).parse(khe);
        }
        else if ("next_link".equals(s)) {
            jsonContactsLiveSyncPermissionPrompt.c = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("primary_text".equals(s)) {
            jsonContactsLiveSyncPermissionPrompt.a = khe.T((String)null);
        }
        else if ("skip_link".equals(s)) {
            jsonContactsLiveSyncPermissionPrompt.d = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
    }
    
    public JsonContactsLiveSyncPermissionPrompt parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonContactsLiveSyncPermissionPrompt jsonContactsLiveSyncPermissionPrompt, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonContactsLiveSyncPermissionPrompt, tfe, b);
    }
}
