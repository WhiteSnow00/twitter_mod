import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tx4 implements sr9
{
    public final xc0 a;
    public final int b;
    
    public tx4(final String s, final int b) {
        final xc0 a = new xc0(s, (List)null, 6);
        this.a = a;
        this.b = b;
    }
    
    public final void a(final vx9 vx9) {
        e0e.f((Object)vx9, "buffer");
        if (vx9.f()) {
            vx9.g(vx9.d, vx9.e, this.a.F0);
        }
        else {
            vx9.g(vx9.b, vx9.c, this.a.F0);
        }
        final int b = vx9.b;
        int c = vx9.c;
        if (b != c) {
            c = -1;
        }
        final int b2 = this.b;
        int n;
        if (b2 > 0) {
            n = c + b2 - 1;
        }
        else {
            n = c + b2 - this.a.F0.length();
        }
        final int f = jb2.F(n, 0, vx9.e());
        vx9.i(f, f);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof tx4)) {
            return false;
        }
        final String f0 = this.a.F0;
        final tx4 tx4 = (tx4)o;
        return e0e.a((Object)f0, (Object)tx4.a.F0) && this.b == tx4.b;
    }
    
    @Override
    public final int hashCode() {
        return this.a.F0.hashCode() * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("CommitTextCommand(text='");
        f.append(this.a.F0);
        f.append("', newCursorPosition=");
        return gwl.x(f, this.b, ')');
    }
}
