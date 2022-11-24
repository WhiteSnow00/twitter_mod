// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotificationSettingsTemplate$JsonNotificationSetting$$JsonObjectMapper extends JsonMapper<JsonNotificationSettingsTemplate.JsonNotificationSetting>
{
    public static JsonNotificationSettingsTemplate.JsonNotificationSetting _parse(final qhe qhe) throws IOException {
        final JsonNotificationSettingsTemplate.JsonNotificationSetting jsonNotificationSetting = new JsonNotificationSettingsTemplate.JsonNotificationSetting();
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
            parseField(jsonNotificationSetting, d, qhe);
            qhe.m0();
        }
        return jsonNotificationSetting;
    }
    
    public static void _serialize(final JsonNotificationSettingsTemplate.JsonNotificationSetting jsonNotificationSetting, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("control_type", jsonNotificationSetting.a);
        final HashMap d = jsonNotificationSetting.d;
        if (d != null) {
            final Iterator a = af.A(yfe, "description", d);
            while (a.hasNext()) {
                final Map.Entry entry = a.next();
                if (qee.r((String)entry.getKey(), yfe, (Map.Entry)entry) == null) {
                    yfe.j();
                }
                else {
                    yfe.s0((String)entry.getValue());
                }
            }
            yfe.h();
        }
        yfe.u0("id", jsonNotificationSetting.b);
        yfe.u0("name", jsonNotificationSetting.c);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotificationSettingsTemplate.JsonNotificationSetting jsonNotificationSetting, final String s, final qhe qhe) throws IOException {
        if ("control_type".equals(s)) {
            jsonNotificationSetting.a = qhe.T((String)null);
        }
        else if ("description".equals(s)) {
            if (qhe.e() == rje.N0) {
                final HashMap d = new HashMap();
                while (qhe.i0() != rje.O0) {
                    final String j = qhe.j();
                    qhe.i0();
                    if (qhe.e() == rje.X0) {
                        d.put(j, null);
                    }
                    else {
                        d.put(j, qhe.T((String)null));
                    }
                }
                jsonNotificationSetting.d = d;
            }
            else {
                jsonNotificationSetting.d = null;
            }
        }
        else if ("id".equals(s)) {
            jsonNotificationSetting.b = qhe.T((String)null);
        }
        else if ("name".equals(s)) {
            jsonNotificationSetting.c = qhe.T((String)null);
        }
    }
    
    public JsonNotificationSettingsTemplate.JsonNotificationSetting parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNotificationSettingsTemplate.JsonNotificationSetting jsonNotificationSetting, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNotificationSetting, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNotificationSettingsTemplate.JsonNotificationSetting)o, yfe, b);
    }
}
