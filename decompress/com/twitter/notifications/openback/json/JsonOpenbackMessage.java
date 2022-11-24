// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.openback.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007" }, d2 = { "Lcom/twitter/notifications/openback/json/JsonOpenbackMessage;", "Ltih;", "Lunj;", "<init>", "()V", "Companion", "a", "subsystem.tfa.notifications.openback.json" }, k = 1, mv = { 1, 7, 1 })
@JsonObject
public final class JsonOpenbackMessage extends tih<unj>
{
    public static final a Companion;
    @JsonField
    public String a;
    @JsonField
    public pnj b;
    @JsonField
    public Long c;
    @JsonField(name = { "signals" })
    public ynj d;
    @JsonField
    public rnj e;
    @JsonField
    public tnj f;
    
    static {
        Companion = new a();
    }
    
    @Override
    public final Object s() {
        final String a = this.a;
        if (a != null) {
            return new unj(a, this.b, this.c, this.v(), this.t(), this.u());
        }
        e0e.m("messageId");
        throw null;
    }
    
    public final rnj t() {
        final rnj e = this.e;
        if (e != null) {
            return e;
        }
        e0e.m("expiration");
        throw null;
    }
    
    public final tnj u() {
        final tnj f = this.f;
        if (f != null) {
            return f;
        }
        e0e.m("limits");
        throw null;
    }
    
    public final ynj v() {
        final ynj d = this.d;
        if (d != null) {
            return d;
        }
        e0e.m("openbackSignals");
        throw null;
    }
    
    public static final class a
    {
    }
}
