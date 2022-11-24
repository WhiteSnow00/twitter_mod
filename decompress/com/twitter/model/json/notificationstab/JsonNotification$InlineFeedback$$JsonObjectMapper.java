// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.notificationstab;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotification$InlineFeedback$$JsonObjectMapper extends JsonMapper<JsonNotification.InlineFeedback>
{
    public static JsonNotification.InlineFeedback _parse(final qhe qhe) throws IOException {
        final JsonNotification.InlineFeedback inlineFeedback = new JsonNotification.InlineFeedback();
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
            parseField(inlineFeedback, d, qhe);
            qhe.m0();
        }
        return inlineFeedback;
    }
    
    public static void _serialize(final JsonNotification.InlineFeedback inlineFeedback, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("inlineDislike", inlineFeedback.b);
        if (inlineFeedback.e != null) {
            yfe.i("inlineDislikeUrl");
            JsonNotification$InlineDislikeUrl$$JsonObjectMapper._serialize(inlineFeedback.e, yfe, true);
        }
        yfe.u0("inlineLike", inlineFeedback.a);
        if (inlineFeedback.c != null) {
            yfe.i("inlineLikeUrl");
            JsonNotification$InlineLikeUrl$$JsonObjectMapper._serialize(inlineFeedback.c, yfe, true);
        }
        if (inlineFeedback.f != null) {
            yfe.i("inlineRevertedDislikeUrl");
            JsonNotification$InlineRevertedDislikeUrl$$JsonObjectMapper._serialize(inlineFeedback.f, yfe, true);
        }
        if (inlineFeedback.d != null) {
            yfe.i("inlineRevertedLikeUrl");
            JsonNotification$InlineRevertedLikeUrl$$JsonObjectMapper._serialize(inlineFeedback.d, yfe, true);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotification.InlineFeedback inlineFeedback, final String s, final qhe qhe) throws IOException {
        if ("inlineDislike".equals(s)) {
            inlineFeedback.b = qhe.T((String)null);
        }
        else if ("inlineDislikeUrl".equals(s)) {
            inlineFeedback.e = JsonNotification$InlineDislikeUrl$$JsonObjectMapper._parse(qhe);
        }
        else if ("inlineLike".equals(s)) {
            inlineFeedback.a = qhe.T((String)null);
        }
        else if ("inlineLikeUrl".equals(s)) {
            inlineFeedback.c = JsonNotification$InlineLikeUrl$$JsonObjectMapper._parse(qhe);
        }
        else if ("inlineRevertedDislikeUrl".equals(s)) {
            inlineFeedback.f = JsonNotification$InlineRevertedDislikeUrl$$JsonObjectMapper._parse(qhe);
        }
        else if ("inlineRevertedLikeUrl".equals(s)) {
            inlineFeedback.d = JsonNotification$InlineRevertedLikeUrl$$JsonObjectMapper._parse(qhe);
        }
    }
    
    public JsonNotification.InlineFeedback parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNotification.InlineFeedback inlineFeedback, final yfe yfe, final boolean b) throws IOException {
        _serialize(inlineFeedback, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNotification.InlineFeedback)o, yfe, b);
    }
}
