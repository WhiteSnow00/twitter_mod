// 
// Decompiled by Procyon v0.6.0
// 

public final class t09 implements m1l<l4a>
{
    public final qr2 a;
    public final qr2 b;
    public final d83 c;
    public final m1l<l4a> d;
    
    public t09(final qr2 a, final qr2 b, final d83 c, final m1l<l4a> d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void a(final pk6<l4a> pk6, final n1l n1l) {
        if (n1l.o().F0 >= 2) {
            n1l.f("disk", "nil-result_write");
            pk6.c(null, 1);
        }
        else {
            Object o = pk6;
            if (n1l.l().l) {
                o = new t09.t09$b((pk6)pk6, n1l, this.a, this.b, this.c, (t09$a)null);
            }
            this.d.a((pk6<l4a>)o, n1l);
        }
    }
}
