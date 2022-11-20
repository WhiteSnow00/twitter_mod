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
    public static final r93 CALLBACK_TRIGGER_TYPE_CONVERTER;
    
    static {
        CALLBACK_TRIGGER_TYPE_CONVERTER = new r93();
    }
    
    public static JsonScribeCallback _parse(final tge tge) throws IOException {
        final JsonScribeCallback jsonScribeCallback = new JsonScribeCallback();
        if (tge.e() == null) {
            tge.h0();
        }
        if (tge.e() != vie.L0) {
            tge.l0();
            return null;
        }
        while (tge.h0() != vie.M0) {
            final String d = tge.d();
            tge.h0();
            parseField(jsonScribeCallback, d, tge);
            tge.l0();
        }
        return jsonScribeCallback;
    }
    
    public static void _serialize(final JsonScribeCallback jsonScribeCallback, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("endpoint", jsonScribeCallback.b);
        if (jsonScribeCallback.c != null) {
            LoganSquare.typeConverterFor((Class)gej.class).serialize((Object)jsonScribeCallback.c, "scribe_config", true, afe);
        }
        final q93 a = jsonScribeCallback.a;
        if (a != null) {
            ((StringBasedTypeConverter)JsonScribeCallback$$JsonObjectMapper.CALLBACK_TRIGGER_TYPE_CONVERTER).serialize((Object)a, "trigger", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonScribeCallback jsonScribeCallback, final String s, final tge tge) throws IOException {
        if ("endpoint".equals(s)) {
            jsonScribeCallback.b = tge.T((String)null);
        }
        else if ("scribe_config".equals(s)) {
            jsonScribeCallback.c = (gej)LoganSquare.typeConverterFor((Class)gej.class).parse(tge);
        }
        else if ("trigger".equals(s)) {
            jsonScribeCallback.a = (q93)((StringBasedTypeConverter)JsonScribeCallback$$JsonObjectMapper.CALLBACK_TRIGGER_TYPE_CONVERTER).parse(tge);
        }
    }
    
    public JsonScribeCallback parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonScribeCallback jsonScribeCallback, final afe afe, final boolean b) throws IOException {
        _serialize(jsonScribeCallback, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonScribeCallback)o, afe, b);
    }
}
