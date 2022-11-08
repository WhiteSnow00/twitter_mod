// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.core;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class BaseJsonApiTweet$ExtendedTweetEntities$$JsonObjectMapper extends JsonMapper<BaseJsonApiTweet.ExtendedTweetEntities>
{
    public static BaseJsonApiTweet.ExtendedTweetEntities _parse(final khe khe) throws IOException {
        final BaseJsonApiTweet.ExtendedTweetEntities extendedTweetEntities = new BaseJsonApiTweet.ExtendedTweetEntities();
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
            parseField(extendedTweetEntities, d, khe);
            khe.m0();
        }
        return extendedTweetEntities;
    }
    
    public static void _serialize(final BaseJsonApiTweet.ExtendedTweetEntities extendedTweetEntities, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final ArrayList a = extendedTweetEntities.a;
        if (a != null) {
            final Iterator g = q1a.g(tfe, "media", a);
            while (g.hasNext()) {
                final dtg dtg = g.next();
                if (dtg != null) {
                    LoganSquare.typeConverterFor((Class)dtg.class).serialize((Object)dtg, "lslocalmediaElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final BaseJsonApiTweet.ExtendedTweetEntities extendedTweetEntities, final String s, final khe khe) throws IOException {
        if ("media".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList a = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final dtg dtg = (dtg)LoganSquare.typeConverterFor((Class)dtg.class).parse(khe);
                    if (dtg != null) {
                        a.add(dtg);
                    }
                }
                extendedTweetEntities.a = a;
            }
            else {
                extendedTweetEntities.a = null;
            }
        }
    }
    
    public BaseJsonApiTweet.ExtendedTweetEntities parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final BaseJsonApiTweet.ExtendedTweetEntities extendedTweetEntities, final tfe tfe, final boolean b) throws IOException {
        _serialize(extendedTweetEntities, tfe, b);
    }
}
