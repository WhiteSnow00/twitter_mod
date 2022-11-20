// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.Iterator;
import java.util.ArrayList;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineModuleMetadata$JsonTimelineModuleConversationMetadata$$JsonObjectMapper extends JsonMapper<JsonTimelineModuleMetadata$JsonTimelineModuleConversationMetadata>
{
    public static final d TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER;
    
    static {
        TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER = new d();
    }
    
    public static JsonTimelineModuleMetadata$JsonTimelineModuleConversationMetadata _parse(final tge tge) throws IOException {
        final JsonTimelineModuleMetadata$JsonTimelineModuleConversationMetadata jsonTimelineModuleMetadata$JsonTimelineModuleConversationMetadata = new JsonTimelineModuleMetadata$JsonTimelineModuleConversationMetadata();
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
            parseField(jsonTimelineModuleMetadata$JsonTimelineModuleConversationMetadata, d, tge);
            tge.l0();
        }
        return jsonTimelineModuleMetadata$JsonTimelineModuleConversationMetadata;
    }
    
    public static void _serialize(final JsonTimelineModuleMetadata$JsonTimelineModuleConversationMetadata jsonTimelineModuleMetadata$JsonTimelineModuleConversationMetadata, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final ArrayList a = jsonTimelineModuleMetadata$JsonTimelineModuleConversationMetadata.a;
        if (a != null) {
            final Iterator a2 = br.A(afe, "allTweetIds", a);
            while (a2.hasNext()) {
                afe.r0((String)a2.next());
            }
            afe.f();
        }
        afe.e("enableDeduplication", jsonTimelineModuleMetadata$JsonTimelineModuleConversationMetadata.b);
        final u4t c = jsonTimelineModuleMetadata$JsonTimelineModuleConversationMetadata.c;
        if (c == null) {
            if (b) {
                afe.h();
            }
            return;
        }
        ((ywj<u4t>)JsonTimelineModuleMetadata$JsonTimelineModuleConversationMetadata$$JsonObjectMapper.TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER).serialize(c, "socialContext", true, afe);
        throw null;
    }
    
    public static void parseField(final JsonTimelineModuleMetadata$JsonTimelineModuleConversationMetadata jsonTimelineModuleMetadata$JsonTimelineModuleConversationMetadata, String t, final tge tge) throws IOException {
        if ("allTweetIds".equals(t)) {
            if (tge.e() == vie.N0) {
                final ArrayList a = new ArrayList();
                while (tge.h0() != vie.O0) {
                    t = tge.T((String)null);
                    if (t != null) {
                        a.add(t);
                    }
                }
                jsonTimelineModuleMetadata$JsonTimelineModuleConversationMetadata.a = a;
            }
            else {
                jsonTimelineModuleMetadata$JsonTimelineModuleConversationMetadata.a = null;
            }
        }
        else if ("enableDeduplication".equals(t)) {
            jsonTimelineModuleMetadata$JsonTimelineModuleConversationMetadata.b = tge.k();
        }
        else if ("socialContext".equals(t)) {
            jsonTimelineModuleMetadata$JsonTimelineModuleConversationMetadata.c = ((hfe<u4t>)JsonTimelineModuleMetadata$JsonTimelineModuleConversationMetadata$$JsonObjectMapper.TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER).parse(tge);
        }
    }
    
    public JsonTimelineModuleMetadata$JsonTimelineModuleConversationMetadata parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTimelineModuleMetadata$JsonTimelineModuleConversationMetadata jsonTimelineModuleMetadata$JsonTimelineModuleConversationMetadata, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTimelineModuleMetadata$JsonTimelineModuleConversationMetadata, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTimelineModuleMetadata$JsonTimelineModuleConversationMetadata)o, afe, b);
    }
}
