// 
// Decompiled by Procyon v0.6.0
// 

public final class m3p
{
    public final ptb<Float> a;
    public final ptb<Float> b;
    public final boolean c;
    
    public m3p(final ptb<Float> a, final ptb<Float> b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("ScrollAxisRange(value=");
        f.append(((Number)this.a.invoke()).floatValue());
        f.append(", maxValue=");
        f.append(((Number)this.b.invoke()).floatValue());
        f.append(", reverseScrolling=");
        return d10.D(f, this.c, ')');
    }
}
