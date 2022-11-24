// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotificationSettingsTemplate$$JsonObjectMapper extends JsonMapper<JsonNotificationSettingsTemplate>
{
    public static JsonNotificationSettingsTemplate _parse(final qhe qhe) throws IOException {
        final JsonNotificationSettingsTemplate jsonNotificationSettingsTemplate = new JsonNotificationSettingsTemplate();
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
            parseField(jsonNotificationSettingsTemplate, d, qhe);
            qhe.m0();
        }
        return jsonNotificationSettingsTemplate;
    }
    
    public static void _serialize(final JsonNotificationSettingsTemplate jsonNotificationSettingsTemplate, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final HashMap b2 = jsonNotificationSettingsTemplate.b;
        if (b2 != null) {
            final Iterator a = af.A(yfe, "control_types", b2);
            while (a.hasNext()) {
                final Map.Entry<String, JsonNotificationSettingsTemplate.JsonControlType> entry = a.next();
                if (qee.r((String)entry.getKey(), yfe, (Map.Entry)entry) == null) {
                    yfe.j();
                }
                else {
                    if (entry.getValue() == null) {
                        continue;
                    }
                    JsonNotificationSettingsTemplate$JsonControlType$$JsonObjectMapper._serialize(entry.getValue(), yfe, true);
                }
            }
            yfe.h();
        }
        final HashMap a2 = jsonNotificationSettingsTemplate.a;
        if (a2 != null) {
            final Iterator a3 = af.A(yfe, "doc", a2);
            while (a3.hasNext()) {
                final Map.Entry entry2 = a3.next();
                if (qee.r((String)entry2.getKey(), yfe, (Map.Entry)entry2) == null) {
                    yfe.j();
                }
                else {
                    yfe.s0((String)entry2.getValue());
                }
            }
            yfe.h();
        }
        final ArrayList c = jsonNotificationSettingsTemplate.c;
        if (c != null) {
            final Iterator e = d10.E(yfe, "settings", c);
            while (e.hasNext()) {
                final JsonNotificationSettingsTemplate.JsonNotificationSetting jsonNotificationSetting = e.next();
                if (jsonNotificationSetting != null) {
                    JsonNotificationSettingsTemplate$JsonNotificationSetting$$JsonObjectMapper._serialize(jsonNotificationSetting, yfe, true);
                }
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotificationSettingsTemplate jsonNotificationSettingsTemplate, String j, final qhe qhe) throws IOException {
        if ("control_types".equals(j)) {
            if (qhe.e() == rje.N0) {
                final HashMap b = new HashMap();
                while (qhe.i0() != rje.O0) {
                    final String i = qhe.j();
                    qhe.i0();
                    if (qhe.e() == rje.X0) {
                        b.put(i, null);
                    }
                    else {
                        b.put(i, JsonNotificationSettingsTemplate$JsonControlType$$JsonObjectMapper._parse(qhe));
                    }
                }
                jsonNotificationSettingsTemplate.b = b;
            }
            else {
                jsonNotificationSettingsTemplate.b = null;
            }
        }
        else if ("doc".equals(j)) {
            if (qhe.e() == rje.N0) {
                final HashMap a = new HashMap();
                while (qhe.i0() != rje.O0) {
                    j = qhe.j();
                    qhe.i0();
                    if (qhe.e() == rje.X0) {
                        a.put(j, null);
                    }
                    else {
                        a.put(j, qhe.T((String)null));
                    }
                }
                jsonNotificationSettingsTemplate.a = a;
            }
            else {
                jsonNotificationSettingsTemplate.a = null;
            }
        }
        else if ("settings".equals(j)) {
            if (qhe.e() == rje.P0) {
                final ArrayList c = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final JsonNotificationSettingsTemplate.JsonNotificationSetting parse = JsonNotificationSettingsTemplate$JsonNotificationSetting$$JsonObjectMapper._parse(qhe);
                    if (parse != null) {
                        c.add(parse);
                    }
                }
                jsonNotificationSettingsTemplate.c = c;
            }
            else {
                jsonNotificationSettingsTemplate.c = null;
            }
        }
    }
    
    public JsonNotificationSettingsTemplate parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNotificationSettingsTemplate jsonNotificationSettingsTemplate, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNotificationSettingsTemplate, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNotificationSettingsTemplate)o, yfe, b);
    }
}
