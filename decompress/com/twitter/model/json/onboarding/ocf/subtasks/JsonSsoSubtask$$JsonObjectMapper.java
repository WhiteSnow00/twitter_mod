// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.util.Iterator;
import java.util.ArrayList;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection$$JsonObjectMapper;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSsoSubtask$$JsonObjectMapper extends JsonMapper<JsonSsoSubtask>
{
    public static final k5r SSO_PROVIDER_TYPE_CONVERTER;
    
    static {
        SSO_PROVIDER_TYPE_CONVERTER = new k5r();
    }
    
    public static JsonSsoSubtask _parse(final tge tge) throws IOException {
        final JsonSsoSubtask jsonSsoSubtask = new JsonSsoSubtask();
        if (tge.e() == null) {
            tge.h0();
        }
        if (tge.e() != vie.L0) {
            tge.l0();
            return null;
        }
        while (tge.h0() != vie.M0) {
            final String d = tge.d();
            tge.h0();
            parseField(jsonSsoSubtask, d, tge);
            tge.l0();
        }
        return jsonSsoSubtask;
    }
    
    public static void _serialize(final JsonSsoSubtask jsonSsoSubtask, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("auth_url", jsonSsoSubtask.g);
        if (jsonSsoSubtask.c != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonSsoSubtask.c, "cancel_link", true, afe);
        }
        if (jsonSsoSubtask.j != null) {
            afe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonSsoSubtask.j, afe, true);
        }
        afe.t0("exchange_url", jsonSsoSubtask.h);
        if (jsonSsoSubtask.b != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonSsoSubtask.b, "fail_link", true, afe);
        }
        if (jsonSsoSubtask.a != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonSsoSubtask.a, "next_link", true, afe);
        }
        final j5r d = jsonSsoSubtask.d;
        if (d != null) {
            ((StringBasedTypeConverter)JsonSsoSubtask$$JsonObjectMapper.SSO_PROVIDER_TYPE_CONVERTER).serialize((Object)d, "provider", true, afe);
        }
        afe.t0("redirect_uri", jsonSsoSubtask.f);
        final ArrayList e = jsonSsoSubtask.e;
        if (e != null) {
            final Iterator a = br.A(afe, "scopes", e);
            while (a.hasNext()) {
                afe.r0((String)a.next());
            }
            afe.f();
        }
        afe.t0("state", jsonSsoSubtask.i);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonSsoSubtask jsonSsoSubtask, final String s, final tge tge) throws IOException {
        if ("auth_url".equals(s)) {
            jsonSsoSubtask.g = tge.T((String)null);
        }
        else if ("cancel_link".equals(s)) {
            jsonSsoSubtask.c = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("component_collection".equals(s)) {
            jsonSsoSubtask.j = JsonOcfComponentCollection$$JsonObjectMapper._parse(tge);
        }
        else if ("exchange_url".equals(s)) {
            jsonSsoSubtask.h = tge.T((String)null);
        }
        else if ("fail_link".equals(s)) {
            jsonSsoSubtask.b = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("next_link".equals(s)) {
            jsonSsoSubtask.a = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("provider".equals(s)) {
            jsonSsoSubtask.d = (j5r)((StringBasedTypeConverter)JsonSsoSubtask$$JsonObjectMapper.SSO_PROVIDER_TYPE_CONVERTER).parse(tge);
        }
        else if ("redirect_uri".equals(s)) {
            jsonSsoSubtask.f = tge.T((String)null);
        }
        else if ("scopes".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList e = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final String t = tge.T((String)null);
                    if (t != null) {
                        e.add(t);
                    }
                }
                jsonSsoSubtask.e = e;
            }
            else {
                jsonSsoSubtask.e = null;
            }
        }
        else if ("state".equals(s)) {
            jsonSsoSubtask.i = tge.T((String)null);
        }
    }
    
    public JsonSsoSubtask parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonSsoSubtask jsonSsoSubtask, final afe afe, final boolean b) throws IOException {
        _serialize(jsonSsoSubtask, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonSsoSubtask)o, afe, b);
    }
}
