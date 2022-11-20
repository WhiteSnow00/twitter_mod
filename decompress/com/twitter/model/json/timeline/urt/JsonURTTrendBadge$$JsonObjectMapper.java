// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonURTTrendBadge$$JsonObjectMapper extends JsonMapper<JsonURTTrendBadge>
{
    public static JsonURTTrendBadge _parse(final tge tge) throws IOException {
        final JsonURTTrendBadge jsonURTTrendBadge = new JsonURTTrendBadge();
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
            parseField(jsonURTTrendBadge, d, tge);
            tge.l0();
        }
        return jsonURTTrendBadge;
    }
    
    public static void _serialize(final JsonURTTrendBadge jsonURTTrendBadge, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonURTTrendBadge.b != null) {
            LoganSquare.typeConverterFor((Class)pge.class).serialize((Object)jsonURTTrendBadge.b, "badgeColor", true, afe);
        }
        afe.t0("badgeText", jsonURTTrendBadge.a);
        if (jsonURTTrendBadge.d != null) {
            LoganSquare.typeConverterFor((Class)c2u.class).serialize((Object)jsonURTTrendBadge.d, "badgeType", true, afe);
        }
        if (jsonURTTrendBadge.c != null) {
            LoganSquare.typeConverterFor((Class)pge.class).serialize((Object)jsonURTTrendBadge.c, "textColor", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonURTTrendBadge jsonURTTrendBadge, final String s, final tge tge) throws IOException {
        if ("badgeColor".equals(s)) {
            jsonURTTrendBadge.b = (pge)LoganSquare.typeConverterFor((Class)pge.class).parse(tge);
        }
        else if ("badgeText".equals(s)) {
            jsonURTTrendBadge.a = tge.T((String)null);
        }
        else if ("badgeType".equals(s)) {
            jsonURTTrendBadge.d = (c2u)LoganSquare.typeConverterFor((Class)c2u.class).parse(tge);
        }
        else if ("textColor".equals(s)) {
            jsonURTTrendBadge.c = (pge)LoganSquare.typeConverterFor((Class)pge.class).parse(tge);
        }
    }
    
    public JsonURTTrendBadge parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonURTTrendBadge jsonURTTrendBadge, final afe afe, final boolean b) throws IOException {
        _serialize(jsonURTTrendBadge, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonURTTrendBadge)o, afe, b);
    }
}
