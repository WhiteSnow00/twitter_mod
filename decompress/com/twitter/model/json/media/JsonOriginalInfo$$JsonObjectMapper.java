// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media;

import java.util.ArrayList;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOriginalInfo$$JsonObjectMapper extends JsonMapper<JsonOriginalInfo>
{
    public static JsonOriginalInfo _parse(final khe khe) throws IOException {
        final JsonOriginalInfo jsonOriginalInfo = new JsonOriginalInfo();
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
            parseField(jsonOriginalInfo, d, khe);
            khe.m0();
        }
        return jsonOriginalInfo;
    }
    
    public static void _serialize(final JsonOriginalInfo jsonOriginalInfo, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonOriginalInfo.e != null) {
            tfe.i("focus_rect");
            JsonRect$$JsonObjectMapper._serialize(jsonOriginalInfo.e, tfe, true);
        }
        final JsonRect[] d = jsonOriginalInfo.d;
        if (d != null) {
            tfe.i("focus_rects");
            tfe.q0();
            for (final JsonRect jsonRect : d) {
                if (jsonRect != null) {
                    JsonRect$$JsonObjectMapper._serialize(jsonRect, tfe, true);
                }
            }
            tfe.f();
        }
        tfe.T("height", jsonOriginalInfo.c);
        tfe.u0("url", jsonOriginalInfo.a);
        tfe.T("width", jsonOriginalInfo.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonOriginalInfo jsonOriginalInfo, final String s, final khe khe) throws IOException {
        if ("focus_rect".equals(s)) {
            jsonOriginalInfo.e = JsonRect$$JsonObjectMapper._parse(khe);
        }
        else if ("focus_rects".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList list = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final JsonRect parse = JsonRect$$JsonObjectMapper._parse(khe);
                    if (parse != null) {
                        list.add(parse);
                    }
                }
                jsonOriginalInfo.d = list.toArray(new JsonRect[list.size()]);
            }
            else {
                jsonOriginalInfo.d = null;
            }
        }
        else if ("height".equals(s)) {
            jsonOriginalInfo.c = khe.z();
        }
        else if ("url".equals(s)) {
            jsonOriginalInfo.a = khe.T((String)null);
        }
        else if ("width".equals(s)) {
            jsonOriginalInfo.b = khe.z();
        }
    }
    
    public JsonOriginalInfo parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonOriginalInfo jsonOriginalInfo, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonOriginalInfo, tfe, b);
    }
}
