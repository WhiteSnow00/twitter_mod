import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fz6
{
    public final fz6.fz6$a a;
    public final UserIdentifier b;
    public ez6 c;
    public Integer d;
    
    public fz6(final gz6 gz6, final UserIdentifier b, final ibm ibm) {
        this.b = b;
        final fz6.fz6$a a = new fz6.fz6$a(this);
        this.a = a;
        ((f0w)gz6).a(b).subscribe((wbj)a);
        ibm.i((rj)new ut1((Object)this, 20));
    }
    
    public final void a(final int n) {
        final Integer value = n;
        this.d = value;
        final ez6 c = this.c;
        if (c != null) {
            c.s((int)value);
        }
        else {
            final xca a = xca.a();
            final UserIdentifier b = this.b;
            final zf4 zf4 = new zf4(new String[] { "::navigation:badge:set_count_error" });
            zf4.A();
            a.b(b, (okm)zf4);
        }
    }
    
    public final void b(final ez6 c) {
        this.c = c;
        final Integer d = this.d;
        if (d != null) {
            c.s((int)d);
        }
    }
}
