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
    public static JsonURTSportsEvent _parse(final khe khe) throws IOException {
        final JsonURTSportsEvent jsonURTSportsEvent = new JsonURTSportsEvent();
        if (khe.e() == null) {
            khe.i0();
        }
        if (khe.e() != lje.K0) {
            khe.m0();
            return null;
        }
        while (khe.i0() != lje.L0) {
            final String d = khe.d();
            khe.i0();
            parseField(jsonURTSportsEvent, d, khe);
            khe.m0();
        }
        return jsonURTSportsEvent;
    }
    
    public static void _serialize(final JsonURTSportsEvent jsonURTSportsEvent, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("gameClock", jsonURTSportsEvent.c);
        tfe.u0("gameClockPeriod", jsonURTSportsEvent.d);
        tfe.u0("id", jsonURTSportsEvent.a);
        final ArrayList e = jsonURTSportsEvent.e;
        if (e != null) {
            final Iterator g = q1a.g(tfe, "participants", e);
            while (g.hasNext()) {
                final dqv$b dqv$b = g.next();
                if (dqv$b != null) {
                    LoganSquare.typeConverterFor((Class)dqv$b.class).serialize((Object)dqv$b, "lslocalparticipantsElement", false, tfe);
                }
            }
            tfe.f();
        }
        tfe.W("startTimeMillis", jsonURTSportsEvent.f);
        tfe.u0("state", jsonURTSportsEvent.g);
        if (jsonURTSportsEvent.h != null) {
            LoganSquare.typeConverterFor((Class)q7t.class).serialize((Object)jsonURTSportsEvent.h, "url", true, tfe);
        }
        tfe.u0("winnerId", jsonURTSportsEvent.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonURTSportsEvent jsonURTSportsEvent, final String s, final khe khe) throws IOException {
        final boolean equals = "gameClock".equals(s);
        final Long n = null;
        if (equals) {
            jsonURTSportsEvent.c = khe.T((String)null);
        }
        else if ("gameClockPeriod".equals(s)) {
            jsonURTSportsEvent.d = khe.T((String)null);
        }
        else if ("id".equals(s)) {
            jsonURTSportsEvent.a = khe.T((String)null);
        }
        else if ("participants".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList e = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final dqv$b dqv$b = (dqv$b)LoganSquare.typeConverterFor((Class)dqv$b.class).parse(khe);
                    if (dqv$b != null) {
                        e.add(dqv$b);
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
            if (khe.e() == lje.U0) {
                value = n;
            }
            else {
                value = khe.L();
            }
            jsonURTSportsEvent.f = value;
        }
        else if ("state".equals(s)) {
            jsonURTSportsEvent.g = khe.T((String)null);
        }
        else if ("url".equals(s)) {
            jsonURTSportsEvent.h = (q7t)LoganSquare.typeConverterFor((Class)q7t.class).parse(khe);
        }
        else if ("winnerId".equals(s)) {
            jsonURTSportsEvent.b = khe.T((String)null);
        }
    }
    
    public JsonURTSportsEvent parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonURTSportsEvent jsonURTSportsEvent, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonURTSportsEvent, tfe, b);
    }
}
