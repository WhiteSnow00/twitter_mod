// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.openback.json;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOpenbackSignals$$JsonObjectMapper extends JsonMapper<JsonOpenbackSignals>
{
    public static JsonOpenbackSignals _parse(final qhe qhe) throws IOException {
        final JsonOpenbackSignals jsonOpenbackSignals = new JsonOpenbackSignals();
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
            parseField(jsonOpenbackSignals, d, qhe);
            qhe.m0();
        }
        return jsonOpenbackSignals;
    }
    
    public static void _serialize(final JsonOpenbackSignals jsonOpenbackSignals, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonOpenbackSignals.d != null) {
            LoganSquare.typeConverterFor((Class)onj.class).serialize((Object)jsonOpenbackSignals.d, "batteryChargingStatus", true, yfe);
        }
        if (jsonOpenbackSignals.b != null) {
            LoganSquare.typeConverterFor((Class)qnj.class).serialize((Object)jsonOpenbackSignals.b, "deviceDecisions", true, yfe);
        }
        if (jsonOpenbackSignals.c != null) {
            LoganSquare.typeConverterFor((Class)snj.class).serialize((Object)jsonOpenbackSignals.c, "headphones", true, yfe);
        }
        if (jsonOpenbackSignals.e != null) {
            LoganSquare.typeConverterFor((Class)xnj.class).serialize((Object)jsonOpenbackSignals.e, "ringerVolume", true, yfe);
        }
        if (jsonOpenbackSignals.a != null) {
            LoganSquare.typeConverterFor((Class)znj.class).serialize((Object)jsonOpenbackSignals.a, "unlock", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonOpenbackSignals jsonOpenbackSignals, final String s, final qhe qhe) throws IOException {
        if ("batteryChargingStatus".equals(s)) {
            jsonOpenbackSignals.d = (onj)LoganSquare.typeConverterFor((Class)onj.class).parse(qhe);
        }
        else if ("deviceDecisions".equals(s)) {
            jsonOpenbackSignals.b = (qnj)LoganSquare.typeConverterFor((Class)qnj.class).parse(qhe);
        }
        else if ("headphones".equals(s)) {
            jsonOpenbackSignals.c = (snj)LoganSquare.typeConverterFor((Class)snj.class).parse(qhe);
        }
        else if ("ringerVolume".equals(s)) {
            jsonOpenbackSignals.e = (xnj)LoganSquare.typeConverterFor((Class)xnj.class).parse(qhe);
        }
        else if ("unlock".equals(s)) {
            jsonOpenbackSignals.a = (znj)LoganSquare.typeConverterFor((Class)znj.class).parse(qhe);
        }
    }
    
    public JsonOpenbackSignals parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonOpenbackSignals jsonOpenbackSignals, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonOpenbackSignals, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonOpenbackSignals)o, yfe, b);
    }
}
