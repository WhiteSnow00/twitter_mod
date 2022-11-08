// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonActionList$$JsonObjectMapper extends JsonMapper<JsonActionList>
{
    public static final ok ACTION_LIST_STYLE_TYPE_CONVERTER;
    
    static {
        ACTION_LIST_STYLE_TYPE_CONVERTER = new ok();
    }
    
    public static JsonActionList _parse(final khe khe) throws IOException {
        final JsonActionList list = new JsonActionList();
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
    
    public static void _serialize(final JsonActionList list, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final ArrayList d = list.d;
        if (d != null) {
            final Iterator g = q1a.g(tfe, "action_items", d);
            while (g.hasNext()) {
                final hk hk = g.next();
                if (hk != null) {
                    LoganSquare.typeConverterFor((Class)hk.class).serialize((Object)hk, "lslocalaction_itemsElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (list.c != null) {
            LoganSquare.typeConverterFor((Class)iej.class).serialize((Object)list.c, "header", true, tfe);
        }
        if (list.a != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)list.a, "next_link", true, tfe);
        }
        if (list.b != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)list.b, "skip_link", true, tfe);
        }
        final qk.c e = list.e;
        if (e != null) {
            ((StringBasedTypeConverter)JsonActionList$$JsonObjectMapper.ACTION_LIST_STYLE_TYPE_CONVERTER).serialize((Object)e, "style", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonActionList list, final String s, final khe khe) throws IOException {
        if ("action_items".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList d = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final hk hk = (hk)LoganSquare.typeConverterFor((Class)hk.class).parse(khe);
                    if (hk != null) {
                        d.add(hk);
                    }
                }
                list.d = d;
            }
            else {
                list.d = null;
            }
        }
        else if ("header".equals(s)) {
            list.c = (iej)LoganSquare.typeConverterFor((Class)iej.class).parse(khe);
        }
        else if ("next_link".equals(s)) {
            list.a = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("skip_link".equals(s)) {
            list.b = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("style".equals(s)) {
            list.e = (qk.c)((StringBasedTypeConverter)JsonActionList$$JsonObjectMapper.ACTION_LIST_STYLE_TYPE_CONVERTER).parse(khe);
        }
    }
    
    public JsonActionList parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonActionList list, final tfe tfe, final boolean b) throws IOException {
        _serialize(list, tfe, b);
    }
}
