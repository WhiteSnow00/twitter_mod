// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.openback.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOpenbackBatteryChargingStatus$$JsonObjectMapper extends JsonMapper<JsonOpenbackBatteryChargingStatus>
{
    public static JsonOpenbackBatteryChargingStatus _parse(final qhe qhe) throws IOException {
        final JsonOpenbackBatteryChargingStatus jsonOpenbackBatteryChargingStatus = new JsonOpenbackBatteryChargingStatus();
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
            parseField(jsonOpenbackBatteryChargingStatus, d, qhe);
            qhe.m0();
        }
        return jsonOpenbackBatteryChargingStatus;
    }
    
    public static void _serialize(final JsonOpenbackBatteryChargingStatus jsonOpenbackBatteryChargingStatus, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("charging", jsonOpenbackBatteryChargingStatus.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonOpenbackBatteryChargingStatus jsonOpenbackBatteryChargingStatus, final String s, final qhe qhe) throws IOException {
        if ("charging".equals(s)) {
            jsonOpenbackBatteryChargingStatus.a = qhe.l();
        }
    }
    
    public JsonOpenbackBatteryChargingStatus parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonOpenbackBatteryChargingStatus jsonOpenbackBatteryChargingStatus, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonOpenbackBatteryChargingStatus, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonOpenbackBatteryChargingStatus)o, yfe, b);
    }
}
