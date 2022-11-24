// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.subscriptions.features.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUndoTweetResponse$$JsonObjectMapper extends JsonMapper<JsonUndoTweetResponse>
{
    public static JsonUndoTweetResponse _parse(final qhe qhe) throws IOException {
        final JsonUndoTweetResponse jsonUndoTweetResponse = new JsonUndoTweetResponse();
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
            parseField(jsonUndoTweetResponse, d, qhe);
            qhe.m0();
        }
        return jsonUndoTweetResponse;
    }
    
    public static void _serialize(final JsonUndoTweetResponse jsonUndoTweetResponse, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("undo_original_tweet_enabled", jsonUndoTweetResponse.e);
        yfe.e("undo_poll_tweet_enabled", jsonUndoTweetResponse.f);
        yfe.e("undo_quote_tweet_enabled", jsonUndoTweetResponse.a);
        yfe.e("undo_reply_tweet_enabled", jsonUndoTweetResponse.b);
        yfe.e("undo_thread_tweet_enabled", jsonUndoTweetResponse.d);
        yfe.T("undo_tweet_duration_secs", (int)jsonUndoTweetResponse.c);
        yfe.e("view_tweet_after_sending_enabled", jsonUndoTweetResponse.g);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonUndoTweetResponse jsonUndoTweetResponse, final String s, final qhe qhe) throws IOException {
        if ("undo_original_tweet_enabled".equals(s)) {
            jsonUndoTweetResponse.e = qhe.l();
        }
        else if ("undo_poll_tweet_enabled".equals(s)) {
            jsonUndoTweetResponse.f = qhe.l();
        }
        else if ("undo_quote_tweet_enabled".equals(s)) {
            jsonUndoTweetResponse.a = qhe.l();
        }
        else if ("undo_reply_tweet_enabled".equals(s)) {
            jsonUndoTweetResponse.b = qhe.l();
        }
        else if ("undo_thread_tweet_enabled".equals(s)) {
            jsonUndoTweetResponse.d = qhe.l();
        }
        else if ("undo_tweet_duration_secs".equals(s)) {
            Integer value;
            if (qhe.e() == rje.X0) {
                value = null;
            }
            else {
                value = qhe.z();
            }
            jsonUndoTweetResponse.c = value;
        }
        else if ("view_tweet_after_sending_enabled".equals(s)) {
            jsonUndoTweetResponse.g = qhe.l();
        }
    }
    
    public JsonUndoTweetResponse parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonUndoTweetResponse jsonUndoTweetResponse, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonUndoTweetResponse, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonUndoTweetResponse)o, yfe, b);
    }
}
