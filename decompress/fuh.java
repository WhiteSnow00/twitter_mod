// 
// Decompiled by Procyon v0.6.0
// 

public final class fuh<T extends xes> implements Comparable<fuh<T>>
{
    public final euh C0;
    public final T D0;
    
    public fuh(final euh c0, final T d0) {
        this.C0 = c0;
        this.D0 = d0;
    }
    
    @Override
    public final int compareTo(final Object o) {
        return this.C0.a - ((fuh)o).C0.a;
    }
}
