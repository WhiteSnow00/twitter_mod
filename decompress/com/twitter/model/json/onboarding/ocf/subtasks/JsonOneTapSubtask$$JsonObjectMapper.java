// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOneTapSubtask$$JsonObjectMapper extends JsonMapper<JsonOneTapSubtask>
{
    public static JsonOneTapSubtask _parse(final tge tge) throws IOException {
        final JsonOneTapSubtask jsonOneTapSubtask = new JsonOneTapSubtask();
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
            parseField(jsonOneTapSubtask, d, tge);
            tge.l0();
        }
        return jsonOneTapSubtask;
    }
    
    public static void _serialize(final JsonOneTapSubtask jsonOneTapSubtask, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.e("auto_login_enabled", jsonOneTapSubtask.e);
        afe.t0("dismiss_callback", jsonOneTapSubtask.d);
        afe.e("filter_by_authorized_accounts", jsonOneTapSubtask.g);
        if (jsonOneTapSubtask.a != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonOneTapSubtask.a, "next_link", true, afe);
        }
        afe.e("saved_passwords_enabled", jsonOneTapSubtask.f);
        afe.t0("state", jsonOneTapSubtask.c);
        if (jsonOneTapSubtask.b != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonOneTapSubtask.b, "success_link", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonOneTapSubtask jsonOneTapSubtask, final String s, final tge tge) throws IOException {
        if ("auto_login_enabled".equals(s)) {
            jsonOneTapSubtask.e = tge.k();
        }
        else if ("dismiss_callback".equals(s)) {
            jsonOneTapSubtask.d = tge.T((String)null);
        }
        else if ("filter_by_authorized_accounts".equals(s)) {
            jsonOneTapSubtask.g = tge.k();
        }
        else if ("next_link".equals(s)) {
            jsonOneTapSubtask.a = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("saved_passwords_enabled".equals(s)) {
            jsonOneTapSubtask.f = tge.k();
        }
        else if ("state".equals(s)) {
            jsonOneTapSubtask.c = tge.T((String)null);
        }
        else if ("success_link".equals(s)) {
            jsonOneTapSubtask.b = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
    }
    
    public JsonOneTapSubtask parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonOneTapSubtask jsonOneTapSubtask, final afe afe, final boolean b) throws IOException {
        _serialize(jsonOneTapSubtask, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonOneTapSubtask)o, afe, b);
    }
}
