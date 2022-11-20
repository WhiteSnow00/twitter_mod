import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nda implements dua<uda>
{
    public final dua<cxs> a;
    public final fjl b;
    
    public nda(final dua<cxs> a, final fjl b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final cxs cxs, final cua$c cua$c, final efv efv) {
        final uda uda = (uda)cxs;
        this.a.a((cxs)uda, cua$c, efv);
        final gjl j = uda.k.j;
        if (j != null) {
            final fjl b = this.b;
            final long b2 = j.b;
            final String g = j.g;
            Objects.requireNonNull(b);
            final uil$a uil$a = new uil$a();
            uil$a.c = b2;
            uil$a.a = g;
            b.a.b((xil)xil.e(wil.L0, (uil)((n4j)uil$a).e()).e());
        }
    }
}
