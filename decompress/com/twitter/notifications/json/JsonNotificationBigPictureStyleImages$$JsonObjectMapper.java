// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNotificationBigPictureStyleImages$$JsonObjectMapper extends JsonMapper<JsonNotificationBigPictureStyleImages>
{
    public static JsonNotificationBigPictureStyleImages _parse(final qhe qhe) throws IOException {
        final JsonNotificationBigPictureStyleImages jsonNotificationBigPictureStyleImages = new JsonNotificationBigPictureStyleImages();
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
            parseField(jsonNotificationBigPictureStyleImages, d, qhe);
            qhe.m0();
        }
        return jsonNotificationBigPictureStyleImages;
    }
    
    public static void _serialize(final JsonNotificationBigPictureStyleImages jsonNotificationBigPictureStyleImages, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonNotificationBigPictureStyleImages.a != null) {
            LoganSquare.typeConverterFor((Class)usi.class).serialize((Object)jsonNotificationBigPictureStyleImages.a, "collapsed_small_icon", true, yfe);
        }
        if (jsonNotificationBigPictureStyleImages.c != null) {
            LoganSquare.typeConverterFor((Class)usi.class).serialize((Object)jsonNotificationBigPictureStyleImages.c, "expanded_large_image", true, yfe);
        }
        if (jsonNotificationBigPictureStyleImages.b != null) {
            LoganSquare.typeConverterFor((Class)usi.class).serialize((Object)jsonNotificationBigPictureStyleImages.b, "expanded_small_icon", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNotificationBigPictureStyleImages jsonNotificationBigPictureStyleImages, final String s, final qhe qhe) throws IOException {
        if ("collapsed_small_icon".equals(s)) {
            jsonNotificationBigPictureStyleImages.a = (usi)LoganSquare.typeConverterFor((Class)usi.class).parse(qhe);
        }
        else if ("expanded_large_image".equals(s)) {
            jsonNotificationBigPictureStyleImages.c = (usi)LoganSquare.typeConverterFor((Class)usi.class).parse(qhe);
        }
        else if ("expanded_small_icon".equals(s)) {
            jsonNotificationBigPictureStyleImages.b = (usi)LoganSquare.typeConverterFor((Class)usi.class).parse(qhe);
        }
    }
    
    public JsonNotificationBigPictureStyleImages parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNotificationBigPictureStyleImages jsonNotificationBigPictureStyleImages, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNotificationBigPictureStyleImages, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNotificationBigPictureStyleImages)o, yfe, b);
    }
}
