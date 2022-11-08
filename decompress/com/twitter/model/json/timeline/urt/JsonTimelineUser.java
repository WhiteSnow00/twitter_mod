// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.Locale;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineUser extends aih<a8t>
{
    @JsonField
    public String a;
    @JsonField
    public rhw b;
    @JsonField(name = { "displayType", "userDisplayType" }, typeConverter = JsonTimelineUser.JsonTimelineUser$a.class)
    public String c;
    @JsonField(name = { "promotedMetadata", "userPromotedMetadata" })
    public JsonPromotedContentUrt d;
    @JsonField(name = { "socialContext" }, typeConverter = d.class)
    public d4t e;
    @JsonField
    public boolean f;
    @JsonField(name = { "reactiveTriggers", "userReactiveTriggers" })
    public ozl.c g;
    
    public JsonTimelineUser() {
        this.c = "";
    }
    
    @Override
    public final Object s() {
        final hfv e = ffa.e(this.b);
        if (e != null) {
            u4c.d().q(e);
            this.a = e.e();
        }
        a8t a8t;
        if (this.a != null && !"".equals(this.c)) {
            a8t = new a8t(this.a, this.c, (hil)fih.b((aih)this.d), poa.V(this.e), this.f, this.g);
        }
        else {
            e9a.d((Throwable)new IllegalStateException(String.format(Locale.ENGLISH, "A JsonTimelineUser must have a non-null ID and a valid display type. ID: %s, DisplayType: %s", this.a, this.c)));
            a8t = null;
        }
        return a8t;
    }
}
