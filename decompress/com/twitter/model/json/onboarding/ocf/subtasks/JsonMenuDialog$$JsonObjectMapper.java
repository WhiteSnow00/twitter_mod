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
    public static JsonMenuDialog _parse(final khe khe) throws IOException {
        final JsonMenuDialog jsonMenuDialog = new JsonMenuDialog();
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
            parseField(jsonMenuDialog, d, khe);
            khe.m0();
        }
        return jsonMenuDialog;
    }
    
    public static void _serialize(final JsonMenuDialog jsonMenuDialog, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonMenuDialog.d != null) {
            tfe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonMenuDialog.d, tfe, true);
        }
        if (jsonMenuDialog.c != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonMenuDialog.c, "dismiss_link", true, tfe);
        }
        final ArrayList b2 = jsonMenuDialog.b;
        if (b2 != null) {
            final Iterator g = q1a.g(tfe, "primary_action_links", b2);
            while (g.hasNext()) {
                final xrv xrv = g.next();
                if (xrv != null) {
                    LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)xrv, "lslocalprimary_action_linksElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (jsonMenuDialog.a != null) {
            tfe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonMenuDialog.a, tfe, true);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonMenuDialog jsonMenuDialog, final String s, final khe khe) throws IOException {
        if ("component_collection".equals(s)) {
            jsonMenuDialog.d = JsonOcfComponentCollection$$JsonObjectMapper._parse(khe);
        }
        else if ("dismiss_link".equals(s)) {
            jsonMenuDialog.c = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("primary_action_links".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList b = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final xrv xrv = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
                    if (xrv != null) {
                        b.add(xrv);
                    }
                }
                jsonMenuDialog.b = b;
            }
            else {
                jsonMenuDialog.b = null;
            }
        }
        else if ("primary_text".equals(s)) {
            jsonMenuDialog.a = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
    }
    
    public JsonMenuDialog parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonMenuDialog jsonMenuDialog, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonMenuDialog, tfe, b);
    }
}
