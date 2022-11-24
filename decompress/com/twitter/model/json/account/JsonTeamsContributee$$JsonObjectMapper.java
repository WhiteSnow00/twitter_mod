// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTeamsContributee$$JsonObjectMapper extends JsonMapper<JsonTeamsContributee>
{
    public static JsonTeamsContributee _parse(final qhe qhe) throws IOException {
        final JsonTeamsContributee jsonTeamsContributee = new JsonTeamsContributee();
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
            parseField(jsonTeamsContributee, d, qhe);
            qhe.m0();
        }
        return jsonTeamsContributee;
    }
    
    public static void _serialize(final JsonTeamsContributee jsonTeamsContributee, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("admin", (boolean)jsonTeamsContributee.b);
        if (jsonTeamsContributee.a != null) {
            LoganSquare.typeConverterFor((Class)qgv.class).serialize((Object)jsonTeamsContributee.a, "user", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTeamsContributee jsonTeamsContributee, final String s, final qhe qhe) throws IOException {
        if ("admin".equals(s)) {
            Boolean value;
            if (qhe.e() == rje.X0) {
                value = null;
            }
            else {
                value = qhe.l();
            }
            jsonTeamsContributee.b = value;
        }
        else if ("user".equals(s)) {
            jsonTeamsContributee.a = (qgv)LoganSquare.typeConverterFor((Class)qgv.class).parse(qhe);
        }
    }
    
    public JsonTeamsContributee parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTeamsContributee jsonTeamsContributee, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTeamsContributee, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTeamsContributee)o, yfe, b);
    }
}
