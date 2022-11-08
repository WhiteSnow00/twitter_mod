// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonURTTrendBadge$$JsonObjectMapper extends JsonMapper<JsonURTTrendBadge>
{
    public static JsonURTTrendBadge _parse(final khe khe) throws IOException {
        final JsonURTTrendBadge jsonURTTrendBadge = new JsonURTTrendBadge();
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
            parseField(jsonURTTrendBadge, d, khe);
            khe.m0();
        }
        return jsonURTTrendBadge;
    }
    
    public static void _serialize(final JsonURTTrendBadge jsonURTTrendBadge, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonURTTrendBadge.b != null) {
            LoganSquare.typeConverterFor((Class)ghe.class).serialize((Object)jsonURTTrendBadge.b, "badgeColor", true, tfe);
        }
        tfe.u0("badgeText", jsonURTTrendBadge.a);
        if (jsonURTTrendBadge.d != null) {
            LoganSquare.typeConverterFor((Class)n1u.class).serialize((Object)jsonURTTrendBadge.d, "badgeType", true, tfe);
        }
        if (jsonURTTrendBadge.c != null) {
            LoganSquare.typeConverterFor((Class)ghe.class).serialize((Object)jsonURTTrendBadge.c, "textColor", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonURTTrendBadge jsonURTTrendBadge, final String s, final khe khe) throws IOException {
        if ("badgeColor".equals(s)) {
            jsonURTTrendBadge.b = (ghe)LoganSquare.typeConverterFor((Class)ghe.class).parse(khe);
        }
        else if ("badgeText".equals(s)) {
            jsonURTTrendBadge.a = khe.T((String)null);
        }
        else if ("badgeType".equals(s)) {
            jsonURTTrendBadge.d = (n1u)LoganSquare.typeConverterFor((Class)n1u.class).parse(khe);
        }
        else if ("textColor".equals(s)) {
            jsonURTTrendBadge.c = (ghe)LoganSquare.typeConverterFor((Class)ghe.class).parse(khe);
        }
    }
    
    public JsonURTTrendBadge parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonURTTrendBadge jsonURTTrendBadge, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonURTTrendBadge, tfe, b);
    }
}
