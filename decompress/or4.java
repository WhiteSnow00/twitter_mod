// 
// Decompiled by Procyon v0.6.0
// 

public final class or4 extends ste implements mtb<Integer, int[], fve, lo8, int[], fzv>
{
    public final ds0.l D0;
    
    public or4(final ds0.l d0) {
        this.D0 = d0;
        super(5);
    }
    
    public final Object y0(final Object o, final Object o2, final Object o3, final Object o4, final Object o5) {
        final int intValue = ((Number)o).intValue();
        final int[] array = (int[])o2;
        final fve fve = (fve)o3;
        final lo8 lo8 = (lo8)o4;
        final int[] array2 = (int[])o5;
        czd.f((Object)array, "size");
        czd.f((Object)fve, "<anonymous parameter 2>");
        czd.f((Object)lo8, "density");
        czd.f((Object)array2, "outPosition");
        this.D0.c(lo8, intValue, array, array2);
        return fzv.a;
    }
}
