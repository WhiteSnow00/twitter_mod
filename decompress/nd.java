// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nd<T> extends nb<T>
{
    public final pop h;
    public final xpm i;
    
    public nd(final m1l<T> m1l, final pop h, final xpm i) {
        rrb.b();
        this.h = h;
        this.i = i;
        super.a = h.g;
        rrb.b();
        i.c((n1l)h);
        rrb.b();
        rrb.b();
        m1l.a((pk6<T>)new md(this), h);
        rrb.b();
        rrb.b();
    }
    
    @Override
    public final boolean close() {
        if (!super.close()) {
            return false;
        }
        if (!this.g()) {
            this.i.i((n1l)this.h);
            this.h.t();
        }
        return true;
    }
}
