// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.notificationstab;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotification$DisplayOptions$$JsonObjectMapper extends JsonMapper<JsonNotification.DisplayOptions>
{
    public static JsonNotification.DisplayOptions _parse(final qhe qhe) throws IOException {
        final JsonNotification.DisplayOptions displayOptions = new JsonNotification.DisplayOptions();
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
            parseField(displayOptions, d, qhe);
            qhe.m0();
        }
        return displayOptions;
    }
    
    public static void _serialize(final JsonNotification.DisplayOptions displayOptions, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (displayOptions.a != null) {
            yfe.i("inlineActions");
            JsonNotification$InlineActions$$JsonObjectMapper._serialize(displayOptions.a, yfe, true);
        }
        if (displayOptions.b != null) {
            yfe.i("mediaPreview");
            JsonNotification$MediaPreview$$JsonObjectMapper._serialize(displayOptions.b, yfe, true);
        }
        if (displayOptions.c != null) {
            yfe.i("quoteTweet");
            JsonNotification$QuoteTweet$$JsonObjectMapper._serialize(displayOptions.c, yfe, true);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotification.DisplayOptions displayOptions, final String s, final qhe qhe) throws IOException {
        if ("inlineActions".equals(s)) {
            displayOptions.a = JsonNotification$InlineActions$$JsonObjectMapper._parse(qhe);
        }
        else if ("mediaPreview".equals(s)) {
            displayOptions.b = JsonNotification$MediaPreview$$JsonObjectMapper._parse(qhe);
        }
        else if ("quoteTweet".equals(s)) {
            displayOptions.c = JsonNotification$QuoteTweet$$JsonObjectMapper._parse(qhe);
        }
    }
    
    public JsonNotification.DisplayOptions parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNotification.DisplayOptions displayOptions, final yfe yfe, final boolean b) throws IOException {
        _serialize(displayOptions, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNotification.DisplayOptions)o, yfe, b);
    }
}
