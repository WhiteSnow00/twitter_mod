// 
// Decompiled by Procyon v0.6.0
// 

public final class ctu implements fda<btu>, fca<btu>
{
    public final znl<btu> F0;
    
    public ctu() {
        this.F0 = (znl<btu>)new znl();
    }
    
    public final void e(final Object o) {
        final btu btu = (btu)o;
        e0e.f((Object)btu, "t");
        this.F0.onNext((Object)btu);
    }
    
    public final t5j<btu> v0() {
        return (t5j<btu>)this.F0;
    }
}
