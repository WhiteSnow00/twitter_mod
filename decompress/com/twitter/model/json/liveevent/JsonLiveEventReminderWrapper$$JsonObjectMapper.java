// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLiveEventReminderWrapper$$JsonObjectMapper extends JsonMapper<JsonLiveEventReminderWrapper>
{
    public static JsonLiveEventReminderWrapper _parse(final khe khe) throws IOException {
        final JsonLiveEventReminderWrapper jsonLiveEventReminderWrapper = new JsonLiveEventReminderWrapper();
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
            parseField(jsonLiveEventReminderWrapper, d, khe);
            khe.m0();
        }
        return jsonLiveEventReminderWrapper;
    }
    
    public static void _serialize(final JsonLiveEventReminderWrapper jsonLiveEventReminderWrapper, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonLiveEventReminderWrapper.a != null) {
            LoganSquare.typeConverterFor((Class)jxf.class).serialize((Object)jsonLiveEventReminderWrapper.a, "remind_me_subscription", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonLiveEventReminderWrapper jsonLiveEventReminderWrapper, final String s, final khe khe) throws IOException {
        if ("remind_me_subscription".equals(s)) {
            jsonLiveEventReminderWrapper.a = (jxf)LoganSquare.typeConverterFor((Class)jxf.class).parse(khe);
        }
    }
    
    public JsonLiveEventReminderWrapper parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonLiveEventReminderWrapper jsonLiveEventReminderWrapper, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonLiveEventReminderWrapper, tfe, b);
    }
}
