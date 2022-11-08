// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection$$JsonObjectMapper;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAlertDialog$$JsonObjectMapper extends JsonMapper<JsonAlertDialog>
{
    public static JsonAlertDialog _parse(final khe khe) throws IOException {
        final JsonAlertDialog jsonAlertDialog = new JsonAlertDialog();
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
            parseField(jsonAlertDialog, d, khe);
            khe.m0();
        }
        return jsonAlertDialog;
    }
    
    public static void _serialize(final JsonAlertDialog jsonAlertDialog, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonAlertDialog.d != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonAlertDialog.d, "cancel_link", true, tfe);
        }
        if (jsonAlertDialog.f != null) {
            tfe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonAlertDialog.f, tfe, true);
        }
        if (jsonAlertDialog.e != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonAlertDialog.e, "dismiss_link", true, tfe);
        }
        if (jsonAlertDialog.c != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonAlertDialog.c, "next_link", true, tfe);
        }
        if (jsonAlertDialog.a != null) {
            tfe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonAlertDialog.a, tfe, true);
        }
        if (jsonAlertDialog.b != null) {
            tfe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonAlertDialog.b, tfe, true);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonAlertDialog jsonAlertDialog, final String s, final khe khe) throws IOException {
        if ("cancel_link".equals(s)) {
            jsonAlertDialog.d = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("component_collection".equals(s)) {
            jsonAlertDialog.f = JsonOcfComponentCollection$$JsonObjectMapper._parse(khe);
        }
        else if ("dismiss_link".equals(s)) {
            jsonAlertDialog.e = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("next_link".equals(s)) {
            jsonAlertDialog.c = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("primary_text".equals(s)) {
            jsonAlertDialog.a = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("secondary_text".equals(s)) {
            jsonAlertDialog.b = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
    }
    
    public JsonAlertDialog parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonAlertDialog jsonAlertDialog, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonAlertDialog, tfe, b);
    }
}
