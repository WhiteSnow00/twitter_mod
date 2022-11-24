import com.twitter.api.upload.request.progress.ProgressUpdatedEvent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n2h implements fa3
{
    public final p2h a;
    public final tca b;
    public final String c;
    public final lvu d;
    public final k5w e;
    
    public n2h(final p2h a, final tca b, final String c, final lvu d, final k5w e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a(final Object o) {
        final p2h a = this.a;
        final tca b = this.b;
        final String c = this.c;
        final lvu d = this.d;
        final k5w e = this.e;
        final l2h l2h = (l2h)o;
        final l2h k0 = a.I0.K0;
        if (k0 != null) {
            b.onEvent((Object)ProgressUpdatedEvent.b(c, 3));
            a.P(d, e, ((xsc)k0).b, k0.i, ((xsc)k0).d, b);
        }
    }
}
