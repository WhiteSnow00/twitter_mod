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
public class JsonTimelineUserFacepile extends aih<m8t>
{
    @JsonField
    public List<String> a;
    @JsonField(name = { "usersResults", "facepileUserResults" })
    public List<rhw> b;
    @JsonField
    public List<String> c;
    @JsonField(name = { "featuredUsersResults", "facepileFeaturedUserResults" })
    public List<rhw> d;
    @JsonField(name = { "action", "facepileButtonAction" })
    public fpv e;
    @JsonField(name = { "actionType", "facepileActionType" }, typeConverter = fqa.class)
    public eqa f;
    @JsonField(name = { "displaysFeaturingText", "facepileDisplaysFeaturingText" })
    public boolean g;
    @JsonField(name = { "displayType", "facepileDisplayType" }, typeConverter = mqa.class)
    public lqa h;
    
    @Override
    public final Object s() {
        m8t m8t;
        try {
            if (this.f != eqa.C0) {
                final ArrayList b = this.b;
                if (b != null) {
                    this.a = u4c.a((List)b, true);
                }
                final ArrayList d = this.d;
                if (d != null) {
                    this.c = u4c.a((List)d, false);
                }
                final List<String> a = this.a;
                if (a != null) {
                    final List<String> c = this.c;
                    if (c != null) {
                        final m8t$a m8t$a = new m8t$a();
                        m8t$a.a = a;
                        m8t$a.b = c;
                        m8t$a.c = this.e;
                        m8t$a.d = this.f;
                        m8t$a.e = this.g;
                        m8t$a.g = this.h;
                        m8t = (m8t)((h4j)m8t$a).e();
                        return m8t;
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
            e9a.d((Throwable)ex);
            m8t = null;
        }
        return m8t;
    }
}
