// 
// Decompiled by Procyon v0.6.0
// 

public final class e0t extends nws
{
    public final f0t k;
    
    public e0t(final e0t.e0t$a e0t$a) {
        super((nws$a)e0t$a);
        final f0t k = e0t$a.k;
        zzd.c((Object)k);
        this.k = k;
    }
    
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
        if (!zzd.a((Object)e0t.class, (Object)class1)) {
            return false;
        }
        zzd.d(o, "null cannot be cast to non-null type com.twitter.model.timeline.urt.TimelinePagedCarouselItem");
        return zzd.a((Object)this.k, (Object)((e0t)o).k);
    }
    
    public final int hashCode() {
        return this.k.hashCode();
    }
}
