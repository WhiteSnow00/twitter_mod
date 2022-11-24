// 
// Decompiled by Procyon v0.6.0
// 

public final class lbu
{
    public String a;
    public boolean b;
    public boolean c;
    
    public final void a(final pbf pbf) {
        e0e.f((Object)pbf, "event");
        if (pbf instanceof pbf.q) {
            this.a = ((pbf.q)pbf).a;
        }
        else {
            final boolean b = pbf instanceof pbf.n;
            final int n = 1;
            if (b || pbf instanceof pbf.p) {
                this.b = false;
            }
            else if (pbf instanceof pbf.l) {
                this.b = true;
            }
            else if (pbf instanceof pbf.k) {
                this.c = true;
            }
            else {
                int n2;
                if (pbf instanceof pbf.d) {
                    n2 = n;
                }
                else {
                    n2 = ((pbf instanceof pbf.e) ? 1 : 0);
                }
                if (n2 != 0) {
                    this.c = false;
                }
                else if (pbf instanceof pbf.j && this.c && !this.b) {
                    this.a = ((pbf.j)pbf).a;
                }
            }
        }
    }
}
