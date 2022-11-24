// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.subscriptions;

import java.util.Objects;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "Lcom/twitter/subscriptions/JsonProductSubscription;", "Ltih;", "Ln4l;", "<init>", "()V", "subsystem.tfa.subscriptions.json_release" }, k = 1, mv = { 1, 7, 1 })
@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public final class JsonProductSubscription extends tih<n4l>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    
    @Override
    public final Object s() {
        final o4l$a companion = o4l.Companion;
        final String b = this.b;
        Objects.requireNonNull(companion);
        o4l o4l = o4l.F0;
        if (b != null) {
            try {
                o4l = o4l.valueOf(b);
            }
            catch (final IllegalArgumentException ex) {}
        }
        final eg8 a = p4l.a;
        final String a2 = this.a;
        Objects.requireNonNull(a);
        final int n = 1;
        Label_0077: {
            if (a2 == null) {
                final int n2 = n;
                break Label_0077;
            }
            try {
                final int n2 = p4l.n(a2);
                return new n4l(n2, o4l);
            }
            catch (final IllegalArgumentException ex2) {
                final int n2 = n;
                return new n4l(n2, o4l);
            }
        }
    }
}
