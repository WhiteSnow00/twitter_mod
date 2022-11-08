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
    public static final o6k PERMISSION_REPROMPT_BEHAVIOR_CONVERTER;
    public static final bjl PROMPT_STYLE_TYPE_CONVERTER;
    
    static {
        PROMPT_STYLE_TYPE_CONVERTER = new bjl();
        PERMISSION_REPROMPT_BEHAVIOR_CONVERTER = new o6k();
    }
    
    public static JsonNotificationsPermissionPrompt _parse(final khe khe) throws IOException {
        final JsonNotificationsPermissionPrompt jsonNotificationsPermissionPrompt = new JsonNotificationsPermissionPrompt();
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
            parseField(jsonNotificationsPermissionPrompt, d, khe);
            khe.m0();
        }
        return jsonNotificationsPermissionPrompt;
    }
    
    public static void _serialize(final JsonNotificationsPermissionPrompt jsonNotificationsPermissionPrompt, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonNotificationsPermissionPrompt.e != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonNotificationsPermissionPrompt.e, "denied_link", true, tfe);
        }
        if (jsonNotificationsPermissionPrompt.c != null) {
            tfe.i("detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonNotificationsPermissionPrompt.c, tfe, true);
        }
        if (jsonNotificationsPermissionPrompt.d != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonNotificationsPermissionPrompt.d, "granted_link", true, tfe);
        }
        if (jsonNotificationsPermissionPrompt.g != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonNotificationsPermissionPrompt.g, "previously_denied_link", true, tfe);
        }
        ((StringBasedTypeConverter)JsonNotificationsPermissionPrompt$$JsonObjectMapper.PERMISSION_REPROMPT_BEHAVIOR_CONVERTER).serialize((Object)jsonNotificationsPermissionPrompt.i, "previously_denied_reprompt_behavior", true, tfe);
        if (jsonNotificationsPermissionPrompt.f != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonNotificationsPermissionPrompt.f, "previously_granted_link", true, tfe);
        }
        if (jsonNotificationsPermissionPrompt.a != null) {
            tfe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonNotificationsPermissionPrompt.a, tfe, true);
        }
        if (jsonNotificationsPermissionPrompt.b != null) {
            tfe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonNotificationsPermissionPrompt.b, tfe, true);
        }
        final ajl h = jsonNotificationsPermissionPrompt.h;
        if (h != null) {
            ((StringBasedTypeConverter)JsonNotificationsPermissionPrompt$$JsonObjectMapper.PROMPT_STYLE_TYPE_CONVERTER).serialize((Object)h, "style", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonNotificationsPermissionPrompt jsonNotificationsPermissionPrompt, final String s, final khe khe) throws IOException {
        if ("denied_link".equals(s)) {
            jsonNotificationsPermissionPrompt.e = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("detail_text".equals(s)) {
            jsonNotificationsPermissionPrompt.c = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("granted_link".equals(s)) {
            jsonNotificationsPermissionPrompt.d = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("previously_denied_link".equals(s)) {
            jsonNotificationsPermissionPrompt.g = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("previously_denied_reprompt_behavior".equals(s)) {
            jsonNotificationsPermissionPrompt.i = (int)((StringBasedTypeConverter)JsonNotificationsPermissionPrompt$$JsonObjectMapper.PERMISSION_REPROMPT_BEHAVIOR_CONVERTER).parse(khe);
        }
        else if ("previously_granted_link".equals(s)) {
            jsonNotificationsPermissionPrompt.f = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("primary_text".equals(s)) {
            jsonNotificationsPermissionPrompt.a = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("secondary_text".equals(s)) {
            jsonNotificationsPermissionPrompt.b = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("style".equals(s)) {
            jsonNotificationsPermissionPrompt.h = (ajl)((StringBasedTypeConverter)JsonNotificationsPermissionPrompt$$JsonObjectMapper.PROMPT_STYLE_TYPE_CONVERTER).parse(khe);
        }
    }
    
    public JsonNotificationsPermissionPrompt parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonNotificationsPermissionPrompt jsonNotificationsPermissionPrompt, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonNotificationsPermissionPrompt, tfe, b);
    }
}
