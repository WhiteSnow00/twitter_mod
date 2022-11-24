// 
// Decompiled by Procyon v0.6.0
// 

public final class ujg<I, O> extends no<I>
{
    public final oo<I> a;
    public final l9r<jo<I, O>> b;
    
    public ujg(final oo<I> a, final l9r<? extends jo<I, O>> b) {
        e0e.f((Object)a, "launcher");
        this.a = a;
        this.b = (l9r<jo<I, O>>)b;
    }
    
    public final void a(final I n, final xn xn) {
        final no<I> a = this.a.a;
        vzv a2;
        if (a != null) {
            a.a((Object)n);
            a2 = vzv.a;
        }
        else {
            a2 = null;
        }
        if (a2 != null) {
            return;
        }
        throw new IllegalStateException("Launcher has not been initialized".toString());
    }
    
    public final void b() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
