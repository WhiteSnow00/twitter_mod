import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d0t implements f0t
{
    public final vo6 b;
    public final lnv c;
    public final lnv d;
    public final String e;
    public final String f;
    public final Map<ozl$a$a, Long> g;
    
    public d0t(final vo6 b, final lnv c, final lnv d, final String e, final String f, final Map<ozl$a$a, Long> g) {
        zzd.f((Object)c, "positiveCallback");
        zzd.f((Object)d, "negativeCallback");
        zzd.f((Object)e, "positiveButtonText");
        zzd.f((Object)f, "negativeButtonText");
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
        Class<?> class1;
        if (o != null) {
            class1 = o.getClass();
        }
        else {
            class1 = null;
        }
        if (!zzd.a((Object)d0t.class, (Object)class1)) {
            return false;
        }
        zzd.d(o, "null cannot be cast to non-null type com.twitter.model.timeline.urt.TimelinePagedCarouselFeedbackItem");
        final d0t d0t = (d0t)o;
        return zzd.a((Object)this.b, (Object)d0t.b) && zzd.a((Object)this.c.a, (Object)d0t.c.a) && zzd.a((Object)this.d.a, (Object)d0t.d.a) && zzd.a((Object)this.e, (Object)d0t.e) && zzd.a((Object)this.f, (Object)d0t.f) && zzd.a((Object)this.g, (Object)d0t.g);
    }
    
    @Override
    public final int hashCode() {
        final vo6 b = this.b;
        int hashCode;
        if (b != null) {
            hashCode = b.hashCode();
        }
        else {
            hashCode = 0;
        }
        return this.g.hashCode() + l7k.a(this.f, l7k.a(this.e, l7k.a(this.d.a, l7k.a(this.c.a, hashCode * 31, 31), 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final vo6 b = this.b;
        final lnv c = this.c;
        final lnv d = this.d;
        final String e = this.e;
        final String f = this.f;
        final Map<ozl$a$a, Long> g = this.g;
        final StringBuilder sb = new StringBuilder();
        sb.append("TimelinePagedCarouselFeedbackItem(tweet=");
        sb.append(b);
        sb.append(", positiveCallback=");
        sb.append(c);
        sb.append(", negativeCallback=");
        sb.append(d);
        sb.append(", positiveButtonText=");
        sb.append(e);
        sb.append(", negativeButtonText=");
        sb.append(f);
        sb.append(", reactiveTriggers=");
        sb.append(g);
        sb.append(")");
        return sb.toString();
    }
}
