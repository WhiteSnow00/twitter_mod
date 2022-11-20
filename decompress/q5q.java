// 
// Decompiled by Procyon v0.6.0
// 

public final class q5q extends eql
{
    public final boolean a;
    
    public q5q() {
        this.a = true;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof q5q && this.a == ((q5q)o).a);
    }
    
    public final int hashCode() {
        int a;
        if ((a = (this.a ? 1 : 0)) != 0) {
            a = 1;
        }
        return a;
    }
    
    public final String toString() {
        return ib0.C("ShowingArg(showing=", this.a, ")");
    }
}
