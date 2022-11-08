// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.core;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class GraphqlJsonTwitterUser$JsonGraphQlLegacyTwitterUser$$JsonObjectMapper extends JsonMapper<GraphqlJsonTwitterUser.JsonGraphQlLegacyTwitterUser>
{
    public static GraphqlJsonTwitterUser.JsonGraphQlLegacyTwitterUser _parse(final khe khe) throws IOException {
        final GraphqlJsonTwitterUser.JsonGraphQlLegacyTwitterUser jsonGraphQlLegacyTwitterUser = new GraphqlJsonTwitterUser.JsonGraphQlLegacyTwitterUser();
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
            parseField(jsonGraphQlLegacyTwitterUser, d, khe);
            khe.m0();
        }
        return jsonGraphQlLegacyTwitterUser;
    }
    
    public static void _serialize(final GraphqlJsonTwitterUser.JsonGraphQlLegacyTwitterUser jsonGraphQlLegacyTwitterUser, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        RestJsonTwitterUser$$JsonObjectMapper._serialize((RestJsonTwitterUser)jsonGraphQlLegacyTwitterUser, tfe, false);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final GraphqlJsonTwitterUser.JsonGraphQlLegacyTwitterUser jsonGraphQlLegacyTwitterUser, final String s, final khe khe) throws IOException {
        RestJsonTwitterUser$$JsonObjectMapper.parseField((RestJsonTwitterUser)jsonGraphQlLegacyTwitterUser, s, khe);
    }
    
    public GraphqlJsonTwitterUser.JsonGraphQlLegacyTwitterUser parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final GraphqlJsonTwitterUser.JsonGraphQlLegacyTwitterUser jsonGraphQlLegacyTwitterUser, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonGraphQlLegacyTwitterUser, tfe, b);
    }
}
