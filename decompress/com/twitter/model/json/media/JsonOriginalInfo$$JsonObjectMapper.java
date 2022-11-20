// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media;

import java.util.ArrayList;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOriginalInfo$$JsonObjectMapper extends JsonMapper<JsonOriginalInfo>
{
    public static JsonOriginalInfo _parse(final tge tge) throws IOException {
        final JsonOriginalInfo jsonOriginalInfo = new JsonOriginalInfo();
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
            parseField(jsonOriginalInfo, d, tge);
            tge.l0();
        }
        return jsonOriginalInfo;
    }
    
    public static void _serialize(final JsonOriginalInfo jsonOriginalInfo, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonOriginalInfo.e != null) {
            afe.i("focus_rect");
            JsonRect$$JsonObjectMapper._serialize(jsonOriginalInfo.e, afe, true);
        }
        final JsonRect[] d = jsonOriginalInfo.d;
        if (d != null) {
            afe.i("focus_rects");
            afe.p0();
            for (final JsonRect jsonRect : d) {
                if (jsonRect != null) {
                    JsonRect$$JsonObjectMapper._serialize(jsonRect, afe, true);
                }
            }
            afe.f();
        }
        afe.T("height", jsonOriginalInfo.c);
        afe.t0("url", jsonOriginalInfo.a);
        afe.T("width", jsonOriginalInfo.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonOriginalInfo jsonOriginalInfo, final String s, final tge tge) throws IOException {
        if ("focus_rect".equals(s)) {
            jsonOriginalInfo.e = JsonRect$$JsonObjectMapper._parse(tge);
        }
        else if ("focus_rects".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList list = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final JsonRect parse = JsonRect$$JsonObjectMapper._parse(tge);
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
            jsonOriginalInfo.c = tge.y();
        }
        else if ("url".equals(s)) {
            jsonOriginalInfo.a = tge.T((String)null);
        }
        else if ("width".equals(s)) {
            jsonOriginalInfo.b = tge.y();
        }
    }
    
    public JsonOriginalInfo parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonOriginalInfo jsonOriginalInfo, final afe afe, final boolean b) throws IOException {
        _serialize(jsonOriginalInfo, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonOriginalInfo)o, afe, b);
    }
}
