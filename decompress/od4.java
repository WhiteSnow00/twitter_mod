// 
// Decompiled by Procyon v0.6.0
// 

public final class od4 extends ste implements nsb<Boolean>
{
    public final puh<Boolean> D0;
    public final nsb<Boolean> E0;
    
    public od4(final puh<Boolean> d0, final nsb<Boolean> e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(0);
    }
    
    public final Object invoke() {
        return (boolean)this.D0.getValue() || (boolean)this.E0.invoke();
    }
}
