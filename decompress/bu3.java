// 
// Decompiled by Procyon v0.6.0
// 

public final class bu3<T extends j0p> implements au3
{
    public final u5k<T> a;
    public final o0p<T> b;
    
    public bu3(final u5k<T> a, final o0p<T> b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
        final u5k<T> a = this.a;
        cbw.b(a.b.a(a.c, vba.g("periscope_watch", "", "", "heart", "send"), this.b.a()));
    }
    
    public final void b() {
        final u5k<T> a = this.a;
        a.b.a(a.c, vba.g("periscope_watch", "", "", "chat", "send"), this.b.a());
    }
    
    public final void c() {
        final u5k<T> a = this.a;
        cbw.b(a.b.a(a.c, vba.g("periscope_watch", "", "", "chat", "show"), this.b.a()));
    }
    
    public final void d() {
        final u5k<T> a = this.a;
        cbw.b(a.b.a(a.c, vba.g("periscope_watch", "", "", "chat", "hide"), this.b.a()));
    }
}
