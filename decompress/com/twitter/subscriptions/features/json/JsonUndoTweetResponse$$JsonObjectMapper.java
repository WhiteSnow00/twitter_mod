// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.subscriptions.features.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUndoTweetResponse$$JsonObjectMapper extends JsonMapper<JsonUndoTweetResponse>
{
    public static JsonUndoTweetResponse _parse(final khe khe) throws IOException {
        final JsonUndoTweetResponse jsonUndoTweetResponse = new JsonUndoTweetResponse();
        if (khe.e() == null) {
            khe.i0();
        }
        if (khe.e() != lje.K0) {
            khe.m0();
            return null;
        }
        while (khe.i0() != lje.L0) {
            final String d = khe.d();
            khe.i0();
            parseField(jsonUndoTweetResponse, d, khe);
            khe.m0();
        }
        return jsonUndoTweetResponse;
    }
    
    public static void _serialize(final JsonUndoTweetResponse jsonUndoTweetResponse, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.e("undo_original_tweet_enabled", jsonUndoTweetResponse.e);
        tfe.e("undo_poll_tweet_enabled", jsonUndoTweetResponse.f);
        tfe.e("undo_quote_tweet_enabled", jsonUndoTweetResponse.a);
        tfe.e("undo_reply_tweet_enabled", jsonUndoTweetResponse.b);
        tfe.e("undo_thread_tweet_enabled", jsonUndoTweetResponse.d);
        tfe.T("undo_tweet_duration_secs", jsonUndoTweetResponse.c);
        tfe.e("view_tweet_after_sending_enabled", jsonUndoTweetResponse.g);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonUndoTweetResponse jsonUndoTweetResponse, final String s, final khe khe) throws IOException {
        if ("undo_original_tweet_enabled".equals(s)) {
            jsonUndoTweetResponse.e = khe.k();
        }
        else if ("undo_poll_tweet_enabled".equals(s)) {
            jsonUndoTweetResponse.f = khe.k();
        }
        else if ("undo_quote_tweet_enabled".equals(s)) {
            jsonUndoTweetResponse.a = khe.k();
        }
        else if ("undo_reply_tweet_enabled".equals(s)) {
            jsonUndoTweetResponse.b = khe.k();
        }
        else if ("undo_thread_tweet_enabled".equals(s)) {
            jsonUndoTweetResponse.d = khe.k();
        }
        else if ("undo_tweet_duration_secs".equals(s)) {
            Integer value;
            if (khe.e() == lje.U0) {
                value = null;
            }
            else {
                value = khe.z();
            }
            jsonUndoTweetResponse.c = value;
        }
        else if ("view_tweet_after_sending_enabled".equals(s)) {
            jsonUndoTweetResponse.g = khe.k();
        }
    }
    
    public JsonUndoTweetResponse parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonUndoTweetResponse jsonUndoTweetResponse, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonUndoTweetResponse, tfe, b);
    }
}
