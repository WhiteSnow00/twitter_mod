// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.search;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTypeaheadUser$$JsonObjectMapper extends JsonMapper<JsonTypeaheadUser>
{
    public static JsonTypeaheadUser _parse(final qhe qhe) throws IOException {
        final JsonTypeaheadUser jsonTypeaheadUser = new JsonTypeaheadUser();
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
            parseField(jsonTypeaheadUser, d, qhe);
            qhe.m0();
        }
        return jsonTypeaheadUser;
    }
    
    public static void _serialize(final JsonTypeaheadUser jsonTypeaheadUser, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("can_media_tag", jsonTypeaheadUser.n);
        yfe.W("id", jsonTypeaheadUser.d);
        yfe.e("is_blue_verified", jsonTypeaheadUser.j);
        yfe.e("is_dm_able", jsonTypeaheadUser.m);
        yfe.e("is_protected", jsonTypeaheadUser.k);
        yfe.e("is_translator", jsonTypeaheadUser.l);
        yfe.u0("location", jsonTypeaheadUser.h);
        yfe.u0("name", jsonTypeaheadUser.e);
        yfe.u0("profile_image_url_https", jsonTypeaheadUser.g);
        if (jsonTypeaheadUser.p != null) {
            LoganSquare.typeConverterFor((Class)dmv.class).serialize((Object)jsonTypeaheadUser.p, "result_context", true, yfe);
        }
        yfe.T("rounded_graph_weight", jsonTypeaheadUser.b);
        yfe.T("rounded_score", jsonTypeaheadUser.a);
        yfe.u0("screen_name", jsonTypeaheadUser.f);
        if (jsonTypeaheadUser.o != null) {
            yfe.i("social_context");
            JsonTypeaheadUser$SocialContext$$JsonObjectMapper._serialize(jsonTypeaheadUser.o, yfe, true);
        }
        final ArrayList c = jsonTypeaheadUser.c;
        if (c != null) {
            final Iterator e = d10.E(yfe, "tokens", c);
            while (e.hasNext()) {
                final JsonTypeaheadResponse.JsonToken jsonToken = e.next();
                if (jsonToken != null) {
                    JsonTypeaheadResponse$JsonToken$$JsonObjectMapper._serialize(jsonToken, yfe, true);
                }
            }
            yfe.f();
        }
        yfe.e("verified", jsonTypeaheadUser.i);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTypeaheadUser jsonTypeaheadUser, final String s, final qhe qhe) throws IOException {
        if ("can_media_tag".equals(s)) {
            jsonTypeaheadUser.n = qhe.l();
        }
        else if ("id".equals(s)) {
            jsonTypeaheadUser.d = qhe.L();
        }
        else if (!"is_blue_verified".equals(s) && !"ext_is_blue_verified".equals(s)) {
            if ("is_dm_able".equals(s)) {
                jsonTypeaheadUser.m = qhe.l();
            }
            else if ("is_protected".equals(s)) {
                jsonTypeaheadUser.k = qhe.l();
            }
            else if ("is_translator".equals(s)) {
                jsonTypeaheadUser.l = qhe.l();
            }
            else if ("location".equals(s)) {
                jsonTypeaheadUser.h = qhe.T((String)null);
            }
            else if ("name".equals(s)) {
                jsonTypeaheadUser.e = qhe.T((String)null);
            }
            else if ("profile_image_url_https".equals(s)) {
                jsonTypeaheadUser.g = qhe.T((String)null);
            }
            else if ("result_context".equals(s)) {
                jsonTypeaheadUser.p = (dmv)LoganSquare.typeConverterFor((Class)dmv.class).parse(qhe);
            }
            else if ("rounded_graph_weight".equals(s)) {
                jsonTypeaheadUser.b = qhe.z();
            }
            else if ("rounded_score".equals(s)) {
                jsonTypeaheadUser.a = qhe.z();
            }
            else if ("screen_name".equals(s)) {
                jsonTypeaheadUser.f = qhe.T((String)null);
            }
            else if ("social_context".equals(s)) {
                jsonTypeaheadUser.o = JsonTypeaheadUser$SocialContext$$JsonObjectMapper._parse(qhe);
            }
            else if ("tokens".equals(s)) {
                if (qhe.e() == rje.P0) {
                    final ArrayList c = new ArrayList();
                    while (qhe.i0() != rje.Q0) {
                        final JsonTypeaheadResponse.JsonToken parse = JsonTypeaheadResponse$JsonToken$$JsonObjectMapper._parse(qhe);
                        if (parse != null) {
                            c.add(parse);
                        }
                    }
                    jsonTypeaheadUser.c = c;
                }
                else {
                    jsonTypeaheadUser.c = null;
                }
            }
            else if ("verified".equals(s)) {
                jsonTypeaheadUser.i = qhe.l();
            }
        }
        else {
            jsonTypeaheadUser.j = qhe.l();
        }
    }
    
    public JsonTypeaheadUser parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTypeaheadUser jsonTypeaheadUser, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTypeaheadUser, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTypeaheadUser)o, yfe, b);
    }
}
