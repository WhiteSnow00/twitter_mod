// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMoment$$JsonObjectMapper extends JsonMapper<JsonMoment>
{
    public static JsonMoment _parse(final khe khe) throws IOException {
        final JsonMoment jsonMoment = new JsonMoment();
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
            parseField(jsonMoment, d, khe);
            khe.m0();
        }
        return jsonMoment;
    }
    
    public static void _serialize(final JsonMoment jsonMoment, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonMoment.m != null) {
            LoganSquare.typeConverterFor((Class)z51.class).serialize((Object)jsonMoment.m, "author", true, tfe);
        }
        tfe.e("can_subscribe", jsonMoment.i);
        tfe.W("capsule_contents_version", jsonMoment.p);
        if (jsonMoment.u != null) {
            tfe.i("cover_media");
            JsonMomentCoverMedia$$JsonObjectMapper._serialize(jsonMoment.u, tfe, true);
        }
        if (jsonMoment.v != null) {
            LoganSquare.typeConverterFor((Class)l73.class).serialize((Object)jsonMoment.v, "cta", true, tfe);
        }
        if (jsonMoment.r != null) {
            LoganSquare.typeConverterFor((Class)w87.class).serialize((Object)jsonMoment.r, "curation_metadata", true, tfe);
        }
        tfe.u0("description", jsonMoment.c);
        tfe.u0("duration_string", jsonMoment.h);
        if (jsonMoment.o != null) {
            LoganSquare.typeConverterFor((Class)aca.class).serialize((Object)jsonMoment.o, "event", true, tfe);
        }
        tfe.W("id", jsonMoment.a);
        tfe.e("is_liked", jsonMoment.s);
        tfe.e("is_live", jsonMoment.d);
        tfe.e("sensitive", jsonMoment.e);
        tfe.e("is_subscribed", jsonMoment.j);
        if (jsonMoment.x != null) {
            LoganSquare.typeConverterFor((Class)noh.class).serialize((Object)jsonMoment.x, "moment_access", true, tfe);
        }
        tfe.T("num_subscribers", jsonMoment.k);
        if (jsonMoment.n != null) {
            LoganSquare.typeConverterFor((Class)hil.class).serialize((Object)jsonMoment.n, "promoted_content", true, tfe);
        }
        if (jsonMoment.w != null) {
            LoganSquare.typeConverterFor((Class)hph.class).serialize((Object)jsonMoment.w, "sports_event_data", true, tfe);
        }
        tfe.u0("subcategory_string", jsonMoment.f);
        tfe.u0("time_string", jsonMoment.g);
        tfe.u0("title", jsonMoment.b);
        tfe.W("total_likes", jsonMoment.t);
        tfe.u0("url", jsonMoment.l);
        final HashMap q = jsonMoment.q;
        if (q != null) {
            final Iterator h = q1a.h(tfe, "users", q);
            while (h.hasNext()) {
                final Map.Entry<String, hfv> entry = h.next();
                if (o1a.g((String)entry.getKey(), tfe, (Map.Entry)entry) == null) {
                    tfe.j();
                }
                else {
                    if (entry.getValue() == null) {
                        continue;
                    }
                    LoganSquare.typeConverterFor((Class)hfv.class).serialize((Object)entry.getValue(), "lslocalusersElement", false, tfe);
                }
            }
            tfe.h();
        }
        if (jsonMoment.y != null) {
            LoganSquare.typeConverterFor((Class)nph.class).serialize((Object)jsonMoment.y, "visibility_mode", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonMoment jsonMoment, final String s, final khe khe) throws IOException {
        if ("author".equals(s)) {
            jsonMoment.m = (z51)LoganSquare.typeConverterFor((Class)z51.class).parse(khe);
        }
        else if ("can_subscribe".equals(s)) {
            jsonMoment.i = khe.k();
        }
        else if ("capsule_contents_version".equals(s)) {
            jsonMoment.p = khe.L();
        }
        else if ("cover_media".equals(s)) {
            jsonMoment.u = JsonMomentCoverMedia$$JsonObjectMapper._parse(khe);
        }
        else if ("cta".equals(s)) {
            jsonMoment.v = (l73)LoganSquare.typeConverterFor((Class)l73.class).parse(khe);
        }
        else if ("curation_metadata".equals(s)) {
            jsonMoment.r = (w87)LoganSquare.typeConverterFor((Class)w87.class).parse(khe);
        }
        else if ("description".equals(s)) {
            jsonMoment.c = khe.T((String)null);
        }
        else if ("duration_string".equals(s)) {
            jsonMoment.h = khe.T((String)null);
        }
        else if ("event".equals(s)) {
            jsonMoment.o = (aca)LoganSquare.typeConverterFor((Class)aca.class).parse(khe);
        }
        else if ("id".equals(s)) {
            jsonMoment.a = khe.L();
        }
        else if ("is_liked".equals(s)) {
            jsonMoment.s = khe.k();
        }
        else if ("is_live".equals(s)) {
            jsonMoment.d = khe.k();
        }
        else if ("sensitive".equals(s)) {
            jsonMoment.e = khe.k();
        }
        else if ("is_subscribed".equals(s)) {
            jsonMoment.j = khe.k();
        }
        else if ("moment_access".equals(s)) {
            jsonMoment.x = (noh)LoganSquare.typeConverterFor((Class)noh.class).parse(khe);
        }
        else if ("num_subscribers".equals(s)) {
            jsonMoment.k = khe.z();
        }
        else if ("promoted_content".equals(s)) {
            jsonMoment.n = (hil)LoganSquare.typeConverterFor((Class)hil.class).parse(khe);
        }
        else if ("sports_event_data".equals(s)) {
            jsonMoment.w = (hph)LoganSquare.typeConverterFor((Class)hph.class).parse(khe);
        }
        else if ("subcategory_string".equals(s)) {
            jsonMoment.f = khe.T((String)null);
        }
        else if ("time_string".equals(s)) {
            jsonMoment.g = khe.T((String)null);
        }
        else if ("title".equals(s)) {
            jsonMoment.b = khe.T((String)null);
        }
        else if ("total_likes".equals(s)) {
            jsonMoment.t = khe.L();
        }
        else if ("url".equals(s)) {
            jsonMoment.l = khe.T((String)null);
        }
        else if ("users".equals(s)) {
            if (khe.e() == lje.K0) {
                final HashMap q = new HashMap();
                while (khe.i0() != lje.L0) {
                    final String j = khe.j();
                    khe.i0();
                    if (khe.e() == lje.U0) {
                        q.put(j, null);
                    }
                    else {
                        q.put(j, LoganSquare.typeConverterFor((Class)hfv.class).parse(khe));
                    }
                }
                jsonMoment.q = q;
            }
            else {
                jsonMoment.q = null;
            }
        }
        else if ("visibility_mode".equals(s)) {
            jsonMoment.y = (nph)LoganSquare.typeConverterFor((Class)nph.class).parse(khe);
        }
    }
    
    public JsonMoment parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonMoment jsonMoment, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonMoment, tfe, b);
    }
}
