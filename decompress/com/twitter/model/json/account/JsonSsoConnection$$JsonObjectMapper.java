// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSsoConnection$$JsonObjectMapper extends JsonMapper<JsonSsoConnection>
{
    public static final j6r SSO_PROVIDER_TYPE_CONVERTER;
    
    static {
        SSO_PROVIDER_TYPE_CONVERTER = new j6r();
    }
    
    public static JsonSsoConnection _parse(final qhe qhe) throws IOException {
        final JsonSsoConnection jsonSsoConnection = new JsonSsoConnection();
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
            parseField(jsonSsoConnection, d, qhe);
            qhe.m0();
        }
        return jsonSsoConnection;
    }
    
    public static void _serialize(final JsonSsoConnection jsonSsoConnection, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("sso_id_hash", jsonSsoConnection.a);
        final i6r b2 = jsonSsoConnection.b;
        if (b2 != null) {
            ((StringBasedTypeConverter)JsonSsoConnection$$JsonObjectMapper.SSO_PROVIDER_TYPE_CONVERTER).serialize((Object)b2, "sso_provider", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSsoConnection jsonSsoConnection, final String s, final qhe qhe) throws IOException {
        if ("sso_id_hash".equals(s)) {
            jsonSsoConnection.a = qhe.T((String)null);
        }
        else if ("sso_provider".equals(s)) {
            jsonSsoConnection.b = (i6r)((StringBasedTypeConverter)JsonSsoConnection$$JsonObjectMapper.SSO_PROVIDER_TYPE_CONVERTER).parse(qhe);
        }
    }
    
    public JsonSsoConnection parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSsoConnection jsonSsoConnection, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonSsoConnection, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSsoConnection)o, yfe, b);
    }
}
