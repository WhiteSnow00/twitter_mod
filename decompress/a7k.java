// 
// Decompiled by Procyon v0.6.0
// 

public enum a7k
{
    public static final a7k[] H0;
    public final kl0 F0;
    public final String G0;
    
    static {
        H0 = new a7k[] { new a7k("ALIAS_2", 0, 2, kl0.H0), new a7k("ALIAS_3", 1, 3, kl0.I0), new a7k("ALIAS_4", 2, 4, kl0.J0), new a7k("ALIAS_5", 3, 5, kl0.K0), new a7k("ALIAS_6", 4, 6, kl0.L0), new a7k("ALIAS_7", 5, 7, kl0.M0), new a7k("ALIAS_8", 6, 8, kl0.N0) };
    }
    
    public a7k(final String s, final int n, final int n2, final kl0 f0) {
        final String b = rk0.B("com.twitter.subscriptions.appicon.implementation.icon", n2);
        super(s, n);
        this.F0 = f0;
        this.G0 = b;
    }
}
