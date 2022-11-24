// 
// Decompiled by Procyon v0.6.0
// 

public final class s0f extends pue implements hub<vmr, vj6, arg>
{
    public final p0f F0;
    public final hub<v0f, vj6, arg> G0;
    
    public s0f(final p0f f0, final hub<? super v0f, ? super vj6, ? extends arg> g0) {
        this.F0 = f0;
        this.G0 = (hub<v0f, vj6, arg>)g0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final vmr vmr = (vmr)o;
        final long a = ((vj6)o2).a;
        e0e.f((Object)vmr, "$this$null");
        return this.G0.invoke((Object)new w0f(this.F0, vmr), (Object)new vj6(a));
    }
}
