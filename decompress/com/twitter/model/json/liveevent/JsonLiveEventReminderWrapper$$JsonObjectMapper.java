// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLiveEventReminderWrapper$$JsonObjectMapper extends JsonMapper<JsonLiveEventReminderWrapper>
{
    public static JsonLiveEventReminderWrapper _parse(final tge tge) throws IOException {
        final JsonLiveEventReminderWrapper jsonLiveEventReminderWrapper = new JsonLiveEventReminderWrapper();
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
            parseField(jsonLiveEventReminderWrapper, d, tge);
            tge.l0();
        }
        return jsonLiveEventReminderWrapper;
    }
    
    public static void _serialize(final JsonLiveEventReminderWrapper jsonLiveEventReminderWrapper, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonLiveEventReminderWrapper.a != null) {
            LoganSquare.typeConverterFor((Class)vwf.class).serialize((Object)jsonLiveEventReminderWrapper.a, "remind_me_subscription", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonLiveEventReminderWrapper jsonLiveEventReminderWrapper, final String s, final tge tge) throws IOException {
        if ("remind_me_subscription".equals(s)) {
            jsonLiveEventReminderWrapper.a = (vwf)LoganSquare.typeConverterFor((Class)vwf.class).parse(tge);
        }
    }
    
    public JsonLiveEventReminderWrapper parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonLiveEventReminderWrapper jsonLiveEventReminderWrapper, final afe afe, final boolean b) throws IOException {
        _serialize(jsonLiveEventReminderWrapper, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonLiveEventReminderWrapper)o, afe, b);
    }
}
