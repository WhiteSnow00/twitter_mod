// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.people;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonProfileRecommendationModuleResponse$$JsonObjectMapper extends JsonMapper<JsonProfileRecommendationModuleResponse>
{
    public static final sib FOLLOW_MODULE_STYLE_TYPE_CONVERTER;
    
    static {
        FOLLOW_MODULE_STYLE_TYPE_CONVERTER = new sib();
    }
    
    public static JsonProfileRecommendationModuleResponse _parse(final qhe qhe) throws IOException {
        final JsonProfileRecommendationModuleResponse jsonProfileRecommendationModuleResponse = new JsonProfileRecommendationModuleResponse();
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
            parseField(jsonProfileRecommendationModuleResponse, d, qhe);
            qhe.m0();
        }
        return jsonProfileRecommendationModuleResponse;
    }
    
    public static void _serialize(final JsonProfileRecommendationModuleResponse jsonProfileRecommendationModuleResponse, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final ArrayList d = jsonProfileRecommendationModuleResponse.d;
        if (d != null) {
            final Iterator e = d10.E(yfe, "recommended_users", d);
            while (e.hasNext()) {
                final qgv qgv = e.next();
                if (qgv != null) {
                    LoganSquare.typeConverterFor((Class)qgv.class).serialize((Object)qgv, "lslocalrecommended_usersElement", false, yfe);
                }
            }
            yfe.f();
        }
        yfe.e("show_user_dismiss", jsonProfileRecommendationModuleResponse.e);
        final String a = jsonProfileRecommendationModuleResponse.a;
        if (a != null) {
            ((StringBasedTypeConverter)JsonProfileRecommendationModuleResponse$$JsonObjectMapper.FOLLOW_MODULE_STYLE_TYPE_CONVERTER).serialize((Object)a, "style", true, yfe);
        }
        if (jsonProfileRecommendationModuleResponse.c != null) {
            LoganSquare.typeConverterFor((Class)fym.class).serialize((Object)jsonProfileRecommendationModuleResponse.c, "subtitle", true, yfe);
        }
        if (jsonProfileRecommendationModuleResponse.b != null) {
            LoganSquare.typeConverterFor((Class)fym.class).serialize((Object)jsonProfileRecommendationModuleResponse.b, "title", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonProfileRecommendationModuleResponse jsonProfileRecommendationModuleResponse, final String s, final qhe qhe) throws IOException {
        if ("recommended_users".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList d = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final qgv qgv = (qgv)LoganSquare.typeConverterFor((Class)qgv.class).parse(qhe);
                    if (qgv != null) {
                        d.add(qgv);
                    }
                }
                jsonProfileRecommendationModuleResponse.d = d;
            }
            else {
                jsonProfileRecommendationModuleResponse.d = null;
            }
        }
        else if ("show_user_dismiss".equals(s)) {
            jsonProfileRecommendationModuleResponse.e = qhe.l();
        }
        else if ("style".equals(s)) {
            jsonProfileRecommendationModuleResponse.a = (String)((StringBasedTypeConverter)JsonProfileRecommendationModuleResponse$$JsonObjectMapper.FOLLOW_MODULE_STYLE_TYPE_CONVERTER).parse(qhe);
        }
        else if ("subtitle".equals(s)) {
            jsonProfileRecommendationModuleResponse.c = (fym)LoganSquare.typeConverterFor((Class)fym.class).parse(qhe);
        }
        else if ("title".equals(s)) {
            jsonProfileRecommendationModuleResponse.b = (fym)LoganSquare.typeConverterFor((Class)fym.class).parse(qhe);
        }
    }
    
    public JsonProfileRecommendationModuleResponse parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonProfileRecommendationModuleResponse jsonProfileRecommendationModuleResponse, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonProfileRecommendationModuleResponse, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonProfileRecommendationModuleResponse)o, yfe, b);
    }
}
