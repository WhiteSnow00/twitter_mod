// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.business;

import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.profilemodules.model.business.HourMinute;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonBusinessOpenTimesRegularSlot$$JsonObjectMapper extends JsonMapper<JsonBusinessOpenTimesRegularSlot>
{
    public static JsonBusinessOpenTimesRegularSlot _parse(final tge tge) throws IOException {
        final JsonBusinessOpenTimesRegularSlot jsonBusinessOpenTimesRegularSlot = new JsonBusinessOpenTimesRegularSlot();
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
            parseField(jsonBusinessOpenTimesRegularSlot, d, tge);
            tge.l0();
        }
        return jsonBusinessOpenTimesRegularSlot;
    }
    
    public static void _serialize(final JsonBusinessOpenTimesRegularSlot jsonBusinessOpenTimesRegularSlot, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonBusinessOpenTimesRegularSlot.b != null) {
            LoganSquare.typeConverterFor((Class)HourMinute.class).serialize((Object)jsonBusinessOpenTimesRegularSlot.b, "close", true, afe);
        }
        if (jsonBusinessOpenTimesRegularSlot.a != null) {
            LoganSquare.typeConverterFor((Class)HourMinute.class).serialize((Object)jsonBusinessOpenTimesRegularSlot.a, "open", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonBusinessOpenTimesRegularSlot jsonBusinessOpenTimesRegularSlot, final String s, final tge tge) throws IOException {
        if ("close".equals(s)) {
            jsonBusinessOpenTimesRegularSlot.b = (HourMinute)LoganSquare.typeConverterFor((Class)HourMinute.class).parse(tge);
        }
        else if ("open".equals(s)) {
            jsonBusinessOpenTimesRegularSlot.a = (HourMinute)LoganSquare.typeConverterFor((Class)HourMinute.class).parse(tge);
        }
    }
    
    public JsonBusinessOpenTimesRegularSlot parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonBusinessOpenTimesRegularSlot jsonBusinessOpenTimesRegularSlot, final afe afe, final boolean b) throws IOException {
        _serialize(jsonBusinessOpenTimesRegularSlot, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonBusinessOpenTimesRegularSlot)o, afe, b);
    }
}
