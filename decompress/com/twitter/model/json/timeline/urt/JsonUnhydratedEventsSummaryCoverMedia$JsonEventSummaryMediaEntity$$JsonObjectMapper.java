// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUnhydratedEventsSummaryCoverMedia$JsonEventSummaryMediaEntity$$JsonObjectMapper extends JsonMapper<JsonUnhydratedEventsSummaryCoverMedia.JsonEventSummaryMediaEntity>
{
    public static JsonUnhydratedEventsSummaryCoverMedia.JsonEventSummaryMediaEntity _parse(final tge tge) throws IOException {
        final JsonUnhydratedEventsSummaryCoverMedia.JsonEventSummaryMediaEntity jsonEventSummaryMediaEntity = new JsonUnhydratedEventsSummaryCoverMedia.JsonEventSummaryMediaEntity();
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
            parseField(jsonEventSummaryMediaEntity, d, tge);
            tge.l0();
        }
        return jsonEventSummaryMediaEntity;
    }
    
    public static void _serialize(final JsonUnhydratedEventsSummaryCoverMedia.JsonEventSummaryMediaEntity jsonEventSummaryMediaEntity, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonEventSummaryMediaEntity.a != null) {
            LoganSquare.typeConverterFor((Class)qi2.class).serialize((Object)jsonEventSummaryMediaEntity.a, "broadcastId", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonUnhydratedEventsSummaryCoverMedia.JsonEventSummaryMediaEntity jsonEventSummaryMediaEntity, final String s, final tge tge) throws IOException {
        if ("broadcastId".equals(s)) {
            jsonEventSummaryMediaEntity.a = (qi2)LoganSquare.typeConverterFor((Class)qi2.class).parse(tge);
        }
    }
    
    public JsonUnhydratedEventsSummaryCoverMedia.JsonEventSummaryMediaEntity parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonUnhydratedEventsSummaryCoverMedia.JsonEventSummaryMediaEntity jsonEventSummaryMediaEntity, final afe afe, final boolean b) throws IOException {
        _serialize(jsonEventSummaryMediaEntity, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonUnhydratedEventsSummaryCoverMedia.JsonEventSummaryMediaEntity)o, afe, b);
    }
}
