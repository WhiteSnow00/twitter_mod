import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hc8 implements Comparator<d8q>
{
    @Override
    public final int compare(final Object o, final Object o2) {
        final d8q d8q = (d8q)o;
        final d8q d8q2 = (d8q)o2;
        return (int)(jc8.a(d8q.a, 0) * d8q.b - jc8.a(d8q2.a, 0) * d8q2.b);
    }
}
