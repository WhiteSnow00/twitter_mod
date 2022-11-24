// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.stratostore;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUserLabelData$$JsonObjectMapper extends JsonMapper<JsonUserLabelData>
{
    public static JsonUserLabelData _parse(final qhe qhe) throws IOException {
        final JsonUserLabelData jsonUserLabelData = new JsonUserLabelData();
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
            parseField(jsonUserLabelData, d, qhe);
            qhe.m0();
        }
        return jsonUserLabelData;
    }
    
    public static void _serialize(final JsonUserLabelData jsonUserLabelData, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonUserLabelData.a != null) {
            LoganSquare.typeConverterFor((Class)mew.class).serialize((Object)jsonUserLabelData.a, "label", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonUserLabelData jsonUserLabelData, final String s, final qhe qhe) throws IOException {
        if ("label".equals(s)) {
            jsonUserLabelData.a = (mew)LoganSquare.typeConverterFor((Class)mew.class).parse(qhe);
        }
    }
    
    public JsonUserLabelData parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonUserLabelData jsonUserLabelData, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonUserLabelData, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonUserLabelData)o, yfe, b);
    }
}
