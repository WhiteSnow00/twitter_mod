// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMarkEntriesUnreadGreaterThanSortIndexInstruction$$JsonObjectMapper extends JsonMapper<JsonMarkEntriesUnreadGreaterThanSortIndexInstruction>
{
    public static JsonMarkEntriesUnreadGreaterThanSortIndexInstruction _parse(final qhe qhe) throws IOException {
        final JsonMarkEntriesUnreadGreaterThanSortIndexInstruction jsonMarkEntriesUnreadGreaterThanSortIndexInstruction = new JsonMarkEntriesUnreadGreaterThanSortIndexInstruction();
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
            parseField(jsonMarkEntriesUnreadGreaterThanSortIndexInstruction, d, qhe);
            qhe.m0();
        }
        return jsonMarkEntriesUnreadGreaterThanSortIndexInstruction;
    }
    
    public static void _serialize(final JsonMarkEntriesUnreadGreaterThanSortIndexInstruction jsonMarkEntriesUnreadGreaterThanSortIndexInstruction, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.W("sortIndex", (long)jsonMarkEntriesUnreadGreaterThanSortIndexInstruction.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonMarkEntriesUnreadGreaterThanSortIndexInstruction jsonMarkEntriesUnreadGreaterThanSortIndexInstruction, final String s, final qhe qhe) throws IOException {
        if ("sortIndex".equals(s)) {
            Long value;
            if (qhe.e() == rje.X0) {
                value = null;
            }
            else {
                value = qhe.L();
            }
            jsonMarkEntriesUnreadGreaterThanSortIndexInstruction.a = value;
        }
    }
    
    public JsonMarkEntriesUnreadGreaterThanSortIndexInstruction parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonMarkEntriesUnreadGreaterThanSortIndexInstruction jsonMarkEntriesUnreadGreaterThanSortIndexInstruction, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonMarkEntriesUnreadGreaterThanSortIndexInstruction, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonMarkEntriesUnreadGreaterThanSortIndexInstruction)o, yfe, b);
    }
}
