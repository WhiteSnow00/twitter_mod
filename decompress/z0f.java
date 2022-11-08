// 
// Decompiled by Procyon v0.6.0
// 

public final class z0f extends gue implements rtb<Integer, Boolean>
{
    public final /* synthetic */ j0f C0;
    public final /* synthetic */ yy6 D0;
    public final /* synthetic */ t0f E0;
    
    public z0f(final j0f c0, final yy6 d0, final t0f e0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final int intValue = ((Number)o).intValue();
        final boolean b = intValue >= 0 && intValue < this.C0.a();
        final j0f c0 = this.C0;
        if (b) {
            fk7.v0(this.D0, null, 0, (gub)new y0f(this.E0, intValue, (ap6)null), 3);
            return Boolean.TRUE;
        }
        final StringBuilder j = lwe.j("Can't scroll to index ", intValue, ", it is out of bounds [0, ");
        j.append(c0.a());
        j.append(')');
        throw new IllegalArgumentException(j.toString().toString());
    }
}
