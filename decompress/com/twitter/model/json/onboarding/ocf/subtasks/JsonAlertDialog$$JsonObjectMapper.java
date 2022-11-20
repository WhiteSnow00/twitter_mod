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
    public static JsonAlertDialog _parse(final tge tge) throws IOException {
        final JsonAlertDialog jsonAlertDialog = new JsonAlertDialog();
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
            parseField(jsonAlertDialog, d, tge);
            tge.l0();
        }
        return jsonAlertDialog;
    }
    
    public static void _serialize(final JsonAlertDialog jsonAlertDialog, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonAlertDialog.d != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonAlertDialog.d, "cancel_link", true, afe);
        }
        if (jsonAlertDialog.f != null) {
            afe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonAlertDialog.f, afe, true);
        }
        if (jsonAlertDialog.e != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonAlertDialog.e, "dismiss_link", true, afe);
        }
        if (jsonAlertDialog.c != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonAlertDialog.c, "next_link", true, afe);
        }
        if (jsonAlertDialog.a != null) {
            afe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonAlertDialog.a, afe, true);
        }
        if (jsonAlertDialog.b != null) {
            afe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonAlertDialog.b, afe, true);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonAlertDialog jsonAlertDialog, final String s, final tge tge) throws IOException {
        if ("cancel_link".equals(s)) {
            jsonAlertDialog.d = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("component_collection".equals(s)) {
            jsonAlertDialog.f = JsonOcfComponentCollection$$JsonObjectMapper._parse(tge);
        }
        else if ("dismiss_link".equals(s)) {
            jsonAlertDialog.e = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("next_link".equals(s)) {
            jsonAlertDialog.c = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("primary_text".equals(s)) {
            jsonAlertDialog.a = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("secondary_text".equals(s)) {
            jsonAlertDialog.b = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
    }
    
    public JsonAlertDialog parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonAlertDialog jsonAlertDialog, final afe afe, final boolean b) throws IOException {
        _serialize(jsonAlertDialog, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonAlertDialog)o, afe, b);
    }
}
