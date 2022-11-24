// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.openback.json;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.util.Objects;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOpenbackRingerVolumeSignal$$JsonObjectMapper extends JsonMapper<JsonOpenbackRingerVolumeSignal>
{
    public static final k3j NUMBER_OPERATOR_TYPE_CONVERTER;
    
    static {
        NUMBER_OPERATOR_TYPE_CONVERTER = new k3j();
    }
    
    public static JsonOpenbackRingerVolumeSignal _parse(final qhe qhe) throws IOException {
        final JsonOpenbackRingerVolumeSignal jsonOpenbackRingerVolumeSignal = new JsonOpenbackRingerVolumeSignal();
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
            parseField(jsonOpenbackRingerVolumeSignal, d, qhe);
            qhe.m0();
        }
        return jsonOpenbackRingerVolumeSignal;
    }
    
    public static void _serialize(final JsonOpenbackRingerVolumeSignal jsonOpenbackRingerVolumeSignal, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        jsonOpenbackRingerVolumeSignal.t();
        ((StringBasedTypeConverter)JsonOpenbackRingerVolumeSignal$$JsonObjectMapper.NUMBER_OPERATOR_TYPE_CONVERTER).serialize((Object)jsonOpenbackRingerVolumeSignal.t(), "operator", true, yfe);
        yfe.W("volume", jsonOpenbackRingerVolumeSignal.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonOpenbackRingerVolumeSignal jsonOpenbackRingerVolumeSignal, final String s, final qhe qhe) throws IOException {
        if ("operator".equals(s)) {
            final j3j a = (j3j)((StringBasedTypeConverter)JsonOpenbackRingerVolumeSignal$$JsonObjectMapper.NUMBER_OPERATOR_TYPE_CONVERTER).parse(qhe);
            Objects.requireNonNull(jsonOpenbackRingerVolumeSignal);
            e0e.f((Object)a, "<set-?>");
            jsonOpenbackRingerVolumeSignal.a = a;
        }
        else if ("volume".equals(s)) {
            jsonOpenbackRingerVolumeSignal.b = qhe.L();
        }
    }
    
    public JsonOpenbackRingerVolumeSignal parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonOpenbackRingerVolumeSignal jsonOpenbackRingerVolumeSignal, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonOpenbackRingerVolumeSignal, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonOpenbackRingerVolumeSignal)o, yfe, b);
    }
}
