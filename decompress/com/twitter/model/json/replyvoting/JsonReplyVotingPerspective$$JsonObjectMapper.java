// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.replyvoting;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonReplyVotingPerspective$$JsonObjectMapper extends JsonMapper<JsonReplyVotingPerspective>
{
    public static JsonReplyVotingPerspective _parse(final qhe qhe) throws IOException {
        final JsonReplyVotingPerspective jsonReplyVotingPerspective = new JsonReplyVotingPerspective();
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
            parseField(jsonReplyVotingPerspective, d, qhe);
            qhe.m0();
        }
        return jsonReplyVotingPerspective;
    }
    
    public static void _serialize(final JsonReplyVotingPerspective jsonReplyVotingPerspective, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("is_downvoted", jsonReplyVotingPerspective.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonReplyVotingPerspective jsonReplyVotingPerspective, final String s, final qhe qhe) throws IOException {
        if ("is_downvoted".equals(s)) {
            jsonReplyVotingPerspective.a = qhe.l();
        }
    }
    
    public JsonReplyVotingPerspective parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonReplyVotingPerspective jsonReplyVotingPerspective, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonReplyVotingPerspective, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonReplyVotingPerspective)o, yfe, b);
    }
}
