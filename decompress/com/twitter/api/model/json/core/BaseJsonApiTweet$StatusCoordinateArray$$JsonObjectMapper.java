// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.core;

import java.util.ArrayList;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class BaseJsonApiTweet$StatusCoordinateArray$$JsonObjectMapper extends JsonMapper<BaseJsonApiTweet.StatusCoordinateArray>
{
    public static BaseJsonApiTweet.StatusCoordinateArray _parse(final khe khe) throws IOException {
        final BaseJsonApiTweet.StatusCoordinateArray statusCoordinateArray = new BaseJsonApiTweet.StatusCoordinateArray();
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
            parseField(statusCoordinateArray, d, khe);
            khe.m0();
        }
        return statusCoordinateArray;
    }
    
    public static void _serialize(final BaseJsonApiTweet.StatusCoordinateArray statusCoordinateArray, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final Double[] a = statusCoordinateArray.a;
        if (a != null) {
            tfe.i("coordinates");
            tfe.q0();
            for (int length = a.length, i = 0; i < length; ++i) {
                tfe.k(a[i]);
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final BaseJsonApiTweet.StatusCoordinateArray statusCoordinateArray, final String s, final khe khe) throws IOException {
        if ("coordinates".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList list = new ArrayList();
                while (khe.i0() != lje.N0) {
                    Double value;
                    if (khe.e() == lje.U0) {
                        value = null;
                    }
                    else {
                        value = khe.p();
                    }
                    if (value != null) {
                        list.add(value);
                    }
                }
                statusCoordinateArray.a = list.toArray(new Double[list.size()]);
            }
            else {
                statusCoordinateArray.a = null;
            }
        }
    }
    
    public BaseJsonApiTweet.StatusCoordinateArray parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final BaseJsonApiTweet.StatusCoordinateArray statusCoordinateArray, final tfe tfe, final boolean b) throws IOException {
        _serialize(statusCoordinateArray, tfe, b);
    }
}
