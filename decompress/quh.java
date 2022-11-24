// 
// Decompiled by Procyon v0.6.0
// 

public final class quh<K, V> extends qkg implements noe$a
{
    public final x8k I0;
    public V J0;
    
    public quh(final x8k i0, final K k, final V j0) {
        e0e.f((Object)i0, "parentIterator");
        super(k, j0, 0);
        this.I0 = i0;
        this.J0 = j0;
    }
    
    @Override
    public final V getValue() {
        return this.J0;
    }
    
    @Override
    public final V setValue(final V j0) {
        final V j2 = this.J0;
        this.J0 = j0;
        this.I0.c(this.getKey(), j0);
        return j2;
    }
}
