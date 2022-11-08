import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pow extends vmw
{
    public final x8c b;
    public boolean c;
    public final ad9 d;
    public otb<oyv> e;
    public final cwj f;
    public float g;
    public float h;
    public long i;
    public final rtb<ld9, oyv> j;
    
    public pow() {
        final x8c b = new x8c();
        b.k = 0.0f;
        b.q = true;
        ((vmw)b).c();
        b.l = 0.0f;
        b.q = true;
        ((vmw)b).c();
        b.d((otb)new pow$c(this));
        this.b = b;
        this.c = true;
        this.d = new ad9();
        this.e = (otb<oyv>)pow$b.C0;
        this.f = (cwj)nkz.r((Object)null);
        Objects.requireNonNull(mcq.Companion);
        this.i = mcq.c;
        this.j = new pow$a(this);
    }
    
    public final void a(final ld9 ld9) {
        zzd.f((Object)ld9, "<this>");
        this.f(ld9, 1.0f, null);
    }
    
    public final void e() {
        this.c = true;
        this.e.invoke();
    }
    
    public final void f(final ld9 ld9, final float n, sr4 sr4) {
        zzd.f((Object)ld9, "<this>");
        if (sr4 == null) {
            sr4 = (sr4)((nhq)this.f).getValue();
        }
        if (this.c || !mcq.a(this.i, ld9.c())) {
            final x8c b = this.b;
            b.m = mcq.d(ld9.c()) / this.g;
            b.q = true;
            ((vmw)b).c();
            final x8c b2 = this.b;
            b2.n = mcq.b(ld9.c()) / this.h;
            b2.q = true;
            ((vmw)b2).c();
            final ad9 d = this.d;
            final long b3 = lr0.b((int)(float)Math.ceil(mcq.d(ld9.c())), (int)(float)Math.ceil(mcq.b(ld9.c())));
            final tve layoutDirection = ld9.getLayoutDirection();
            final pow$a j = this.j;
            Objects.requireNonNull(d);
            zzd.f((Object)layoutDirection, "layoutDirection");
            zzd.f((Object)j, "block");
            d.c = (dp8)ld9;
            final i40 a = d.a;
            Object c = d.b;
            Object h = null;
            Label_0307: {
                if (a != null && c != null && (int)(b3 >> 32) <= a.getWidth()) {
                    h = a;
                    if (iud.b(b3) <= a.getHeight()) {
                        break Label_0307;
                    }
                }
                h = fk7.h((int)(b3 >> 32), iud.b(b3), 0, 28);
                c = q0b.b((h6d)h);
                d.a = (i40)h;
                d.b = (f20)c;
            }
            d.d = b3;
            final sg3 e = d.e;
            final long t = lr0.T(b3);
            final sg3$a c2 = e.C0;
            final dp8 a2 = c2.a;
            final tve b4 = c2.b;
            final rg3 c3 = c2.c;
            final long d2 = c2.d;
            c2.a = (dp8)ld9;
            c2.b = layoutDirection;
            c2.c = (rg3)c;
            c2.d = t;
            final f20 f20 = (f20)c;
            f20.p();
            Objects.requireNonNull(pr4.Companion);
            final long b5 = pr4.b;
            Objects.requireNonNull(o12.Companion);
            kd9.j((ld9)e, b5, 0L, 0L, 0.0f, (uau)null, (sr4)null, 0, 62, (Object)null);
            j.invoke((Object)e);
            f20.c();
            final sg3$a c4 = e.C0;
            c4.b(a2);
            c4.c(b4);
            c4.a(c3);
            c4.d = d2;
            ((i40)h).a();
            this.c = false;
            this.i = ld9.c();
        }
        final ad9 d3 = this.d;
        Objects.requireNonNull(d3);
        final i40 a3 = d3.a;
        if (a3 != null) {
            kd9.d(ld9, (h6d)a3, 0L, d3.d, 0L, 0L, n, (uau)null, sr4, 0, 0, 858, (Object)null);
            return;
        }
        throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination".toString());
    }
    
    public final String toString() {
        final StringBuilder j = p88.j("Params: ", "\tname: ");
        aob.h(j, this.b.i, "\n", "\tviewportWidth: ");
        j.append(this.g);
        j.append("\n");
        j.append("\tviewportHeight: ");
        j.append(this.h);
        j.append("\n");
        final String string = j.toString();
        zzd.e((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
