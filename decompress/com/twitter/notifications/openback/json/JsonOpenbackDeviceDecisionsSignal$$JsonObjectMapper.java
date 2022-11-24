// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.openback.json;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.util.Objects;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOpenbackDeviceDecisionsSignal$$JsonObjectMapper extends JsonMapper<JsonOpenbackDeviceDecisionsSignal>
{
    public static final lu8 DEVICE_DECISION_SIGNAL_TYPE_CONVERTER;
    
    static {
        DEVICE_DECISION_SIGNAL_TYPE_CONVERTER = new lu8();
    }
    
    public static JsonOpenbackDeviceDecisionsSignal _parse(final qhe qhe) throws IOException {
        final JsonOpenbackDeviceDecisionsSignal jsonOpenbackDeviceDecisionsSignal = new JsonOpenbackDeviceDecisionsSignal();
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
            parseField(jsonOpenbackDeviceDecisionsSignal, d, qhe);
            qhe.m0();
        }
        return jsonOpenbackDeviceDecisionsSignal;
    }
    
    public static void _serialize(final JsonOpenbackDeviceDecisionsSignal jsonOpenbackDeviceDecisionsSignal, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        jsonOpenbackDeviceDecisionsSignal.t();
        ((StringBasedTypeConverter)JsonOpenbackDeviceDecisionsSignal$$JsonObjectMapper.DEVICE_DECISION_SIGNAL_TYPE_CONVERTER).serialize((Object)jsonOpenbackDeviceDecisionsSignal.t(), "model", true, yfe);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonOpenbackDeviceDecisionsSignal jsonOpenbackDeviceDecisionsSignal, final String s, final qhe qhe) throws IOException {
        if ("model".equals(s)) {
            final ku8 a = (ku8)((StringBasedTypeConverter)JsonOpenbackDeviceDecisionsSignal$$JsonObjectMapper.DEVICE_DECISION_SIGNAL_TYPE_CONVERTER).parse(qhe);
            Objects.requireNonNull(jsonOpenbackDeviceDecisionsSignal);
            e0e.f((Object)a, "<set-?>");
            jsonOpenbackDeviceDecisionsSignal.a = a;
        }
    }
    
    public JsonOpenbackDeviceDecisionsSignal parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonOpenbackDeviceDecisionsSignal jsonOpenbackDeviceDecisionsSignal, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonOpenbackDeviceDecisionsSignal, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonOpenbackDeviceDecisionsSignal)o, yfe, b);
    }
}
