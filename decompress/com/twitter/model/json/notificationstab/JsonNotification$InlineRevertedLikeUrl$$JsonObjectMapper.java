// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.notificationstab;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotification$InlineRevertedLikeUrl$$JsonObjectMapper extends JsonMapper<JsonNotification.InlineRevertedLikeUrl>
{
    public static JsonNotification.InlineRevertedLikeUrl _parse(final qhe qhe) throws IOException {
        final JsonNotification.InlineRevertedLikeUrl inlineRevertedLikeUrl = new JsonNotification.InlineRevertedLikeUrl();
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
            parseField(inlineRevertedLikeUrl, d, qhe);
            qhe.m0();
        }
        return inlineRevertedLikeUrl;
    }
    
    public static void _serialize(final JsonNotification.InlineRevertedLikeUrl inlineRevertedLikeUrl, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("endpoint", inlineRevertedLikeUrl.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotification.InlineRevertedLikeUrl inlineRevertedLikeUrl, final String s, final qhe qhe) throws IOException {
        if ("endpoint".equals(s)) {
            inlineRevertedLikeUrl.a = qhe.T((String)null);
        }
    }
    
    public JsonNotification.InlineRevertedLikeUrl parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNotification.InlineRevertedLikeUrl inlineRevertedLikeUrl, final yfe yfe, final boolean b) throws IOException {
        _serialize(inlineRevertedLikeUrl, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNotification.InlineRevertedLikeUrl)o, yfe, b);
    }
}
