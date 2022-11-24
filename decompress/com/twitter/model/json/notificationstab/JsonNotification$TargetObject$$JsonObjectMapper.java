// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.notificationstab;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotification$TargetObject$$JsonObjectMapper extends JsonMapper<JsonNotification.TargetObject>
{
    public static JsonNotification.TargetObject _parse(final qhe qhe) throws IOException {
        final JsonNotification.TargetObject targetObject = new JsonNotification.TargetObject();
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
            parseField(targetObject, d, qhe);
            qhe.m0();
        }
        return targetObject;
    }
    
    public static void _serialize(final JsonNotification.TargetObject targetObject, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (targetObject.a != null) {
            yfe.i("tweet");
            JsonNotification$TargetObjectTweet$$JsonObjectMapper._serialize(targetObject.a, yfe, true);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotification.TargetObject targetObject, final String s, final qhe qhe) throws IOException {
        if ("tweet".equals(s)) {
            targetObject.a = JsonNotification$TargetObjectTweet$$JsonObjectMapper._parse(qhe);
        }
    }
    
    public JsonNotification.TargetObject parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNotification.TargetObject targetObject, final yfe yfe, final boolean b) throws IOException {
        _serialize(targetObject, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNotification.TargetObject)o, yfe, b);
    }
}
