import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w80 implements Comparator<int[]>
{
    @Override
    public final int compare(final Object o, final Object o2) {
        return ((int[])o)[0] - ((int[])o2)[0];
    }
}
