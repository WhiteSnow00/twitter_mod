// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.hashflag;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonHashflag$$JsonObjectMapper extends JsonMapper<JsonHashflag>
{
    public static JsonHashflag _parse(final tge tge) throws IOException {
        final JsonHashflag jsonHashflag = new JsonHashflag();
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
            parseField(jsonHashflag, d, tge);
            tge.l0();
        }
        return jsonHashflag;
    }
    
    public static void _serialize(final JsonHashflag jsonHashflag, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final ArrayList e = jsonHashflag.e;
        if (e != null) {
            final Iterator a = br.A(afe, "animations", e);
            while (a.hasNext()) {
                final cb0 cb0 = a.next();
                if (cb0 != null) {
                    LoganSquare.typeConverterFor((Class)cb0.class).serialize((Object)cb0, "lslocalanimationsElement", false, afe);
                }
            }
            afe.f();
        }
        afe.t0("assetUrl", jsonHashflag.b);
        afe.t0("endingTimestampMs", jsonHashflag.d);
        afe.t0("hashtag", jsonHashflag.a);
        afe.t0("startingTimestampMs", jsonHashflag.c);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonHashflag jsonHashflag, final String s, final tge tge) throws IOException {
        if ("animations".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList e = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final cb0 cb0 = (cb0)LoganSquare.typeConverterFor((Class)cb0.class).parse(tge);
                    if (cb0 != null) {
                        e.add(cb0);
                    }
                }
                jsonHashflag.e = e;
            }
            else {
                jsonHashflag.e = null;
            }
        }
        else if (!"assetUrl".equals(s) && !"asset_url".equals(s)) {
            if (!"endingTimestampMs".equals(s) && !"ending_timestamp_ms".equals(s)) {
                if ("hashtag".equals(s)) {
                    jsonHashflag.a = tge.T((String)null);
                }
                else if ("startingTimestampMs".equals(s) || "starting_timestamp_ms".equals(s)) {
                    jsonHashflag.c = tge.T((String)null);
                }
            }
            else {
                jsonHashflag.d = tge.T((String)null);
            }
        }
        else {
            jsonHashflag.b = tge.T((String)null);
        }
    }
    
    public JsonHashflag parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonHashflag jsonHashflag, final afe afe, final boolean b) throws IOException {
        _serialize(jsonHashflag, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonHashflag)o, afe, b);
    }
}
