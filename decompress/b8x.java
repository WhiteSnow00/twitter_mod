// 
// Decompiled by Procyon v0.6.0
// 

public final class b8x implements z7x, pba<a8x>
{
    public final hlr<a8x> C0;
    public final hlr<a8x> D0;
    public boolean E0;
    public boolean F0;
    
    public b8x() {
        this.C0 = (hlr<a8x>)((hlr)new xum(false)).d();
        this.D0 = (hlr<a8x>)((hlr)new xum(true)).d();
    }
    
    public final void C() {
        ((wbj)this.C0).onComplete();
        ((wbj)this.D0).onComplete();
    }
    
    public final void D(final a8x a8x) {
        zzd.f((Object)a8x, "viewLifecycleEvent");
        final int ordinal = a8x.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        this.E0 = false;
                    }
                }
                else {
                    this.E0 = true;
                }
            }
            else {
                this.F0 = false;
            }
        }
        else {
            this.F0 = true;
        }
        final int ordinal2 = a8x.ordinal();
        Label_0107: {
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    if (ordinal2 == 2) {
                        break Label_0107;
                    }
                    if (ordinal2 != 3 && ordinal2 != 4) {
                        return;
                    }
                }
                ((wbj)this.D0).onNext((Object)a8x);
                return;
            }
        }
        ((wbj)this.C0).onNext((Object)a8x);
    }
    
    public final /* synthetic */ b5j G(final ibf ibf) {
        return dia.f((raf)this, ibf);
    }
    
    public final b5j<a8x> a() {
        final b5j concat = b5j.concat((naj)b5j.create((b9j)new m5(this, 0)), (naj)b5j.merge((naj)this.C0, (naj)this.D0));
        zzd.e((Object)concat, "concat(\n            Obse\u2026reverseSubject)\n        )");
        return (b5j<a8x>)concat;
    }
    
    @Override
    public final b5j b() {
        return this.G((ibf)a8x.G0);
    }
    
    @Override
    public final b5j d() {
        return this.G((ibf)a8x.E0);
    }
    
    @Override
    public final b5j g() {
        return this.G((ibf)a8x.F0);
    }
    
    @Override
    public final b5j l() {
        return this.G((ibf)a8x.C0);
    }
    
    @Override
    public final b5j o() {
        return this.G((ibf)a8x.D0);
    }
}
