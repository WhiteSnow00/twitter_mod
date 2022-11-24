// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.av;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonMediaInfo extends tih<rn9>
{
    @JsonField
    public String a;
    @JsonField(name = { "publisher_id", "publisherId" })
    public long b;
    @JsonField
    public JsonMediaInfo.JsonMediaInfo$JsonPublisherInfo c;
    @JsonField(name = { "call_to_action", "callToAction" })
    public lyw d;
    @JsonField(name = { "duration_millis", "durationMillis" })
    public long e;
    @JsonField(name = { "variants", "videoVariants" })
    public List<a3h> f;
    @JsonField(name = { "advertiser_name", "advertiserName" })
    public String g;
    @JsonField(name = { "advertiser_profile_image_url", "advertiserProfileImageUrl" })
    public String h;
    @JsonField(name = { "render_ad_by_advertiser_name", "renderAdByAdvertiserName" })
    public boolean i;
    
    @Override
    public final Object s() {
        final JsonMediaInfo.JsonMediaInfo$JsonPublisherInfo c = this.c;
        long n;
        if (c != null) {
            n = c.a;
        }
        else {
            n = this.b;
        }
        return new rn9(this.a, n, this.g, this.i, ged.g((List)this.f), this.d, this.h);
    }
}
