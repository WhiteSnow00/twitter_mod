// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.newsletters;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonRevueNewsletterInfo$$JsonObjectMapper extends JsonMapper<JsonRevueNewsletterInfo>
{
    public static JsonRevueNewsletterInfo _parse(final tge tge) throws IOException {
        final JsonRevueNewsletterInfo jsonRevueNewsletterInfo = new JsonRevueNewsletterInfo();
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
            parseField(jsonRevueNewsletterInfo, d, tge);
            tge.l0();
        }
        return jsonRevueNewsletterInfo;
    }
    
    public static void _serialize(final JsonRevueNewsletterInfo jsonRevueNewsletterInfo, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("author", jsonRevueNewsletterInfo.c);
        afe.t0("description", jsonRevueNewsletterInfo.b);
        afe.t0("title", jsonRevueNewsletterInfo.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonRevueNewsletterInfo jsonRevueNewsletterInfo, final String s, final tge tge) throws IOException {
        if ("author".equals(s)) {
            jsonRevueNewsletterInfo.c = tge.T((String)null);
        }
        else if ("description".equals(s)) {
            jsonRevueNewsletterInfo.b = tge.T((String)null);
        }
        else if ("title".equals(s)) {
            jsonRevueNewsletterInfo.a = tge.T((String)null);
        }
    }
    
    public JsonRevueNewsletterInfo parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonRevueNewsletterInfo jsonRevueNewsletterInfo, final afe afe, final boolean b) throws IOException {
        _serialize(jsonRevueNewsletterInfo, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonRevueNewsletterInfo)o, afe, b);
    }
}
