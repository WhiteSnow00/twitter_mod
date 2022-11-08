// 
// Decompiled by Procyon v0.6.0
// 

public final class p22 implements o22
{
    public static final p22.p22$a Companion;
    public final xau a;
    
    static {
        Companion = new p22.p22$a();
    }
    
    public p22(final xau a) {
        zzd.f((Object)a, "userPreferences");
        this.a = a;
    }
    
    public final long a() {
        return this.a.d("block_sync_last_time", 0L);
    }
    
    public final void b(final long n) {
        this.a.i().c("block_sync_last_time", n).e();
    }
    
    public final boolean c() {
        return this.a.e("block_sync_aggressive", false);
    }
    
    public final void d(final int n) {
        this.a.i().f("block_sync_aggressive", n > 200).e();
    }
}
