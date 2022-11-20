// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonURTSportsEvent$$JsonObjectMapper extends JsonMapper<JsonURTSportsEvent>
{
    public static JsonURTSportsEvent _parse(final tge tge) throws IOException {
        final JsonURTSportsEvent jsonURTSportsEvent = new JsonURTSportsEvent();
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
            parseField(jsonURTSportsEvent, d, tge);
            tge.l0();
        }
        return jsonURTSportsEvent;
    }
    
    public static void _serialize(final JsonURTSportsEvent jsonURTSportsEvent, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("gameClock", jsonURTSportsEvent.c);
        afe.t0("gameClockPeriod", jsonURTSportsEvent.d);
        afe.t0("id", jsonURTSportsEvent.a);
        final ArrayList e = jsonURTSportsEvent.e;
        if (e != null) {
            final Iterator a = br.A(afe, "participants", e);
            while (a.hasNext()) {
                final zqv$b zqv$b = a.next();
                if (zqv$b != null) {
                    LoganSquare.typeConverterFor((Class)zqv$b.class).serialize((Object)zqv$b, "lslocalparticipantsElement", false, afe);
                }
            }
            afe.f();
        }
        afe.V("startTimeMillis", (long)jsonURTSportsEvent.f);
        afe.t0("state", jsonURTSportsEvent.g);
        if (jsonURTSportsEvent.h != null) {
            LoganSquare.typeConverterFor((Class)i8t.class).serialize((Object)jsonURTSportsEvent.h, "url", true, afe);
        }
        afe.t0("winnerId", jsonURTSportsEvent.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonURTSportsEvent jsonURTSportsEvent, final String s, final tge tge) throws IOException {
        final boolean equals = "gameClock".equals(s);
        final Long n = null;
        if (equals) {
            jsonURTSportsEvent.c = tge.T((String)null);
        }
        else if ("gameClockPeriod".equals(s)) {
            jsonURTSportsEvent.d = tge.T((String)null);
        }
        else if ("id".equals(s)) {
            jsonURTSportsEvent.a = tge.T((String)null);
        }
        else if ("participants".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList e = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final zqv$b zqv$b = (zqv$b)LoganSquare.typeConverterFor((Class)zqv$b.class).parse(tge);
                    if (zqv$b != null) {
                        e.add(zqv$b);
                    }
                }
                jsonURTSportsEvent.e = e;
            }
            else {
                jsonURTSportsEvent.e = null;
            }
        }
        else if ("startTimeMillis".equals(s)) {
            Long value;
            if (tge.e() == vie.V0) {
                value = n;
            }
            else {
                value = tge.K();
            }
            jsonURTSportsEvent.f = value;
        }
        else if ("state".equals(s)) {
            jsonURTSportsEvent.g = tge.T((String)null);
        }
        else if ("url".equals(s)) {
            jsonURTSportsEvent.h = (i8t)LoganSquare.typeConverterFor((Class)i8t.class).parse(tge);
        }
        else if ("winnerId".equals(s)) {
            jsonURTSportsEvent.b = tge.T((String)null);
        }
    }
    
    public JsonURTSportsEvent parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonURTSportsEvent jsonURTSportsEvent, final afe afe, final boolean b) throws IOException {
        _serialize(jsonURTSportsEvent, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonURTSportsEvent)o, afe, b);
    }
}
