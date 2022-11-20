// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.safetycenter.json;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/safetycenter/json/JsonReportDetail;", "Lfih;", "Lqjm;", "<init>", "()V", "subsystem.tfa.safety-center.implementation_release" }, k = 1, mv = { 1, 7, 1 })
@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public final class JsonReportDetail extends fih<qjm>
{
    @JsonField(typeConverter = dlm.class)
    public clm a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public String d;
    @JsonField(typeConverter = alm.class)
    public zkm e;
    @JsonField(typeConverter = ukf.class)
    public List<Object> f;
    @JsonField(typeConverter = tkf.class)
    public List<Object> g;
    @JsonField
    public String h;
    @JsonField
    public String i;
    @JsonField(typeConverter = tqw.class)
    public rqw j;
    
    public final Object s() {
        final clm a = this.a;
        final String b = this.b;
        czd.c((Object)b);
        final String c = this.c;
        czd.c((Object)c);
        final String d = this.d;
        final pcm d2 = pcm.D0;
        Object o;
        if ((o = this.f) == null) {
            o = f2a.D0;
        }
        Object o2;
        if ((o2 = this.g) == null) {
            o2 = f2a.D0;
        }
        final String h = this.h;
        final zkm e = this.e;
        czd.c((Object)e);
        final String i = this.i;
        czd.c((Object)i);
        return new qjm(a, b, c, d, (List)o, (List)o2, h, e, i, this.j);
    }
}
