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
    public static final w6k PERMISSION_REPROMPT_BEHAVIOR_CONVERTER;
    
    static {
        PERMISSION_REPROMPT_BEHAVIOR_CONVERTER = new w6k();
    }
    
    public static JsonLocationPermissionPrompt _parse(final tge tge) throws IOException {
        final JsonLocationPermissionPrompt jsonLocationPermissionPrompt = new JsonLocationPermissionPrompt();
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
            parseField(jsonLocationPermissionPrompt, d, tge);
            tge.l0();
        }
        return jsonLocationPermissionPrompt;
    }
    
    public static void _serialize(final JsonLocationPermissionPrompt jsonLocationPermissionPrompt, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonLocationPermissionPrompt.d != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonLocationPermissionPrompt.d, "denied_link", true, afe);
        }
        if (jsonLocationPermissionPrompt.b != null) {
            afe.i("detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonLocationPermissionPrompt.b, afe, true);
        }
        if (jsonLocationPermissionPrompt.c != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonLocationPermissionPrompt.c, "granted_link", true, afe);
        }
        if (jsonLocationPermissionPrompt.a != null) {
            LoganSquare.typeConverterFor((Class)oej.class).serialize((Object)jsonLocationPermissionPrompt.a, "header", true, afe);
        }
        if (jsonLocationPermissionPrompt.f != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonLocationPermissionPrompt.f, "previously_denied_link", true, afe);
        }
        ((StringBasedTypeConverter)JsonLocationPermissionPrompt$$JsonObjectMapper.PERMISSION_REPROMPT_BEHAVIOR_CONVERTER).serialize((Object)jsonLocationPermissionPrompt.g, "previously_denied_reprompt_behavior", true, afe);
        if (jsonLocationPermissionPrompt.e != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonLocationPermissionPrompt.e, "previously_granted_link", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonLocationPermissionPrompt jsonLocationPermissionPrompt, final String s, final tge tge) throws IOException {
        if ("denied_link".equals(s)) {
            jsonLocationPermissionPrompt.d = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("detail_text".equals(s)) {
            jsonLocationPermissionPrompt.b = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("granted_link".equals(s)) {
            jsonLocationPermissionPrompt.c = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("header".equals(s)) {
            jsonLocationPermissionPrompt.a = (oej)LoganSquare.typeConverterFor((Class)oej.class).parse(tge);
        }
        else if ("previously_denied_link".equals(s)) {
            jsonLocationPermissionPrompt.f = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("previously_denied_reprompt_behavior".equals(s)) {
            jsonLocationPermissionPrompt.g = (int)((StringBasedTypeConverter)JsonLocationPermissionPrompt$$JsonObjectMapper.PERMISSION_REPROMPT_BEHAVIOR_CONVERTER).parse(tge);
        }
        else if ("previously_granted_link".equals(s)) {
            jsonLocationPermissionPrompt.e = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
    }
    
    public JsonLocationPermissionPrompt parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonLocationPermissionPrompt jsonLocationPermissionPrompt, final afe afe, final boolean b) throws IOException {
        _serialize(jsonLocationPermissionPrompt, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonLocationPermissionPrompt)o, afe, b);
    }
}
