// 
// Decompiled by Procyon v0.6.0
// 

public final class cjg<I, O> extends jo<I>
{
    public final ko<I> a;
    public final q7r<fo<I, O>> b;
    
    public cjg(final ko<I> a, final q7r<? extends fo<I, O>> b) {
        zzd.f((Object)a, "launcher");
        this.a = a;
        this.b = (q7r<fo<I, O>>)b;
    }
    
    @Override
    public final void a(final I n, final tn tn) {
        final jo a = this.a.a;
        oyv a2;
        if (a != null) {
            a.a((Object)n);
            a2 = oyv.a;
        }
        else {
            a2 = null;
        }
        if (a2 != null) {
            return;
        }
        throw new IllegalStateException("Launcher has not been initialized".toString());
    }
    
    @Override
    public final void b() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
