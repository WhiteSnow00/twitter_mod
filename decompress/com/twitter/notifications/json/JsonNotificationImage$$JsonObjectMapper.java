// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotificationImage$$JsonObjectMapper extends JsonMapper<JsonNotificationImage>
{
    public static JsonNotificationImage _parse(final qhe qhe) throws IOException {
        final JsonNotificationImage jsonNotificationImage = new JsonNotificationImage();
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
            parseField(jsonNotificationImage, d, qhe);
            qhe.m0();
        }
        return jsonNotificationImage;
    }
    
    public static void _serialize(final JsonNotificationImage jsonNotificationImage, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("circle_crop", jsonNotificationImage.c);
        if (jsonNotificationImage.b != null) {
            LoganSquare.typeConverterFor((Class)p77.class).serialize((Object)jsonNotificationImage.b, "crop_data", true, yfe);
        }
        yfe.u0("image_url", jsonNotificationImage.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotificationImage jsonNotificationImage, final String s, final qhe qhe) throws IOException {
        if ("circle_crop".equals(s)) {
            jsonNotificationImage.c = qhe.l();
        }
        else if ("crop_data".equals(s)) {
            jsonNotificationImage.b = (p77)LoganSquare.typeConverterFor((Class)p77.class).parse(qhe);
        }
        else if ("image_url".equals(s)) {
            jsonNotificationImage.a = qhe.T((String)null);
        }
    }
    
    public JsonNotificationImage parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNotificationImage jsonNotificationImage, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNotificationImage, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNotificationImage)o, yfe, b);
    }
}
