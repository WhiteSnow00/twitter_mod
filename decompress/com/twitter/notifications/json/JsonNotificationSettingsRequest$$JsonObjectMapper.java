// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotificationSettingsRequest$$JsonObjectMapper extends JsonMapper<JsonNotificationSettingsRequest>
{
    public static JsonNotificationSettingsRequest _parse(final qhe qhe) throws IOException {
        final JsonNotificationSettingsRequest jsonNotificationSettingsRequest = new JsonNotificationSettingsRequest();
        if (qhe.e() == null) {
            qhe.i0();
        }
        if (qhe.e() != rje.N0) {
            qhe.m0();
            return null;
        }
        while (qhe.i0() != rje.O0) {
            final String d = qhe.d();
            qhe.i0();
            parseField(jsonNotificationSettingsRequest, d, qhe);
            qhe.m0();
        }
        return jsonNotificationSettingsRequest;
    }
    
    public static void _serialize(final JsonNotificationSettingsRequest jsonNotificationSettingsRequest, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.W("client_application_id", jsonNotificationSettingsRequest.b);
        if (jsonNotificationSettingsRequest.c != null) {
            yfe.i("push_device_info");
            JsonUserDevicesRequest$$JsonObjectMapper._serialize(jsonNotificationSettingsRequest.c, yfe, true);
        }
        if (jsonNotificationSettingsRequest.d != null) {
            yfe.i("sms_device_info");
            JsonUserDevicesRequest$$JsonObjectMapper._serialize(jsonNotificationSettingsRequest.d, yfe, true);
        }
        yfe.W("user_id", jsonNotificationSettingsRequest.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotificationSettingsRequest jsonNotificationSettingsRequest, final String s, final qhe qhe) throws IOException {
        if ("client_application_id".equals(s)) {
            jsonNotificationSettingsRequest.b = qhe.L();
        }
        else if ("push_device_info".equals(s)) {
            jsonNotificationSettingsRequest.c = JsonUserDevicesRequest$$JsonObjectMapper._parse(qhe);
        }
        else if ("sms_device_info".equals(s)) {
            jsonNotificationSettingsRequest.d = JsonUserDevicesRequest$$JsonObjectMapper._parse(qhe);
        }
        else if ("user_id".equals(s)) {
            jsonNotificationSettingsRequest.a = qhe.L();
        }
    }
    
    public JsonNotificationSettingsRequest parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNotificationSettingsRequest jsonNotificationSettingsRequest, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNotificationSettingsRequest, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNotificationSettingsRequest)o, yfe, b);
    }
}
