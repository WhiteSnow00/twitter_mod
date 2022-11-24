// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import java.util.Iterator;
import java.util.ArrayList;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonArticleNudgeDomainsResponse$$JsonObjectMapper extends JsonMapper<JsonArticleNudgeDomainsResponse>
{
    public static JsonArticleNudgeDomainsResponse _parse(final qhe qhe) throws IOException {
        final JsonArticleNudgeDomainsResponse jsonArticleNudgeDomainsResponse = new JsonArticleNudgeDomainsResponse();
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
            parseField(jsonArticleNudgeDomainsResponse, d, qhe);
            qhe.m0();
        }
        return jsonArticleNudgeDomainsResponse;
    }
    
    public static void _serialize(final JsonArticleNudgeDomainsResponse jsonArticleNudgeDomainsResponse, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final ArrayList a = jsonArticleNudgeDomainsResponse.a;
        if (a != null) {
            final Iterator e = d10.E(yfe, "article_nudge_domains", a);
            while (e.hasNext()) {
                yfe.s0((String)e.next());
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonArticleNudgeDomainsResponse jsonArticleNudgeDomainsResponse, final String s, final qhe qhe) throws IOException {
        if ("article_nudge_domains".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList a = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final String t = qhe.T((String)null);
                    if (t != null) {
                        a.add(t);
                    }
                }
                jsonArticleNudgeDomainsResponse.a = a;
            }
            else {
                jsonArticleNudgeDomainsResponse.a = null;
            }
        }
    }
    
    public JsonArticleNudgeDomainsResponse parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonArticleNudgeDomainsResponse jsonArticleNudgeDomainsResponse, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonArticleNudgeDomainsResponse, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonArticleNudgeDomainsResponse)o, yfe, b);
    }
}
