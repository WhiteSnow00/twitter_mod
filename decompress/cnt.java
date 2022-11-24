import com.twitter.util.InvalidDataException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cnt extends fys implements fys$a
{
    public final j7t j;
    
    public cnt(final String s, final long n, final b1p b1p, final kws kws, final long n2, final boolean b, final j7t j, final pmh pmh) {
        super(s, n, b1p, kws, n2, b, (c2t)null, pmh);
        this.j = j;
    }
    
    public final tvs.a a(final y4c y4c, final lsm lsm) {
        final lxd e = y4c.e(this.j.a);
        if (e == null) {
            r9a.h((Throwable)new InvalidDataException("Topic lookup in interestTopic map failed"));
        }
        final zmt$a zmt$a = new zmt$a();
        zmt$a.p = e;
        zmt$a.q = this.j;
        ((tvs.a)zmt$a).a = ((yvs)this).b;
        ((tvs.a)zmt$a).c = ((yvs)this).c;
        ((tvs.a)zmt$a).n = super.h;
        ((tvs.a)zmt$a).f = super.e;
        final kws f = super.f;
        cwa a;
        if (f != null) {
            a = lsm.a(f);
        }
        else {
            a = null;
        }
        ((tvs.a)zmt$a).g = a;
        ((tvs.a)zmt$a).o = super.i;
        return (tvs.a)zmt$a;
    }
}
