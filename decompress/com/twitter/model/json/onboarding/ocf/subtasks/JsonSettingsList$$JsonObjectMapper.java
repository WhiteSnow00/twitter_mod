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
    public static JsonSettingsList _parse(final khe khe) throws IOException {
        final JsonSettingsList list = new JsonSettingsList();
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
            parseField(list, d, khe);
            khe.m0();
        }
        return list;
    }
    
    public static void _serialize(final JsonSettingsList list, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (list.l != null) {
            tfe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(list.l, tfe, true);
        }
        if (list.g != null) {
            tfe.i("detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(list.g, tfe, true);
        }
        if (list.j != null) {
            LoganSquare.typeConverterFor((Class)iej.class).serialize((Object)list.j, "header", true, tfe);
        }
        tfe.e("is_bottom_bar_alignment_vertical", list.m);
        if (list.e != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)list.e, "next_link", true, tfe);
        }
        if (list.k != null) {
            LoganSquare.typeConverterFor((Class)s3a.class).serialize((Object)list.k, "next_link_enable_condition", true, tfe);
        }
        if (list.a != null) {
            tfe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(list.a, tfe, true);
        }
        tfe.u0("scroll_hint", list.c);
        if (list.b != null) {
            tfe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(list.b, tfe, true);
        }
        final ArrayList d = list.d;
        if (d != null) {
            final Iterator g = q1a.g(tfe, "settings", d);
            while (g.hasNext()) {
                final fqp fqp = g.next();
                if (fqp != null) {
                    LoganSquare.typeConverterFor((Class)fqp.class).serialize((Object)fqp, "lslocalsettingsElement", false, tfe);
                }
            }
            tfe.f();
        }
        tfe.e("show_divider", list.i);
        if (list.h != null) {
            LoganSquare.typeConverterFor((Class)ioh.class).serialize((Object)list.h, "show_more", true, tfe);
        }
        if (list.f != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)list.f, "skip_link", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonSettingsList list, final String s, final khe khe) throws IOException {
        if ("component_collection".equals(s)) {
            list.l = JsonOcfComponentCollection$$JsonObjectMapper._parse(khe);
        }
        else if ("detail_text".equals(s)) {
            list.g = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("header".equals(s)) {
            list.j = (iej)LoganSquare.typeConverterFor((Class)iej.class).parse(khe);
        }
        else if ("is_bottom_bar_alignment_vertical".equals(s)) {
            list.m = khe.k();
        }
        else if ("next_link".equals(s)) {
            list.e = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("next_link_enable_condition".equals(s)) {
            list.k = (s3a)LoganSquare.typeConverterFor((Class)s3a.class).parse(khe);
        }
        else if ("primary_text".equals(s)) {
            list.a = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("scroll_hint".equals(s)) {
            list.c = khe.T((String)null);
        }
        else if ("secondary_text".equals(s)) {
            list.b = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("settings".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList d = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final fqp fqp = (fqp)LoganSquare.typeConverterFor((Class)fqp.class).parse(khe);
                    if (fqp != null) {
                        d.add(fqp);
                    }
                }
                list.d = d;
            }
            else {
                list.d = null;
            }
        }
        else if ("show_divider".equals(s)) {
            list.i = khe.k();
        }
        else if ("show_more".equals(s)) {
            list.h = (ioh)LoganSquare.typeConverterFor((Class)ioh.class).parse(khe);
        }
        else if ("skip_link".equals(s)) {
            list.f = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
    }
    
    public JsonSettingsList parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonSettingsList list, final tfe tfe, final boolean b) throws IOException {
        _serialize(list, tfe, b);
    }
}
