// 
// Decompiled by Procyon v0.6.0
// 

public final class via implements n0k
{
    public static final a Companion;
    public final s0k a;
    public int b;
    
    static {
        Companion = new a();
    }
    
    public via(final s0k a) {
        zzd.f((Object)a, "pctTimelineTracker");
        this.a = a;
        this.b = 1;
    }
    
    public final void a() {
        if (this.b == 1) {
            this.a.b((r0k)new r0k$d("explore-tapped"));
        }
    }
    
    public final void b() {
        if (this.b == 1) {
            this.a.c("explore-tapped");
        }
    }
    
    public static final class a
    {
    }
}
