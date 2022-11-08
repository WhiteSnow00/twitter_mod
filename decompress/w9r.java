// 
// Decompiled by Procyon v0.6.0
// 

public final class w9r<T> implements q7r<T>
{
    public final T C0;
    
    public w9r(final T c0) {
        this.C0 = c0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof w9r && zzd.a((Object)this.C0, (Object)((w9r)o).C0));
    }
    
    public final T getValue() {
        return this.C0;
    }
    
    @Override
    public final int hashCode() {
        final T c0 = this.C0;
        int hashCode;
        if (c0 == null) {
            hashCode = 0;
        }
        else {
            hashCode = c0.hashCode();
        }
        return hashCode;
    }
    
    @Override
    public final String toString() {
        return dia.s(w48.g("StaticValueHolder(value="), (Object)this.C0, ')');
    }
}
