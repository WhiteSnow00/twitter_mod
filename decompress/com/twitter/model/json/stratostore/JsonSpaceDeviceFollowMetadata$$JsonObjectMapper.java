// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.stratostore;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSpaceDeviceFollowMetadata$$JsonObjectMapper extends JsonMapper<JsonSpaceDeviceFollowMetadata>
{
    public static JsonSpaceDeviceFollowMetadata _parse(final qhe qhe) throws IOException {
        final JsonSpaceDeviceFollowMetadata jsonSpaceDeviceFollowMetadata = new JsonSpaceDeviceFollowMetadata();
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
            parseField(jsonSpaceDeviceFollowMetadata, d, qhe);
            qhe.m0();
        }
        return jsonSpaceDeviceFollowMetadata;
    }
    
    public static void _serialize(final JsonSpaceDeviceFollowMetadata jsonSpaceDeviceFollowMetadata, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("spaceDeviceFollowing", jsonSpaceDeviceFollowMetadata.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSpaceDeviceFollowMetadata jsonSpaceDeviceFollowMetadata, final String s, final qhe qhe) throws IOException {
        if ("spaceDeviceFollowing".equals(s)) {
            jsonSpaceDeviceFollowMetadata.a = qhe.l();
        }
    }
    
    public JsonSpaceDeviceFollowMetadata parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSpaceDeviceFollowMetadata jsonSpaceDeviceFollowMetadata, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonSpaceDeviceFollowMetadata, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSpaceDeviceFollowMetadata)o, yfe, b);
    }
}
