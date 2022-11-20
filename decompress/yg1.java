import com.twitter.util.user.UserIdentifier;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yg1 implements xg1
{
    public final wc6 a;
    public final h5j<tg1> b;
    public final bh1 c;
    public final uew d;
    
    public yg1(final ool ool, final xbm xbm, final bh1 c, final uew d, final Set<wg1> set) {
        final wc6 a = new wc6();
        this.a = a;
        this.c = c;
        this.d = d;
        final nnl b = ool.b;
        Objects.requireNonNull(c);
        this.b = (h5j<tg1>)((h5j)b).doOnNext((lj6)new wqg((Object)c, 9)).share();
        Objects.requireNonNull(a);
        xbm.i((oj)new fdv(a, 12));
        for (final wg1 wg1 : set) {
            this.a.a(this.a(wg1.a()).subscribe((lj6)new k8f((Object)wg1, 9)));
        }
    }
    
    @Override
    public final h5j<tg1> a(final String s) {
        return (h5j<tg1>)this.d.c().switchMap((psb)new cbg((Object)this, (Object)s, 4));
    }
    
    @Override
    public final h5j<tg1> b(final UserIdentifier userIdentifier, final String s) {
        return (h5j<tg1>)this.b.filter((ytk)new b5w((Object)userIdentifier)).filter((ytk)new r0g(s, 1)).startWith((taj)this.c.a(userIdentifier, s).P());
    }
}
