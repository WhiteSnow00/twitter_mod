// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.message;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonURTMessageAction$$JsonObjectMapper extends JsonMapper<JsonURTMessageAction>
{
    public static JsonURTMessageAction _parse(final khe khe) throws IOException {
        final JsonURTMessageAction jsonURTMessageAction = new JsonURTMessageAction();
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
            parseField(jsonURTMessageAction, d, khe);
            khe.m0();
        }
        return jsonURTMessageAction;
    }
    
    public static void _serialize(final JsonURTMessageAction jsonURTMessageAction, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.e("dismissOnClick", jsonURTMessageAction.a);
        final ArrayList c = jsonURTMessageAction.c;
        if (c != null) {
            final Iterator g = q1a.g(tfe, "onClickCallbacks", c);
            while (g.hasNext()) {
                final lnv lnv = g.next();
                if (lnv != null) {
                    LoganSquare.typeConverterFor((Class)lnv.class).serialize((Object)lnv, "lslocalonClickCallbacksElement", false, tfe);
                }
            }
            tfe.f();
        }
        tfe.u0("url", jsonURTMessageAction.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonURTMessageAction jsonURTMessageAction, final String s, final khe khe) throws IOException {
        if ("dismissOnClick".equals(s)) {
            jsonURTMessageAction.a = khe.k();
        }
        else if ("onClickCallbacks".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList c = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final lnv lnv = (lnv)LoganSquare.typeConverterFor((Class)lnv.class).parse(khe);
                    if (lnv != null) {
                        c.add(lnv);
                    }
                }
                jsonURTMessageAction.c = c;
            }
            else {
                jsonURTMessageAction.c = null;
            }
        }
        else if ("url".equals(s)) {
            jsonURTMessageAction.b = khe.T((String)null);
        }
    }
    
    public JsonURTMessageAction parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonURTMessageAction jsonURTMessageAction, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonURTMessageAction, tfe, b);
    }
}
