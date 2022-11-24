// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.notificationstab;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotification$InlineDislikeUrl$$JsonObjectMapper extends JsonMapper<JsonNotification.InlineDislikeUrl>
{
    public static JsonNotification.InlineDislikeUrl _parse(final qhe qhe) throws IOException {
        final JsonNotification.InlineDislikeUrl inlineDislikeUrl = new JsonNotification.InlineDislikeUrl();
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
            parseField(inlineDislikeUrl, d, qhe);
            qhe.m0();
        }
        return inlineDislikeUrl;
    }
    
    public static void _serialize(final JsonNotification.InlineDislikeUrl inlineDislikeUrl, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("endpoint", inlineDislikeUrl.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotification.InlineDislikeUrl inlineDislikeUrl, final String s, final qhe qhe) throws IOException {
        if ("endpoint".equals(s)) {
            inlineDislikeUrl.a = qhe.T((String)null);
        }
    }
    
    public JsonNotification.InlineDislikeUrl parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNotification.InlineDislikeUrl inlineDislikeUrl, final yfe yfe, final boolean b) throws IOException {
        _serialize(inlineDislikeUrl, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNotification.InlineDislikeUrl)o, yfe, b);
    }
}
