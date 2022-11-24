// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.revenue.brandsurvey;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonBrandSurveyAnswers$$JsonObjectMapper extends JsonMapper<JsonBrandSurveyAnswers>
{
    public static JsonBrandSurveyAnswers _parse(final qhe qhe) throws IOException {
        final JsonBrandSurveyAnswers jsonBrandSurveyAnswers = new JsonBrandSurveyAnswers();
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
            parseField(jsonBrandSurveyAnswers, d, qhe);
            qhe.m0();
        }
        return jsonBrandSurveyAnswers;
    }
    
    public static void _serialize(final JsonBrandSurveyAnswers jsonBrandSurveyAnswers, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final List<List<Integer>> a = jsonBrandSurveyAnswers.a;
        if (a != null) {
            final Iterator o = ffe.o(yfe, "answers", a);
            while (o.hasNext()) {
                final List list = o.next();
                if (list != null) {
                    yfe.q0();
                    final Iterator iterator = list.iterator();
                    while (iterator.hasNext()) {
                        yfe.q((int)iterator.next());
                    }
                    yfe.f();
                }
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonBrandSurveyAnswers jsonBrandSurveyAnswers, final String s, final qhe qhe) throws IOException {
        if ("answers".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList a = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    Object o;
                    if (qhe.e() == rje.P0) {
                        final ArrayList<Integer> list = new ArrayList<Integer>();
                        while (true) {
                            o = list;
                            if (qhe.i0() == rje.Q0) {
                                break;
                            }
                            Integer value;
                            if (qhe.e() == rje.X0) {
                                value = null;
                            }
                            else {
                                value = qhe.z();
                            }
                            if (value == null) {
                                continue;
                            }
                            list.add(value);
                        }
                    }
                    else {
                        o = null;
                    }
                    if (o != null) {
                        a.add(o);
                    }
                }
                jsonBrandSurveyAnswers.a = a;
            }
            else {
                jsonBrandSurveyAnswers.a = null;
            }
        }
    }
    
    public JsonBrandSurveyAnswers parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonBrandSurveyAnswers jsonBrandSurveyAnswers, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonBrandSurveyAnswers, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonBrandSurveyAnswers)o, yfe, b);
    }
}
