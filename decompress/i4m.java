// 
// Decompiled by Procyon v0.6.0
// 

public final class i4m
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    
    public i4m(final String a, final String b, final String c, final String d, final String e, final String f, final String g) {
        czd.f((Object)a, "impressionId");
        czd.f((Object)b, "title");
        czd.f((Object)c, "text");
        czd.f((Object)d, "uri");
        czd.f((Object)e, "scribeTarget");
        czd.f((Object)f, "profilePicUrl");
        czd.f((Object)g, "mediaUrl");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof i4m)) {
            return false;
        }
        final i4m i4m = (i4m)o;
        return czd.a((Object)this.a, (Object)i4m.a) && czd.a((Object)this.b, (Object)i4m.b) && czd.a((Object)this.c, (Object)i4m.c) && czd.a((Object)this.d, (Object)i4m.d) && czd.a((Object)this.e, (Object)i4m.e) && czd.a((Object)this.f, (Object)i4m.f) && czd.a((Object)this.g, (Object)i4m.g);
    }
    
    @Override
    public final int hashCode() {
        return this.g.hashCode() + hmg.f(this.f, hmg.f(this.e, hmg.f(this.d, hmg.f(this.c, hmg.f(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final String c = this.c;
        final String d = this.d;
        final String e = this.e;
        final String f = this.f;
        final String g = this.g;
        final StringBuilder q = tqf.q("RecommendationsPayload(impressionId=", a, ", title=", b, ", text=");
        nb0.z(q, c, ", uri=", d, ", scribeTarget=");
        nb0.z(q, e, ", profilePicUrl=", f, ", mediaUrl=");
        return ed.B(q, g, ")");
    }
}
