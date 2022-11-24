// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.page;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonPageConfiguration$$JsonObjectMapper extends JsonMapper<JsonPageConfiguration>
{
    public static JsonPageConfiguration _parse(final qhe qhe) throws IOException {
        final JsonPageConfiguration jsonPageConfiguration = new JsonPageConfiguration();
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
            parseField(jsonPageConfiguration, d, qhe);
            qhe.m0();
        }
        return jsonPageConfiguration;
    }
    
    public static void _serialize(final JsonPageConfiguration jsonPageConfiguration, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("id", jsonPageConfiguration.a);
        if (jsonPageConfiguration.d != null) {
            LoganSquare.typeConverterFor((Class)vsj.class).serialize((Object)jsonPageConfiguration.d, "pageHeader", true, yfe);
        }
        if (jsonPageConfiguration.e != null) {
            LoganSquare.typeConverterFor((Class)etj.class).serialize((Object)jsonPageConfiguration.e, "pageNavBar", true, yfe);
        }
        if (jsonPageConfiguration.c != null) {
            LoganSquare.typeConverterFor((Class)j5t.class).serialize((Object)jsonPageConfiguration.c, "scribeConfig", true, yfe);
        }
        if (jsonPageConfiguration.b != null) {
            LoganSquare.typeConverterFor((Class)rtj.class).serialize((Object)jsonPageConfiguration.b, "tabs", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonPageConfiguration jsonPageConfiguration, final String s, final qhe qhe) throws IOException {
        if ("id".equals(s)) {
            jsonPageConfiguration.a = qhe.T((String)null);
        }
        else if ("pageHeader".equals(s)) {
            jsonPageConfiguration.d = (vsj)LoganSquare.typeConverterFor((Class)vsj.class).parse(qhe);
        }
        else if ("pageNavBar".equals(s)) {
            jsonPageConfiguration.e = (etj)LoganSquare.typeConverterFor((Class)etj.class).parse(qhe);
        }
        else if ("scribeConfig".equals(s)) {
            jsonPageConfiguration.c = (j5t)LoganSquare.typeConverterFor((Class)j5t.class).parse(qhe);
        }
        else if ("tabs".equals(s)) {
            jsonPageConfiguration.b = (rtj)LoganSquare.typeConverterFor((Class)rtj.class).parse(qhe);
        }
    }
    
    public JsonPageConfiguration parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonPageConfiguration jsonPageConfiguration, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonPageConfiguration, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonPageConfiguration)o, yfe, b);
    }
}
