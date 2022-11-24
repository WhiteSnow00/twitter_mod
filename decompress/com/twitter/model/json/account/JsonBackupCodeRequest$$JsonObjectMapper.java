// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import java.util.ArrayList;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonBackupCodeRequest$$JsonObjectMapper extends JsonMapper<JsonBackupCodeRequest>
{
    public static JsonBackupCodeRequest _parse(final qhe qhe) throws IOException {
        final JsonBackupCodeRequest jsonBackupCodeRequest = new JsonBackupCodeRequest();
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
            parseField(jsonBackupCodeRequest, d, qhe);
            qhe.m0();
        }
        return jsonBackupCodeRequest;
    }
    
    public static void _serialize(final JsonBackupCodeRequest jsonBackupCodeRequest, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final String[] a = jsonBackupCodeRequest.a;
        if (a != null) {
            yfe.i("codes");
            yfe.q0();
            for (int length = a.length, i = 0; i < length; ++i) {
                yfe.s0(a[i]);
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonBackupCodeRequest jsonBackupCodeRequest, String t, final qhe qhe) throws IOException {
        if ("codes".equals(t)) {
            if (qhe.e() == rje.P0) {
                final ArrayList list = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    t = qhe.T((String)null);
                    if (t != null) {
                        list.add(t);
                    }
                }
                jsonBackupCodeRequest.a = list.toArray(new String[list.size()]);
            }
            else {
                jsonBackupCodeRequest.a = null;
            }
        }
    }
    
    public JsonBackupCodeRequest parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonBackupCodeRequest jsonBackupCodeRequest, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonBackupCodeRequest, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonBackupCodeRequest)o, yfe, b);
    }
}
