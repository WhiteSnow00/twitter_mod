// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonScribeCallback$$JsonObjectMapper extends JsonMapper<JsonScribeCallback>
{
    public static final y93 CALLBACK_TRIGGER_TYPE_CONVERTER;
    
    static {
        CALLBACK_TRIGGER_TYPE_CONVERTER = new y93();
    }
    
    public static JsonScribeCallback _parse(final khe khe) throws IOException {
        final JsonScribeCallback jsonScribeCallback = new JsonScribeCallback();
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
            parseField(jsonScribeCallback, d, khe);
            khe.m0();
        }
        return jsonScribeCallback;
    }
    
    public static void _serialize(final JsonScribeCallback jsonScribeCallback, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("endpoint", jsonScribeCallback.b);
        if (jsonScribeCallback.c != null) {
            LoganSquare.typeConverterFor((Class)bej.class).serialize((Object)jsonScribeCallback.c, "scribe_config", true, tfe);
        }
        final x93 a = jsonScribeCallback.a;
        if (a != null) {
            ((StringBasedTypeConverter)JsonScribeCallback$$JsonObjectMapper.CALLBACK_TRIGGER_TYPE_CONVERTER).serialize((Object)a, "trigger", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonScribeCallback jsonScribeCallback, final String s, final khe khe) throws IOException {
        if ("endpoint".equals(s)) {
            jsonScribeCallback.b = khe.T((String)null);
        }
        else if ("scribe_config".equals(s)) {
            jsonScribeCallback.c = (bej)LoganSquare.typeConverterFor((Class)bej.class).parse(khe);
        }
        else if ("trigger".equals(s)) {
            jsonScribeCallback.a = (x93)((StringBasedTypeConverter)JsonScribeCallback$$JsonObjectMapper.CALLBACK_TRIGGER_TYPE_CONVERTER).parse(khe);
        }
    }
    
    public JsonScribeCallback parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonScribeCallback jsonScribeCallback, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonScribeCallback, tfe, b);
    }
}
