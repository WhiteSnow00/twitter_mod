import android.util.SparseIntArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gqk
{
    public final iqk a;
    public final tli b;
    public final iqk c;
    public final qli d;
    public final iqk e;
    public final tli f;
    public final iqk g;
    public final tli h;
    public final String i;
    public final int j;
    
    public gqk(final a a) {
        srb.b();
        this.a = kf8.a();
        this.b = tli.j();
        final int a2 = mh8.a;
        final SparseIntArray sparseIntArray = new SparseIntArray();
        for (int i = 131072; i <= 4194304; i *= 2) {
            sparseIntArray.put(i, a2);
        }
        this.c = new iqk(4194304, a2 * 4194304, sparseIntArray, mh8.a);
        this.d = qli.h();
        final SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray2.put(1024, 5);
        sparseIntArray2.put(2048, 5);
        sparseIntArray2.put(4096, 5);
        sparseIntArray2.put(8192, 5);
        sparseIntArray2.put(16384, 5);
        sparseIntArray2.put(32768, 5);
        sparseIntArray2.put(65536, 5);
        sparseIntArray2.put(131072, 5);
        sparseIntArray2.put(262144, 2);
        sparseIntArray2.put(524288, 2);
        sparseIntArray2.put(1048576, 2);
        final int n = (int)Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        int n2;
        if (n < 16777216) {
            n2 = 3145728;
        }
        else if (n < 33554432) {
            n2 = 6291456;
        }
        else {
            n2 = 12582912;
        }
        final int n3 = (int)Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        int n4;
        if (n3 < 16777216) {
            n4 = n3 / 2;
        }
        else {
            n4 = n3 / 4 * 3;
        }
        this.e = new iqk(n2, n4, sparseIntArray2, -1);
        this.f = tli.j();
        final SparseIntArray sparseIntArray3 = new SparseIntArray();
        sparseIntArray3.put(16384, 5);
        this.g = new iqk(81920, 1048576, sparseIntArray3, -1);
        this.h = tli.j();
        this.i = "legacy";
        this.j = 4194304;
        srb.b();
    }
    
    public static final class a
    {
    }
}
