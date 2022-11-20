// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineSportsEventCard$$JsonObjectMapper extends JsonMapper<JsonTimelineSportsEventCard>
{
    public static JsonTimelineSportsEventCard _parse(final tge tge) throws IOException {
        final JsonTimelineSportsEventCard jsonTimelineSportsEventCard = new JsonTimelineSportsEventCard();
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
            parseField(jsonTimelineSportsEventCard, d, tge);
            tge.l0();
        }
        return jsonTimelineSportsEventCard;
    }
    
    public static void _serialize(final JsonTimelineSportsEventCard jsonTimelineSportsEventCard, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonTimelineSportsEventCard.a != null) {
            LoganSquare.typeConverterFor((Class)zqv.class).serialize((Object)jsonTimelineSportsEventCard.a, "sportsEvent", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTimelineSportsEventCard jsonTimelineSportsEventCard, final String s, final tge tge) throws IOException {
        if ("sportsEvent".equals(s)) {
            jsonTimelineSportsEventCard.a = (zqv)LoganSquare.typeConverterFor((Class)zqv.class).parse(tge);
        }
    }
    
    public JsonTimelineSportsEventCard parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTimelineSportsEventCard jsonTimelineSportsEventCard, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTimelineSportsEventCard, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTimelineSportsEventCard)o, afe, b);
    }
}
