// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineTweet$$JsonObjectMapper extends JsonMapper<JsonTimelineTweet>
{
    public static final r0t TIMELINE_PREVIEW_METADATA_UNION_CONVERTER;
    public static final d TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER;
    public static final JsonTimelineTweet$a TWEET_DISPLAY_SIZE_TYPE_CONVERTER;
    public static final JsonTimelineTweet$b TWEET_DISPLAY_TYPE_TYPE_CONVERTER;
    
    static {
        TWEET_DISPLAY_TYPE_TYPE_CONVERTER = new JsonTimelineTweet$b();
        TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER = new d();
        TWEET_DISPLAY_SIZE_TYPE_CONVERTER = new JsonTimelineTweet$a();
        TIMELINE_PREVIEW_METADATA_UNION_CONVERTER = new r0t();
    }
    
    public static JsonTimelineTweet _parse(final khe khe) throws IOException {
        final JsonTimelineTweet jsonTimelineTweet = new JsonTimelineTweet();
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
            parseField(jsonTimelineTweet, d, khe);
            khe.m0();
        }
        return jsonTimelineTweet;
    }
    
    public static void _serialize(final JsonTimelineTweet jsonTimelineTweet, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonTimelineTweet.t != null) {
            LoganSquare.typeConverterFor((Class)nts.class).serialize((Object)jsonTimelineTweet.t, "conversationAnnotation", true, tfe);
        }
        final String d = jsonTimelineTweet.d;
        if (d != null) {
            ((StringBasedTypeConverter)JsonTimelineTweet$$JsonObjectMapper.TWEET_DISPLAY_SIZE_TYPE_CONVERTER).serialize((Object)d, "displaySize", true, tfe);
        }
        final String c = jsonTimelineTweet.c;
        if (c != null) {
            ((StringBasedTypeConverter)JsonTimelineTweet$$JsonObjectMapper.TWEET_DISPLAY_TYPE_TYPE_CONVERTER).serialize((Object)c, "tweetDisplayType", true, tfe);
        }
        if (jsonTimelineTweet.p != null) {
            LoganSquare.typeConverterFor((Class)elu.class).serialize((Object)jsonTimelineTweet.p, "forwardPivot", true, tfe);
        }
        tfe.e("hasModeratedReplies", jsonTimelineTweet.m);
        if (jsonTimelineTweet.g != null) {
            tfe.i("highlights");
            JsonTweetHighlights$$JsonObjectMapper._serialize(jsonTimelineTweet.g, tfe, true);
        }
        tfe.u0("id", jsonTimelineTweet.b);
        final d4t o = jsonTimelineTweet.o;
        if (o != null) {
            ((twj<d4t>)JsonTimelineTweet$$JsonObjectMapper.TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER).serialize(o, "tweetSocialProof", true, tfe);
            throw null;
        }
        if (jsonTimelineTweet.q != null) {
            LoganSquare.typeConverterFor((Class)elu.class).serialize((Object)jsonTimelineTweet.q, "innerForwardPivot", true, tfe);
        }
        if (jsonTimelineTweet.h != null) {
            LoganSquare.typeConverterFor((Class)brv.class).serialize((Object)jsonTimelineTweet.h, "innerTombstoneInfo", true, tfe);
        }
        tfe.e("isModerated", jsonTimelineTweet.l);
        if (jsonTimelineTweet.j != null) {
            LoganSquare.typeConverterFor((Class)mwk.class).serialize((Object)jsonTimelineTweet.j, "prerollMetadata", true, tfe);
        }
        final q0t k = jsonTimelineTweet.k;
        if (k != null) {
            ((twj<q0t>)JsonTimelineTweet$$JsonObjectMapper.TIMELINE_PREVIEW_METADATA_UNION_CONVERTER).serialize(k, "previewMetadata", true, tfe);
            throw null;
        }
        if (jsonTimelineTweet.e != null) {
            tfe.i("tweetPromotedMetadata");
            JsonPromotedContentUrt$$JsonObjectMapper._serialize(jsonTimelineTweet.e, tfe, true);
        }
        final ArrayList r = jsonTimelineTweet.r;
        if (r != null) {
            final Iterator g = q1a.g(tfe, "reactiveTriggers", r);
            while (g.hasNext()) {
                final ozl.b b2 = g.next();
                if (b2 != null) {
                    LoganSquare.typeConverterFor((Class)ozl.b.class).serialize((Object)b2, "lslocalreactiveTriggersElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (jsonTimelineTweet.u != null) {
            LoganSquare.typeConverterFor((Class)wg1.class).serialize((Object)jsonTimelineTweet.u, "replyBadge", true, tfe);
        }
        final d4t f = jsonTimelineTweet.f;
        if (f == null) {
            if (jsonTimelineTweet.i != null) {
                LoganSquare.typeConverterFor((Class)b9t.class).serialize((Object)jsonTimelineTweet.i, "timelinesScoreInfo", true, tfe);
            }
            if (jsonTimelineTweet.s != null) {
                LoganSquare.typeConverterFor((Class)d6t.class).serialize((Object)jsonTimelineTweet.s, "topicFollowPrompt", true, tfe);
            }
            if (jsonTimelineTweet.n != null) {
                LoganSquare.typeConverterFor((Class)meu.class).serialize((Object)jsonTimelineTweet.n, "tweetContext", true, tfe);
            }
            if (jsonTimelineTweet.a != null) {
                LoganSquare.typeConverterFor((Class)apu$a.class).serialize((Object)jsonTimelineTweet.a, "tweetResult", true, tfe);
            }
            if (b) {
                tfe.h();
            }
            return;
        }
        ((twj<d4t>)JsonTimelineTweet$$JsonObjectMapper.TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER).serialize(f, "socialContext", true, tfe);
        throw null;
    }
    
    public static void parseField(final JsonTimelineTweet jsonTimelineTweet, final String s, final khe khe) throws IOException {
        if ("conversationAnnotation".equals(s)) {
            jsonTimelineTweet.t = (nts)LoganSquare.typeConverterFor((Class)nts.class).parse(khe);
        }
        else if ("displaySize".equals(s)) {
            jsonTimelineTweet.d = (String)((StringBasedTypeConverter)JsonTimelineTweet$$JsonObjectMapper.TWEET_DISPLAY_SIZE_TYPE_CONVERTER).parse(khe);
        }
        else if (!"tweetDisplayType".equals(s) && !"displayType".equals(s)) {
            if ("forwardPivot".equals(s)) {
                jsonTimelineTweet.p = (elu)LoganSquare.typeConverterFor((Class)elu.class).parse(khe);
            }
            else if ("hasModeratedReplies".equals(s)) {
                jsonTimelineTweet.m = khe.k();
            }
            else if ("highlights".equals(s)) {
                jsonTimelineTweet.g = JsonTweetHighlights$$JsonObjectMapper._parse(khe);
            }
            else if ("id".equals(s)) {
                jsonTimelineTweet.b = khe.T((String)null);
            }
            else if ("tweetSocialProof".equals(s)) {
                jsonTimelineTweet.o = (d4t)((age)JsonTimelineTweet$$JsonObjectMapper.TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER).parse(khe);
            }
            else if ("innerForwardPivot".equals(s)) {
                jsonTimelineTweet.q = (elu)LoganSquare.typeConverterFor((Class)elu.class).parse(khe);
            }
            else if ("innerTombstoneInfo".equals(s)) {
                jsonTimelineTweet.h = (brv)LoganSquare.typeConverterFor((Class)brv.class).parse(khe);
            }
            else if ("isModerated".equals(s)) {
                jsonTimelineTweet.l = khe.k();
            }
            else if ("prerollMetadata".equals(s)) {
                jsonTimelineTweet.j = (mwk)LoganSquare.typeConverterFor((Class)mwk.class).parse(khe);
            }
            else if ("previewMetadata".equals(s)) {
                jsonTimelineTweet.k = (q0t)((age)JsonTimelineTweet$$JsonObjectMapper.TIMELINE_PREVIEW_METADATA_UNION_CONVERTER).parse(khe);
            }
            else if (!"tweetPromotedMetadata".equals(s) && !"promotedMetadata".equals(s)) {
                if ("reactiveTriggers".equals(s)) {
                    if (khe.e() == lje.M0) {
                        final ArrayList r = new ArrayList();
                        while (khe.i0() != lje.N0) {
                            final ozl.b b = (ozl.b)LoganSquare.typeConverterFor((Class)ozl.b.class).parse(khe);
                            if (b != null) {
                                r.add(b);
                            }
                        }
                        jsonTimelineTweet.r = r;
                    }
                    else {
                        jsonTimelineTweet.r = null;
                    }
                }
                else if ("replyBadge".equals(s)) {
                    jsonTimelineTweet.u = (wg1)LoganSquare.typeConverterFor((Class)wg1.class).parse(khe);
                }
                else if ("socialContext".equals(s)) {
                    jsonTimelineTweet.f = (d4t)((age)JsonTimelineTweet$$JsonObjectMapper.TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER).parse(khe);
                }
                else if ("timelinesScoreInfo".equals(s)) {
                    jsonTimelineTweet.i = (b9t)LoganSquare.typeConverterFor((Class)b9t.class).parse(khe);
                }
                else if ("topicFollowPrompt".equals(s)) {
                    jsonTimelineTweet.s = (d6t)LoganSquare.typeConverterFor((Class)d6t.class).parse(khe);
                }
                else if ("tweetContext".equals(s)) {
                    jsonTimelineTweet.n = (meu)LoganSquare.typeConverterFor((Class)meu.class).parse(khe);
                }
                else if ("tweetResult".equals(s)) {
                    jsonTimelineTweet.a = (apu$a)LoganSquare.typeConverterFor((Class)apu$a.class).parse(khe);
                }
            }
            else {
                jsonTimelineTweet.e = JsonPromotedContentUrt$$JsonObjectMapper._parse(khe);
                jsonTimelineTweet.b = null;
            }
        }
        else {
            jsonTimelineTweet.c = (String)((StringBasedTypeConverter)JsonTimelineTweet$$JsonObjectMapper.TWEET_DISPLAY_TYPE_TYPE_CONVERTER).parse(khe);
        }
    }
    
    public JsonTimelineTweet parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTimelineTweet jsonTimelineTweet, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonTimelineTweet, tfe, b);
    }
}
