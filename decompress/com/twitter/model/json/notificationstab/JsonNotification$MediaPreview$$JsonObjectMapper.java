// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.notificationstab;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotification$MediaPreview$$JsonObjectMapper extends JsonMapper<JsonNotification.MediaPreview>
{
    public static final che JSON_NOTIFICATION_MEDIA_PREVIEW_TYPE_CONVERTER;
    
    static {
        JSON_NOTIFICATION_MEDIA_PREVIEW_TYPE_CONVERTER = new che();
    }
    
    public static JsonNotification.MediaPreview _parse(final qhe qhe) throws IOException {
        final JsonNotification.MediaPreview mediaPreview = new JsonNotification.MediaPreview();
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
            parseField(mediaPreview, d, qhe);
            qhe.m0();
        }
        return mediaPreview;
    }
    
    public static void _serialize(final JsonNotification.MediaPreview mediaPreview, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final hui a = mediaPreview.a;
        if (a != null) {
            ((StringBasedTypeConverter)JsonNotification$MediaPreview$$JsonObjectMapper.JSON_NOTIFICATION_MEDIA_PREVIEW_TYPE_CONVERTER).serialize((Object)a, "mediaSize", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotification.MediaPreview mediaPreview, final String s, final qhe qhe) throws IOException {
        if ("mediaSize".equals(s)) {
            mediaPreview.a = (hui)((StringBasedTypeConverter)JsonNotification$MediaPreview$$JsonObjectMapper.JSON_NOTIFICATION_MEDIA_PREVIEW_TYPE_CONVERTER).parse(qhe);
        }
    }
    
    public JsonNotification.MediaPreview parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNotification.MediaPreview mediaPreview, final yfe yfe, final boolean b) throws IOException {
        _serialize(mediaPreview, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNotification.MediaPreview)o, yfe, b);
    }
}
