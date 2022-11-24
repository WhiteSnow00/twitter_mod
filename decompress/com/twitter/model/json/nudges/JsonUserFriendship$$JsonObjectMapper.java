// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import java.util.Iterator;
import java.util.ArrayList;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUserFriendship$$JsonObjectMapper extends JsonMapper<JsonUserFriendship>
{
    public static JsonUserFriendship _parse(final qhe qhe) throws IOException {
        final JsonUserFriendship jsonUserFriendship = new JsonUserFriendship();
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
            parseField(jsonUserFriendship, d, qhe);
            qhe.m0();
        }
        return jsonUserFriendship;
    }
    
    public static void _serialize(final JsonUserFriendship jsonUserFriendship, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final ArrayList e = jsonUserFriendship.e;
        if (e != null) {
            final Iterator e2 = d10.E(yfe, "connections", e);
            while (e2.hasNext()) {
                yfe.s0((String)e2.next());
            }
            yfe.f();
        }
        yfe.W("id", (long)jsonUserFriendship.c);
        yfe.u0("id_str", jsonUserFriendship.d);
        yfe.u0("name", jsonUserFriendship.a);
        yfe.u0("screen_name", jsonUserFriendship.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonUserFriendship jsonUserFriendship, final String s, final qhe qhe) throws IOException {
        final boolean equals = "connections".equals(s);
        final Long n = null;
        if (equals) {
            if (qhe.e() == rje.P0) {
                final ArrayList e = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final String t = qhe.T((String)null);
                    if (t != null) {
                        e.add(t);
                    }
                }
                jsonUserFriendship.e = e;
            }
            else {
                jsonUserFriendship.e = null;
            }
        }
        else if ("id".equals(s)) {
            Long value;
            if (qhe.e() == rje.X0) {
                value = n;
            }
            else {
                value = qhe.L();
            }
            jsonUserFriendship.c = value;
        }
        else if ("id_str".equals(s)) {
            jsonUserFriendship.d = qhe.T((String)null);
        }
        else if ("name".equals(s)) {
            jsonUserFriendship.a = qhe.T((String)null);
        }
        else if ("screen_name".equals(s)) {
            jsonUserFriendship.b = qhe.T((String)null);
        }
    }
    
    public JsonUserFriendship parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonUserFriendship jsonUserFriendship, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonUserFriendship, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonUserFriendship)o, yfe, b);
    }
}
