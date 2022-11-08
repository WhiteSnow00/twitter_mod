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
    public static JsonHashflag _parse(final khe khe) throws IOException {
        final JsonHashflag jsonHashflag = new JsonHashflag();
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
            parseField(jsonHashflag, d, khe);
            khe.m0();
        }
        return jsonHashflag;
    }
    
    public static void _serialize(final JsonHashflag jsonHashflag, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final ArrayList e = jsonHashflag.e;
        if (e != null) {
            final Iterator g = q1a.g(tfe, "animations", e);
            while (g.hasNext()) {
                final gb0 gb0 = g.next();
                if (gb0 != null) {
                    LoganSquare.typeConverterFor((Class)gb0.class).serialize((Object)gb0, "lslocalanimationsElement", false, tfe);
                }
            }
            tfe.f();
        }
        tfe.u0("assetUrl", jsonHashflag.b);
        tfe.u0("endingTimestampMs", jsonHashflag.d);
        tfe.u0("hashtag", jsonHashflag.a);
        tfe.u0("startingTimestampMs", jsonHashflag.c);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonHashflag jsonHashflag, final String s, final khe khe) throws IOException {
        if ("animations".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList e = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final gb0 gb0 = (gb0)LoganSquare.typeConverterFor((Class)gb0.class).parse(khe);
                    if (gb0 != null) {
                        e.add(gb0);
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
                    jsonHashflag.a = khe.T((String)null);
                }
                else if ("startingTimestampMs".equals(s) || "starting_timestamp_ms".equals(s)) {
                    jsonHashflag.c = khe.T((String)null);
                }
            }
            else {
                jsonHashflag.d = khe.T((String)null);
            }
        }
        else {
            jsonHashflag.b = khe.T((String)null);
        }
    }
    
    public JsonHashflag parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonHashflag jsonHashflag, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonHashflag, tfe, b);
    }
}
