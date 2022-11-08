// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.core;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class BaseJsonApiTweet$UserRetweetId$$JsonObjectMapper extends JsonMapper<BaseJsonApiTweet.UserRetweetId>
{
    public static BaseJsonApiTweet.UserRetweetId _parse(final khe khe) throws IOException {
        final BaseJsonApiTweet.UserRetweetId userRetweetId = new BaseJsonApiTweet.UserRetweetId();
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
            parseField(userRetweetId, d, khe);
            khe.m0();
        }
        return userRetweetId;
    }
    
    public static void _serialize(final BaseJsonApiTweet.UserRetweetId userRetweetId, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.W("id_str", userRetweetId.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final BaseJsonApiTweet.UserRetweetId userRetweetId, final String s, final khe khe) throws IOException {
        if ("id_str".equals(s) || "id".equals(s)) {
            userRetweetId.a = khe.L();
        }
    }
    
    public BaseJsonApiTweet.UserRetweetId parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final BaseJsonApiTweet.UserRetweetId userRetweetId, final tfe tfe, final boolean b) throws IOException {
        _serialize(userRetweetId, tfe, b);
    }
}
