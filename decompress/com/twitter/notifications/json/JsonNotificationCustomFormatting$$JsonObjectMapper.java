// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotificationCustomFormatting$$JsonObjectMapper extends JsonMapper<JsonNotificationCustomFormatting>
{
    public static JsonNotificationCustomFormatting _parse(final qhe qhe) throws IOException {
        final JsonNotificationCustomFormatting jsonNotificationCustomFormatting = new JsonNotificationCustomFormatting();
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
            parseField(jsonNotificationCustomFormatting, d, qhe);
            qhe.m0();
        }
        return jsonNotificationCustomFormatting;
    }
    
    public static void _serialize(final JsonNotificationCustomFormatting jsonNotificationCustomFormatting, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final ArrayList c = jsonNotificationCustomFormatting.c;
        if (c != null) {
            final Iterator e = d10.E(yfe, "bold_indices", c);
            while (e.hasNext()) {
                final List list = e.next();
                if (list != null) {
                    yfe.q0();
                    final Iterator iterator = list.iterator();
                    while (iterator.hasNext()) {
                        yfe.q((int)iterator.next());
                    }
                    yfe.f();
                }
            }
            yfe.f();
        }
        yfe.u0("hex_color", jsonNotificationCustomFormatting.a);
        final ArrayList b2 = jsonNotificationCustomFormatting.b;
        if (b2 != null) {
            final Iterator e2 = d10.E(yfe, "highlight_indices", b2);
            while (e2.hasNext()) {
                final List list2 = e2.next();
                if (list2 != null) {
                    yfe.q0();
                    final Iterator iterator2 = list2.iterator();
                    while (iterator2.hasNext()) {
                        yfe.q((int)iterator2.next());
                    }
                    yfe.f();
                }
            }
            yfe.f();
        }
        final ArrayList d = jsonNotificationCustomFormatting.d;
        if (d != null) {
            final Iterator e3 = d10.E(yfe, "italicize_indices", d);
            while (e3.hasNext()) {
                final List list3 = e3.next();
                if (list3 != null) {
                    yfe.q0();
                    final Iterator iterator3 = list3.iterator();
                    while (iterator3.hasNext()) {
                        yfe.q((int)iterator3.next());
                    }
                    yfe.f();
                }
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotificationCustomFormatting jsonNotificationCustomFormatting, final String s, final qhe qhe) throws IOException {
        if ("bold_indices".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList c = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    Object o;
                    if (qhe.e() == rje.P0) {
                        final ArrayList<Integer> list = new ArrayList<Integer>();
                        while (true) {
                            o = list;
                            if (qhe.i0() == rje.Q0) {
                                break;
                            }
                            Integer value;
                            if (qhe.e() == rje.X0) {
                                value = null;
                            }
                            else {
                                value = qhe.z();
                            }
                            if (value == null) {
                                continue;
                            }
                            list.add(value);
                        }
                    }
                    else {
                        o = null;
                    }
                    if (o != null) {
                        c.add(o);
                    }
                }
                jsonNotificationCustomFormatting.c = c;
            }
            else {
                jsonNotificationCustomFormatting.c = null;
            }
        }
        else if ("hex_color".equals(s)) {
            jsonNotificationCustomFormatting.a = qhe.T((String)null);
        }
        else if ("highlight_indices".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList b = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    Object o2;
                    if (qhe.e() == rje.P0) {
                        final ArrayList<Integer> list2 = new ArrayList<Integer>();
                        while (true) {
                            o2 = list2;
                            if (qhe.i0() == rje.Q0) {
                                break;
                            }
                            Integer value2;
                            if (qhe.e() == rje.X0) {
                                value2 = null;
                            }
                            else {
                                value2 = qhe.z();
                            }
                            if (value2 == null) {
                                continue;
                            }
                            list2.add(value2);
                        }
                    }
                    else {
                        o2 = null;
                    }
                    if (o2 != null) {
                        b.add(o2);
                    }
                }
                jsonNotificationCustomFormatting.b = b;
            }
            else {
                jsonNotificationCustomFormatting.b = null;
            }
        }
        else if ("italicize_indices".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList d = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    Object o3;
                    if (qhe.e() == rje.P0) {
                        final ArrayList<Integer> list3 = new ArrayList<Integer>();
                        while (true) {
                            o3 = list3;
                            if (qhe.i0() == rje.Q0) {
                                break;
                            }
                            Integer value3;
                            if (qhe.e() == rje.X0) {
                                value3 = null;
                            }
                            else {
                                value3 = qhe.z();
                            }
                            if (value3 == null) {
                                continue;
                            }
                            list3.add(value3);
                        }
                    }
                    else {
                        o3 = null;
                    }
                    if (o3 != null) {
                        d.add(o3);
                    }
                }
                jsonNotificationCustomFormatting.d = d;
            }
            else {
                jsonNotificationCustomFormatting.d = null;
            }
        }
    }
    
    public JsonNotificationCustomFormatting parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNotificationCustomFormatting jsonNotificationCustomFormatting, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNotificationCustomFormatting, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNotificationCustomFormatting)o, yfe, b);
    }
}
