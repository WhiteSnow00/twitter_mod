// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLiveEventReminderSubscription$$JsonObjectMapper extends JsonMapper<JsonLiveEventReminderSubscription>
{
    public static JsonLiveEventReminderSubscription _parse(final tge tge) throws IOException {
        final JsonLiveEventReminderSubscription jsonLiveEventReminderSubscription = new JsonLiveEventReminderSubscription();
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
            parseField(jsonLiveEventReminderSubscription, d, tge);
            tge.l0();
        }
        return jsonLiveEventReminderSubscription;
    }
    
    public static void _serialize(final JsonLiveEventReminderSubscription jsonLiveEventReminderSubscription, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("notification_id", jsonLiveEventReminderSubscription.c);
        afe.e("subscribed", (boolean)jsonLiveEventReminderSubscription.b);
        afe.e("toggle_visible", (boolean)jsonLiveEventReminderSubscription.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonLiveEventReminderSubscription jsonLiveEventReminderSubscription, final String s, final tge tge) throws IOException {
        final boolean equals = "notification_id".equals(s);
        final Boolean b = null;
        final Boolean b2 = null;
        if (equals) {
            jsonLiveEventReminderSubscription.c = tge.T((String)null);
        }
        else if ("subscribed".equals(s)) {
            Boolean value;
            if (tge.e() == vie.V0) {
                value = b2;
            }
            else {
                value = tge.k();
            }
            jsonLiveEventReminderSubscription.b = value;
        }
        else if ("toggle_visible".equals(s)) {
            Boolean value2;
            if (tge.e() == vie.V0) {
                value2 = b;
            }
            else {
                value2 = tge.k();
            }
            jsonLiveEventReminderSubscription.a = value2;
        }
    }
    
    public JsonLiveEventReminderSubscription parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonLiveEventReminderSubscription jsonLiveEventReminderSubscription, final afe afe, final boolean b) throws IOException {
        _serialize(jsonLiveEventReminderSubscription, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonLiveEventReminderSubscription)o, afe, b);
    }
}
