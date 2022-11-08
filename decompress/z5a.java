// 
// Decompiled by Procyon v0.6.0
// 

public final class z5a extends gue implements rtb<iud, iud>
{
    public final /* synthetic */ rtb<Integer, Integer> C0;
    
    public z5a(final rtb<? super Integer, Integer> c0) {
        this.C0 = (rtb<Integer, Integer>)c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final long a = ((iud)o).a;
        return new iud(lr0.b((int)(a >> 32), ((Number)this.C0.invoke((Object)iud.b(a))).intValue()));
    }
}
