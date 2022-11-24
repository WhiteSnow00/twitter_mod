// 
// Decompiled by Procyon v0.6.0
// 

public final class gop implements sr9
{
    public final int a;
    public final int b;
    
    public gop(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final vx9 vx9) {
        e0e.f((Object)vx9, "buffer");
        final int f = jb2.F(this.a, 0, vx9.e());
        final int f2 = jb2.F(this.b, 0, vx9.e());
        if (f < f2) {
            vx9.i(f, f2);
        }
        else {
            vx9.i(f2, f);
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof gop)) {
            return false;
        }
        final int a = this.a;
        final gop gop = (gop)o;
        return a == gop.a && this.b == gop.b;
    }
    
    @Override
    public final int hashCode() {
        return this.a * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("SetSelectionCommand(start=");
        f.append(this.a);
        f.append(", end=");
        return gwl.x(f, this.b, ')');
    }
}
