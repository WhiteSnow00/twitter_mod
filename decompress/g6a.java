// 
// Decompiled by Procyon v0.6.0
// 

public final class g6a extends gue implements rtb<iud, cud>
{
    public final /* synthetic */ rtb<Integer, Integer> C0;
    
    public g6a(final rtb<? super Integer, Integer> c0) {
        this.C0 = (rtb<Integer, Integer>)c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        return new cud(ukg.e(((Number)this.C0.invoke((Object)(int)(((iud)o).a >> 32))).intValue(), 0));
    }
}
