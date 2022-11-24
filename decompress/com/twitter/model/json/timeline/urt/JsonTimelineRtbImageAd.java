// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineRtbImageAd extends tih<f5t>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public c9t d;
    @JsonField
    public String e;
    @JsonField
    public b8d f;
    @JsonField
    public JsonPromotedContentUrt g;
    
    @Override
    public final Object s() {
        final c9t d = this.d;
        String b;
        if (d instanceof ief) {
            b = ((ief)d).b;
        }
        else {
            b = null;
        }
        final gjl g = yih.b(this.g);
        final f5t.a a = new f5t.a();
        a.a = this.a;
        a.b = this.c;
        a.c = this.b;
        a.d = b;
        a.e = this.e;
        a.g = g;
        a.f = this.f;
        final f5t f5t = (f5t)a.j();
        if (f5t == null) {
            c0e.i("A JsonTimelineRtbAd must have a valid creativeId, landingUrl, promotedMetadata, and impressionId.");
        }
        return f5t;
    }
}
