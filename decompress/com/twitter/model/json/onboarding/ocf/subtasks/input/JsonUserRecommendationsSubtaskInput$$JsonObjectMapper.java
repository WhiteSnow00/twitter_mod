// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks.input;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUserRecommendationsSubtaskInput$$JsonObjectMapper extends JsonMapper<JsonUserRecommendationsSubtaskInput>
{
    public static JsonUserRecommendationsSubtaskInput _parse(final qhe qhe) throws IOException {
        final JsonUserRecommendationsSubtaskInput jsonUserRecommendationsSubtaskInput = new JsonUserRecommendationsSubtaskInput();
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
            parseField(jsonUserRecommendationsSubtaskInput, d, qhe);
            qhe.m0();
        }
        return jsonUserRecommendationsSubtaskInput;
    }
    
    public static void _serialize(final JsonUserRecommendationsSubtaskInput jsonUserRecommendationsSubtaskInput, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final Set c = jsonUserRecommendationsSubtaskInput.c;
        if (c != null) {
            yfe.i("impressions");
            yfe.q0();
            final Iterator iterator = c.iterator();
            while (iterator.hasNext()) {
                yfe.r((long)iterator.next());
            }
            yfe.f();
        }
        final Map d = jsonUserRecommendationsSubtaskInput.d;
        if (d != null) {
            yfe.i("linger_times_ms");
            yfe.r0();
            for (final Map.Entry<String, V> entry : d.entrySet()) {
                if (qee.r((String)entry.getKey(), yfe, (Map.Entry)entry) == null) {
                    yfe.j();
                }
                else {
                    yfe.q((int)entry.getValue());
                }
            }
            yfe.h();
        }
        final Set b2 = jsonUserRecommendationsSubtaskInput.b;
        if (b2 != null) {
            yfe.i("selected_user_recommendations");
            yfe.q0();
            final Iterator iterator3 = b2.iterator();
            while (iterator3.hasNext()) {
                yfe.r((long)iterator3.next());
            }
            yfe.f();
        }
        JsonDefaultSubtaskInput$$JsonObjectMapper._serialize((JsonDefaultSubtaskInput)jsonUserRecommendationsSubtaskInput, yfe, false);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonUserRecommendationsSubtaskInput jsonUserRecommendationsSubtaskInput, final String s, final qhe qhe) throws IOException {
        if ("impressions".equals(s)) {
            if (qhe.e() == rje.P0) {
                final HashSet c = new HashSet();
                while (qhe.i0() != rje.Q0) {
                    Long value;
                    if (qhe.e() == rje.X0) {
                        value = null;
                    }
                    else {
                        value = qhe.L();
                    }
                    if (value != null) {
                        c.add(value);
                    }
                }
                jsonUserRecommendationsSubtaskInput.c = c;
            }
            else {
                jsonUserRecommendationsSubtaskInput.c = null;
            }
        }
        else if ("linger_times_ms".equals(s)) {
            if (qhe.e() == rje.N0) {
                final HashMap d = new HashMap();
                while (qhe.i0() != rje.O0) {
                    final String j = qhe.j();
                    qhe.i0();
                    final rje e = qhe.e();
                    final rje x0 = rje.X0;
                    if (e == x0) {
                        d.put(j, null);
                    }
                    else {
                        Integer value2;
                        if (qhe.e() == x0) {
                            value2 = null;
                        }
                        else {
                            value2 = qhe.z();
                        }
                        d.put(j, value2);
                    }
                }
                jsonUserRecommendationsSubtaskInput.d = d;
            }
            else {
                jsonUserRecommendationsSubtaskInput.d = null;
            }
        }
        else if ("selected_user_recommendations".equals(s)) {
            if (qhe.e() == rje.P0) {
                final HashSet b = new HashSet();
                while (qhe.i0() != rje.Q0) {
                    Long value3;
                    if (qhe.e() == rje.X0) {
                        value3 = null;
                    }
                    else {
                        value3 = qhe.L();
                    }
                    if (value3 != null) {
                        b.add(value3);
                    }
                }
                jsonUserRecommendationsSubtaskInput.b = b;
            }
            else {
                jsonUserRecommendationsSubtaskInput.b = null;
            }
        }
        else {
            JsonDefaultSubtaskInput$$JsonObjectMapper.parseField((JsonDefaultSubtaskInput)jsonUserRecommendationsSubtaskInput, s, qhe);
        }
    }
    
    public JsonUserRecommendationsSubtaskInput parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonUserRecommendationsSubtaskInput jsonUserRecommendationsSubtaskInput, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonUserRecommendationsSubtaskInput, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonUserRecommendationsSubtaskInput)o, yfe, b);
    }
}
