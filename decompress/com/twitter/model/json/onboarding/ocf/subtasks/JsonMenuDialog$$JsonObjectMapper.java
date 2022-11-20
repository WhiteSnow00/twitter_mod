// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import java.util.Iterator;
import java.util.ArrayList;
import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMenuDialog$$JsonObjectMapper extends JsonMapper<JsonMenuDialog>
{
    public static JsonMenuDialog _parse(final tge tge) throws IOException {
        final JsonMenuDialog jsonMenuDialog = new JsonMenuDialog();
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
            parseField(jsonMenuDialog, d, tge);
            tge.l0();
        }
        return jsonMenuDialog;
    }
    
    public static void _serialize(final JsonMenuDialog jsonMenuDialog, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonMenuDialog.d != null) {
            afe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonMenuDialog.d, afe, true);
        }
        if (jsonMenuDialog.c != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonMenuDialog.c, "dismiss_link", true, afe);
        }
        final ArrayList b2 = jsonMenuDialog.b;
        if (b2 != null) {
            final Iterator a = br.A(afe, "primary_action_links", b2);
            while (a.hasNext()) {
                final ssv ssv = a.next();
                if (ssv != null) {
                    LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)ssv, "lslocalprimary_action_linksElement", false, afe);
                }
            }
            afe.f();
        }
        if (jsonMenuDialog.a != null) {
            afe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonMenuDialog.a, afe, true);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonMenuDialog jsonMenuDialog, final String s, final tge tge) throws IOException {
        if ("component_collection".equals(s)) {
            jsonMenuDialog.d = JsonOcfComponentCollection$$JsonObjectMapper._parse(tge);
        }
        else if ("dismiss_link".equals(s)) {
            jsonMenuDialog.c = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("primary_action_links".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList b = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final ssv ssv = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
                    if (ssv != null) {
                        b.add(ssv);
                    }
                }
                jsonMenuDialog.b = b;
            }
            else {
                jsonMenuDialog.b = null;
            }
        }
        else if ("primary_text".equals(s)) {
            jsonMenuDialog.a = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
    }
    
    public JsonMenuDialog parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonMenuDialog jsonMenuDialog, final afe afe, final boolean b) throws IOException {
        _serialize(jsonMenuDialog, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonMenuDialog)o, afe, b);
    }
}
