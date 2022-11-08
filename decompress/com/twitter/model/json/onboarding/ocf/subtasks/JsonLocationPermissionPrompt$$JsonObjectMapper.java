// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLocationPermissionPrompt$$JsonObjectMapper extends JsonMapper<JsonLocationPermissionPrompt>
{
    public static final o6k PERMISSION_REPROMPT_BEHAVIOR_CONVERTER;
    
    static {
        PERMISSION_REPROMPT_BEHAVIOR_CONVERTER = new o6k();
    }
    
    public static JsonLocationPermissionPrompt _parse(final khe khe) throws IOException {
        final JsonLocationPermissionPrompt jsonLocationPermissionPrompt = new JsonLocationPermissionPrompt();
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
            parseField(jsonLocationPermissionPrompt, d, khe);
            khe.m0();
        }
        return jsonLocationPermissionPrompt;
    }
    
    public static void _serialize(final JsonLocationPermissionPrompt jsonLocationPermissionPrompt, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonLocationPermissionPrompt.d != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonLocationPermissionPrompt.d, "denied_link", true, tfe);
        }
        if (jsonLocationPermissionPrompt.b != null) {
            tfe.i("detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonLocationPermissionPrompt.b, tfe, true);
        }
        if (jsonLocationPermissionPrompt.c != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonLocationPermissionPrompt.c, "granted_link", true, tfe);
        }
        if (jsonLocationPermissionPrompt.a != null) {
            LoganSquare.typeConverterFor((Class)iej.class).serialize((Object)jsonLocationPermissionPrompt.a, "header", true, tfe);
        }
        if (jsonLocationPermissionPrompt.f != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonLocationPermissionPrompt.f, "previously_denied_link", true, tfe);
        }
        ((StringBasedTypeConverter)JsonLocationPermissionPrompt$$JsonObjectMapper.PERMISSION_REPROMPT_BEHAVIOR_CONVERTER).serialize((Object)jsonLocationPermissionPrompt.g, "previously_denied_reprompt_behavior", true, tfe);
        if (jsonLocationPermissionPrompt.e != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonLocationPermissionPrompt.e, "previously_granted_link", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonLocationPermissionPrompt jsonLocationPermissionPrompt, final String s, final khe khe) throws IOException {
        if ("denied_link".equals(s)) {
            jsonLocationPermissionPrompt.d = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("detail_text".equals(s)) {
            jsonLocationPermissionPrompt.b = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("granted_link".equals(s)) {
            jsonLocationPermissionPrompt.c = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("header".equals(s)) {
            jsonLocationPermissionPrompt.a = (iej)LoganSquare.typeConverterFor((Class)iej.class).parse(khe);
        }
        else if ("previously_denied_link".equals(s)) {
            jsonLocationPermissionPrompt.f = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("previously_denied_reprompt_behavior".equals(s)) {
            jsonLocationPermissionPrompt.g = (int)((StringBasedTypeConverter)JsonLocationPermissionPrompt$$JsonObjectMapper.PERMISSION_REPROMPT_BEHAVIOR_CONVERTER).parse(khe);
        }
        else if ("previously_granted_link".equals(s)) {
            jsonLocationPermissionPrompt.e = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
    }
    
    public JsonLocationPermissionPrompt parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonLocationPermissionPrompt jsonLocationPermissionPrompt, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonLocationPermissionPrompt, tfe, b);
    }
}
