import retrofit2.HttpException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p3k implements m5k$c
{
    public final /* synthetic */ raq<x4m> a;
    public final /* synthetic */ ek2 b;
    
    public p3k(final raq<x4m> a, final ek2 b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final x4m x4m) {
        ((y9q$a)this.a).b((Object)x4m);
        this.b.i("Reconnect Broadcast success", false);
    }
    
    public final void b(HttpException ex) {
        final raq<x4m> a = this.a;
        if (ex == null) {
            ex = (HttpException)new Exception("Failed to get broadcast");
        }
        ((y9q$a)a).a((Throwable)ex);
        this.b.i("Reconnect Broadcast failed", false);
    }
}
