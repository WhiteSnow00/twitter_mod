import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class gdk<V, R>
{
    public final r3g a;
    public final idk<V, R> b;
    public a c;
    
    public gdk(final ybq ybq, final r3g a, final idk<V, R> b, final ibm ibm) {
        this.a = a;
        this.b = b;
        final j29 subscribe = ((b5j)b.c).subscribe((fk6)new n92((Object)this, (Object)ybq, 10));
        Objects.requireNonNull(subscribe);
        ibm.i((rj)new hjd(subscribe, 8));
    }
    
    public interface a
    {
        void w0(final pav p0);
    }
}
