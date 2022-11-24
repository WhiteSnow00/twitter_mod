// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.notificationstab;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotification$Template$$JsonObjectMapper extends JsonMapper<JsonNotification.Template>
{
    public static JsonNotification.Template _parse(final qhe qhe) throws IOException {
        final JsonNotification.Template template = new JsonNotification.Template();
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
            parseField(template, d, qhe);
            qhe.m0();
        }
        return template;
    }
    
    public static void _serialize(final JsonNotification.Template template, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (template.a != null) {
            yfe.i("aggregateUserActionsV1");
            JsonNotification$AggregatesUserActionsV1$$JsonObjectMapper._serialize(template.a, yfe, true);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotification.Template template, final String s, final qhe qhe) throws IOException {
        if ("aggregateUserActionsV1".equals(s)) {
            template.a = JsonNotification$AggregatesUserActionsV1$$JsonObjectMapper._parse(qhe);
        }
    }
    
    public JsonNotification.Template parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNotification.Template template, final yfe yfe, final boolean b) throws IOException {
        _serialize(template, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNotification.Template)o, yfe, b);
    }
}
