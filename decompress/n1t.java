// 
// Decompiled by Procyon v0.6.0
// 

public final class n1t extends vxs
{
    public final o1t k;
    
    public n1t(final n1t.n1t$a n1t$a) {
        super((vxs$a)n1t$a);
        final o1t k = n1t$a.k;
        e0e.c((Object)k);
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
        if (!e0e.a((Object)n1t.class, (Object)class1)) {
            return false;
        }
        e0e.d(o, "null cannot be cast to non-null type com.twitter.model.timeline.urt.TimelinePagedCarouselItem");
        return e0e.a((Object)this.k, (Object)((n1t)o).k);
    }
    
    public final int hashCode() {
        return this.k.hashCode();
    }
}
