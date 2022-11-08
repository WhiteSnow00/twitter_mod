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
    public static JsonInAppNotificationSubtask _parse(final khe khe) throws IOException {
        final JsonInAppNotificationSubtask jsonInAppNotificationSubtask = new JsonInAppNotificationSubtask();
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
            parseField(jsonInAppNotificationSubtask, d, khe);
            khe.m0();
        }
        return jsonInAppNotificationSubtask;
    }
    
    public static void _serialize(final JsonInAppNotificationSubtask jsonInAppNotificationSubtask, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonInAppNotificationSubtask.a != null) {
            tfe.i("message");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonInAppNotificationSubtask.a, tfe, true);
        }
        if (jsonInAppNotificationSubtask.c != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonInAppNotificationSubtask.c, "next_link", true, tfe);
        }
        tfe.T("wait_time_ms", jsonInAppNotificationSubtask.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonInAppNotificationSubtask jsonInAppNotificationSubtask, final String s, final khe khe) throws IOException {
        if ("message".equals(s)) {
            jsonInAppNotificationSubtask.a = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("next_link".equals(s)) {
            jsonInAppNotificationSubtask.c = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("wait_time_ms".equals(s)) {
            jsonInAppNotificationSubtask.b = khe.z();
        }
    }
    
    public JsonInAppNotificationSubtask parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonInAppNotificationSubtask jsonInAppNotificationSubtask, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonInAppNotificationSubtask, tfe, b);
    }
}
