// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.profiles;

import java.util.Iterator;
import java.util.ArrayList;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFriendsFollowingIds$$JsonObjectMapper extends JsonMapper<JsonFriendsFollowingIds>
{
    public static JsonFriendsFollowingIds _parse(final qhe qhe) throws IOException {
        final JsonFriendsFollowingIds jsonFriendsFollowingIds = new JsonFriendsFollowingIds();
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
            parseField(jsonFriendsFollowingIds, d, qhe);
            qhe.m0();
        }
        return jsonFriendsFollowingIds;
    }
    
    public static void _serialize(final JsonFriendsFollowingIds jsonFriendsFollowingIds, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final ArrayList a = jsonFriendsFollowingIds.a;
        if (a != null) {
            final Iterator e = d10.E(yfe, "ids", a);
            while (e.hasNext()) {
                yfe.s0((String)e.next());
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonFriendsFollowingIds jsonFriendsFollowingIds, final String s, final qhe qhe) throws IOException {
        if ("ids".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList a = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final String t = qhe.T((String)null);
                    if (t != null) {
                        a.add(t);
                    }
                }
                jsonFriendsFollowingIds.a = a;
            }
            else {
                jsonFriendsFollowingIds.a = null;
            }
        }
    }
    
    public JsonFriendsFollowingIds parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonFriendsFollowingIds jsonFriendsFollowingIds, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonFriendsFollowingIds, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonFriendsFollowingIds)o, yfe, b);
    }
}
