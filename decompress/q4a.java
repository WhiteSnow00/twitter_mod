import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q4a implements m1l<l4a>
{
    public final qr2 a;
    public final qr2 b;
    public final d83 c;
    public final m1l<l4a> d;
    public final xpw e;
    public final xpw f;
    
    public q4a(final qr2 a, final qr2 b, final d83 c, final xpw e, final xpw f, final m1l<l4a> d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
        this.f = f;
        this.d = d;
    }
    
    @Override
    public final void a(final pk6<l4a> pk6, final n1l n1l) {
        try {
            rrb.b();
            final r1l i = n1l.i();
            i.k(n1l, "EncodedProbeProducer");
            final q4a.q4a$a q4a$a = new q4a.q4a$a((pk6)pk6, n1l, this.a, this.b, this.c, this.e, this.f);
            i.a(n1l, "EncodedProbeProducer", null);
            rrb.b();
            this.d.a((pk6<l4a>)q4a$a, n1l);
            rrb.b();
        }
        finally {
            rrb.b();
        }
    }
}
