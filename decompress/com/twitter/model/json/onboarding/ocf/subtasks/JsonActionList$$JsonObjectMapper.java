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
    public static final pk ACTION_LIST_STYLE_TYPE_CONVERTER;
    
    static {
        ACTION_LIST_STYLE_TYPE_CONVERTER = new pk();
    }
    
    public static JsonActionList _parse(final qhe qhe) throws IOException {
        final JsonActionList list = new JsonActionList();
        if (qhe.e() == null) {
            qhe.i0();
        }
        if (qhe.e() != rje.N0) {
            qhe.m0();
            return null;
        }
        while (qhe.i0() != rje.O0) {
            final String d = qhe.d();
            qhe.i0();
            parseField(list, d, qhe);
            qhe.m0();
        }
        return list;
    }
    
    public static void _serialize(final JsonActionList list, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final ArrayList d = list.d;
        if (d != null) {
            final Iterator e = d10.E(yfe, "action_items", d);
            while (e.hasNext()) {
                final ik ik = e.next();
                if (ik != null) {
                    LoganSquare.typeConverterFor((Class)ik.class).serialize((Object)ik, "lslocalaction_itemsElement", false, yfe);
                }
            }
            yfe.f();
        }
        if (list.c != null) {
            LoganSquare.typeConverterFor((Class)afj.class).serialize((Object)list.c, "header", true, yfe);
        }
        if (list.a != null) {
            LoganSquare.typeConverterFor((Class)dtv.class).serialize((Object)list.a, "next_link", true, yfe);
        }
        if (list.b != null) {
            LoganSquare.typeConverterFor((Class)dtv.class).serialize((Object)list.b, "skip_link", true, yfe);
        }
        final rk$c e2 = list.e;
        if (e2 != null) {
            ((StringBasedTypeConverter)JsonActionList$$JsonObjectMapper.ACTION_LIST_STYLE_TYPE_CONVERTER).serialize((Object)e2, "style", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonActionList list, final String s, final qhe qhe) throws IOException {
        if ("action_items".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList d = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final ik ik = (ik)LoganSquare.typeConverterFor((Class)ik.class).parse(qhe);
                    if (ik != null) {
                        d.add(ik);
                    }
                }
                list.d = d;
            }
            else {
                list.d = null;
            }
        }
        else if ("header".equals(s)) {
            list.c = (afj)LoganSquare.typeConverterFor((Class)afj.class).parse(qhe);
        }
        else if ("next_link".equals(s)) {
            list.a = (dtv)LoganSquare.typeConverterFor((Class)dtv.class).parse(qhe);
        }
        else if ("skip_link".equals(s)) {
            list.b = (dtv)LoganSquare.typeConverterFor((Class)dtv.class).parse(qhe);
        }
        else if ("style".equals(s)) {
            list.e = (rk$c)((StringBasedTypeConverter)JsonActionList$$JsonObjectMapper.ACTION_LIST_STYLE_TYPE_CONVERTER).parse(qhe);
        }
    }
    
    public JsonActionList parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonActionList list, final yfe yfe, final boolean b) throws IOException {
        _serialize(list, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonActionList)o, yfe, b);
    }
}
