// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonViewer$$JsonObjectMapper extends JsonMapper<JsonViewer>
{
    public static JsonViewer _parse(final tge tge) throws IOException {
        final JsonViewer jsonViewer = new JsonViewer();
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
            parseField(jsonViewer, d, tge);
            tge.l0();
        }
        return jsonViewer;
    }
    
    public static void _serialize(final JsonViewer jsonViewer, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.e("isCreator", (boolean)jsonViewer.b);
        afe.T("superFollowersCount", jsonViewer.c);
        if (jsonViewer.a != null) {
            LoganSquare.typeConverterFor((Class)kiw.class).serialize((Object)jsonViewer.a, "userResult", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonViewer jsonViewer, final String s, final tge tge) throws IOException {
        if ("isCreator".equals(s)) {
            Boolean value;
            if (tge.e() == vie.V0) {
                value = null;
            }
            else {
                value = tge.k();
            }
            jsonViewer.b = value;
        }
        else if ("superFollowersCount".equals(s)) {
            jsonViewer.c = tge.y();
        }
        else if ("userResult".equals(s)) {
            jsonViewer.a = (kiw)LoganSquare.typeConverterFor((Class)kiw.class).parse(tge);
        }
    }
    
    public JsonViewer parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonViewer jsonViewer, final afe afe, final boolean b) throws IOException {
        _serialize(jsonViewer, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonViewer)o, afe, b);
    }
}
