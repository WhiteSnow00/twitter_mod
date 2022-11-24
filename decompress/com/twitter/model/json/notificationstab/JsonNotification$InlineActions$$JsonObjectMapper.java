// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.notificationstab;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotification$InlineActions$$JsonObjectMapper extends JsonMapper<JsonNotification.InlineActions>
{
    public static JsonNotification.InlineActions _parse(final qhe qhe) throws IOException {
        final JsonNotification.InlineActions inlineActions = new JsonNotification.InlineActions();
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
            parseField(inlineActions, d, qhe);
            qhe.m0();
        }
        return inlineActions;
    }
    
    public static void _serialize(final JsonNotification.InlineActions inlineActions, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotification.InlineActions inlineActions, final String s, final qhe qhe) throws IOException {
    }
    
    public JsonNotification.InlineActions parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNotification.InlineActions inlineActions, final yfe yfe, final boolean b) throws IOException {
        _serialize(inlineActions, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNotification.InlineActions)o, yfe, b);
    }
}
