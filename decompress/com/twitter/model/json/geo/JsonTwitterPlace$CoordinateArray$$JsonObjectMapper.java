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
    public static JsonTwitterPlace.CoordinateArray _parse(final tge tge) throws IOException {
        final JsonTwitterPlace.CoordinateArray coordinateArray = new JsonTwitterPlace.CoordinateArray();
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
            parseField(coordinateArray, d, tge);
            tge.l0();
        }
        return coordinateArray;
    }
    
    public static void _serialize(final JsonTwitterPlace.CoordinateArray coordinateArray, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final ArrayList a = coordinateArray.a;
        if (a != null) {
            final Iterator a2 = br.A(afe, "coordinates", a);
            while (a2.hasNext()) {
                final List list = a2.next();
                if (list != null) {
                    afe.p0();
                    for (final List list2 : list) {
                        if (list2 != null) {
                            afe.p0();
                            final Iterator iterator2 = list2.iterator();
                            while (iterator2.hasNext()) {
                                afe.k((double)iterator2.next());
                            }
                            afe.f();
                        }
                    }
                    afe.f();
                }
            }
            afe.f();
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTwitterPlace.CoordinateArray coordinateArray, final String s, final tge tge) throws IOException {
        if ("coordinates".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList a = new ArrayList();
                while (tge.h0() != vie.O0) {
                    Object o;
                    if (tge.e() == vie.N0) {
                        final ArrayList<Object> list = new ArrayList<Object>();
                        while (true) {
                            o = list;
                            if (tge.h0() == vie.O0) {
                                break;
                            }
                            Object o2;
                            if (tge.e() == vie.N0) {
                                final ArrayList<Double> list2 = new ArrayList<Double>();
                                while (true) {
                                    o2 = list2;
                                    if (tge.h0() == vie.O0) {
                                        break;
                                    }
                                    Double value;
                                    if (tge.e() == vie.V0) {
                                        value = null;
                                    }
                                    else {
                                        value = tge.p();
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
    
    public JsonTwitterPlace.CoordinateArray parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTwitterPlace.CoordinateArray coordinateArray, final afe afe, final boolean b) throws IOException {
        _serialize(coordinateArray, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTwitterPlace.CoordinateArray)o, afe, b);
    }
}
