// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotificationSettingsApiResult$ResultInfo$$JsonObjectMapper extends JsonMapper<JsonNotificationSettingsApiResult.ResultInfo>
{
    public static JsonNotificationSettingsApiResult.ResultInfo _parse(final qhe qhe) throws IOException {
        final JsonNotificationSettingsApiResult.ResultInfo resultInfo = new JsonNotificationSettingsApiResult.ResultInfo();
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
            parseField(resultInfo, d, qhe);
            qhe.m0();
        }
        return resultInfo;
    }
    
    public static void _serialize(final JsonNotificationSettingsApiResult.ResultInfo resultInfo, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("checksum", resultInfo.a);
        yfe.T("sleep_hour_begin", (int)resultInfo.c);
        yfe.T("sleep_hour_end", (int)resultInfo.d);
        yfe.e("sleep_setting_enabled", (boolean)resultInfo.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotificationSettingsApiResult.ResultInfo resultInfo, final String s, final qhe qhe) throws IOException {
        final boolean equals = "checksum".equals(s);
        final Integer n = null;
        final Boolean b = null;
        final Integer n2 = null;
        if (equals) {
            resultInfo.a = qhe.T((String)null);
        }
        else if ("sleep_hour_begin".equals(s)) {
            Integer value;
            if (qhe.e() == rje.X0) {
                value = n2;
            }
            else {
                value = qhe.z();
            }
            resultInfo.c = value;
        }
        else if ("sleep_hour_end".equals(s)) {
            Integer value2;
            if (qhe.e() == rje.X0) {
                value2 = n;
            }
            else {
                value2 = qhe.z();
            }
            resultInfo.d = value2;
        }
        else if ("sleep_setting_enabled".equals(s)) {
            Boolean value3;
            if (qhe.e() == rje.X0) {
                value3 = b;
            }
            else {
                value3 = qhe.l();
            }
            resultInfo.b = value3;
        }
    }
    
    public JsonNotificationSettingsApiResult.ResultInfo parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNotificationSettingsApiResult.ResultInfo resultInfo, final yfe yfe, final boolean b) throws IOException {
        _serialize(resultInfo, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNotificationSettingsApiResult.ResultInfo)o, yfe, b);
    }
}
