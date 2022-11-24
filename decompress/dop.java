import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dop implements sr9
{
    public final xc0 a;
    public final int b;
    
    public dop(final String s, final int b) {
        final xc0 a = new xc0(s, (List)null, 6);
        this.a = a;
        this.b = b;
    }
    
    public final void a(final vx9 vx9) {
        e0e.f((Object)vx9, "buffer");
        if (vx9.f()) {
            final int d = vx9.d;
            vx9.g(d, vx9.e, this.a.F0);
            if (this.a.F0.length() > 0) {
                vx9.h(d, this.a.F0.length() + d);
            }
        }
        else {
            final int b = vx9.b;
            vx9.g(b, vx9.c, this.a.F0);
            if (this.a.F0.length() > 0) {
                vx9.h(b, this.a.F0.length() + b);
            }
        }
        final int b2 = vx9.b;
        int c = vx9.c;
        if (b2 != c) {
            c = -1;
        }
        final int b3 = this.b;
        int n;
        if (b3 > 0) {
            n = c + b3 - 1;
        }
        else {
            n = c + b3 - this.a.F0.length();
        }
        final int f = jb2.F(n, 0, vx9.e());
        vx9.i(f, f);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof dop)) {
            return false;
        }
        final String f0 = this.a.F0;
        final dop dop = (dop)o;
        return e0e.a((Object)f0, (Object)dop.a.F0) && this.b == dop.b;
    }
    
    @Override
    public final int hashCode() {
        return this.a.F0.hashCode() * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("SetComposingTextCommand(text='");
        f.append(this.a.F0);
        f.append("', newCursorPosition=");
        return gwl.x(f, this.b, ')');
    }
}
