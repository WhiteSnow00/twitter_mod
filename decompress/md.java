// 
// Decompiled by Procyon v0.6.0
// 

public abstract class md<T> extends mb<T>
{
    public final snp h;
    public final jpm i;
    
    public md(final y0l<T> y0l, final snp h, final jpm i) {
        pqb.b();
        this.h = h;
        this.i = i;
        super.a = ((so1)h).g;
        pqb.b();
        i.c((z0l)h);
        pqb.b();
        pqb.b();
        y0l.a((jj6)new ld(this), (z0l)h);
        pqb.b();
        pqb.b();
    }
    
    public final boolean close() {
        if (!super.close()) {
            return false;
        }
        if (!this.g()) {
            this.i.i((z0l)this.h);
            ((so1)this.h).t();
        }
        return true;
    }
}
