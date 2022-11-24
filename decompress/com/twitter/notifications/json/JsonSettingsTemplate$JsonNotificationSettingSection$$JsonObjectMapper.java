// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSettingsTemplate$JsonNotificationSettingSection$$JsonObjectMapper extends JsonMapper<JsonSettingsTemplate.JsonNotificationSettingSection>
{
    public static JsonSettingsTemplate.JsonNotificationSettingSection _parse(final qhe qhe) throws IOException {
        final JsonSettingsTemplate.JsonNotificationSettingSection jsonNotificationSettingSection = new JsonSettingsTemplate.JsonNotificationSettingSection();
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
            parseField(jsonNotificationSettingSection, d, qhe);
            qhe.m0();
        }
        return jsonNotificationSettingSection;
    }
    
    public static void _serialize(final JsonSettingsTemplate.JsonNotificationSettingSection jsonNotificationSettingSection, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final ArrayList c = jsonNotificationSettingSection.c;
        if (c != null) {
            final Iterator e = d10.E(yfe, "section_entries", c);
            while (e.hasNext()) {
                final irp$c irp$c = e.next();
                if (irp$c != null) {
                    LoganSquare.typeConverterFor((Class)irp$c.class).serialize((Object)irp$c, "lslocalsection_entriesElement", false, yfe);
                }
            }
            yfe.f();
        }
        yfe.u0("section_header", jsonNotificationSettingSection.a);
        yfe.u0("section_type", jsonNotificationSettingSection.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSettingsTemplate.JsonNotificationSettingSection jsonNotificationSettingSection, final String s, final qhe qhe) throws IOException {
        if ("section_entries".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList c = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final irp$c irp$c = (irp$c)LoganSquare.typeConverterFor((Class)irp$c.class).parse(qhe);
                    if (irp$c != null) {
                        c.add(irp$c);
                    }
                }
                jsonNotificationSettingSection.c = c;
            }
            else {
                jsonNotificationSettingSection.c = null;
            }
        }
        else if ("section_header".equals(s)) {
            jsonNotificationSettingSection.a = qhe.T((String)null);
        }
        else if ("section_type".equals(s)) {
            jsonNotificationSettingSection.b = qhe.T((String)null);
        }
    }
    
    public JsonSettingsTemplate.JsonNotificationSettingSection parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSettingsTemplate.JsonNotificationSettingSection jsonNotificationSettingSection, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNotificationSettingSection, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSettingsTemplate.JsonNotificationSettingSection)o, yfe, b);
    }
}
