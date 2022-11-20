// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.business;

import java.util.Iterator;
import java.util.ArrayList;
import com.twitter.profilemodules.model.business.Weekday;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonBusinessOpenTimesRegular$$JsonObjectMapper extends JsonMapper<JsonBusinessOpenTimesRegular>
{
    public static JsonBusinessOpenTimesRegular _parse(final tge tge) throws IOException {
        final JsonBusinessOpenTimesRegular jsonBusinessOpenTimesRegular = new JsonBusinessOpenTimesRegular();
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
            parseField(jsonBusinessOpenTimesRegular, d, tge);
            tge.l0();
        }
        return jsonBusinessOpenTimesRegular;
    }
    
    public static void _serialize(final JsonBusinessOpenTimesRegular jsonBusinessOpenTimesRegular, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final ArrayList a = jsonBusinessOpenTimesRegular.a;
        if (a != null) {
            final Iterator a2 = br.A(afe, "slots", a);
            while (a2.hasNext()) {
                final x13 x13 = a2.next();
                if (x13 != null) {
                    LoganSquare.typeConverterFor((Class)x13.class).serialize((Object)x13, "lslocalslotsElement", false, afe);
                }
            }
            afe.f();
        }
        if (jsonBusinessOpenTimesRegular.b != null) {
            LoganSquare.typeConverterFor((Class)Weekday.class).serialize((Object)jsonBusinessOpenTimesRegular.b, "weekday", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonBusinessOpenTimesRegular jsonBusinessOpenTimesRegular, final String s, final tge tge) throws IOException {
        if ("slots".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList a = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final x13 x13 = (x13)LoganSquare.typeConverterFor((Class)x13.class).parse(tge);
                    if (x13 != null) {
                        a.add(x13);
                    }
                }
                jsonBusinessOpenTimesRegular.a = a;
            }
            else {
                jsonBusinessOpenTimesRegular.a = null;
            }
        }
        else if ("weekday".equals(s)) {
            jsonBusinessOpenTimesRegular.b = (Weekday)LoganSquare.typeConverterFor((Class)Weekday.class).parse(tge);
        }
    }
    
    public JsonBusinessOpenTimesRegular parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonBusinessOpenTimesRegular jsonBusinessOpenTimesRegular, final afe afe, final boolean b) throws IOException {
        _serialize(jsonBusinessOpenTimesRegular, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonBusinessOpenTimesRegular)o, afe, b);
    }
}
