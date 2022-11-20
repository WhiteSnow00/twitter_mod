import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r5c
{
    public final int[] a;
    public final float[] b;
    
    public r5c(final int n, final int n2) {
        this.a = new int[] { n, n2 };
        this.b = new float[] { 0.0f, 1.0f };
    }
    
    public r5c(final int n, final int n2, final int n3) {
        this.a = new int[] { n, n2, n3 };
        this.b = new float[] { 0.0f, 0.5f, 1.0f };
    }
    
    public r5c(final List<Integer> list, final List<Float> list2) {
        final int size = list.size();
        this.a = new int[size];
        this.b = new float[size];
        for (int i = 0; i < size; ++i) {
            this.a[i] = (int)list.get(i);
            this.b[i] = list2.get(i);
        }
    }
}
