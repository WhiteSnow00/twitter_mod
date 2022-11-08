import java.util.Objects;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class le9<DH extends ke9> implements wdx
{
    public boolean a;
    public boolean b;
    public boolean c;
    public DH d;
    public ie9 e;
    public final je9 f;
    
    public le9(final DH dh) {
        this.a = false;
        this.b = false;
        this.c = true;
        this.e = null;
        je9 b;
        if (je9.c) {
            b = new je9();
        }
        else {
            b = je9.b;
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
        this.f.a(je9.a.I0);
        this.a = true;
        final ie9 e = this.e;
        if (e != null && e.e() != null) {
            this.e.c();
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
        this.f.a(je9.a.J0);
        this.a = false;
        if (this.e()) {
            this.e.a();
        }
    }
    
    public final Drawable d() {
        final ke9 d = this.d;
        Drawable b;
        if (d == null) {
            b = null;
        }
        else {
            b = d.b();
        }
        return b;
    }
    
    public final boolean e() {
        final ie9 e = this.e;
        return e != null && e.e() == this.d;
    }
    
    public final void f(final boolean c) {
        if (this.c == c) {
            return;
        }
        final je9 f = this.f;
        je9.a a;
        if (c) {
            a = je9.a.S0;
        }
        else {
            a = je9.a.T0;
        }
        f.a(a);
        this.c = c;
        this.b();
    }
    
    public final void g(final ie9 e) {
        final boolean a = this.a;
        if (a) {
            this.c();
        }
        if (this.e()) {
            this.f.a(je9.a.F0);
            this.e.d((ke9)null);
        }
        if ((this.e = e) != null) {
            this.f.a(je9.a.E0);
            this.e.d((ke9)this.d);
        }
        else {
            this.f.a(je9.a.G0);
        }
        if (a) {
            this.a();
        }
    }
    
    public final void h(final DH d) {
        this.f.a(je9.a.C0);
        final boolean e = this.e();
        final Drawable d2 = this.d();
        if (d2 instanceof udx) {
            ((udx)d2).l((wdx)null);
        }
        Objects.requireNonNull(d);
        this.d = d;
        final Drawable b = d.b();
        this.f(b == null || b.isVisible());
        final Drawable d3 = this.d();
        if (d3 instanceof udx) {
            ((udx)d3).l((wdx)this);
        }
        if (e) {
            this.e.d((ke9)d);
        }
    }
    
    @Override
    public final String toString() {
        final y4j$a b = y4j.b((Object)this);
        b.b("controllerAttached", this.a);
        b.b("holderAttached", this.b);
        b.b("drawableVisible", this.c);
        b.c("events", (Object)this.f.toString());
        return b.toString();
    }
}
