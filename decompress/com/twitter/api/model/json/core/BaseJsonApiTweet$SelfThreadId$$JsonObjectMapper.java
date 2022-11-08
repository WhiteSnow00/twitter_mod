// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.core;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class BaseJsonApiTweet$SelfThreadId$$JsonObjectMapper extends JsonMapper<BaseJsonApiTweet.SelfThreadId>
{
    public static BaseJsonApiTweet.SelfThreadId _parse(final khe khe) throws IOException {
        final BaseJsonApiTweet.SelfThreadId selfThreadId = new BaseJsonApiTweet.SelfThreadId();
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
            parseField(selfThreadId, d, khe);
            khe.m0();
        }
        return selfThreadId;
    }
    
    public static void _serialize(final BaseJsonApiTweet.SelfThreadId selfThreadId, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.W("id_str", selfThreadId.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final BaseJsonApiTweet.SelfThreadId selfThreadId, final String s, final khe khe) throws IOException {
        if ("id_str".equals(s) || "id".equals(s)) {
            selfThreadId.a = khe.L();
        }
    }
    
    public BaseJsonApiTweet.SelfThreadId parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final BaseJsonApiTweet.SelfThreadId selfThreadId, final tfe tfe, final boolean b) throws IOException {
        _serialize(selfThreadId, tfe, b);
    }
}
