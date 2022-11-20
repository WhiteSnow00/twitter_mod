// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSettingsList$$JsonObjectMapper extends JsonMapper<JsonSettingsList>
{
    public static JsonSettingsList _parse(final tge tge) throws IOException {
        final JsonSettingsList list = new JsonSettingsList();
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
            parseField(list, d, tge);
            tge.l0();
        }
        return list;
    }
    
    public static void _serialize(final JsonSettingsList list, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (list.l != null) {
            afe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(list.l, afe, true);
        }
        if (list.g != null) {
            afe.i("detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(list.g, afe, true);
        }
        if (list.j != null) {
            LoganSquare.typeConverterFor((Class)oej.class).serialize((Object)list.j, "header", true, afe);
        }
        afe.e("is_bottom_bar_alignment_vertical", list.m);
        if (list.e != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)list.e, "next_link", true, afe);
        }
        if (list.k != null) {
            LoganSquare.typeConverterFor((Class)c3a.class).serialize((Object)list.k, "next_link_enable_condition", true, afe);
        }
        if (list.a != null) {
            afe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(list.a, afe, true);
        }
        afe.t0("scroll_hint", list.c);
        if (list.b != null) {
            afe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(list.b, afe, true);
        }
        final ArrayList d = list.d;
        if (d != null) {
            final Iterator a = br.A(afe, "settings", d);
            while (a.hasNext()) {
                final wqp wqp = a.next();
                if (wqp != null) {
                    LoganSquare.typeConverterFor((Class)wqp.class).serialize((Object)wqp, "lslocalsettingsElement", false, afe);
                }
            }
            afe.f();
        }
        afe.e("show_divider", list.i);
        if (list.h != null) {
            LoganSquare.typeConverterFor((Class)noh.class).serialize((Object)list.h, "show_more", true, afe);
        }
        if (list.f != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)list.f, "skip_link", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonSettingsList list, final String s, final tge tge) throws IOException {
        if ("component_collection".equals(s)) {
            list.l = JsonOcfComponentCollection$$JsonObjectMapper._parse(tge);
        }
        else if ("detail_text".equals(s)) {
            list.g = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("header".equals(s)) {
            list.j = (oej)LoganSquare.typeConverterFor((Class)oej.class).parse(tge);
        }
        else if ("is_bottom_bar_alignment_vertical".equals(s)) {
            list.m = tge.k();
        }
        else if ("next_link".equals(s)) {
            list.e = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("next_link_enable_condition".equals(s)) {
            list.k = (c3a)LoganSquare.typeConverterFor((Class)c3a.class).parse(tge);
        }
        else if ("primary_text".equals(s)) {
            list.a = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("scroll_hint".equals(s)) {
            list.c = tge.T((String)null);
        }
        else if ("secondary_text".equals(s)) {
            list.b = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("settings".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList d = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final wqp wqp = (wqp)LoganSquare.typeConverterFor((Class)wqp.class).parse(tge);
                    if (wqp != null) {
                        d.add(wqp);
                    }
                }
                list.d = d;
            }
            else {
                list.d = null;
            }
        }
        else if ("show_divider".equals(s)) {
            list.i = tge.k();
        }
        else if ("show_more".equals(s)) {
            list.h = (noh)LoganSquare.typeConverterFor((Class)noh.class).parse(tge);
        }
        else if ("skip_link".equals(s)) {
            list.f = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
    }
    
    public JsonSettingsList parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonSettingsList list, final afe afe, final boolean b) throws IOException {
        _serialize(list, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonSettingsList)o, afe, b);
    }
}
