// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.business;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.profilemodules.model.business.OpenCloseTimeNext;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonBusinessOpenTimesResponse$$JsonObjectMapper extends JsonMapper<JsonBusinessOpenTimesResponse>
{
    public static JsonBusinessOpenTimesResponse _parse(final tge tge) throws IOException {
        final JsonBusinessOpenTimesResponse jsonBusinessOpenTimesResponse = new JsonBusinessOpenTimesResponse();
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
            parseField(jsonBusinessOpenTimesResponse, d, tge);
            tge.l0();
        }
        return jsonBusinessOpenTimesResponse;
    }
    
    public static void _serialize(final JsonBusinessOpenTimesResponse jsonBusinessOpenTimesResponse, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonBusinessOpenTimesResponse.d != null) {
            LoganSquare.typeConverterFor((Class)OpenCloseTimeNext.class).serialize((Object)jsonBusinessOpenTimesResponse.d, "closes", true, afe);
        }
        afe.e("is_open", jsonBusinessOpenTimesResponse.b);
        if (jsonBusinessOpenTimesResponse.a != null) {
            LoganSquare.typeConverterFor((Class)tmj.class).serialize((Object)jsonBusinessOpenTimesResponse.a, "open_times_type", true, afe);
        }
        if (jsonBusinessOpenTimesResponse.c != null) {
            LoganSquare.typeConverterFor((Class)OpenCloseTimeNext.class).serialize((Object)jsonBusinessOpenTimesResponse.c, "opens", true, afe);
        }
        final ArrayList e = jsonBusinessOpenTimesResponse.e;
        if (e != null) {
            final Iterator a = br.A(afe, "regular", e);
            while (a.hasNext()) {
                final v13 v13 = a.next();
                if (v13 != null) {
                    LoganSquare.typeConverterFor((Class)v13.class).serialize((Object)v13, "lslocalregularElement", false, afe);
                }
            }
            afe.f();
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonBusinessOpenTimesResponse jsonBusinessOpenTimesResponse, final String s, final tge tge) throws IOException {
        if ("closes".equals(s)) {
            jsonBusinessOpenTimesResponse.d = (OpenCloseTimeNext)LoganSquare.typeConverterFor((Class)OpenCloseTimeNext.class).parse(tge);
        }
        else if ("is_open".equals(s)) {
            jsonBusinessOpenTimesResponse.b = tge.k();
        }
        else if ("open_times_type".equals(s)) {
            jsonBusinessOpenTimesResponse.a = (tmj)LoganSquare.typeConverterFor((Class)tmj.class).parse(tge);
        }
        else if ("opens".equals(s)) {
            jsonBusinessOpenTimesResponse.c = (OpenCloseTimeNext)LoganSquare.typeConverterFor((Class)OpenCloseTimeNext.class).parse(tge);
        }
        else if ("regular".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList e = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final v13 v13 = (v13)LoganSquare.typeConverterFor((Class)v13.class).parse(tge);
                    if (v13 != null) {
                        e.add(v13);
                    }
                }
                jsonBusinessOpenTimesResponse.e = e;
            }
            else {
                jsonBusinessOpenTimesResponse.e = null;
            }
        }
    }
    
    public JsonBusinessOpenTimesResponse parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonBusinessOpenTimesResponse jsonBusinessOpenTimesResponse, final afe afe, final boolean b) throws IOException {
        _serialize(jsonBusinessOpenTimesResponse, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonBusinessOpenTimesResponse)o, afe, b);
    }
}
