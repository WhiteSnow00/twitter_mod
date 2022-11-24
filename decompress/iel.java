// 
// Decompiled by Procyon v0.6.0
// 

public final class iel extends lo1<noj<qgv>>
{
    public final jel G0;
    
    public iel(final jel g0) {
        this.G0 = g0;
    }
    
    public final void onNext(final Object o) {
        final noj noj = (noj)o;
        if (noj.f()) {
            this.G0.L0.W3((qgv)noj.c(), this.G0.M0.A());
        }
    }
}
