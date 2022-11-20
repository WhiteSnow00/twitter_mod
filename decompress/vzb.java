// 
// Decompiled by Procyon v0.6.0
// 

public final class vzb implements frp
{
    public final itb<lzj, ddq, fve, fzv> a;
    
    public vzb(final itb<? super lzj, ? super ddq, ? super fve, fzv> a) {
        czd.f((Object)a, "builder");
        this.a = (itb<lzj, ddq, fve, fzv>)a;
    }
    
    public final opj a(final long n, final fve fve, final lo8 lo8) {
        czd.f((Object)fve, "layoutDirection");
        czd.f((Object)lo8, "density");
        final lzj v = rp9.v();
        this.a.h0((Object)v, (Object)new ddq(n), (Object)fve);
        ((g50)v).close();
        return (opj)new opj$a(v);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        final boolean b = o instanceof vzb;
        Object a = null;
        vzb vzb;
        if (b) {
            vzb = (vzb)o;
        }
        else {
            vzb = null;
        }
        if (vzb != null) {
            a = vzb.a;
        }
        return czd.a(a, (Object)this.a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}
