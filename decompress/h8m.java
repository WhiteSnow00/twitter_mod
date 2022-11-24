import com.facebook.common.references.SharedReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h8m<T> extends cj4<T>
{
    public h8m(final SharedReference<T> sharedReference, final c c, final Throwable t) {
        super(sharedReference, c, t);
    }
    
    public h8m(final T t, final asm<T> asm, final c c, final Throwable t2) {
        super(t, asm, c, t2);
    }
    
    @Override
    public final cj4<T> a() {
        xd.M(this.i());
        return new h8m((com.facebook.common.references.SharedReference<Object>)super.G0, super.H0, super.I0);
    }
    
    public final /* bridge */ Object clone() throws CloneNotSupportedException {
        return this.a();
    }
}
