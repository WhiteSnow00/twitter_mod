// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.cover;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonURTCoverImage$$JsonObjectMapper extends JsonMapper<JsonURTCoverImage>
{
    public static final vov U_R_T_IMAGE_ANIMATION_TYPE_CONVERTER;
    public static final wov U_R_T_IMAGE_DISPLAY_TYPE_CONVERTER;
    
    static {
        U_R_T_IMAGE_DISPLAY_TYPE_CONVERTER = new wov();
        U_R_T_IMAGE_ANIMATION_TYPE_CONVERTER = new vov();
    }
    
    public static JsonURTCoverImage _parse(final khe khe) throws IOException {
        final JsonURTCoverImage jsonURTCoverImage = new JsonURTCoverImage();
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
            parseField(jsonURTCoverImage, d, khe);
            khe.m0();
        }
        return jsonURTCoverImage;
    }
    
    public static void _serialize(final JsonURTCoverImage jsonURTCoverImage, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonURTCoverImage.a != null) {
            LoganSquare.typeConverterFor((Class)szg.class).serialize((Object)jsonURTCoverImage.a, "image", true, tfe);
        }
        ((StringBasedTypeConverter)JsonURTCoverImage$$JsonObjectMapper.U_R_T_IMAGE_ANIMATION_TYPE_CONVERTER).serialize((Object)jsonURTCoverImage.c, "imageAnimationType", true, tfe);
        ((StringBasedTypeConverter)JsonURTCoverImage$$JsonObjectMapper.U_R_T_IMAGE_DISPLAY_TYPE_CONVERTER).serialize((Object)jsonURTCoverImage.b, "imageDisplayType", true, tfe);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonURTCoverImage jsonURTCoverImage, final String s, final khe khe) throws IOException {
        if ("image".equals(s)) {
            jsonURTCoverImage.a = (szg)LoganSquare.typeConverterFor((Class)szg.class).parse(khe);
        }
        else if ("imageAnimationType".equals(s)) {
            jsonURTCoverImage.c = (int)((StringBasedTypeConverter)JsonURTCoverImage$$JsonObjectMapper.U_R_T_IMAGE_ANIMATION_TYPE_CONVERTER).parse(khe);
        }
        else if ("imageDisplayType".equals(s)) {
            jsonURTCoverImage.b = (int)((StringBasedTypeConverter)JsonURTCoverImage$$JsonObjectMapper.U_R_T_IMAGE_DISPLAY_TYPE_CONVERTER).parse(khe);
        }
    }
    
    public JsonURTCoverImage parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonURTCoverImage jsonURTCoverImage, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonURTCoverImage, tfe, b);
    }
}
