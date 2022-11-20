// 
// Decompiled by Procyon v0.6.0
// 

public final class xha implements r0k
{
    public static final xha.xha$a Companion;
    public final w0k a;
    public int b;
    
    static {
        Companion = new xha.xha$a();
    }
    
    public xha(final w0k a) {
        czd.f((Object)a, "pctTimelineTracker");
        this.a = a;
        this.b = 1;
    }
    
    public final void a() {
        if (this.b == 1) {
            this.a.b((v0k)new v0k$d("explore-tapped"));
        }
    }
    
    public final void b() {
        if (this.b == 1) {
            this.a.c("explore-tapped");
        }
    }
}
