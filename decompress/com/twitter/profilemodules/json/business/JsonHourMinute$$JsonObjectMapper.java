// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.business;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonHourMinute$$JsonObjectMapper extends JsonMapper<JsonHourMinute>
{
    public static JsonHourMinute _parse(final tge tge) throws IOException {
        final JsonHourMinute jsonHourMinute = new JsonHourMinute();
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
            parseField(jsonHourMinute, d, tge);
            tge.l0();
        }
        return jsonHourMinute;
    }
    
    public static void _serialize(final JsonHourMinute jsonHourMinute, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.T("hour", (int)jsonHourMinute.a);
        afe.T("minute", (int)jsonHourMinute.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonHourMinute jsonHourMinute, final String s, final tge tge) throws IOException {
        final boolean equals = "hour".equals(s);
        final Integer n = null;
        final Integer n2 = null;
        if (equals) {
            Integer value;
            if (tge.e() == vie.V0) {
                value = n2;
            }
            else {
                value = tge.y();
            }
            jsonHourMinute.a = value;
        }
        else if ("minute".equals(s)) {
            Integer value2;
            if (tge.e() == vie.V0) {
                value2 = n;
            }
            else {
                value2 = tge.y();
            }
            jsonHourMinute.b = value2;
        }
    }
    
    public JsonHourMinute parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonHourMinute jsonHourMinute, final afe afe, final boolean b) throws IOException {
        _serialize(jsonHourMinute, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonHourMinute)o, afe, b);
    }
}
