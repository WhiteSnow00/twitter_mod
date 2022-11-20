// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.business;

import com.twitter.profilemodules.model.business.HourMinute;
import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.profilemodules.model.business.Weekday;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOpenCloseTimeNext$$JsonObjectMapper extends JsonMapper<JsonOpenCloseTimeNext>
{
    public static JsonOpenCloseTimeNext _parse(final tge tge) throws IOException {
        final JsonOpenCloseTimeNext jsonOpenCloseTimeNext = new JsonOpenCloseTimeNext();
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
            parseField(jsonOpenCloseTimeNext, d, tge);
            tge.l0();
        }
        return jsonOpenCloseTimeNext;
    }
    
    public static void _serialize(final JsonOpenCloseTimeNext jsonOpenCloseTimeNext, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonOpenCloseTimeNext.a != null) {
            LoganSquare.typeConverterFor((Class)Weekday.class).serialize((Object)jsonOpenCloseTimeNext.a, "day", true, afe);
        }
        if (jsonOpenCloseTimeNext.b != null) {
            LoganSquare.typeConverterFor((Class)HourMinute.class).serialize((Object)jsonOpenCloseTimeNext.b, "time", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonOpenCloseTimeNext jsonOpenCloseTimeNext, final String s, final tge tge) throws IOException {
        if ("day".equals(s)) {
            jsonOpenCloseTimeNext.a = (Weekday)LoganSquare.typeConverterFor((Class)Weekday.class).parse(tge);
        }
        else if ("time".equals(s)) {
            jsonOpenCloseTimeNext.b = (HourMinute)LoganSquare.typeConverterFor((Class)HourMinute.class).parse(tge);
        }
    }
    
    public JsonOpenCloseTimeNext parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonOpenCloseTimeNext jsonOpenCloseTimeNext, final afe afe, final boolean b) throws IOException {
        _serialize(jsonOpenCloseTimeNext, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonOpenCloseTimeNext)o, afe, b);
    }
}
