// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonActionListItem extends tih<ik>
{
    @JsonField(typeConverter = mk.class)
    public lk a;
    @JsonField
    public JsonActionListItem.JsonActionListItem$JsonActionData b;
    
    @Override
    public final Object s() {
        final int ordinal = ((Enum)this.a).ordinal();
        Object o;
        if (ordinal != 1) {
            if (ordinal != 2) {
                o = null;
            }
            else {
                final nk$b u = this.b.b.u();
                final lk a = this.a;
                e0e.f((Object)a, "actionListItemType");
                ((ik$a)u).a = a;
                o = ((z4j)u).e();
            }
        }
        else {
            final sk.b u2 = this.b.a.u();
            final lk a2 = this.a;
            e0e.f((Object)a2, "actionListItemType");
            u2.a = a2;
            o = ((z4j)u2).e();
        }
        return o;
    }
}
