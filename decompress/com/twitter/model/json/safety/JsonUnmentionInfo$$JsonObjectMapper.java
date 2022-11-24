// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.safety;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.util.user.UserIdentifier;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUnmentionInfo$$JsonObjectMapper extends JsonMapper<JsonUnmentionInfo>
{
    public static JsonUnmentionInfo _parse(final qhe qhe) throws IOException {
        final JsonUnmentionInfo jsonUnmentionInfo = new JsonUnmentionInfo();
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
            parseField(jsonUnmentionInfo, d, qhe);
            qhe.m0();
        }
        return jsonUnmentionInfo;
    }
    
    public static void _serialize(final JsonUnmentionInfo jsonUnmentionInfo, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final ArrayList a = jsonUnmentionInfo.a;
        if (a != null) {
            final Iterator e = d10.E(yfe, "unmentionedUsers", a);
            while (e.hasNext()) {
                yfe.r((long)e.next());
            }
            yfe.f();
        }
        final ArrayList b2 = jsonUnmentionInfo.b;
        if (b2 != null) {
            final Iterator e2 = d10.E(yfe, "unmentioned_users_results", b2);
            while (e2.hasNext()) {
                final UserIdentifier userIdentifier = e2.next();
                if (userIdentifier != null) {
                    LoganSquare.typeConverterFor((Class)UserIdentifier.class).serialize((Object)userIdentifier, "lslocalunmentioned_users_resultsElement", false, yfe);
                }
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonUnmentionInfo jsonUnmentionInfo, final String s, final qhe qhe) throws IOException {
        if ("unmentionedUsers".equals(s)) {
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
                jsonUnmentionInfo.a = a;
            }
            else {
                jsonUnmentionInfo.a = null;
            }
        }
        else if ("unmentioned_users_results".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList b = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final UserIdentifier userIdentifier = (UserIdentifier)LoganSquare.typeConverterFor((Class)UserIdentifier.class).parse(qhe);
                    if (userIdentifier != null) {
                        b.add(userIdentifier);
                    }
                }
                jsonUnmentionInfo.b = b;
            }
            else {
                jsonUnmentionInfo.b = null;
            }
        }
    }
    
    public JsonUnmentionInfo parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonUnmentionInfo jsonUnmentionInfo, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonUnmentionInfo, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonUnmentionInfo)o, yfe, b);
    }
}
