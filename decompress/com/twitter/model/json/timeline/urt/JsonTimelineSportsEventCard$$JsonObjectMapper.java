// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineSportsEventCard$$JsonObjectMapper extends JsonMapper<JsonTimelineSportsEventCard>
{
    public static JsonTimelineSportsEventCard _parse(final khe khe) throws IOException {
        final JsonTimelineSportsEventCard jsonTimelineSportsEventCard = new JsonTimelineSportsEventCard();
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
            parseField(jsonTimelineSportsEventCard, d, khe);
            khe.m0();
        }
        return jsonTimelineSportsEventCard;
    }
    
    public static void _serialize(final JsonTimelineSportsEventCard jsonTimelineSportsEventCard, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonTimelineSportsEventCard.a != null) {
            LoganSquare.typeConverterFor((Class)dqv.class).serialize((Object)jsonTimelineSportsEventCard.a, "sportsEvent", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTimelineSportsEventCard jsonTimelineSportsEventCard, final String s, final khe khe) throws IOException {
        if ("sportsEvent".equals(s)) {
            jsonTimelineSportsEventCard.a = (dqv)LoganSquare.typeConverterFor((Class)dqv.class).parse(khe);
        }
    }
    
    public JsonTimelineSportsEventCard parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTimelineSportsEventCard jsonTimelineSportsEventCard, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonTimelineSportsEventCard, tfe, b);
    }
}
