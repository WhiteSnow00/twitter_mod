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
    public static final h1t TIMELINE_PREVIEW_METADATA_UNION_CONVERTER;
    public static final d TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER;
    public static final JsonTimelineTweet$a TWEET_DISPLAY_SIZE_TYPE_CONVERTER;
    public static final JsonTimelineTweet$b TWEET_DISPLAY_TYPE_TYPE_CONVERTER;
    
    static {
        TWEET_DISPLAY_TYPE_TYPE_CONVERTER = new JsonTimelineTweet$b();
        TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER = new d();
        TWEET_DISPLAY_SIZE_TYPE_CONVERTER = new JsonTimelineTweet$a();
        TIMELINE_PREVIEW_METADATA_UNION_CONVERTER = new h1t();
    }
    
    public static JsonTimelineTweet _parse(final tge tge) throws IOException {
        final JsonTimelineTweet jsonTimelineTweet = new JsonTimelineTweet();
        if (tge.e() == null) {
            tge.h0();
        }
        if (tge.e() != vie.L0) {
            tge.l0();
            return null;
        }
        while (tge.h0() != vie.M0) {
            final String d = tge.d();
            tge.h0();
            parseField(jsonTimelineTweet, d, tge);
            tge.l0();
        }
        return jsonTimelineTweet;
    }
    
    public static void _serialize(final JsonTimelineTweet jsonTimelineTweet, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonTimelineTweet.t != null) {
            LoganSquare.typeConverterFor((Class)fus.class).serialize((Object)jsonTimelineTweet.t, "conversationAnnotation", true, afe);
        }
        final String d = jsonTimelineTweet.d;
        if (d != null) {
            ((StringBasedTypeConverter)JsonTimelineTweet$$JsonObjectMapper.TWEET_DISPLAY_SIZE_TYPE_CONVERTER).serialize((Object)d, "displaySize", true, afe);
        }
        final String c = jsonTimelineTweet.c;
        if (c != null) {
            ((StringBasedTypeConverter)JsonTimelineTweet$$JsonObjectMapper.TWEET_DISPLAY_TYPE_TYPE_CONVERTER).serialize((Object)c, "tweetDisplayType", true, afe);
        }
        if (jsonTimelineTweet.p != null) {
            LoganSquare.typeConverterFor((Class)ylu.class).serialize((Object)jsonTimelineTweet.p, "forwardPivot", true, afe);
        }
        afe.e("hasModeratedReplies", jsonTimelineTweet.m);
        if (jsonTimelineTweet.g != null) {
            afe.i("highlights");
            JsonTweetHighlights$$JsonObjectMapper._serialize(jsonTimelineTweet.g, afe, true);
        }
        afe.t0("id", jsonTimelineTweet.b);
        final u4t o = jsonTimelineTweet.o;
        if (o != null) {
            ((ywj<u4t>)JsonTimelineTweet$$JsonObjectMapper.TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER).serialize(o, "tweetSocialProof", true, afe);
            throw null;
        }
        if (jsonTimelineTweet.q != null) {
            LoganSquare.typeConverterFor((Class)ylu.class).serialize((Object)jsonTimelineTweet.q, "innerForwardPivot", true, afe);
        }
        if (jsonTimelineTweet.h != null) {
            LoganSquare.typeConverterFor((Class)wrv.class).serialize((Object)jsonTimelineTweet.h, "innerTombstoneInfo", true, afe);
        }
        afe.e("isModerated", jsonTimelineTweet.l);
        if (jsonTimelineTweet.j != null) {
            LoganSquare.typeConverterFor((Class)uwk.class).serialize((Object)jsonTimelineTweet.j, "prerollMetadata", true, afe);
        }
        final g1t k = jsonTimelineTweet.k;
        if (k != null) {
            ((ywj<g1t>)JsonTimelineTweet$$JsonObjectMapper.TIMELINE_PREVIEW_METADATA_UNION_CONVERTER).serialize(k, "previewMetadata", true, afe);
            throw null;
        }
        if (jsonTimelineTweet.e != null) {
            afe.i("tweetPromotedMetadata");
            JsonPromotedContentUrt$$JsonObjectMapper._serialize(jsonTimelineTweet.e, afe, true);
        }
        final ArrayList r = jsonTimelineTweet.r;
        if (r != null) {
            final Iterator a = br.A(afe, "reactiveTriggers", r);
            while (a.hasNext()) {
                final d0m$b d0m$b = a.next();
                if (d0m$b != null) {
                    LoganSquare.typeConverterFor((Class)d0m$b.class).serialize((Object)d0m$b, "lslocalreactiveTriggersElement", false, afe);
                }
            }
            afe.f();
        }
        if (jsonTimelineTweet.u != null) {
            LoganSquare.typeConverterFor((Class)sg1.class).serialize((Object)jsonTimelineTweet.u, "replyBadge", true, afe);
        }
        final u4t f = jsonTimelineTweet.f;
        if (f == null) {
            if (jsonTimelineTweet.i != null) {
                LoganSquare.typeConverterFor((Class)r9t.class).serialize((Object)jsonTimelineTweet.i, "timelinesScoreInfo", true, afe);
            }
            if (jsonTimelineTweet.s != null) {
                LoganSquare.typeConverterFor((Class)v6t.class).serialize((Object)jsonTimelineTweet.s, "topicFollowPrompt", true, afe);
            }
            if (jsonTimelineTweet.n != null) {
                LoganSquare.typeConverterFor((Class)ffu.class).serialize((Object)jsonTimelineTweet.n, "tweetContext", true, afe);
            }
            if (jsonTimelineTweet.a != null) {
                LoganSquare.typeConverterFor((Class)upu.a.class).serialize((Object)jsonTimelineTweet.a, "tweetResult", true, afe);
            }
            if (b) {
                afe.h();
            }
            return;
        }
        ((ywj<u4t>)JsonTimelineTweet$$JsonObjectMapper.TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER).serialize(f, "socialContext", true, afe);
        throw null;
    }
    
    public static void parseField(final JsonTimelineTweet jsonTimelineTweet, final String s, final tge tge) throws IOException {
        if ("conversationAnnotation".equals(s)) {
            jsonTimelineTweet.t = (fus)LoganSquare.typeConverterFor((Class)fus.class).parse(tge);
        }
        else if ("displaySize".equals(s)) {
            jsonTimelineTweet.d = (String)((StringBasedTypeConverter)JsonTimelineTweet$$JsonObjectMapper.TWEET_DISPLAY_SIZE_TYPE_CONVERTER).parse(tge);
        }
        else if (!"tweetDisplayType".equals(s) && !"displayType".equals(s)) {
            if ("forwardPivot".equals(s)) {
                jsonTimelineTweet.p = (ylu)LoganSquare.typeConverterFor((Class)ylu.class).parse(tge);
            }
            else if ("hasModeratedReplies".equals(s)) {
                jsonTimelineTweet.m = tge.k();
            }
            else if ("highlights".equals(s)) {
                jsonTimelineTweet.g = JsonTweetHighlights$$JsonObjectMapper._parse(tge);
            }
            else if ("id".equals(s)) {
                jsonTimelineTweet.b = tge.T((String)null);
            }
            else if ("tweetSocialProof".equals(s)) {
                jsonTimelineTweet.o = ((hfe<u4t>)JsonTimelineTweet$$JsonObjectMapper.TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER).parse(tge);
            }
            else if ("innerForwardPivot".equals(s)) {
                jsonTimelineTweet.q = (ylu)LoganSquare.typeConverterFor((Class)ylu.class).parse(tge);
            }
            else if ("innerTombstoneInfo".equals(s)) {
                jsonTimelineTweet.h = (wrv)LoganSquare.typeConverterFor((Class)wrv.class).parse(tge);
            }
            else if ("isModerated".equals(s)) {
                jsonTimelineTweet.l = tge.k();
            }
            else if ("prerollMetadata".equals(s)) {
                jsonTimelineTweet.j = (uwk)LoganSquare.typeConverterFor((Class)uwk.class).parse(tge);
            }
            else if ("previewMetadata".equals(s)) {
                jsonTimelineTweet.k = ((hfe<g1t>)JsonTimelineTweet$$JsonObjectMapper.TIMELINE_PREVIEW_METADATA_UNION_CONVERTER).parse(tge);
            }
            else if (!"tweetPromotedMetadata".equals(s) && !"promotedMetadata".equals(s)) {
                if ("reactiveTriggers".equals(s)) {
                    if (tge.e() == vie.N0) {
                        final ArrayList r = new ArrayList();
                        while (tge.h0() != vie.O0) {
                            final d0m$b d0m$b = (d0m$b)LoganSquare.typeConverterFor((Class)d0m$b.class).parse(tge);
                            if (d0m$b != null) {
                                r.add(d0m$b);
                            }
                        }
                        jsonTimelineTweet.r = r;
                    }
                    else {
                        jsonTimelineTweet.r = null;
                    }
                }
                else if ("replyBadge".equals(s)) {
                    jsonTimelineTweet.u = (sg1)LoganSquare.typeConverterFor((Class)sg1.class).parse(tge);
                }
                else if ("socialContext".equals(s)) {
                    jsonTimelineTweet.f = ((hfe<u4t>)JsonTimelineTweet$$JsonObjectMapper.TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER).parse(tge);
                }
                else if ("timelinesScoreInfo".equals(s)) {
                    jsonTimelineTweet.i = (r9t)LoganSquare.typeConverterFor((Class)r9t.class).parse(tge);
                }
                else if ("topicFollowPrompt".equals(s)) {
                    jsonTimelineTweet.s = (v6t)LoganSquare.typeConverterFor((Class)v6t.class).parse(tge);
                }
                else if ("tweetContext".equals(s)) {
                    jsonTimelineTweet.n = (ffu)LoganSquare.typeConverterFor((Class)ffu.class).parse(tge);
                }
                else if ("tweetResult".equals(s)) {
                    jsonTimelineTweet.a = (upu.a)LoganSquare.typeConverterFor((Class)upu.a.class).parse(tge);
                }
            }
            else {
                jsonTimelineTweet.e = JsonPromotedContentUrt$$JsonObjectMapper._parse(tge);
                jsonTimelineTweet.b = null;
            }
        }
        else {
            jsonTimelineTweet.c = (String)((StringBasedTypeConverter)JsonTimelineTweet$$JsonObjectMapper.TWEET_DISPLAY_TYPE_TYPE_CONVERTER).parse(tge);
        }
    }
    
    public JsonTimelineTweet parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTimelineTweet jsonTimelineTweet, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTimelineTweet, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTimelineTweet)o, afe, b);
    }
}
