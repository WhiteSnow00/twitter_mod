// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonInAppNotificationSubtask$$JsonObjectMapper extends JsonMapper<JsonInAppNotificationSubtask>
{
    public static JsonInAppNotificationSubtask _parse(final tge tge) throws IOException {
        final JsonInAppNotificationSubtask jsonInAppNotificationSubtask = new JsonInAppNotificationSubtask();
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
            parseField(jsonInAppNotificationSubtask, d, tge);
            tge.l0();
        }
        return jsonInAppNotificationSubtask;
    }
    
    public static void _serialize(final JsonInAppNotificationSubtask jsonInAppNotificationSubtask, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonInAppNotificationSubtask.a != null) {
            afe.i("message");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonInAppNotificationSubtask.a, afe, true);
        }
        if (jsonInAppNotificationSubtask.c != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonInAppNotificationSubtask.c, "next_link", true, afe);
        }
        afe.T("wait_time_ms", jsonInAppNotificationSubtask.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonInAppNotificationSubtask jsonInAppNotificationSubtask, final String s, final tge tge) throws IOException {
        if ("message".equals(s)) {
            jsonInAppNotificationSubtask.a = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("next_link".equals(s)) {
            jsonInAppNotificationSubtask.c = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("wait_time_ms".equals(s)) {
            jsonInAppNotificationSubtask.b = tge.y();
        }
    }
    
    public JsonInAppNotificationSubtask parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonInAppNotificationSubtask jsonInAppNotificationSubtask, final afe afe, final boolean b) throws IOException {
        _serialize(jsonInAppNotificationSubtask, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonInAppNotificationSubtask)o, afe, b);
    }
}
