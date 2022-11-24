// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUrtTimelineTweetComposer$$JsonObjectMapper extends JsonMapper<JsonUrtTimelineTweetComposer>
{
    public static final t7t TIMELINE_TWEET_COMPOSER_DISPLAY_TYPE_TYPE_CONVERTER;
    
    static {
        TIMELINE_TWEET_COMPOSER_DISPLAY_TYPE_TYPE_CONVERTER = new t7t();
    }
    
    public static JsonUrtTimelineTweetComposer _parse(final qhe qhe) throws IOException {
        final JsonUrtTimelineTweetComposer jsonUrtTimelineTweetComposer = new JsonUrtTimelineTweetComposer();
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
            parseField(jsonUrtTimelineTweetComposer, d, qhe);
            qhe.m0();
        }
        return jsonUrtTimelineTweetComposer;
    }
    
    public static void _serialize(final JsonUrtTimelineTweetComposer jsonUrtTimelineTweetComposer, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final String c = jsonUrtTimelineTweetComposer.c;
        if (c != null) {
            ((StringBasedTypeConverter)JsonUrtTimelineTweetComposer$$JsonObjectMapper.TIMELINE_TWEET_COMPOSER_DISPLAY_TYPE_TYPE_CONVERTER).serialize((Object)c, "displayType", true, yfe);
        }
        yfe.u0("text", jsonUrtTimelineTweetComposer.a);
        if (jsonUrtTimelineTweetComposer.b != null) {
            LoganSquare.typeConverterFor((Class)c9t.class).serialize((Object)jsonUrtTimelineTweetComposer.b, "url", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonUrtTimelineTweetComposer jsonUrtTimelineTweetComposer, final String s, final qhe qhe) throws IOException {
        if (!"displayType".equals(s) && !"composerDisplayType".equals(s)) {
            if ("text".equals(s)) {
                jsonUrtTimelineTweetComposer.a = qhe.T((String)null);
            }
            else if ("url".equals(s)) {
                jsonUrtTimelineTweetComposer.b = (c9t)LoganSquare.typeConverterFor((Class)c9t.class).parse(qhe);
            }
        }
        else {
            jsonUrtTimelineTweetComposer.c = (String)((StringBasedTypeConverter)JsonUrtTimelineTweetComposer$$JsonObjectMapper.TIMELINE_TWEET_COMPOSER_DISPLAY_TYPE_TYPE_CONVERTER).parse(qhe);
        }
    }
    
    public JsonUrtTimelineTweetComposer parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonUrtTimelineTweetComposer jsonUrtTimelineTweetComposer, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonUrtTimelineTweetComposer, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonUrtTimelineTweetComposer)o, yfe, b);
    }
}
