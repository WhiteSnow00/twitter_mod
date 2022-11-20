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
    public static final lk ACTION_LIST_STYLE_TYPE_CONVERTER;
    
    static {
        ACTION_LIST_STYLE_TYPE_CONVERTER = new lk();
    }
    
    public static JsonActionList _parse(final tge tge) throws IOException {
        final JsonActionList list = new JsonActionList();
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
    
    public static void _serialize(final JsonActionList list, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final ArrayList d = list.d;
        if (d != null) {
            final Iterator a = br.A(afe, "action_items", d);
            while (a.hasNext()) {
                final ek ek = a.next();
                if (ek != null) {
                    LoganSquare.typeConverterFor((Class)ek.class).serialize((Object)ek, "lslocalaction_itemsElement", false, afe);
                }
            }
            afe.f();
        }
        if (list.c != null) {
            LoganSquare.typeConverterFor((Class)oej.class).serialize((Object)list.c, "header", true, afe);
        }
        if (list.a != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)list.a, "next_link", true, afe);
        }
        if (list.b != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)list.b, "skip_link", true, afe);
        }
        final nk$c e = list.e;
        if (e != null) {
            ((StringBasedTypeConverter)JsonActionList$$JsonObjectMapper.ACTION_LIST_STYLE_TYPE_CONVERTER).serialize((Object)e, "style", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonActionList list, final String s, final tge tge) throws IOException {
        if ("action_items".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList d = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final ek ek = (ek)LoganSquare.typeConverterFor((Class)ek.class).parse(tge);
                    if (ek != null) {
                        d.add(ek);
                    }
                }
                list.d = d;
            }
            else {
                list.d = null;
            }
        }
        else if ("header".equals(s)) {
            list.c = (oej)LoganSquare.typeConverterFor((Class)oej.class).parse(tge);
        }
        else if ("next_link".equals(s)) {
            list.a = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("skip_link".equals(s)) {
            list.b = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("style".equals(s)) {
            list.e = (nk$c)((StringBasedTypeConverter)JsonActionList$$JsonObjectMapper.ACTION_LIST_STYLE_TYPE_CONVERTER).parse(tge);
        }
    }
    
    public JsonActionList parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonActionList list, final afe afe, final boolean b) throws IOException {
        _serialize(list, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonActionList)o, afe, b);
    }
}
