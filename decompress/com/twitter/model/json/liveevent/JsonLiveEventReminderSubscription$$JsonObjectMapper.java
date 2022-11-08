// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLiveEventReminderSubscription$$JsonObjectMapper extends JsonMapper<JsonLiveEventReminderSubscription>
{
    public static JsonLiveEventReminderSubscription _parse(final khe khe) throws IOException {
        final JsonLiveEventReminderSubscription jsonLiveEventReminderSubscription = new JsonLiveEventReminderSubscription();
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
            parseField(jsonLiveEventReminderSubscription, d, khe);
            khe.m0();
        }
        return jsonLiveEventReminderSubscription;
    }
    
    public static void _serialize(final JsonLiveEventReminderSubscription jsonLiveEventReminderSubscription, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("notification_id", jsonLiveEventReminderSubscription.c);
        tfe.e("subscribed", jsonLiveEventReminderSubscription.b);
        tfe.e("toggle_visible", jsonLiveEventReminderSubscription.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonLiveEventReminderSubscription jsonLiveEventReminderSubscription, final String s, final khe khe) throws IOException {
        final boolean equals = "notification_id".equals(s);
        final Boolean b = null;
        final Boolean b2 = null;
        if (equals) {
            jsonLiveEventReminderSubscription.c = khe.T((String)null);
        }
        else if ("subscribed".equals(s)) {
            Boolean value;
            if (khe.e() == lje.U0) {
                value = b2;
            }
            else {
                value = khe.k();
            }
            jsonLiveEventReminderSubscription.b = value;
        }
        else if ("toggle_visible".equals(s)) {
            Boolean value2;
            if (khe.e() == lje.U0) {
                value2 = b;
            }
            else {
                value2 = khe.k();
            }
            jsonLiveEventReminderSubscription.a = value2;
        }
    }
    
    public JsonLiveEventReminderSubscription parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonLiveEventReminderSubscription jsonLiveEventReminderSubscription, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonLiveEventReminderSubscription, tfe, b);
    }
}
