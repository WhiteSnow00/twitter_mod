// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonEventSummary$JsonSemanticCoreEvent$$JsonObjectMapper extends JsonMapper<JsonEventSummary.JsonSemanticCoreEvent>
{
    public static JsonEventSummary.JsonSemanticCoreEvent _parse(final qhe qhe) throws IOException {
        final JsonEventSummary.JsonSemanticCoreEvent jsonSemanticCoreEvent = new JsonEventSummary.JsonSemanticCoreEvent();
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
            parseField(jsonSemanticCoreEvent, d, qhe);
            qhe.m0();
        }
        return jsonSemanticCoreEvent;
    }
    
    public static void _serialize(final JsonEventSummary.JsonSemanticCoreEvent jsonSemanticCoreEvent, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.W("restId", jsonSemanticCoreEvent.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonEventSummary.JsonSemanticCoreEvent jsonSemanticCoreEvent, final String s, final qhe qhe) throws IOException {
        if ("restId".equals(s)) {
            jsonSemanticCoreEvent.a = qhe.L();
        }
    }
    
    public JsonEventSummary.JsonSemanticCoreEvent parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonEventSummary.JsonSemanticCoreEvent jsonSemanticCoreEvent, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonSemanticCoreEvent, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonEventSummary.JsonSemanticCoreEvent)o, yfe, b);
    }
}
