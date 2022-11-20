import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fpn
{
    public final nnl<Set<String>> a;
    public final nnl<String> b;
    public final nnl<String> c;
    
    public fpn() {
        this.a = (nnl<Set<String>>)new nnl();
        this.b = (nnl<String>)new nnl();
        this.c = (nnl<String>)new nnl();
    }
    
    public final void a(final String s) {
        czd.f((Object)s, "userId");
        this.c.onNext((Object)s);
    }
}
