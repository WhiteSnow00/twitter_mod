// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUserEmailPhoneInfo$$JsonObjectMapper extends JsonMapper<JsonUserEmailPhoneInfo>
{
    public static JsonUserEmailPhoneInfo _parse(final qhe qhe) throws IOException {
        final JsonUserEmailPhoneInfo jsonUserEmailPhoneInfo = new JsonUserEmailPhoneInfo();
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
            parseField(jsonUserEmailPhoneInfo, d, qhe);
            qhe.m0();
        }
        return jsonUserEmailPhoneInfo;
    }
    
    public static void _serialize(final JsonUserEmailPhoneInfo jsonUserEmailPhoneInfo, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final ArrayList a = jsonUserEmailPhoneInfo.a;
        if (a != null) {
            final Iterator e = d10.E(yfe, "emails", a);
            while (e.hasNext()) {
                final nbw nbw = e.next();
                if (nbw != null) {
                    LoganSquare.typeConverterFor((Class)nbw.class).serialize((Object)nbw, "lslocalemailsElement", false, yfe);
                }
            }
            yfe.f();
        }
        final ArrayList b2 = jsonUserEmailPhoneInfo.b;
        if (b2 != null) {
            final Iterator e2 = d10.E(yfe, "phone_numbers", b2);
            while (e2.hasNext()) {
                final jgw jgw = e2.next();
                if (jgw != null) {
                    LoganSquare.typeConverterFor((Class)jgw.class).serialize((Object)jgw, "lslocalphone_numbersElement", false, yfe);
                }
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonUserEmailPhoneInfo jsonUserEmailPhoneInfo, final String s, final qhe qhe) throws IOException {
        if ("emails".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList a = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final nbw nbw = (nbw)LoganSquare.typeConverterFor((Class)nbw.class).parse(qhe);
                    if (nbw != null) {
                        a.add(nbw);
                    }
                }
                jsonUserEmailPhoneInfo.a = a;
            }
            else {
                jsonUserEmailPhoneInfo.a = null;
            }
        }
        else if ("phone_numbers".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList b = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final jgw jgw = (jgw)LoganSquare.typeConverterFor((Class)jgw.class).parse(qhe);
                    if (jgw != null) {
                        b.add(jgw);
                    }
                }
                jsonUserEmailPhoneInfo.b = b;
            }
            else {
                jsonUserEmailPhoneInfo.b = null;
            }
        }
    }
    
    public JsonUserEmailPhoneInfo parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonUserEmailPhoneInfo jsonUserEmailPhoneInfo, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonUserEmailPhoneInfo, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonUserEmailPhoneInfo)o, yfe, b);
    }
}
