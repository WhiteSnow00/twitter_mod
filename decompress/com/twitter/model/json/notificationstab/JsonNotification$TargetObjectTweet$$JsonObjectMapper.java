// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.notificationstab;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotification$TargetObjectTweet$$JsonObjectMapper extends JsonMapper<JsonNotification.TargetObjectTweet>
{
    public static JsonNotification.TargetObjectTweet _parse(final qhe qhe) throws IOException {
        final JsonNotification.TargetObjectTweet targetObjectTweet = new JsonNotification.TargetObjectTweet();
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
            parseField(targetObjectTweet, d, qhe);
            qhe.m0();
        }
        return targetObjectTweet;
    }
    
    public static void _serialize(final JsonNotification.TargetObjectTweet targetObjectTweet, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("displayType", targetObjectTweet.b);
        yfe.W("id", targetObjectTweet.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotification.TargetObjectTweet targetObjectTweet, final String s, final qhe qhe) throws IOException {
        if ("displayType".equals(s)) {
            targetObjectTweet.b = qhe.T((String)null);
        }
        else if ("id".equals(s)) {
            targetObjectTweet.a = qhe.L();
        }
    }
    
    public JsonNotification.TargetObjectTweet parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNotification.TargetObjectTweet targetObjectTweet, final yfe yfe, final boolean b) throws IOException {
        _serialize(targetObjectTweet, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNotification.TargetObjectTweet)o, yfe, b);
    }
}
