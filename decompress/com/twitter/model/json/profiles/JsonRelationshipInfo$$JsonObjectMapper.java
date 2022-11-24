// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.profiles;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonRelationshipInfo$$JsonObjectMapper extends JsonMapper<JsonRelationshipInfo>
{
    public static JsonRelationshipInfo _parse(final qhe qhe) throws IOException {
        final JsonRelationshipInfo jsonRelationshipInfo = new JsonRelationshipInfo();
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
            parseField(jsonRelationshipInfo, d, qhe);
            qhe.m0();
        }
        return jsonRelationshipInfo;
    }
    
    public static void _serialize(final JsonRelationshipInfo jsonRelationshipInfo, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("all_replies", jsonRelationshipInfo.f);
        yfe.e("blocked_by", jsonRelationshipInfo.p);
        yfe.e("blocking", jsonRelationshipInfo.e);
        yfe.e("can_dm", jsonRelationshipInfo.j);
        yfe.e("can_media_tag", jsonRelationshipInfo.n);
        yfe.u0("display_name", jsonRelationshipInfo.c);
        yfe.e("followed_by", jsonRelationshipInfo.l);
        yfe.e("following", jsonRelationshipInfo.h);
        yfe.e("following_requested", jsonRelationshipInfo.i);
        yfe.W("id", jsonRelationshipInfo.a);
        yfe.e("live_following", jsonRelationshipInfo.m);
        yfe.e("marked_spam", jsonRelationshipInfo.d);
        yfe.e("muting", jsonRelationshipInfo.o);
        yfe.e("notifications_enabled", jsonRelationshipInfo.g);
        yfe.u0("screen_name", jsonRelationshipInfo.b);
        yfe.e("space_device_following", jsonRelationshipInfo.q);
        yfe.e("want_retweets", jsonRelationshipInfo.k);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonRelationshipInfo jsonRelationshipInfo, final String s, final qhe qhe) throws IOException {
        if ("all_replies".equals(s)) {
            jsonRelationshipInfo.f = qhe.l();
        }
        else if ("blocked_by".equals(s)) {
            jsonRelationshipInfo.p = qhe.l();
        }
        else if ("blocking".equals(s)) {
            jsonRelationshipInfo.e = qhe.l();
        }
        else if ("can_dm".equals(s)) {
            jsonRelationshipInfo.j = qhe.l();
        }
        else if ("can_media_tag".equals(s)) {
            jsonRelationshipInfo.n = qhe.l();
        }
        else if ("display_name".equals(s)) {
            jsonRelationshipInfo.c = qhe.T((String)null);
        }
        else if ("followed_by".equals(s)) {
            jsonRelationshipInfo.l = qhe.l();
        }
        else if ("following".equals(s)) {
            jsonRelationshipInfo.h = qhe.l();
        }
        else if ("following_requested".equals(s)) {
            jsonRelationshipInfo.i = qhe.l();
        }
        else if ("id".equals(s)) {
            jsonRelationshipInfo.a = qhe.L();
        }
        else if ("live_following".equals(s)) {
            jsonRelationshipInfo.m = qhe.l();
        }
        else if ("marked_spam".equals(s)) {
            jsonRelationshipInfo.d = qhe.l();
        }
        else if ("muting".equals(s)) {
            jsonRelationshipInfo.o = qhe.l();
        }
        else if ("notifications_enabled".equals(s)) {
            jsonRelationshipInfo.g = qhe.l();
        }
        else if ("screen_name".equals(s)) {
            jsonRelationshipInfo.b = qhe.T((String)null);
        }
        else if ("space_device_following".equals(s)) {
            jsonRelationshipInfo.q = qhe.l();
        }
        else if ("want_retweets".equals(s)) {
            jsonRelationshipInfo.k = qhe.l();
        }
    }
    
    public JsonRelationshipInfo parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonRelationshipInfo jsonRelationshipInfo, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonRelationshipInfo, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonRelationshipInfo)o, yfe, b);
    }
}
