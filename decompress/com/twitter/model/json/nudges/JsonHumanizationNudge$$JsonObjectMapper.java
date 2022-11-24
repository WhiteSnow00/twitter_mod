// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonHumanizationNudge$$JsonObjectMapper extends JsonMapper<JsonHumanizationNudge>
{
    public static JsonHumanizationNudge _parse(final qhe qhe) throws IOException {
        final JsonHumanizationNudge jsonHumanizationNudge = new JsonHumanizationNudge();
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
            parseField(jsonHumanizationNudge, d, qhe);
            qhe.m0();
        }
        return jsonHumanizationNudge;
    }
    
    public static void _serialize(final JsonHumanizationNudge jsonHumanizationNudge, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonHumanizationNudge.d != null) {
            LoganSquare.typeConverterFor((Class)utc.class).serialize((Object)jsonHumanizationNudge.d, "in_reply_to_user", true, yfe);
        }
        final ArrayList a = jsonHumanizationNudge.a;
        if (a != null) {
            final Iterator e = d10.E(yfe, "mutual_topics", a);
            while (e.hasNext()) {
                final ntc ntc = e.next();
                if (ntc != null) {
                    LoganSquare.typeConverterFor((Class)ntc.class).serialize((Object)ntc, "lslocalmutual_topicsElement", false, yfe);
                }
            }
            yfe.f();
        }
        yfe.u0("nudge_id", jsonHumanizationNudge.c);
        final ArrayList b2 = jsonHumanizationNudge.b;
        if (b2 != null) {
            final Iterator e2 = d10.E(yfe, "social_proof_followers", b2);
            while (e2.hasNext()) {
                final utc utc = e2.next();
                if (utc != null) {
                    LoganSquare.typeConverterFor((Class)utc.class).serialize((Object)utc, "lslocalsocial_proof_followersElement", false, yfe);
                }
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonHumanizationNudge jsonHumanizationNudge, final String s, final qhe qhe) throws IOException {
        if ("in_reply_to_user".equals(s)) {
            jsonHumanizationNudge.d = (utc)LoganSquare.typeConverterFor((Class)utc.class).parse(qhe);
        }
        else if ("mutual_topics".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList a = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final ntc ntc = (ntc)LoganSquare.typeConverterFor((Class)ntc.class).parse(qhe);
                    if (ntc != null) {
                        a.add(ntc);
                    }
                }
                jsonHumanizationNudge.a = a;
            }
            else {
                jsonHumanizationNudge.a = null;
            }
        }
        else if ("nudge_id".equals(s)) {
            jsonHumanizationNudge.c = qhe.T((String)null);
        }
        else if ("social_proof_followers".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList b = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final utc utc = (utc)LoganSquare.typeConverterFor((Class)utc.class).parse(qhe);
                    if (utc != null) {
                        b.add(utc);
                    }
                }
                jsonHumanizationNudge.b = b;
            }
            else {
                jsonHumanizationNudge.b = null;
            }
        }
    }
    
    public JsonHumanizationNudge parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonHumanizationNudge jsonHumanizationNudge, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonHumanizationNudge, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonHumanizationNudge)o, yfe, b);
    }
}
