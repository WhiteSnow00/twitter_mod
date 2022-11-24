// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.safety;

import java.util.List;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSafetyModePreviewResponse$$JsonObjectMapper extends JsonMapper<JsonSafetyModePreviewResponse>
{
    public static final eie JSON_PROFILE_IMAGE_URL_LIST_TYPE_CONVERTER;
    
    static {
        JSON_PROFILE_IMAGE_URL_LIST_TYPE_CONVERTER = new eie();
    }
    
    public static JsonSafetyModePreviewResponse _parse(final qhe qhe) throws IOException {
        final JsonSafetyModePreviewResponse jsonSafetyModePreviewResponse = new JsonSafetyModePreviewResponse();
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
            parseField(jsonSafetyModePreviewResponse, d, qhe);
            qhe.m0();
        }
        return jsonSafetyModePreviewResponse;
    }
    
    public static void _serialize(final JsonSafetyModePreviewResponse jsonSafetyModePreviewResponse, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.W("count", (long)jsonSafetyModePreviewResponse.a);
        final List b2 = jsonSafetyModePreviewResponse.b;
        if (b2 != null) {
            ((xmf)JsonSafetyModePreviewResponse$$JsonObjectMapper.JSON_PROFILE_IMAGE_URL_LIST_TYPE_CONVERTER).b(b2, "users_results", yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSafetyModePreviewResponse jsonSafetyModePreviewResponse, final String s, final qhe qhe) throws IOException {
        if ("count".equals(s)) {
            Long value;
            if (qhe.e() == rje.X0) {
                value = null;
            }
            else {
                value = qhe.L();
            }
            jsonSafetyModePreviewResponse.a = value;
        }
        else if ("users_results".equals(s)) {
            jsonSafetyModePreviewResponse.b = ((xmf)JsonSafetyModePreviewResponse$$JsonObjectMapper.JSON_PROFILE_IMAGE_URL_LIST_TYPE_CONVERTER).a(qhe);
        }
    }
    
    public JsonSafetyModePreviewResponse parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSafetyModePreviewResponse jsonSafetyModePreviewResponse, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonSafetyModePreviewResponse, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSafetyModePreviewResponse)o, yfe, b);
    }
}
