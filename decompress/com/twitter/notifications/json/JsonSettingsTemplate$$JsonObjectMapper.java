// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSettingsTemplate$$JsonObjectMapper extends JsonMapper<JsonSettingsTemplate>
{
    public static JsonSettingsTemplate _parse(final qhe qhe) throws IOException {
        final JsonSettingsTemplate jsonSettingsTemplate = new JsonSettingsTemplate();
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
            parseField(jsonSettingsTemplate, d, qhe);
            qhe.m0();
        }
        return jsonSettingsTemplate;
    }
    
    public static void _serialize(final JsonSettingsTemplate jsonSettingsTemplate, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final ArrayList b2 = jsonSettingsTemplate.b;
        if (b2 != null) {
            final Iterator e = d10.E(yfe, "control_types", b2);
            while (e.hasNext()) {
                yfe.s0((String)e.next());
            }
            yfe.f();
        }
        if (jsonSettingsTemplate.a != null) {
            LoganSquare.typeConverterFor((Class)irp$d.class).serialize((Object)jsonSettingsTemplate.a, "doc", true, yfe);
        }
        final ArrayList c = jsonSettingsTemplate.c;
        if (c != null) {
            final Iterator e2 = d10.E(yfe, "settings", c);
            while (e2.hasNext()) {
                final irp$b irp$b = e2.next();
                if (irp$b != null) {
                    LoganSquare.typeConverterFor((Class)irp$b.class).serialize((Object)irp$b, "lslocalsettingsElement", false, yfe);
                }
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSettingsTemplate jsonSettingsTemplate, final String s, final qhe qhe) throws IOException {
        if ("control_types".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList b = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final String t = qhe.T((String)null);
                    if (t != null) {
                        b.add(t);
                    }
                }
                jsonSettingsTemplate.b = b;
            }
            else {
                jsonSettingsTemplate.b = null;
            }
        }
        else if ("doc".equals(s)) {
            jsonSettingsTemplate.a = (irp$d)LoganSquare.typeConverterFor((Class)irp$d.class).parse(qhe);
        }
        else if ("settings".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList c = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final irp$b irp$b = (irp$b)LoganSquare.typeConverterFor((Class)irp$b.class).parse(qhe);
                    if (irp$b != null) {
                        c.add(irp$b);
                    }
                }
                jsonSettingsTemplate.c = c;
            }
            else {
                jsonSettingsTemplate.c = null;
            }
        }
    }
    
    public JsonSettingsTemplate parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSettingsTemplate jsonSettingsTemplate, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonSettingsTemplate, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSettingsTemplate)o, yfe, b);
    }
}
