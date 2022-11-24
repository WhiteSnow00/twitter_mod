// 
// Decompiled by Procyon v0.6.0
// 

public final class qtj
{
    public static final nmp<qtj> g;
    public final String a;
    public final String b;
    public final c9t c;
    public final tys d;
    public final j5t e;
    public final int f;
    
    static {
        qtj.g = new qtj.qtj$b();
    }
    
    public qtj(final qtj.qtj$a qtj$a) {
        final String a = qtj$a.a;
        vmw.g((Object)a);
        this.a = a;
        final String b = qtj$a.b;
        vmw.g((Object)b);
        this.b = b;
        this.c = qtj$a.c;
        this.d = qtj$a.d;
        final j5t f = qtj$a.f;
        final j5t d = j5t.d;
        j5t e = f;
        if (f == null) {
            e = d;
        }
        this.e = e;
        int e2 = qtj$a.e;
        if (e2 <= 0) {
            e2 = 1200;
        }
        this.f = e2;
    }
}
