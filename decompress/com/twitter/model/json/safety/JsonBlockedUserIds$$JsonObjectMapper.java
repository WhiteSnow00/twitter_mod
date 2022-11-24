// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.safety;

import java.util.Iterator;
import java.util.ArrayList;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonBlockedUserIds$$JsonObjectMapper extends JsonMapper<JsonBlockedUserIds>
{
    public static JsonBlockedUserIds _parse(final qhe qhe) throws IOException {
        final JsonBlockedUserIds jsonBlockedUserIds = new JsonBlockedUserIds();
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
            parseField(jsonBlockedUserIds, d, qhe);
            qhe.m0();
        }
        return jsonBlockedUserIds;
    }
    
    public static void _serialize(final JsonBlockedUserIds jsonBlockedUserIds, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("next_cursor_str", jsonBlockedUserIds.b);
        final ArrayList a = jsonBlockedUserIds.a;
        if (a != null) {
            final Iterator e = d10.E(yfe, "ids", a);
            while (e.hasNext()) {
                yfe.r((long)e.next());
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonBlockedUserIds jsonBlockedUserIds, final String s, final qhe qhe) throws IOException {
        if ("next_cursor_str".equals(s)) {
            jsonBlockedUserIds.b = qhe.T((String)null);
        }
        else if ("ids".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList a = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    Long value;
                    if (qhe.e() == rje.X0) {
                        value = null;
                    }
                    else {
                        value = qhe.L();
                    }
                    if (value != null) {
                        a.add(value);
                    }
                }
                jsonBlockedUserIds.a = a;
            }
            else {
                jsonBlockedUserIds.a = null;
            }
        }
    }
    
    public JsonBlockedUserIds parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonBlockedUserIds jsonBlockedUserIds, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonBlockedUserIds, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonBlockedUserIds)o, yfe, b);
    }
}
