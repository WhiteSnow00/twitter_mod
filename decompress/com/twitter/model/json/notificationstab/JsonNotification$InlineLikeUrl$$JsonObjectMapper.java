// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.notificationstab;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotification$InlineLikeUrl$$JsonObjectMapper extends JsonMapper<JsonNotification.InlineLikeUrl>
{
    public static JsonNotification.InlineLikeUrl _parse(final qhe qhe) throws IOException {
        final JsonNotification.InlineLikeUrl inlineLikeUrl = new JsonNotification.InlineLikeUrl();
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
            parseField(inlineLikeUrl, d, qhe);
            qhe.m0();
        }
        return inlineLikeUrl;
    }
    
    public static void _serialize(final JsonNotification.InlineLikeUrl inlineLikeUrl, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("endpoint", inlineLikeUrl.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotification.InlineLikeUrl inlineLikeUrl, final String s, final qhe qhe) throws IOException {
        if ("endpoint".equals(s)) {
            inlineLikeUrl.a = qhe.T((String)null);
        }
    }
    
    public JsonNotification.InlineLikeUrl parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNotification.InlineLikeUrl inlineLikeUrl, final yfe yfe, final boolean b) throws IOException {
        _serialize(inlineLikeUrl, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNotification.InlineLikeUrl)o, yfe, b);
    }
}
