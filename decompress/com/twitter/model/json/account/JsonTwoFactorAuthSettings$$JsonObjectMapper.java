// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTwoFactorAuthSettings$$JsonObjectMapper extends JsonMapper<JsonTwoFactorAuthSettings>
{
    public static JsonTwoFactorAuthSettings _parse(final qhe qhe) throws IOException {
        final JsonTwoFactorAuthSettings jsonTwoFactorAuthSettings = new JsonTwoFactorAuthSettings();
        if (qhe.e() == null) {
            qhe.i0();
        }
        if (qhe.e() != rje.N0) {
            qhe.m0();
            return null;
        }
        while (qhe.i0() != rje.O0) {
            final String d = qhe.d();
            qhe.i0();
            parseField(jsonTwoFactorAuthSettings, d, qhe);
            qhe.m0();
        }
        return jsonTwoFactorAuthSettings;
    }
    
    public static void _serialize(final JsonTwoFactorAuthSettings jsonTwoFactorAuthSettings, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("isOldPushUser", jsonTwoFactorAuthSettings.c);
        yfe.e("twoFactorAuthEnabled", jsonTwoFactorAuthSettings.a);
        final ArrayList b2 = jsonTwoFactorAuthSettings.b;
        if (b2 != null) {
            final Iterator e = d10.E(yfe, "methods", b2);
            while (e.hasNext()) {
                final xhv xhv = e.next();
                if (xhv != null) {
                    LoganSquare.typeConverterFor((Class)xhv.class).serialize((Object)xhv, "lslocalmethodsElement", false, yfe);
                }
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTwoFactorAuthSettings jsonTwoFactorAuthSettings, final String s, final qhe qhe) throws IOException {
        if ("isOldPushUser".equals(s)) {
            jsonTwoFactorAuthSettings.c = qhe.l();
        }
        else if ("twoFactorAuthEnabled".equals(s)) {
            jsonTwoFactorAuthSettings.a = qhe.l();
        }
        else if ("methods".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList b = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final xhv xhv = (xhv)LoganSquare.typeConverterFor((Class)xhv.class).parse(qhe);
                    if (xhv != null) {
                        b.add(xhv);
                    }
                }
                jsonTwoFactorAuthSettings.b = b;
            }
            else {
                jsonTwoFactorAuthSettings.b = null;
            }
        }
    }
    
    public JsonTwoFactorAuthSettings parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTwoFactorAuthSettings jsonTwoFactorAuthSettings, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTwoFactorAuthSettings, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTwoFactorAuthSettings)o, yfe, b);
    }
}
