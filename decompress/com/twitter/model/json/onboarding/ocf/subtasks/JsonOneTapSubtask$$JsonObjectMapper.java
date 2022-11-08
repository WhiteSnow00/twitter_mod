// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOneTapSubtask$$JsonObjectMapper extends JsonMapper<JsonOneTapSubtask>
{
    public static JsonOneTapSubtask _parse(final khe khe) throws IOException {
        final JsonOneTapSubtask jsonOneTapSubtask = new JsonOneTapSubtask();
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
            parseField(jsonOneTapSubtask, d, khe);
            khe.m0();
        }
        return jsonOneTapSubtask;
    }
    
    public static void _serialize(final JsonOneTapSubtask jsonOneTapSubtask, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.e("auto_login_enabled", jsonOneTapSubtask.e);
        tfe.u0("dismiss_callback", jsonOneTapSubtask.d);
        tfe.e("filter_by_authorized_accounts", jsonOneTapSubtask.g);
        if (jsonOneTapSubtask.a != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonOneTapSubtask.a, "next_link", true, tfe);
        }
        tfe.e("saved_passwords_enabled", jsonOneTapSubtask.f);
        tfe.u0("state", jsonOneTapSubtask.c);
        if (jsonOneTapSubtask.b != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonOneTapSubtask.b, "success_link", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonOneTapSubtask jsonOneTapSubtask, final String s, final khe khe) throws IOException {
        if ("auto_login_enabled".equals(s)) {
            jsonOneTapSubtask.e = khe.k();
        }
        else if ("dismiss_callback".equals(s)) {
            jsonOneTapSubtask.d = khe.T((String)null);
        }
        else if ("filter_by_authorized_accounts".equals(s)) {
            jsonOneTapSubtask.g = khe.k();
        }
        else if ("next_link".equals(s)) {
            jsonOneTapSubtask.a = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("saved_passwords_enabled".equals(s)) {
            jsonOneTapSubtask.f = khe.k();
        }
        else if ("state".equals(s)) {
            jsonOneTapSubtask.c = khe.T((String)null);
        }
        else if ("success_link".equals(s)) {
            jsonOneTapSubtask.b = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
    }
    
    public JsonOneTapSubtask parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonOneTapSubtask jsonOneTapSubtask, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonOneTapSubtask, tfe, b);
    }
}
