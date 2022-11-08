import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e4a implements p0l<z3a>
{
    public final ir2 a;
    public final ir2 b;
    public final u73 c;
    public final p0l<z3a> d;
    public final now e;
    public final now f;
    
    public e4a(final ir2 a, final ir2 b, final u73 c, final now e, final now f, final p0l<z3a> d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
        this.f = f;
        this.d = d;
    }
    
    public final void a(final dk6<z3a> dk6, final q0l q0l) {
        try {
            srb.b();
            final u0l i = q0l.i();
            i.k(q0l, "EncodedProbeProducer");
            final e4a.e4a$a e4a$a = new e4a.e4a$a((dk6)dk6, q0l, this.a, this.b, this.c, this.e, this.f);
            i.a(q0l, "EncodedProbeProducer", (Map)null);
            srb.b();
            this.d.a((dk6)e4a$a, q0l);
            srb.b();
        }
        finally {
            srb.b();
        }
    }
}
