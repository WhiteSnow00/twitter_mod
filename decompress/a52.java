// 
// Decompiled by Procyon v0.6.0
// 

public final class a52 implements pca<z42>, pba<z42>
{
    public final zml<z42> C0;
    
    public a52() {
        this.C0 = (zml<z42>)new zml();
    }
    
    public final void e(final Object o) {
        final z42 z42 = (z42)o;
        zzd.f((Object)z42, "t");
        this.C0.onNext((Object)z42);
    }
    
    public final b5j<z42> v0() {
        return (b5j<z42>)this.C0;
    }
}
