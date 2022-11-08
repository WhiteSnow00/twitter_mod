// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.core;

import java.util.ArrayList;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class RestJsonTwitterUser$JsonActionsArray$$JsonObjectMapper extends JsonMapper<RestJsonTwitterUser.JsonActionsArray>
{
    public static RestJsonTwitterUser.JsonActionsArray _parse(final khe khe) throws IOException {
        final RestJsonTwitterUser.JsonActionsArray jsonActionsArray = new RestJsonTwitterUser.JsonActionsArray();
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
            parseField(jsonActionsArray, d, khe);
            khe.m0();
        }
        return jsonActionsArray;
    }
    
    public static void _serialize(final RestJsonTwitterUser.JsonActionsArray jsonActionsArray, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final String[] a = jsonActionsArray.a;
        if (a != null) {
            tfe.i("disallow");
            tfe.q0();
            for (int length = a.length, i = 0; i < length; ++i) {
                tfe.s0(a[i]);
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final RestJsonTwitterUser.JsonActionsArray jsonActionsArray, final String s, final khe khe) throws IOException {
        if ("disallow".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList list = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final String t = khe.T((String)null);
                    if (t != null) {
                        list.add(t);
                    }
                }
                jsonActionsArray.a = list.toArray(new String[list.size()]);
            }
            else {
                jsonActionsArray.a = null;
            }
        }
    }
    
    public RestJsonTwitterUser.JsonActionsArray parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final RestJsonTwitterUser.JsonActionsArray jsonActionsArray, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonActionsArray, tfe, b);
    }
}
