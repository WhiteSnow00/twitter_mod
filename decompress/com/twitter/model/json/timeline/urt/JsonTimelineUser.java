// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.Locale;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineUser extends tih<m9t>
{
    @JsonField
    public String a;
    @JsonField
    public ziw b;
    @JsonField(name = { "displayType", "userDisplayType" }, typeConverter = JsonTimelineUser.JsonTimelineUser$a.class)
    public String c;
    @JsonField(name = { "promotedMetadata", "userPromotedMetadata" })
    public JsonPromotedContentUrt d;
    @JsonField(name = { "socialContext" }, typeConverter = d.class)
    public o5t e;
    @JsonField
    public boolean f;
    @JsonField(name = { "reactiveTriggers", "userReactiveTriggers" })
    public n0m.c g;
    
    public JsonTimelineUser() {
        this.c = "";
    }
    
    @Override
    public final Object s() {
        final qgv b = dvc.b(this.b);
        if (b != null) {
            y4c.d().q(b);
            this.a = b.e();
        }
        m9t m9t;
        if (this.a != null && !"".equals(this.c)) {
            m9t = new m9t(this.a, this.c, (gjl)yih.b(this.d), ix.w(this.e), this.f, this.g);
        }
        else {
            r9a.d((Throwable)new IllegalStateException(String.format(Locale.ENGLISH, "A JsonTimelineUser must have a non-null ID and a valid display type. ID: %s, DisplayType: %s", this.a, this.c)));
            m9t = null;
        }
        return m9t;
    }
}
