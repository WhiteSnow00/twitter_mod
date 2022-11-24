// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSettingsTemplate$JsonNotificationSettingSectionEntry$$JsonObjectMapper extends JsonMapper<JsonSettingsTemplate.JsonNotificationSettingSectionEntry>
{
    public static JsonSettingsTemplate.JsonNotificationSettingSectionEntry _parse(final qhe qhe) throws IOException {
        final JsonSettingsTemplate.JsonNotificationSettingSectionEntry jsonNotificationSettingSectionEntry = new JsonSettingsTemplate.JsonNotificationSettingSectionEntry();
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
            parseField(jsonNotificationSettingSectionEntry, d, qhe);
            qhe.m0();
        }
        return jsonNotificationSettingSectionEntry;
    }
    
    public static void _serialize(final JsonSettingsTemplate.JsonNotificationSettingSectionEntry jsonNotificationSettingSectionEntry, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("allow_multiple_selections", jsonNotificationSettingSectionEntry.o);
        final ArrayList m = jsonNotificationSettingSectionEntry.m;
        if (m != null) {
            final Iterator e = d10.E(yfe, "buckets", m);
            while (e.hasNext()) {
                yfe.s0((String)e.next());
            }
            yfe.f();
        }
        yfe.u0("client_experiment_filter", jsonNotificationSettingSectionEntry.f);
        yfe.u0("control_type", jsonNotificationSettingSectionEntry.g);
        final ArrayList i = jsonNotificationSettingSectionEntry.i;
        if (i != null) {
            final Iterator e2 = d10.E(yfe, "default_selections", i);
            while (e2.hasNext()) {
                yfe.s0((String)e2.next());
            }
            yfe.f();
        }
        yfe.u0("description", jsonNotificationSettingSectionEntry.c);
        yfe.u0("experiment", jsonNotificationSettingSectionEntry.l);
        final ArrayList n = jsonNotificationSettingSectionEntry.n;
        if (n != null) {
            final Iterator e3 = d10.E(yfe, "feature_switches", n);
            while (e3.hasNext()) {
                yfe.s0((String)e3.next());
            }
            yfe.f();
        }
        yfe.u0("id", jsonNotificationSettingSectionEntry.a);
        yfe.u0("name", jsonNotificationSettingSectionEntry.b);
        yfe.u0("off_description", jsonNotificationSettingSectionEntry.j);
        yfe.u0("professional", jsonNotificationSettingSectionEntry.e);
        yfe.u0("scribe_component", jsonNotificationSettingSectionEntry.k);
        final ArrayList h = jsonNotificationSettingSectionEntry.h;
        if (h != null) {
            final Iterator e4 = d10.E(yfe, "selections", h);
            while (e4.hasNext()) {
                final Map map = e4.next();
                if (map != null) {
                    yfe.r0();
                    for (final Map.Entry<String, V> entry : map.entrySet()) {
                        if (qee.r((String)entry.getKey(), yfe, (Map.Entry)entry) == null) {
                            yfe.j();
                        }
                        else {
                            yfe.s0((String)entry.getValue());
                        }
                    }
                    yfe.h();
                }
            }
            yfe.f();
        }
        yfe.u0("vit", jsonNotificationSettingSectionEntry.d);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSettingsTemplate.JsonNotificationSettingSectionEntry jsonNotificationSettingSectionEntry, String s, final qhe qhe) throws IOException {
        if ("allow_multiple_selections".equals(s)) {
            jsonNotificationSettingSectionEntry.o = qhe.l();
        }
        else if ("buckets".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList m = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    s = qhe.T((String)null);
                    if (s != null) {
                        m.add(s);
                    }
                }
                jsonNotificationSettingSectionEntry.m = m;
            }
            else {
                jsonNotificationSettingSectionEntry.m = null;
            }
        }
        else if ("client_experiment_filter".equals(s)) {
            jsonNotificationSettingSectionEntry.f = qhe.T((String)null);
        }
        else if ("control_type".equals(s)) {
            jsonNotificationSettingSectionEntry.g = qhe.T((String)null);
        }
        else if ("default_selections".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList i = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    s = qhe.T((String)null);
                    if (s != null) {
                        i.add(s);
                    }
                }
                jsonNotificationSettingSectionEntry.i = i;
            }
            else {
                jsonNotificationSettingSectionEntry.i = null;
            }
        }
        else if ("description".equals(s)) {
            jsonNotificationSettingSectionEntry.c = qhe.T((String)null);
        }
        else if ("experiment".equals(s)) {
            jsonNotificationSettingSectionEntry.l = qhe.T((String)null);
        }
        else if ("feature_switches".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList n = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final String t = qhe.T((String)null);
                    if (t != null) {
                        n.add(t);
                    }
                }
                jsonNotificationSettingSectionEntry.n = n;
            }
            else {
                jsonNotificationSettingSectionEntry.n = null;
            }
        }
        else if ("id".equals(s)) {
            jsonNotificationSettingSectionEntry.a = qhe.T((String)null);
        }
        else if ("name".equals(s)) {
            jsonNotificationSettingSectionEntry.b = qhe.T((String)null);
        }
        else if ("off_description".equals(s)) {
            jsonNotificationSettingSectionEntry.j = qhe.T((String)null);
        }
        else if ("professional".equals(s)) {
            jsonNotificationSettingSectionEntry.e = qhe.T((String)null);
        }
        else if ("scribe_component".equals(s)) {
            jsonNotificationSettingSectionEntry.k = qhe.T((String)null);
        }
        else if ("selections".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList h = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    Object o;
                    if (qhe.e() == rje.N0) {
                        final HashMap<String, String> hashMap = new HashMap<String, String>();
                        while (true) {
                            o = hashMap;
                            if (qhe.i0() == rje.O0) {
                                break;
                            }
                            s = qhe.j();
                            qhe.i0();
                            if (qhe.e() == rje.X0) {
                                hashMap.put(s, null);
                            }
                            else {
                                hashMap.put(s, qhe.T((String)null));
                            }
                        }
                    }
                    else {
                        o = null;
                    }
                    if (o != null) {
                        h.add(o);
                    }
                }
                jsonNotificationSettingSectionEntry.h = h;
            }
            else {
                jsonNotificationSettingSectionEntry.h = null;
            }
        }
        else if ("vit".equals(s)) {
            jsonNotificationSettingSectionEntry.d = qhe.T((String)null);
        }
    }
    
    public JsonSettingsTemplate.JsonNotificationSettingSectionEntry parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSettingsTemplate.JsonNotificationSettingSectionEntry jsonNotificationSettingSectionEntry, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNotificationSettingSectionEntry, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSettingsTemplate.JsonNotificationSettingSectionEntry)o, yfe, b);
    }
}
