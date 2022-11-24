// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.notificationstab;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotification$QuoteTweet$$JsonObjectMapper extends JsonMapper<JsonNotification.QuoteTweet>
{
    public static JsonNotification.QuoteTweet _parse(final qhe qhe) throws IOException {
        final JsonNotification.QuoteTweet quoteTweet = new JsonNotification.QuoteTweet();
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
            parseField(quoteTweet, d, qhe);
            qhe.m0();
        }
        return quoteTweet;
    }
    
    public static void _serialize(final JsonNotification.QuoteTweet quoteTweet, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("showQuoteTweetMedia", quoteTweet.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotification.QuoteTweet quoteTweet, final String s, final qhe qhe) throws IOException {
        if ("showQuoteTweetMedia".equals(s)) {
            quoteTweet.a = qhe.l();
        }
    }
    
    public JsonNotification.QuoteTweet parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNotification.QuoteTweet quoteTweet, final yfe yfe, final boolean b) throws IOException {
        _serialize(quoteTweet, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNotification.QuoteTweet)o, yfe, b);
    }
}
