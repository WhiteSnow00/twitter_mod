import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public enum ksl
{
    D0(0);
    
    public static final ksl[] E0;
    
    static {
        final ksl ksl2 = new ksl(1);
        final ksl ksl3 = new ksl(2);
        final ksl ksl4 = new ksl(3);
        final ksl ksl5 = new ksl(4);
        final ksl ksl6 = new ksl(5);
        final ksl ksl;
        E0 = new ksl[] { ksl, ksl2, ksl3, ksl4, ksl5, ksl6 };
        final SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, (Object)ksl);
        sparseArray.put(1, (Object)ksl2);
        sparseArray.put(2, (Object)ksl3);
        sparseArray.put(3, (Object)ksl4);
        sparseArray.put(4, (Object)ksl5);
        sparseArray.put(-1, (Object)ksl6);
    }
    
    public ksl(final int n) {
    }
}
