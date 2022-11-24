// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.page;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonPageTab$$JsonObjectMapper extends JsonMapper<JsonPageTab>
{
    public static JsonPageTab _parse(final qhe qhe) throws IOException {
        final JsonPageTab jsonPageTab = new JsonPageTab();
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
            parseField(jsonPageTab, d, qhe);
            qhe.m0();
        }
        return jsonPageTab;
    }
    
    public static void _serialize(final JsonPageTab jsonPageTab, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("id", jsonPageTab.a);
        yfe.u0("labelText", jsonPageTab.b);
        yfe.T("refreshIntervalSec", jsonPageTab.f);
        if (jsonPageTab.e != null) {
            LoganSquare.typeConverterFor((Class)j5t.class).serialize((Object)jsonPageTab.e, "scribeConfig", true, yfe);
        }
        if (jsonPageTab.d != null) {
            LoganSquare.typeConverterFor((Class)tys.class).serialize((Object)jsonPageTab.d, "timeline", true, yfe);
        }
        if (jsonPageTab.c != null) {
            LoganSquare.typeConverterFor((Class)c9t.class).serialize((Object)jsonPageTab.c, "urtEndpoint", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonPageTab jsonPageTab, final String s, final qhe qhe) throws IOException {
        if ("id".equals(s)) {
            jsonPageTab.a = qhe.T((String)null);
        }
        else if ("labelText".equals(s)) {
            jsonPageTab.b = qhe.T((String)null);
        }
        else if ("refreshIntervalSec".equals(s)) {
            jsonPageTab.f = qhe.z();
        }
        else if ("scribeConfig".equals(s)) {
            jsonPageTab.e = (j5t)LoganSquare.typeConverterFor((Class)j5t.class).parse(qhe);
        }
        else if ("timeline".equals(s)) {
            jsonPageTab.d = (tys)LoganSquare.typeConverterFor((Class)tys.class).parse(qhe);
        }
        else if ("urtEndpoint".equals(s)) {
            jsonPageTab.c = (c9t)LoganSquare.typeConverterFor((Class)c9t.class).parse(qhe);
        }
    }
    
    public JsonPageTab parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonPageTab jsonPageTab, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonPageTab, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonPageTab)o, yfe, b);
    }
}
