// 
// Decompiled by Procyon v0.6.0
// 

public final class oz0 implements gnk$a
{
    public final /* synthetic */ nz0 a;
    public final /* synthetic */ u4 b;
    
    public oz0(final nz0 a, final u4 b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final asv asv) {
        zzd.f((Object)asv, "event");
        if (((u8a)asv).g) {
            this.a.b.onNext((Object)asv);
            this.b.i();
        }
    }
}
