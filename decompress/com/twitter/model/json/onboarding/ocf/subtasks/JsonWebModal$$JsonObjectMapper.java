// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonWebModal$$JsonObjectMapper extends JsonMapper<JsonWebModal>
{
    public static final flx WEB_MODAL_STYLE_TYPE_CONVERTER;
    
    static {
        WEB_MODAL_STYLE_TYPE_CONVERTER = new flx();
    }
    
    public static JsonWebModal _parse(final khe khe) throws IOException {
        final JsonWebModal jsonWebModal = new JsonWebModal();
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
            parseField(jsonWebModal, d, khe);
            khe.m0();
        }
        return jsonWebModal;
    }
    
    public static void _serialize(final JsonWebModal jsonWebModal, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonWebModal.f != null) {
            tfe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonWebModal.f, tfe, true);
        }
        if (jsonWebModal.e != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonWebModal.e, "fail_link", true, tfe);
        }
        if (jsonWebModal.c != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonWebModal.c, "next_link", true, tfe);
        }
        if (jsonWebModal.d != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonWebModal.d, "skip_link", true, tfe);
        }
        final elx b2 = jsonWebModal.b;
        if (b2 != null) {
            ((StringBasedTypeConverter)JsonWebModal$$JsonObjectMapper.WEB_MODAL_STYLE_TYPE_CONVERTER).serialize((Object)b2, "style", true, tfe);
        }
        tfe.u0("url", jsonWebModal.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonWebModal jsonWebModal, final String s, final khe khe) throws IOException {
        if ("component_collection".equals(s)) {
            jsonWebModal.f = JsonOcfComponentCollection$$JsonObjectMapper._parse(khe);
        }
        else if ("fail_link".equals(s)) {
            jsonWebModal.e = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("next_link".equals(s)) {
            jsonWebModal.c = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("skip_link".equals(s)) {
            jsonWebModal.d = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("style".equals(s)) {
            jsonWebModal.b = (elx)((StringBasedTypeConverter)JsonWebModal$$JsonObjectMapper.WEB_MODAL_STYLE_TYPE_CONVERTER).parse(khe);
        }
        else if ("url".equals(s)) {
            jsonWebModal.a = khe.T((String)null);
        }
    }
    
    public JsonWebModal parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonWebModal jsonWebModal, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonWebModal, tfe, b);
    }
}
