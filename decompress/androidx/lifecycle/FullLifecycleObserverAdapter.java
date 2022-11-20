// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

class FullLifecycleObserverAdapter implements e
{
    public final wrb D0;
    public final e E0;
    
    public FullLifecycleObserverAdapter(final wrb d0, final e e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void f(final xaf xaf, final d$b d$b) {
        switch (FullLifecycleObserverAdapter$a.a[((Enum)d$b).ordinal()]) {
            case 7: {
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            }
            case 6: {
                this.D0.j();
                break;
            }
            case 5: {
                this.D0.b();
                break;
            }
            case 4: {
                this.D0.y(xaf);
                break;
            }
            case 3: {
                this.D0.m(xaf);
                break;
            }
            case 2: {
                this.D0.a();
                break;
            }
            case 1: {
                this.D0.e();
                break;
            }
        }
        final e e0 = this.E0;
        if (e0 != null) {
            e0.f(xaf, d$b);
        }
    }
}
