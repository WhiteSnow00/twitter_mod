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
    public static final r4r SSO_PROVIDER_TYPE_CONVERTER;
    
    static {
        SSO_PROVIDER_TYPE_CONVERTER = new r4r();
    }
    
    public static JsonSsoSubtask _parse(final khe khe) throws IOException {
        final JsonSsoSubtask jsonSsoSubtask = new JsonSsoSubtask();
        if (khe.e() == null) {
            khe.i0();
        }
        if (khe.e() != lje.K0) {
            khe.m0();
            return null;
        }
        while (khe.i0() != lje.L0) {
            final String d = khe.d();
            khe.i0();
            parseField(jsonSsoSubtask, d, khe);
            khe.m0();
        }
        return jsonSsoSubtask;
    }
    
    public static void _serialize(final JsonSsoSubtask jsonSsoSubtask, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("auth_url", jsonSsoSubtask.g);
        if (jsonSsoSubtask.c != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonSsoSubtask.c, "cancel_link", true, tfe);
        }
        if (jsonSsoSubtask.j != null) {
            tfe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonSsoSubtask.j, tfe, true);
        }
        tfe.u0("exchange_url", jsonSsoSubtask.h);
        if (jsonSsoSubtask.b != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonSsoSubtask.b, "fail_link", true, tfe);
        }
        if (jsonSsoSubtask.a != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonSsoSubtask.a, "next_link", true, tfe);
        }
        final q4r d = jsonSsoSubtask.d;
        if (d != null) {
            ((StringBasedTypeConverter)JsonSsoSubtask$$JsonObjectMapper.SSO_PROVIDER_TYPE_CONVERTER).serialize((Object)d, "provider", true, tfe);
        }
        tfe.u0("redirect_uri", jsonSsoSubtask.f);
        final ArrayList e = jsonSsoSubtask.e;
        if (e != null) {
            final Iterator g = q1a.g(tfe, "scopes", e);
            while (g.hasNext()) {
                tfe.s0((String)g.next());
            }
            tfe.f();
        }
        tfe.u0("state", jsonSsoSubtask.i);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonSsoSubtask jsonSsoSubtask, final String s, final khe khe) throws IOException {
        if ("auth_url".equals(s)) {
            jsonSsoSubtask.g = khe.T((String)null);
        }
        else if ("cancel_link".equals(s)) {
            jsonSsoSubtask.c = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("component_collection".equals(s)) {
            jsonSsoSubtask.j = JsonOcfComponentCollection$$JsonObjectMapper._parse(khe);
        }
        else if ("exchange_url".equals(s)) {
            jsonSsoSubtask.h = khe.T((String)null);
        }
        else if ("fail_link".equals(s)) {
            jsonSsoSubtask.b = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("next_link".equals(s)) {
            jsonSsoSubtask.a = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("provider".equals(s)) {
            jsonSsoSubtask.d = (q4r)((StringBasedTypeConverter)JsonSsoSubtask$$JsonObjectMapper.SSO_PROVIDER_TYPE_CONVERTER).parse(khe);
        }
        else if ("redirect_uri".equals(s)) {
            jsonSsoSubtask.f = khe.T((String)null);
        }
        else if ("scopes".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList e = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final String t = khe.T((String)null);
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
            jsonSsoSubtask.i = khe.T((String)null);
        }
    }
    
    public JsonSsoSubtask parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonSsoSubtask jsonSsoSubtask, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonSsoSubtask, tfe, b);
    }
}
