// 
// Decompiled by Procyon v0.6.0
// 

public final class zc9 extends wsd implements fd9
{
    public final rtb<ld9, oyv> D0;
    
    public zc9(final rtb<? super ld9, oyv> d0, final rtb<? super vsd, oyv> rtb) {
        final ssd$a a = ssd.a;
        zzd.f((Object)d0, "onDraw");
        zzd.f((Object)a, "inspectorInfo");
        super((rtb)a);
        this.D0 = (rtb<ld9, oyv>)d0;
    }
    
    public final Object X(final Object o, final gub gub) {
        zzd.f((Object)gub, "operation");
        return gub.invoke(o, (Object)this);
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof zc9 && zzd.a((Object)this.D0, (Object)((zc9)o).D0));
    }
    
    public final int hashCode() {
        return this.D0.hashCode();
    }
    
    public final void x(final sl6 sl6) {
        zzd.f((Object)sl6, "<this>");
        this.D0.invoke((Object)sl6);
        sl6.E0();
    }
}
