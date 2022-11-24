// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.util.Map;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonClickTrackingInfo$$JsonObjectMapper extends JsonMapper<JsonClickTrackingInfo>
{
    public static final fe4 CLICK_TRACKING_URL_OVERRIDE_TYPE_CONVERTER;
    public static final JsonClickTrackingInfo$a URL_PARAMS_MAP_CONVERTER;
    
    static {
        URL_PARAMS_MAP_CONVERTER = new JsonClickTrackingInfo$a();
        CLICK_TRACKING_URL_OVERRIDE_TYPE_CONVERTER = new fe4();
    }
    
    public static JsonClickTrackingInfo _parse(final qhe qhe) throws IOException {
        final JsonClickTrackingInfo jsonClickTrackingInfo = new JsonClickTrackingInfo();
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
            parseField(jsonClickTrackingInfo, d, qhe);
            qhe.m0();
        }
        return jsonClickTrackingInfo;
    }
    
    public static void _serialize(final JsonClickTrackingInfo jsonClickTrackingInfo, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("urlOverride", jsonClickTrackingInfo.b);
        final String c = jsonClickTrackingInfo.c;
        if (c != null) {
            ((StringBasedTypeConverter)JsonClickTrackingInfo$$JsonObjectMapper.CLICK_TRACKING_URL_OVERRIDE_TYPE_CONVERTER).serialize((Object)c, "urlOverrideType", true, yfe);
        }
        final Map a = jsonClickTrackingInfo.a;
        if (a == null) {
            if (b) {
                yfe.h();
            }
            return;
        }
        ((nxj)JsonClickTrackingInfo$$JsonObjectMapper.URL_PARAMS_MAP_CONVERTER).serialize((Object)a, "urlParams", true, yfe);
        throw null;
    }
    
    public static void parseField(final JsonClickTrackingInfo jsonClickTrackingInfo, final String s, final qhe qhe) throws IOException {
        if ("urlOverride".equals(s)) {
            jsonClickTrackingInfo.b = qhe.T((String)null);
        }
        else if ("urlOverrideType".equals(s)) {
            jsonClickTrackingInfo.c = (String)((StringBasedTypeConverter)JsonClickTrackingInfo$$JsonObjectMapper.CLICK_TRACKING_URL_OVERRIDE_TYPE_CONVERTER).parse(qhe);
        }
        else if ("urlParams".equals(s)) {
            jsonClickTrackingInfo.a = ((dlg)JsonClickTrackingInfo$$JsonObjectMapper.URL_PARAMS_MAP_CONVERTER).a(qhe);
        }
    }
    
    public JsonClickTrackingInfo parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonClickTrackingInfo jsonClickTrackingInfo, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonClickTrackingInfo, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonClickTrackingInfo)o, yfe, b);
    }
}
