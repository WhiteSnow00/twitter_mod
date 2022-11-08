// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineRtbImageAd extends aih<v3t>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public q7t d;
    @JsonField
    public String e;
    @JsonField
    public v7d f;
    @JsonField
    public JsonPromotedContentUrt g;
    
    @Override
    public final Object s() {
        final q7t d = this.d;
        String b;
        if (d instanceof zdf) {
            b = ((zdf)d).b;
        }
        else {
            b = null;
        }
        final hil g = (hil)fih.b((aih)this.g);
        final v3t$a v3t$a = new v3t$a();
        v3t$a.a = this.a;
        v3t$a.b = this.c;
        v3t$a.c = this.b;
        v3t$a.d = b;
        v3t$a.e = this.e;
        v3t$a.g = g;
        v3t$a.f = this.f;
        final v3t v3t = (v3t)((h4j)v3t$a).j();
        if (v3t == null) {
            zi.A("A JsonTimelineRtbAd must have a valid creativeId, landingUrl, promotedMetadata, and impressionId.");
        }
        return v3t;
    }
}
