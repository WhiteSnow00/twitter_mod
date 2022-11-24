// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTeamsContributor$$JsonObjectMapper extends JsonMapper<JsonTeamsContributor>
{
    public static JsonTeamsContributor _parse(final qhe qhe) throws IOException {
        final JsonTeamsContributor jsonTeamsContributor = new JsonTeamsContributor();
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
            parseField(jsonTeamsContributor, d, qhe);
            qhe.m0();
        }
        return jsonTeamsContributor;
    }
    
    public static void _serialize(final JsonTeamsContributor jsonTeamsContributor, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("is_teams_admin", jsonTeamsContributor.b);
        yfe.W("user_id", jsonTeamsContributor.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTeamsContributor jsonTeamsContributor, final String s, final qhe qhe) throws IOException {
        if ("is_teams_admin".equals(s)) {
            jsonTeamsContributor.b = qhe.l();
        }
        else if ("user_id".equals(s)) {
            jsonTeamsContributor.a = qhe.L();
        }
    }
    
    public JsonTeamsContributor parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTeamsContributor jsonTeamsContributor, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTeamsContributor, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTeamsContributor)o, yfe, b);
    }
}
