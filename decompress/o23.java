// 
// Decompiled by Procyon v0.6.0
// 

public final class o23 extends hub implements nsb<fzv>
{
    public o23(final Object o) {
        super(0, o, (Class)a23.class, "discardCancelPressed", "discardCancelPressed()V", 0);
    }
    
    public final Object invoke() {
        ((a23)((m93)this).receiver).a.onNext((Object)d23$d.a);
        return fzv.a;
    }
}
