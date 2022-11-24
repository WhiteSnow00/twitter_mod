// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.ArrayList;
import com.twitter.util.InvalidDataException;
import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineUserFacepile extends tih<y9t>
{
    @JsonField
    public List<String> a;
    @JsonField(name = { "usersResults", "facepileUserResults" })
    public List<ziw> b;
    @JsonField
    public List<String> c;
    @JsonField(name = { "featuredUsersResults", "facepileFeaturedUserResults" })
    public List<ziw> d;
    @JsonField(name = { "action", "facepileButtonAction" })
    public nqv e;
    @JsonField(name = { "actionType", "facepileActionType" }, typeConverter = kqa.class)
    public jqa f;
    @JsonField(name = { "displaysFeaturingText", "facepileDisplaysFeaturingText" })
    public boolean g;
    @JsonField(name = { "displayType", "facepileDisplayType" }, typeConverter = rqa.class)
    public qqa h;
    
    @Override
    public final Object s() {
        y9t y9t;
        try {
            if (this.f != jqa.F0) {
                final ArrayList b = this.b;
                if (b != null) {
                    this.a = y4c.a(b, true);
                }
                final ArrayList d = this.d;
                if (d != null) {
                    this.c = y4c.a(d, false);
                }
                final List<String> a = this.a;
                if (a != null) {
                    final List<String> c = this.c;
                    if (c != null) {
                        final y9t$a y9t$a = new y9t$a();
                        y9t$a.a = a;
                        y9t$a.b = c;
                        y9t$a.c = this.e;
                        y9t$a.d = this.f;
                        y9t$a.e = this.g;
                        y9t$a.g = this.h;
                        y9t = (y9t)((z4j)y9t$a).e();
                        return y9t;
                    }
                }
                throw new InvalidDataException("User ID and Featured user ID list can't be null");
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(this.f);
            sb.append(" type not supported.");
            throw new InvalidDataException(sb.toString());
        }
        catch (final Exception ex) {
            r9a.d((Throwable)ex);
            y9t = null;
        }
        return y9t;
    }
}
