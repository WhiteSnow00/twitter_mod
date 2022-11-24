// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.page;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonPage$$JsonObjectMapper extends JsonMapper<JsonPage>
{
    public static JsonPage _parse(final qhe qhe) throws IOException {
        final JsonPage jsonPage = new JsonPage();
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
            parseField(jsonPage, d, qhe);
            qhe.m0();
        }
        return jsonPage;
    }
    
    public static void _serialize(final JsonPage jsonPage, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("id", jsonPage.a);
        if (jsonPage.b != null) {
            LoganSquare.typeConverterFor((Class)rsj.class).serialize((Object)jsonPage.b, "pageBody", true, yfe);
        }
        if (jsonPage.e != null) {
            LoganSquare.typeConverterFor((Class)vsj.class).serialize((Object)jsonPage.e, "page_header", true, yfe);
        }
        if (jsonPage.d != null) {
            LoganSquare.typeConverterFor((Class)etj.class).serialize((Object)jsonPage.d, "page_nav_bar", true, yfe);
        }
        if (jsonPage.c != null) {
            LoganSquare.typeConverterFor((Class)j5t.class).serialize((Object)jsonPage.c, "scribeConfig", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonPage jsonPage, final String s, final qhe qhe) throws IOException {
        if ("id".equals(s)) {
            jsonPage.a = qhe.T((String)null);
        }
        else if ("pageBody".equals(s)) {
            jsonPage.b = (rsj)LoganSquare.typeConverterFor((Class)rsj.class).parse(qhe);
        }
        else if ("page_header".equals(s)) {
            jsonPage.e = (vsj)LoganSquare.typeConverterFor((Class)vsj.class).parse(qhe);
        }
        else if ("page_nav_bar".equals(s)) {
            jsonPage.d = (etj)LoganSquare.typeConverterFor((Class)etj.class).parse(qhe);
        }
        else if ("scribeConfig".equals(s)) {
            jsonPage.c = (j5t)LoganSquare.typeConverterFor((Class)j5t.class).parse(qhe);
        }
    }
    
    public JsonPage parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonPage jsonPage, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonPage, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonPage)o, yfe, b);
    }
}
