// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.geo;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTwitterPlace$CoordinateArray$$JsonObjectMapper extends JsonMapper<JsonTwitterPlace.CoordinateArray>
{
    public static JsonTwitterPlace.CoordinateArray _parse(final khe khe) throws IOException {
        final JsonTwitterPlace.CoordinateArray coordinateArray = new JsonTwitterPlace.CoordinateArray();
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
            parseField(coordinateArray, d, khe);
            khe.m0();
        }
        return coordinateArray;
    }
    
    public static void _serialize(final JsonTwitterPlace.CoordinateArray coordinateArray, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final ArrayList a = coordinateArray.a;
        if (a != null) {
            final Iterator g = q1a.g(tfe, "coordinates", a);
            while (g.hasNext()) {
                final List list = g.next();
                if (list != null) {
                    tfe.q0();
                    for (final List list2 : list) {
                        if (list2 != null) {
                            tfe.q0();
                            final Iterator iterator2 = list2.iterator();
                            while (iterator2.hasNext()) {
                                tfe.k((double)iterator2.next());
                            }
                            tfe.f();
                        }
                    }
                    tfe.f();
                }
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTwitterPlace.CoordinateArray coordinateArray, final String s, final khe khe) throws IOException {
        if ("coordinates".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList a = new ArrayList();
                while (khe.i0() != lje.N0) {
                    Object o;
                    if (khe.e() == lje.M0) {
                        final ArrayList<Object> list = new ArrayList<Object>();
                        while (true) {
                            o = list;
                            if (khe.i0() == lje.N0) {
                                break;
                            }
                            Object o2;
                            if (khe.e() == lje.M0) {
                                final ArrayList<Double> list2 = new ArrayList<Double>();
                                while (true) {
                                    o2 = list2;
                                    if (khe.i0() == lje.N0) {
                                        break;
                                    }
                                    Double value;
                                    if (khe.e() == lje.U0) {
                                        value = null;
                                    }
                                    else {
                                        value = khe.p();
                                    }
                                    if (value == null) {
                                        continue;
                                    }
                                    list2.add(value);
                                }
                            }
                            else {
                                o2 = null;
                            }
                            if (o2 == null) {
                                continue;
                            }
                            list.add(o2);
                        }
                    }
                    else {
                        o = null;
                    }
                    if (o != null) {
                        a.add(o);
                    }
                }
                coordinateArray.a = a;
            }
            else {
                coordinateArray.a = null;
            }
        }
    }
    
    public JsonTwitterPlace.CoordinateArray parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTwitterPlace.CoordinateArray coordinateArray, final tfe tfe, final boolean b) throws IOException {
        _serialize(coordinateArray, tfe, b);
    }
}
