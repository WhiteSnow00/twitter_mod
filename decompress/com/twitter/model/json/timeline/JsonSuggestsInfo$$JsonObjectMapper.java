// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline;

import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSuggestsInfo$$JsonObjectMapper extends JsonMapper<JsonSuggestsInfo>
{
    public static JsonSuggestsInfo _parse(final qhe qhe) throws IOException {
        final JsonSuggestsInfo jsonSuggestsInfo = new JsonSuggestsInfo();
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
            parseField(jsonSuggestsInfo, d, qhe);
            qhe.m0();
        }
        return jsonSuggestsInfo;
    }
    
    public static void _serialize(final JsonSuggestsInfo jsonSuggestsInfo, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonSuggestsInfo.a != null) {
            LoganSquare.typeConverterFor((Class)b1p.class).serialize((Object)jsonSuggestsInfo.a, "module", true, yfe);
        }
        final HashMap d = jsonSuggestsInfo.d;
        if (d != null) {
            final Iterator a = af.A(yfe, "moments", d);
            while (a.hasNext()) {
                final Map.Entry<String, b1p> entry = a.next();
                if (qee.r((String)entry.getKey(), yfe, (Map.Entry)entry) == null) {
                    yfe.j();
                }
                else {
                    if (entry.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor((Class)b1p.class).serialize((Object)entry.getValue(), "lslocalmomentsElement", false, yfe);
                }
            }
            yfe.h();
        }
        final HashMap b2 = jsonSuggestsInfo.b;
        if (b2 != null) {
            final Iterator a2 = af.A(yfe, "tweets", b2);
            while (a2.hasNext()) {
                final Map.Entry<String, b1p> entry2 = a2.next();
                if (qee.r((String)entry2.getKey(), yfe, (Map.Entry)entry2) == null) {
                    yfe.j();
                }
                else {
                    if (entry2.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor((Class)b1p.class).serialize((Object)entry2.getValue(), "lslocaltweetsElement", false, yfe);
                }
            }
            yfe.h();
        }
        final HashMap c = jsonSuggestsInfo.c;
        if (c != null) {
            final Iterator a3 = af.A(yfe, "users", c);
            while (a3.hasNext()) {
                final Map.Entry<String, b1p> entry3 = a3.next();
                if (qee.r((String)entry3.getKey(), yfe, (Map.Entry)entry3) == null) {
                    yfe.j();
                }
                else {
                    if (entry3.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor((Class)b1p.class).serialize((Object)entry3.getValue(), "lslocalusersElement", false, yfe);
                }
            }
            yfe.h();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSuggestsInfo jsonSuggestsInfo, String s, final qhe qhe) throws IOException {
        if ("module".equals(s)) {
            jsonSuggestsInfo.a = (b1p)LoganSquare.typeConverterFor((Class)b1p.class).parse(qhe);
        }
        else if ("moments".equals(s)) {
            if (qhe.e() == rje.N0) {
                final HashMap d = new HashMap();
                while (qhe.i0() != rje.O0) {
                    final String j = qhe.j();
                    qhe.i0();
                    if (qhe.e() == rje.X0) {
                        d.put(j, null);
                    }
                    else {
                        d.put(j, LoganSquare.typeConverterFor((Class)b1p.class).parse(qhe));
                    }
                }
                jsonSuggestsInfo.d = d;
            }
            else {
                jsonSuggestsInfo.d = null;
            }
        }
        else if ("tweets".equals(s)) {
            if (qhe.e() == rje.N0) {
                final HashMap b = new HashMap();
                while (qhe.i0() != rje.O0) {
                    s = qhe.j();
                    qhe.i0();
                    if (qhe.e() == rje.X0) {
                        b.put(s, null);
                    }
                    else {
                        b.put(s, LoganSquare.typeConverterFor((Class)b1p.class).parse(qhe));
                    }
                }
                jsonSuggestsInfo.b = b;
            }
            else {
                jsonSuggestsInfo.b = null;
            }
        }
        else if ("users".equals(s)) {
            if (qhe.e() == rje.N0) {
                final HashMap c = new HashMap();
                while (qhe.i0() != rje.O0) {
                    s = qhe.j();
                    qhe.i0();
                    if (qhe.e() == rje.X0) {
                        c.put(s, null);
                    }
                    else {
                        c.put(s, LoganSquare.typeConverterFor((Class)b1p.class).parse(qhe));
                    }
                }
                jsonSuggestsInfo.c = c;
            }
            else {
                jsonSuggestsInfo.c = null;
            }
        }
    }
    
    public JsonSuggestsInfo parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSuggestsInfo jsonSuggestsInfo, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonSuggestsInfo, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSuggestsInfo)o, yfe, b);
    }
}
