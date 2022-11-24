import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e67 implements pml
{
    public final pml<Context> F0;
    public final pml<si4> G0;
    public final pml<si4> H0;
    
    public e67(final pml<Context> f0, final pml<si4> pml, final pml<si4> pml2) {
        final ers a = ers$a.a;
        final frs a2 = frs$a.a;
        this.F0 = f0;
        this.G0 = (pml<si4>)a;
        this.H0 = (pml<si4>)a2;
    }
    
    public final Object get() {
        return new d67((Context)this.F0.get(), (si4)this.G0.get(), (si4)this.H0.get());
    }
}
