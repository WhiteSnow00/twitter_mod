import java.util.Objects;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class we9<DH extends ve9> implements ifx
{
    public boolean a;
    public boolean b;
    public boolean c;
    public DH d;
    public te9 e;
    public final ue9 f;
    
    public we9(final DH dh) {
        this.a = false;
        this.b = false;
        this.c = true;
        this.e = null;
        ue9 b;
        if (ue9.c) {
            b = new ue9();
        }
        else {
            b = ue9.b;
        }
        this.f = b;
        if (dh != null) {
            this.h(dh);
        }
    }
    
    public final void a() {
        if (this.a) {
            return;
        }
        this.f.a(ue9$a.L0);
        this.a = true;
        final te9 e = this.e;
        if (e != null && e.j() != null) {
            this.e.h();
        }
    }
    
    public final void b() {
        if (this.b && this.c) {
            this.a();
        }
        else {
            this.c();
        }
    }
    
    public final void c() {
        if (!this.a) {
            return;
        }
        this.f.a(ue9$a.M0);
        this.a = false;
        if (this.e()) {
            this.e.g();
        }
    }
    
    public final Drawable d() {
        final ve9 d = this.d;
        Drawable c;
        if (d == null) {
            c = null;
        }
        else {
            c = d.c();
        }
        return c;
    }
    
    public final boolean e() {
        final te9 e = this.e;
        return e != null && e.j() == this.d;
    }
    
    public final void f(final boolean c) {
        if (this.c == c) {
            return;
        }
        final ue9 f = this.f;
        ue9$a ue9$a;
        if (c) {
            ue9$a = ue9$a.V0;
        }
        else {
            ue9$a = ue9$a.W0;
        }
        f.a(ue9$a);
        this.c = c;
        this.b();
    }
    
    public final void g(final te9 e) {
        final boolean a = this.a;
        if (a) {
            this.c();
        }
        if (this.e()) {
            this.f.a(ue9$a.I0);
            this.e.i(null);
        }
        if ((this.e = e) != null) {
            this.f.a(ue9$a.H0);
            this.e.i(this.d);
        }
        else {
            this.f.a(ue9$a.J0);
        }
        if (a) {
            this.a();
        }
    }
    
    public final void h(final DH d) {
        this.f.a(ue9$a.F0);
        final boolean e = this.e();
        final Drawable d2 = this.d();
        if (d2 instanceof gfx) {
            ((gfx)d2).l((ifx)null);
        }
        Objects.requireNonNull(d);
        this.d = d;
        final Drawable c = d.c();
        this.f(c == null || c.isVisible());
        final Drawable d3 = this.d();
        if (d3 instanceof gfx) {
            ((gfx)d3).l((ifx)this);
        }
        if (e) {
            this.e.i(d);
        }
    }
    
    @Override
    public final String toString() {
        final q5j$a b = q5j.b((Object)this);
        b.b("controllerAttached", this.a);
        b.b("holderAttached", this.b);
        b.b("drawableVisible", this.c);
        b.c("events", (Object)this.f.toString());
        return b.toString();
    }
}
