// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.openback.json;

import java.util.Objects;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOpenbackMessage$$JsonObjectMapper extends JsonMapper<JsonOpenbackMessage>
{
    public static JsonOpenbackMessage _parse(final qhe qhe) throws IOException {
        final JsonOpenbackMessage jsonOpenbackMessage = new JsonOpenbackMessage();
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
            parseField(jsonOpenbackMessage, d, qhe);
            qhe.m0();
        }
        return jsonOpenbackMessage;
    }
    
    public static void _serialize(final JsonOpenbackMessage jsonOpenbackMessage, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonOpenbackMessage.b != null) {
            LoganSquare.typeConverterFor((Class)pnj.class).serialize((Object)jsonOpenbackMessage.b, "dates", true, yfe);
        }
        yfe.W("delayAfterTrigger", (long)jsonOpenbackMessage.c);
        jsonOpenbackMessage.t();
        LoganSquare.typeConverterFor((Class)rnj.class).serialize((Object)jsonOpenbackMessage.t(), "expiration", true, yfe);
        jsonOpenbackMessage.u();
        LoganSquare.typeConverterFor((Class)tnj.class).serialize((Object)jsonOpenbackMessage.u(), "limits", true, yfe);
        final String a = jsonOpenbackMessage.a;
        if (a != null) {
            yfe.u0("messageId", a);
            jsonOpenbackMessage.v();
            LoganSquare.typeConverterFor((Class)ynj.class).serialize((Object)jsonOpenbackMessage.v(), "signals", true, yfe);
            if (b) {
                yfe.h();
            }
            return;
        }
        e0e.m("messageId");
        throw null;
    }
    
    public static void parseField(final JsonOpenbackMessage jsonOpenbackMessage, String t, final qhe qhe) throws IOException {
        if ("dates".equals(t)) {
            jsonOpenbackMessage.b = (pnj)LoganSquare.typeConverterFor((Class)pnj.class).parse(qhe);
        }
        else {
            final boolean equals = "delayAfterTrigger".equals(t);
            final Long n = null;
            if (equals) {
                Long value;
                if (qhe.e() == rje.X0) {
                    value = n;
                }
                else {
                    value = qhe.L();
                }
                jsonOpenbackMessage.c = value;
            }
            else if ("expiration".equals(t)) {
                final rnj e = (rnj)LoganSquare.typeConverterFor((Class)rnj.class).parse(qhe);
                Objects.requireNonNull(jsonOpenbackMessage);
                e0e.f((Object)e, "<set-?>");
                jsonOpenbackMessage.e = e;
            }
            else if ("limits".equals(t)) {
                final tnj f = (tnj)LoganSquare.typeConverterFor((Class)tnj.class).parse(qhe);
                Objects.requireNonNull(jsonOpenbackMessage);
                e0e.f((Object)f, "<set-?>");
                jsonOpenbackMessage.f = f;
            }
            else if ("messageId".equals(t)) {
                t = qhe.T((String)null);
                Objects.requireNonNull(jsonOpenbackMessage);
                e0e.f((Object)t, "<set-?>");
                jsonOpenbackMessage.a = t;
            }
            else if ("signals".equals(t)) {
                final ynj d = (ynj)LoganSquare.typeConverterFor((Class)ynj.class).parse(qhe);
                Objects.requireNonNull(jsonOpenbackMessage);
                e0e.f((Object)d, "<set-?>");
                jsonOpenbackMessage.d = d;
            }
        }
    }
    
    public JsonOpenbackMessage parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonOpenbackMessage jsonOpenbackMessage, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonOpenbackMessage, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonOpenbackMessage)o, yfe, b);
    }
}
