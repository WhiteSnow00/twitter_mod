// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonConversationThread$$JsonObjectMapper extends JsonMapper<JsonConversationThread>
{
    public static JsonConversationThread _parse(final qhe qhe) throws IOException {
        final JsonConversationThread jsonConversationThread = new JsonConversationThread();
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
            parseField(jsonConversationThread, d, qhe);
            qhe.m0();
        }
        return jsonConversationThread;
    }
    
    public static void _serialize(final JsonConversationThread jsonConversationThread, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final ArrayList a = jsonConversationThread.a;
        if (a != null) {
            final Iterator e = d10.E(yfe, "conversationComponents", a);
            while (e.hasNext()) {
                final kr6 kr6 = e.next();
                if (kr6 != null) {
                    LoganSquare.typeConverterFor((Class)kr6.class).serialize((Object)kr6, "lslocalconversationComponentsElement", false, yfe);
                }
            }
            yfe.f();
        }
        if (jsonConversationThread.b != null) {
            LoganSquare.typeConverterFor((Class)zqv.class).serialize((Object)jsonConversationThread.b, "showMoreCursor", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonConversationThread jsonConversationThread, final String s, final qhe qhe) throws IOException {
        if ("conversationComponents".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList a = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final kr6 kr6 = (kr6)LoganSquare.typeConverterFor((Class)kr6.class).parse(qhe);
                    if (kr6 != null) {
                        a.add(kr6);
                    }
                }
                jsonConversationThread.a = a;
            }
            else {
                jsonConversationThread.a = null;
            }
        }
        else if ("showMoreCursor".equals(s)) {
            jsonConversationThread.b = (zqv)LoganSquare.typeConverterFor((Class)zqv.class).parse(qhe);
        }
    }
    
    public JsonConversationThread parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonConversationThread jsonConversationThread, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonConversationThread, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonConversationThread)o, yfe, b);
    }
}
