// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotificationsPermissionPrompt$$JsonObjectMapper extends JsonMapper<JsonNotificationsPermissionPrompt>
{
    public static final w6k PERMISSION_REPROMPT_BEHAVIOR_CONVERTER;
    public static final ojl PROMPT_STYLE_TYPE_CONVERTER;
    
    static {
        PROMPT_STYLE_TYPE_CONVERTER = new ojl();
        PERMISSION_REPROMPT_BEHAVIOR_CONVERTER = new w6k();
    }
    
    public static JsonNotificationsPermissionPrompt _parse(final tge tge) throws IOException {
        final JsonNotificationsPermissionPrompt jsonNotificationsPermissionPrompt = new JsonNotificationsPermissionPrompt();
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
            parseField(jsonNotificationsPermissionPrompt, d, tge);
            tge.l0();
        }
        return jsonNotificationsPermissionPrompt;
    }
    
    public static void _serialize(final JsonNotificationsPermissionPrompt jsonNotificationsPermissionPrompt, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonNotificationsPermissionPrompt.e != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonNotificationsPermissionPrompt.e, "denied_link", true, afe);
        }
        if (jsonNotificationsPermissionPrompt.c != null) {
            afe.i("detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonNotificationsPermissionPrompt.c, afe, true);
        }
        if (jsonNotificationsPermissionPrompt.d != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonNotificationsPermissionPrompt.d, "granted_link", true, afe);
        }
        if (jsonNotificationsPermissionPrompt.g != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonNotificationsPermissionPrompt.g, "previously_denied_link", true, afe);
        }
        ((StringBasedTypeConverter)JsonNotificationsPermissionPrompt$$JsonObjectMapper.PERMISSION_REPROMPT_BEHAVIOR_CONVERTER).serialize((Object)jsonNotificationsPermissionPrompt.i, "previously_denied_reprompt_behavior", true, afe);
        if (jsonNotificationsPermissionPrompt.f != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonNotificationsPermissionPrompt.f, "previously_granted_link", true, afe);
        }
        if (jsonNotificationsPermissionPrompt.a != null) {
            afe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonNotificationsPermissionPrompt.a, afe, true);
        }
        if (jsonNotificationsPermissionPrompt.b != null) {
            afe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonNotificationsPermissionPrompt.b, afe, true);
        }
        final njl h = jsonNotificationsPermissionPrompt.h;
        if (h != null) {
            ((StringBasedTypeConverter)JsonNotificationsPermissionPrompt$$JsonObjectMapper.PROMPT_STYLE_TYPE_CONVERTER).serialize((Object)h, "style", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonNotificationsPermissionPrompt jsonNotificationsPermissionPrompt, final String s, final tge tge) throws IOException {
        if ("denied_link".equals(s)) {
            jsonNotificationsPermissionPrompt.e = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("detail_text".equals(s)) {
            jsonNotificationsPermissionPrompt.c = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("granted_link".equals(s)) {
            jsonNotificationsPermissionPrompt.d = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("previously_denied_link".equals(s)) {
            jsonNotificationsPermissionPrompt.g = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("previously_denied_reprompt_behavior".equals(s)) {
            jsonNotificationsPermissionPrompt.i = (int)((StringBasedTypeConverter)JsonNotificationsPermissionPrompt$$JsonObjectMapper.PERMISSION_REPROMPT_BEHAVIOR_CONVERTER).parse(tge);
        }
        else if ("previously_granted_link".equals(s)) {
            jsonNotificationsPermissionPrompt.f = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("primary_text".equals(s)) {
            jsonNotificationsPermissionPrompt.a = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("secondary_text".equals(s)) {
            jsonNotificationsPermissionPrompt.b = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("style".equals(s)) {
            jsonNotificationsPermissionPrompt.h = (njl)((StringBasedTypeConverter)JsonNotificationsPermissionPrompt$$JsonObjectMapper.PROMPT_STYLE_TYPE_CONVERTER).parse(tge);
        }
    }
    
    public JsonNotificationsPermissionPrompt parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonNotificationsPermissionPrompt jsonNotificationsPermissionPrompt, final afe afe, final boolean b) throws IOException {
        _serialize(jsonNotificationsPermissionPrompt, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonNotificationsPermissionPrompt)o, afe, b);
    }
}
