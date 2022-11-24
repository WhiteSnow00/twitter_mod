// 
// Decompiled by Procyon v0.6.0
// 

public final class egp extends pue implements stb<ufb, vzv>
{
    public final zfp F0;
    
    public egp(final zfp f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ufb ufb = (ufb)o;
        e0e.f((Object)ufb, "focusState");
        if (!ufb.b() && this.F0.g()) {
            this.F0.j();
        }
        ((cjq<Boolean>)this.F0.h).setValue(Boolean.valueOf(ufb.b()));
        return vzv.a;
    }
}
