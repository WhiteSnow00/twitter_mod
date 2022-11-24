// 
// Decompiled by Procyon v0.6.0
// 

public final class o5m implements gyo, m5m
{
    public int a;
    public af6 b;
    public j10 c;
    public hub<? super d86, ? super Integer, vzv> d;
    public int e;
    public u5d f;
    public v5d g;
    
    public o5m(final af6 b) {
        this.b = b;
    }
    
    public final void a(final hub<? super d86, ? super Integer, vzv> d) {
        e0e.f((Object)d, "block");
        this.d = d;
    }
    
    public final int b(final Object o) {
        final af6 b = this.b;
        int y;
        if (b == null || (y = b.y(this, o)) == 0) {
            y = 1;
        }
        return y;
    }
    
    public final void c() {
        this.b = null;
        this.f = null;
        this.g = null;
    }
    
    public final void d(final boolean b) {
        if (b) {
            this.a |= 0x20;
        }
        else {
            this.a &= 0xFFFFFFDF;
        }
    }
    
    public final void invalidate() {
        final af6 b = this.b;
        if (b != null) {
            b.y(this, (Object)null);
        }
    }
}
