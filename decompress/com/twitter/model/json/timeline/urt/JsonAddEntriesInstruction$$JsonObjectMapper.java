// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAddEntriesInstruction$$JsonObjectMapper extends JsonMapper<JsonAddEntriesInstruction>
{
    public static JsonAddEntriesInstruction _parse(final qhe qhe) throws IOException {
        final JsonAddEntriesInstruction jsonAddEntriesInstruction = new JsonAddEntriesInstruction();
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
            parseField(jsonAddEntriesInstruction, d, qhe);
            qhe.m0();
        }
        return jsonAddEntriesInstruction;
    }
    
    public static void _serialize(final JsonAddEntriesInstruction jsonAddEntriesInstruction, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final ArrayList a = jsonAddEntriesInstruction.a;
        if (a != null) {
            final Iterator e = d10.E(yfe, "entries", a);
            while (e.hasNext()) {
                final yvs yvs = e.next();
                if (yvs != null) {
                    LoganSquare.typeConverterFor((Class)yvs.class).serialize((Object)yvs, "lslocalentriesElement", false, yfe);
                }
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonAddEntriesInstruction jsonAddEntriesInstruction, final String s, final qhe qhe) throws IOException {
        if ("entries".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList a = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final yvs yvs = (yvs)LoganSquare.typeConverterFor((Class)yvs.class).parse(qhe);
                    if (yvs != null) {
                        a.add(yvs);
                    }
                }
                jsonAddEntriesInstruction.a = a;
            }
            else {
                jsonAddEntriesInstruction.a = null;
            }
        }
    }
    
    public JsonAddEntriesInstruction parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonAddEntriesInstruction jsonAddEntriesInstruction, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonAddEntriesInstruction, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonAddEntriesInstruction)o, yfe, b);
    }
}
