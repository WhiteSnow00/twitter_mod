// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUnhydratedEventsSummaryCoverMedia$JsonEventSummaryMediaEntity$$JsonObjectMapper extends JsonMapper<JsonUnhydratedEventsSummaryCoverMedia.JsonEventSummaryMediaEntity>
{
    public static JsonUnhydratedEventsSummaryCoverMedia.JsonEventSummaryMediaEntity _parse(final khe khe) throws IOException {
        final JsonUnhydratedEventsSummaryCoverMedia.JsonEventSummaryMediaEntity jsonEventSummaryMediaEntity = new JsonUnhydratedEventsSummaryCoverMedia.JsonEventSummaryMediaEntity();
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
            parseField(jsonEventSummaryMediaEntity, d, khe);
            khe.m0();
        }
        return jsonEventSummaryMediaEntity;
    }
    
    public static void _serialize(final JsonUnhydratedEventsSummaryCoverMedia.JsonEventSummaryMediaEntity jsonEventSummaryMediaEntity, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonEventSummaryMediaEntity.a != null) {
            LoganSquare.typeConverterFor((Class)xi2.class).serialize((Object)jsonEventSummaryMediaEntity.a, "broadcastId", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonUnhydratedEventsSummaryCoverMedia.JsonEventSummaryMediaEntity jsonEventSummaryMediaEntity, final String s, final khe khe) throws IOException {
        if ("broadcastId".equals(s)) {
            jsonEventSummaryMediaEntity.a = (xi2)LoganSquare.typeConverterFor((Class)xi2.class).parse(khe);
        }
    }
    
    public JsonUnhydratedEventsSummaryCoverMedia.JsonEventSummaryMediaEntity parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonUnhydratedEventsSummaryCoverMedia.JsonEventSummaryMediaEntity jsonEventSummaryMediaEntity, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonEventSummaryMediaEntity, tfe, b);
    }
}
