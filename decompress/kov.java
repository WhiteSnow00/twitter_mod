import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public enum kov
{
    E0((tqm)new wq4(2131100880)), 
    F0((tqm)new wq4(2131099699)), 
    G0((tqm)new wq4(2131099762)), 
    H0((tqm)new wq4(2131100844)), 
    I0((tqm)new wq4(2131100847)), 
    J0((tqm)new wq4(2131100865)), 
    K0((tqm)new wq4(2131099723)), 
    L0((tqm)new wq4(2131099931)), 
    M0((tqm)new wq4(2131099948)), 
    N0((tqm)new wq4(2131100549)), 
    O0((tqm)new wq4(2131100705)), 
    P0((tqm)new wq4(2131100722)), 
    Q0((tqm)new wq4(2131100906)), 
    R0((tqm)new wq4(2131099722)), 
    S0((tqm)new wq4(2131099924)), 
    T0((tqm)new wq4(2131099946)), 
    U0((tqm)new wq4(2131100548)), 
    V0((tqm)new wq4(2131100704)), 
    W0((tqm)new wq4(2131100721)), 
    X0((tqm)new wq4(2131100904)), 
    Y0((tqm)new wq4(2131100343)), 
    Z0((tqm)new wq4(2131099719)), 
    a1((tqm)new wq4(2131099922)), 
    b1((tqm)new wq4(2131099943)), 
    c1((tqm)new wq4(2131100545)), 
    d1((tqm)new wq4(2131100701)), 
    e1((tqm)new wq4(2131100718)), 
    f1((tqm)new wq4(2131100901)), 
    g1((tqm)new wq4(2131099718)), 
    h1((tqm)new wq4(2131099928)), 
    i1((tqm)new wq4(2131099942)), 
    j1((tqm)new wq4(2131100544)), 
    k1((tqm)new wq4(2131100700)), 
    l1((tqm)new wq4(2131100717)), 
    m1((tqm)new wq4(2131100900)), 
    n1((tqm)new wq4(2131099918));
    
    public static final kov[] o1;
    public final tqm D0;
    
    public kov(final tqm d0) {
        this.D0 = d0;
    }
    
    public final int b(final Context context) {
        czd.f((Object)context, "context");
        int b;
        try {
            b = kn6.b(context, this.D0.getId());
        }
        catch (final Exception ex) {
            m8a.d((Throwable)ex);
            b = -1;
        }
        return b;
    }
}
